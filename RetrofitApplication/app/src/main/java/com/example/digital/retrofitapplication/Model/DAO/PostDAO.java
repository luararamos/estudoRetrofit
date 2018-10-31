package com.example.digital.retrofitapplication.Model.DAO;

import android.content.Context;

import com.example.digital.retrofitapplication.Model.Posts;
import com.example.digital.retrofitapplication.Service.RetrofitService;
import com.example.digital.retrofitapplication.Service.ServiceListener;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PostDAO {

    public List<Posts> getPostList(Context context, final ServiceListener listener){


    //Prepara a chamada para a API
    Call<List<Posts>> call = RetrofitService.getApiService().getPosts();
// Coloca a chamada na fila
        call.enqueue(new Callback<List<Posts>>() {
            @Override
            public void onResponse(Call<List<Posts>> call, Response<List<Posts>> response) {
                // Se a resposta não for nula disparamos o listener de sucesso
                if (response.body() != null) {
                    listener.onSuccess(response.body());
                }
            }

            @Override
            public void onFailure(Call<List<Posts>> call, Throwable t) {
                // disparamos o listener de sucesso
                listener.onError(t);

            }
        });


        return new ArrayList<>();
    }


}
