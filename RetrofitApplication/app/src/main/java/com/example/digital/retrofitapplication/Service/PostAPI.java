package com.example.digital.retrofitapplication.Service;

import com.example.digital.retrofitapplication.Model.Posts;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface PostAPI {
        @GET("/posts")
        Call<List<Posts>> getPosts();
}
