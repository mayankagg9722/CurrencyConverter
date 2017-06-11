package com.example.uddishverma.currencyconverter;

import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.content.res.AppCompatResources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextView date, currencyTitle, countryTo, countryFrom;
    Typeface tfRegular, tfThin;
    ImageView arrowDown;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main );

        View decorView = getWindow().getDecorView();
        //Hiding the status bar
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        date = (TextView) findViewById(R.id.date);
        currencyTitle = (TextView) findViewById(R.id.currency_title);
        arrowDown = (ImageView) findViewById(R.id.down_arrow);
        countryTo = (TextView) findViewById(R.id.country_to);
        countryFrom = (TextView) findViewById(R.id.country_from);

        tfRegular = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/OpenSans-Regular.ttf");
        tfRegular = Typeface.createFromAsset(getApplicationContext().getAssets(), "fonts/Raleway-ExtraLight.ttf");
        date.setTypeface(tfRegular);
        currencyTitle.setTypeface(tfRegular);
        countryTo.setTypeface(tfThin);
        countryFrom.setTypeface(tfThin);

        ColorStateList csl = AppCompatResources.getColorStateList(this, R.color.peach);
        Drawable drawableone = getResources().getDrawable(R.drawable.ic_keyboard_arrow_down);
        DrawableCompat.setTintList(drawableone, csl);
        arrowDown.setImageDrawable(drawableone);

    }

    //To get country flags
    private String localeToEmoji(Locale locale) {
        String countryCode = locale.getCountry();
        int firstLetter = Character.codePointAt(countryCode, 0) - 0x41 + 0x1F1E6;
        int secondLetter = Character.codePointAt(countryCode, 1) - 0x41 + 0x1F1E6;
        return new String(Character.toChars(firstLetter)) + new String(Character.toChars(secondLetter));
    }
}
