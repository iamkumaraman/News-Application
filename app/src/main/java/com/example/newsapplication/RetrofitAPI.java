package com.example.newsapplication;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

//a15c92b948884918b02834fbc725a519
//https://newsapi.org/v2/top-headlines?country=in&category=science&apiKey=a15c92b948884918b02834fbc725a519
//https://newsapi.org/v2/top-headlines/sources?apiKey=a15c92b948884918b02834fbc725a519
//https://newsapi.org/v2/top-headlines/sources?category=technology&apiKey=a15c92b948884918b02834fbc725a519

public interface RetrofitAPI {
    @GET
    Call<NewsModal> getAllNews(@Url String url);

    @GET
    Call<NewsModal> getNewsByCategory(@Url String url);


}
