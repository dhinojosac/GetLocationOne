package com.dhinojosac.android.getlocationone;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.Toast;

/**
 * Created by negro-PC on 11-Jan-17.
 */

public class MyLocationListener implements LocationListener {
    Context context;

    public MyLocationListener(Context context) {
        this.context = context;
    }

    @Override
    public void onLocationChanged(Location location) {
        String msg = "Location changed: "+location.getLatitude()+"-"+location.getLongitude();
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onStatusChanged(String s, int i, Bundle bundle) {
        String msg = "GPs status changed!";
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onProviderEnabled(String s) {
        String msg = "GPS is enabled";
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }

    @Override
    public void onProviderDisabled(String s) {
        String msg = "GPS is disabled";
        Toast.makeText(context,msg,Toast.LENGTH_LONG).show();
    }
}
