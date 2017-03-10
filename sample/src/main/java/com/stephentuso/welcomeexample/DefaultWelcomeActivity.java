package com.stephentuso.welcomeexample;

import com.stephentuso.welcome.BasicPage;
import com.stephentuso.welcome.TitlePage;
import com.stephentuso.welcome.WelcomeActivity;
import com.stephentuso.welcome.WelcomeConfiguration;

/**
 * Created by stephentuso on 10/5/16.
 */

public class DefaultWelcomeActivity extends WelcomeActivity {

    @Override
    protected WelcomeConfiguration configuration() {
        return new WelcomeConfiguration.Builder(this)
                .defaultBackgroundColor(R.color.colorPrimary)
                .page(new TitlePage(R.drawable.ic_image_white, (getString(R.string.example_defaultwelcomeactivity_default_welcome_screen))))
                .page(new BasicPage(R.drawable.ic_style_white, (getString(R.string.example_defaultwelcomeactivity_default_style)), (getString(R.string.example_defaultwelcomeactivity_no_custom_styles))))
                .page(new BasicPage(R.drawable.ic_image_white, (getString(R.string.example_defaultwelcomeactivity_default_properties)), (getString(R.string.example_defaultwelcomeactivity_no_properties))))
                .build();
    }

}
