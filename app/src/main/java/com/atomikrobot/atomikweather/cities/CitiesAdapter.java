package com.atomikrobot.atomikweather.cities;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.atomikrobot.atomikweather.CityActivity;
import com.atomikrobot.atomikweather.R;
import com.atomikrobot.atomikweather.models.listModel;
import com.atomikrobot.atomikweather.models.weatherModel;

import java.text.DecimalFormat;
import java.util.List;

public class CitiesAdapter extends ArrayAdapter <listModel> {
    private double lat;
    private double lon;

    public CitiesAdapter (Context context, int textViewResourceId) {
        super(context, textViewResourceId);
    }

    public CitiesAdapter (Context context, int resource, List<listModel> items, double latitude, double longitude) {
        super(context, resource, items);
        this.lat = latitude;
        this.lon = longitude;
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;

        if (v == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.list_cities, null);
        }

        listModel p = getItem(position);

        if (p != null) {
            TextView title = (TextView) v.findViewById(R.id.title);
            ImageView star = (ImageView) v.findViewById(R.id.star_image);
            TextView temp = (TextView) v.findViewById(R.id.temp);
            TextView weather = (TextView) v.findViewById(R.id.weather);


            if (title != null) {
                title.setText(p.getName());
            }

            if (temp != null) {
                temp.setText(p.getMain().getTemp()+"");
            }

            if (weather != null) {
                weather.setText(p.getWeather().get(0).getDescription());
            }
        }

        v.setOnClickListener(new CitiesAdapter.OnItemClickListener(position, v));

        return v;
    }

    private class OnItemClickListener  implements View.OnClickListener {
        private int mPosition;
        private View mV;

        OnItemClickListener(int position, View v){
            mPosition = position;
            mV = v;
        }

        @Override
        public void onClick(View arg0) {
            listModel listModel = getItem(mPosition);

            Intent intent = new Intent(mV.getContext(), CityActivity.class);
            intent.putExtra("name", listModel.getName());
            String listWeather = "";
            for ( weatherModel w : listModel.getWeather()) {
                listWeather = listWeather+w.getDescription();
            }

            intent.putExtra("weather", listWeather);
            intent.putExtra("temp", listModel.getMain().getTemp());



            mV.getContext().startActivity(intent);
        }
    }

}
