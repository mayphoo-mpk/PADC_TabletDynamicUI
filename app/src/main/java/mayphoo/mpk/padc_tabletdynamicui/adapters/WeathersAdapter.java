package mayphoo.mpk.padc_tabletdynamicui.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import mayphoo.mpk.padc_tabletdynamicui.R;
import mayphoo.mpk.padc_tabletdynamicui.delegates.WeatherItemDelegate;
import mayphoo.mpk.padc_tabletdynamicui.viewholders.WeatherViewHolder;

/**
 * Created by User on 12/1/2017.
 */

public class WeathersAdapter extends RecyclerView.Adapter<WeatherViewHolder>{

    private WeatherItemDelegate mWeatherItemDelegate;

    public WeathersAdapter(WeatherItemDelegate weatherItemDelegate) {
        this.mWeatherItemDelegate = weatherItemDelegate;
    }

    @Override
    public WeatherViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View topicView = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_item_weather, parent, false);
        return new WeatherViewHolder(topicView, mWeatherItemDelegate);
    }

    @Override
    public void onBindViewHolder(WeatherViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}
