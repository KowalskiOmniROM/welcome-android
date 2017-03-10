package com.stephentuso.welcomeexample;

import android.content.Intent;

import com.stephentuso.welcome.BasicPage;
import com.stephentuso.welcome.TitlePage;
import com.stephentuso.welcome.WelcomeActivity;
import com.stephentuso.welcome.WelcomeConfiguration;

/**
 * Created by stephentuso on 11/16/16.
 */

public class ButtonBarWelcomeActivity extends WelcomeActivity {

    private static final int REQUEST_CODE_LOG_IN_SIGN_UP = 100;

    @Override
    protected WelcomeConfiguration configuration() {
        return new WelcomeConfiguration.Builder(this)
                .canSkip(false)
                .backButtonNavigatesPages(false)
                .defaultTitleTypefacePath("Roboto-Bold.ttf")
                .defaultHeaderTypefacePath("Roboto-Bold.ttf")
                .bottomLayout(WelcomeConfiguration.BottomLayout.BUTTON_BAR)
                .page(new TitlePage(R.drawable.ic_image_white, (getString(R.string.example_buttonbarsingle_title))))
                .page(new BasicPage(R.drawable.ic_image_white, (getString(R.string.example_buttonbarsingle_description)), (getString(R.string.example_buttonbarsingle_summary))).background(R.color.purple_background))
                .build();
    }

    @Override
    protected void onButtonBarFirstPressed() {
        showExampleActionActivity((getString(R.string.example_buttonbarwelcomeactivity_login)));
    }

    @Override
    protected void onButtonBarSecondPressed() {
        showExampleActionActivity((getString(R.string.example_buttonbarwelcomeactivity_signup)));
    }

    private void showExampleActionActivity(String action) {
        Intent intent = new Intent(this, ExampleActionActivity.class);
        intent.putExtra(ExampleActionActivity.KEY_ACTION_TITLE, action);
        startActivityForResult(intent, REQUEST_CODE_LOG_IN_SIGN_UP);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == REQUEST_CODE_LOG_IN_SIGN_UP && resultCode == RESULT_OK) {
            completeWelcomeScreen();
            return;
        }

        super.onActivityResult(requestCode, resultCode, data);
    }
}
