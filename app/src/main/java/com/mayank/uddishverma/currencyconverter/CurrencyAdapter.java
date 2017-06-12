package com.mayank.uddishverma.currencyconverter;

import android.content.Context;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.mayank.uddishverma.currencyconverter.utils.Globals;
import com.mayank.uddishverma.currencyconverter.utils.Prefs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by uddishverma on 11/06/17.
 */

public class CurrencyAdapter extends RecyclerView.Adapter<CurrencyAdapter.ViewHolder> {

    List<String> countryCode = new ArrayList<>();
    List<String> countriesCurrencies = new ArrayList<>();

    List<String> copycountryCode = new ArrayList<>();
     List<String> copycountriesCurrencies = new ArrayList<>();

    Context context;


    public static final String TAG = "CurrencyAdapter";


    public CurrencyAdapter(Context context,List<String> countryCode, List<String> countriesCurrencies) {
        this.context=context;
        this.countriesCurrencies = countriesCurrencies;
        this.countryCode = countryCode;
        this.copycountriesCurrencies = countriesCurrencies;
        this.copycountryCode = countryCode;
    }


    public void filter(String s){
        copycountriesCurrencies=new ArrayList<>();
        copycountryCode=new ArrayList<>();
        if(s!=null && s.length()>1){
            for(int i=0;i<countriesCurrencies.size();i++){
                if(countriesCurrencies.get(i).toLowerCase().contains(s.toLowerCase())){
                    copycountryCode.add(countryCode.get(i));
                    copycountriesCurrencies.add(countriesCurrencies.get(i));
                }
            }

        }else {
            copycountriesCurrencies=countriesCurrencies;
            copycountryCode=countryCode;
        }
        notifyDataSetChanged();
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        if(this.copycountryCode.get(position)!=null && this.copycountriesCurrencies.get(position)!=null) {
                if (Globals.getCountryFlag(this.copycountryCode.get(position)) != null) {
                    if (Globals.getCountryFlag(this.copycountryCode.get(position)).length() > 1) {
                        holder.flag.setText(Globals.getCountryFlag(this.copycountryCode.get(position)));
                        holder.currency.setText(this.copycountriesCurrencies.get(position));
                    }else {
                        holder.flag.setVisibility(View.GONE);
                        holder.currency.setVisibility(View.GONE);
                    }
                }
            }

        holder.linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int p=0;
                if(MainActivity.flag==1){
                    if(holder.currency.getText().toString().toLowerCase().equals(MainActivity.countryTo.getText().toString().toLowerCase())){
                        p=1;
                    }else {
                        MainActivity.countryFrom.setText(holder.currency.getText().toString());
                    }
                }else if(MainActivity.flag==2){
                    if(holder.currency.getText().toString().toLowerCase().equals(MainActivity.countryFrom.getText().toString().toLowerCase())){
                        p=1;
                    }else {
                        MainActivity.countryTo.setText(holder.currency.getText().toString());
                    }
                }
                if(p==0){
                    MainActivity.behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                    MainActivity.behavior.setPeekHeight(0);
                    MainActivity.currency_to.setText("");
                    MainActivity.currency_from.setText("");
                    MainActivity.search.setText("");
                    InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
                    imm.hideSoftInputFromWindow(holder.linear.getWindowToken(), 0);
                    Prefs.setPrefs("country_from",MainActivity.countryFrom.getText().toString(),context);
                    Prefs.setPrefs("country_to",MainActivity.countryTo.getText().toString(),context);
                }else {
                    Toast.makeText(context,"Select same currencies on both sides",Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return copycountryCode.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView flag, currency;
        public LinearLayout linear;

        public ViewHolder(View itemView) {
            super(itemView);
            flag = (TextView) itemView.findViewById(R.id.flag);
            currency = (TextView) itemView.findViewById(R.id.currency);
            linear=(LinearLayout)itemView.findViewById(R.id.currencylinear);
        }

    }


}
