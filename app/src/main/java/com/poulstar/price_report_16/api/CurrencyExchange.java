package com.poulstar.price_report_16.api;

import com.poulstar.price_report_16.models.MainResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface CurrencyExchange {
    @GET("gh/fawazahmed0/currency-api@1/{date}/currencies/{base}.json")
    Call<MainResponse> get_currency(@Path("date") String date, @Path("base") String base);
}
