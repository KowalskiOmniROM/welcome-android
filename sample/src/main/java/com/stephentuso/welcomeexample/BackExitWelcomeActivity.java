package com.stephentuso.welcomeexample;

import com.stephentuso.welcome.BasicPage;
import com.stephentuso.welcome.WelcomeActivity;
import com.stephentuso.welcome.WelcomeConfiguration;

/**
 * Created by stephentuso on 10/5/16.
 */

public class BackExitWelcomeActivity extends WelcomeActivity {

    @Override
    protected WelcomeConfiguration configuration() {
        return new WelcomeConfiguration.Builder(this)
                .defaultBackgroundColor(R.color.colorPrimary)
                .defaultTitleTypefacePath("Roboto-Bold.ttf")
                .defaultHeaderTypefacePath("Roboto-Bold.ttf")
                .page(new BasicPage(R.drawable.ic_image_white,
                        (getString(R.string.example_backexit_title)),
                        (getString(R.string.example_backexit_description)))
                )
                .page(new BasicPage(R.drawable.ic_back_white,
                        (getString(R.string.example_back_exit_title)),
                        (getString(R.string.example_back_exit_description)))
                )
                .backButtonNavigatesPages(false)
                .swipeToDismiss(true)
                .build();
    }

}
