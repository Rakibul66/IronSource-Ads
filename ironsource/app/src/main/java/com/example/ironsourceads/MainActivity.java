package com.example.ironsourceads;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerListener;

public class MainActivity extends AppCompatActivity {
    private FrameLayout mBannerParentLayout;
    private IronSourceBannerLayout mIronSourceBannerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IronSource.init(this, "YOUR_APP_KEY", IronSource.AD_UNIT.BANNER);
        final FrameLayout bannerContainer = findViewById(R.id.bannerContainer);
        IronSourceBannerLayout banner = IronSource.createBanner(this, ISBannerSize.BANNER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.WRAP_CONTENT);
        bannerContainer.addView(banner, 0, layoutParams);
        banner.setBannerListener(new BannerListener() {
            @Override
            public void onBannerAdLoaded() {
// Called after a banner ad has been successfully loaded
            }
            @Override
            public void onBannerAdLoadFailed(IronSourceError error) {
// Called after a banner has attempted to load an ad but failed.
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        bannerContainer.removeAllViews();
                    }
                });
            }
            @Override
            public void onBannerAdClicked() {
// Called after a banner has been clicked.
            }
            @Override
            public void onBannerAdScreenPresented() {
// Called when a banner is about to present a full screen content.
            }
            @Override
            public void onBannerAdScreenDismissed() {
// Called after a full screen content has been dismissed
            }
            @Override
            public void onBannerAdLeftApplication() {
// Called when a user would be taken out of the application context.
            }
        });
        IronSource.loadBanner(banner);
// YOUR OTHER CODE //
// YOUR OTHER CODE //
// YOUR OTHER CODE //
    }}