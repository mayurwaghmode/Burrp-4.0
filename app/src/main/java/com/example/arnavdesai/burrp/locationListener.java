package com.example.arnavdesai.burrp;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/**
 * Created by Arnav Desai on 9/29/2018.
 */


public class locationListener implements LocationListener {
    public static Location location;

    @Override
    public void onLocationChanged(Location location) {
        this.location=location;
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
