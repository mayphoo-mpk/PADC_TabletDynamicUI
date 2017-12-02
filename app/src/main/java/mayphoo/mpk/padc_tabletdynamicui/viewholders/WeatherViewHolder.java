package mayphoo.mpk.padc_tabletdynamicui.viewholders;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.RelativeLayout;

import butterknife.BindView;
import butterknife.ButterKnife;
import mayphoo.mpk.padc_tabletdynamicui.R;
import mayphoo.mpk.padc_tabletdynamicui.delegates.WeatherItemDelegate;

/**
 * Created by User on 12/2/2017.
 */

public class WeatherViewHolder extends RecyclerView.ViewHolder {

    WeatherItemDelegate mWeatherDelegate;

    @BindView(R.id.rv_weather)
    RelativeLayout rvWeather;

    public WeatherViewHolder(final View itemView, WeatherItemDelegate weatherItemDelegate) {
        super(itemView);
        ButterKnife.bind(this, itemView);
        mWeatherDelegate = weatherItemDelegate;
        itemView.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                rvWeather.setBackgroundColor(itemView.getResources().getColor(R.color.primary_light));
                mWeatherDelegate.onTapWeather();
            }
        });
    }


}
