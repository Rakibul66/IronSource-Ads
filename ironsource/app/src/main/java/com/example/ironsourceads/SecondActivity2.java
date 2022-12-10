package com.example.ironsourceads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.sdk.InterstitialListener;

public class SecondActivity2 extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        button=findViewById(R.id.button);
        IronSource.setInterstitialListener(new InterstitialListener() {
            /**
             * Invoked when Interstitial Ad is ready to be shown after load function was called.
             */
            @Override
            public void onInterstitialAdReady() {
            }
            /**
             * invoked when there is no Interstitial Ad available after calling load function.
             */
            @Override
            public void onInterstitialAdLoadFailed(IronSourceError error) {
            }
            /**
             * Invoked when the Interstitial Ad Unit is opened
             */
            @Override
            public void onInterstitialAdOpened() {
            }
            /*
             * Invoked when the ad is closed and the user is about to return to the application.
             */
            @Override
            public void onInterstitialAdClosed() {
            }
            /**
             * Invoked when Interstitial ad failed to show.
             * @param error - An object which represents the reason of showInterstitial failure.
             */
            @Override
            public void onInterstitialAdShowFailed(IronSourceError error) {
            }
            /*
             * Invoked when the end user clicked on the interstitial ad, for supported networks only.
             */
            @Override
            public void onInterstitialAdClicked() {
            }
            /** Invoked right before the Interstitial screen is about to open.
             *  NOTE - This event is available only for some of the networks.
             *  You should NOT treat this event as an interstitial impression, but rather use InterstitialAdOpenedEvent
             */
            @Override
            public void onInterstitialAdShowSucceeded() {
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                IronSource.loadInterstitial();
//                InterstitialPlacement getInterstitialPlacementInfo(String placementName);
//                IronSource.isInterstitialPlacementCapped(placementName)
//                IronSource.showInterstitial(placementName);
            }
        });

    }
}