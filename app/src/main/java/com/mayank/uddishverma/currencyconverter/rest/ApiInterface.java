package com.mayank.uddishverma.currencyconverter.rest;


import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by mayankaggarwal on 12/02/17.
 */

public interface ApiInterface {

    @GET("currencymobile")
    Call<JsonObject> getCurrencyMobile();

}
