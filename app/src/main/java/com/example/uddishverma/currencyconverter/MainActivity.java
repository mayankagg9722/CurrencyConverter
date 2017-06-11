package com.example.uddishverma.currencyconverter;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.uddishverma.currencyconverter.rest.Data;
import com.example.uddishverma.currencyconverter.utils.Globals;
import com.example.uddishverma.currencyconverter.utils.Prefs;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextView date, currencyTitle, countryTo, countryFrom;
    Typeface tfRegular, tfThin;
    ImageView arrowDown, arrowUp;
    BottomSheetBehavior behavior;
    RecyclerView recyclerView;
    CurrencyAdapter mAdapter;
    ArrayList items = new ArrayList();
    LinearLayout linearLayoutOne, linearLayoutTwo;
    RelativeLayout relativeOne, relativeTwo;
    Calendar calendar;

    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View decorView = getWindow().getDecorView();
        //Hiding the status bar
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);

        initialize();

        currencyApi(MainActivity.this);

        initialApiSave();

        //inflating bottom sheet
        NestedScrollView bottomSheet = (NestedScrollView) findViewById(R.id.bottom_sheet);
        behavior = BottomSheetBehavior.from(bottomSheet);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //TODO fill the list
        mAdapter = new CurrencyAdapter(items);
        recyclerView.setAdapter(mAdapter);

        //Setting click listeners on arrows
        linearLayoutOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });
        linearLayoutTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });
        behavior.setPeekHeight(0);

        relativeOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
            }
        });
        relativeTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
            }
        });

    }

    private void initialApiSave() {
        try {
            JsonParser parser = new JsonParser();
            JsonObject currencyObject;
            if ((Prefs.getPrefs("currencyJson", MainActivity.this).equals("notfound"))) {
                currencyObject = parser.parse(Globals.initalCurrnecyJson).getAsJsonObject();
            } else {
                currencyObject = parser.parse(Prefs.getPrefs("currencyJson", MainActivity.this)).getAsJsonObject();
            }
            JsonObject allThingsObject = parser.parse(Globals.allThingsJson()).getAsJsonObject();

            Log.d("tagg", currencyObject.get("status").getAsString());

            Log.d("tagg", currencyObject.get("currency").getAsJsonObject().get("quotes").getAsJsonObject().get("USDINR").getAsString());
            Log.d("tagg", allThingsObject.get("results").getAsJsonObject().toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void initialize() {

        date = (TextView) findViewById(R.id.date);
        currencyTitle = (TextView) findViewById(R.id.currency_title);
        arrowDown = (ImageView) findViewById(R.id.down_arrow);
        arrowUp = (ImageView) findViewById(R.id.up_arrow);
        countryTo = (TextView) findViewById(R.id.country_to);
        countryFrom = (TextView) findViewById(R.id.country_from);

        date.setText(getCurrentMonth().substring(0,3) + " " + getCurrentDate() + "," + getCurrentYear());

        relativeOne = (RelativeLayout) findViewById(R.id.relative_1);
        relativeTwo = (RelativeLayout) findViewById(R.id.relative_2);
        linearLayoutOne = (LinearLayout) findViewById(R.id.linearll_1);
        linearLayoutTwo = (LinearLayout) findViewById(R.id.linearll_2);

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


    public void currencyApi(Activity activity) {
        Data.getCurrency(activity, new Data.UpdateCallback() {
            @Override
            public void onUpdate() {
                Log.d("tagg", "success api");
            }

            @Override
            public void onFailure() {
                Log.d("tagg", "fail api");
            }
        });
    }

    private String getCurrentDate() {
        calendar = Calendar.getInstance();
        SimpleDateFormat mdformat = new SimpleDateFormat("dd/MM/yyyy");
        String strDate = mdformat.format(calendar.getTime());
        String date = strDate.substring(0, 2);
        return date;
    }

    private String getCurrentMonth() {
        DateFormat dateFormat = new SimpleDateFormat("MM");
        Date date = new Date();
        String month = (dateFormat.format(date));
        String currMonth = null;
        if (month.equals("01")) {
            currMonth = "January";
        } else if (month.equals("02")) {
            currMonth = "February";
        } else if (month.equals("03")) {
            currMonth = "March";
        } else if (month.equals("04")) {
            currMonth = "April";
        } else if (month.equals("05")) {
            currMonth = "May";
        } else if (month.equals("06")) {
            currMonth = "June";
        } else if (month.equals("07")) {
            currMonth = "July";
        } else if (month.equals("08")) {
            currMonth = "August";
        } else if (month.equals("09")) {
            currMonth = "September";
        } else if (month.equals("10")) {
            currMonth = "October";
        } else if (month.equals("11")) {
            currMonth = "November";
        } else if (month.equals("12")) {
            currMonth = "December";
        }
        return currMonth;
    }

    private String getCurrentYear() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat mdformat = new SimpleDateFormat("yyyy/MM/dd");
        String strDate = mdformat.format(calendar.getTime());
        String year = strDate.substring(0, 4);
        return year;
    }
}
