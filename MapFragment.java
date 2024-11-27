package com.csusm.navigation.cougarnav;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MapFragment extends Fragment {

    private static final String MAP_URL = "https://www.google.com/maps/d/u/0/embed?mid=1O7Hn5RetxsbdRTnv9vB8MlwW9bHbOSI";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_map, container, false);

        WebView webView = rootView.findViewById(R.id.webview_map);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true); // Enable JavaScript for interactive maps
        webView.loadUrl(MAP_URL); // Load the Google Maps link

        return rootView;
    }
}
