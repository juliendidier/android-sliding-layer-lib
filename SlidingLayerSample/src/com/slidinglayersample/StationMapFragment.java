package com.slidinglayersample;

import java.io.IOException;
import java.lang.Runnable;
import java.lang.Thread;
import java.util.HashMap;
import java.util.Iterator;

import android.location.Address;
import android.location.Geocoder;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap.OnCameraChangeListener;
import com.google.android.gms.maps.GoogleMap.OnMarkerClickListener;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Marker;

import android.util.Log;

import android.content.res.AssetManager;
import java.io.InputStream;
import android.graphics.BitmapFactory;
import android.graphics.Bitmap;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import android.content.res.AssetFileDescriptor;

import android.graphics.Bitmap.Config;
import android.graphics.drawable.PictureDrawable;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

public class StationMapFragment extends com.google.android.gms.maps.SupportMapFragment
{
    private GoogleMap      map;

    public void setUpMap()
    {
        map = this.getMap();

        map.moveCamera(CameraUpdateFactory.zoomTo(15));
        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        map.setMyLocationEnabled(true);

        UiSettings mSettings = map.getUiSettings();
        mSettings.setZoomControlsEnabled(false);
    }

}
