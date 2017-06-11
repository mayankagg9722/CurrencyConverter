package com.example.uddishverma.currencyconverter;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextView date, currencyTitle;
    Typeface tf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View decorView = getWindow().getDecorView();
        //Hiding the status bar
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        date = (TextView) findViewById(R.id.date);
        currencyTitle = (TextView) findViewById(R.id.currency_title);

        tf = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/OpenSans-Regular.ttf");
        date.setTypeface(tf);
        currencyTitle.setTypeface(tf);

    }

    //To get country flags
    private String localeToEmoji(Locale locale) {
        String countryCode = locale.getCountry();
        int firstLetter = Character.codePointAt(countryCode, 0) - 0x41 + 0x1F1E6;
        int secondLetter = Character.codePointAt(countryCode, 1) - 0x41 + 0x1F1E6;
        return new String(Character.toChars(firstLetter)) + new String(Character.toChars(secondLetter));
    }
}
