package com.stephentuso.welcomeexample;

import com.stephentuso.welcome.BasicPage;
import com.stephentuso.welcome.TitlePage;
import com.stephentuso.welcome.WelcomeActivity;
import com.stephentuso.welcome.WelcomeConfiguration;

/**
 * Created by stephentuso on 11/16/16.
 */

public class ButtonBarSingleWelcomeActivity extends WelcomeActivity {

    @Override
    protected WelcomeConfiguration configuration() {
        return new WelcomeConfiguration.Builder(this)
                .swipeToDismiss(true)
                .defaultTitleTypefacePath("Roboto-Bold.ttf")
                .defaultHeaderTypefacePath("Roboto-Bold.ttf")
                .bottomLayout(WelcomeConfiguration.BottomLayout.BUTTON_BAR_SINGLE)
                .exitAnimation(android.R.anim.fade_out)
                .page(new TitlePage(R.drawable.ic_image_white, (getString(R.string.example_buttonbarsingle_title))))
                .page(new BasicPage(R.drawable.ic_image_white, (getString(R.string.example_buttonbarsingle_description)), (getString(R.string.example_buttonbarsingle_summary))).background(R.color.purple_background))
                .build();
    }

    @Override
    protected void onButtonBarFirstPressed() {
        completeWelcomeScreen();
    }

}
