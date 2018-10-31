package com.example.digital.retrofitapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import com.example.digital.retrofitapplication.Adapter.RecyclerViewAdapter;
import com.example.digital.retrofitapplication.Model.DAO.PostDAO;
import com.example.digital.retrofitapplication.Model.Posts;
import com.example.digital.retrofitapplication.Service.ServiceListener;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ServiceListener {
    private RecyclerViewAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);

        PostDAO dao = new PostDAO();
        adapter = new RecyclerViewAdapter(dao.getPostList(this,this));
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

    }

    public void setupRecyclerView(View view){

    }
//    private List<Posts> getListPosts() {
//        List<Posts> list = new ArrayList<>();
//
//        list.add(new Posts("Nova culinaria no café", "Luara","Um cafézinho muito bom", " http://s2.glbimg.com/P6Nn4AXYPq-K1Xek4cCKyONYYyA=/e.glbimg.com/og/ed/f/original/2014/01/15/cafe.jpg"));
//        list.add(new Posts("Aula de Mobile extra", "Jessica", "Aula de RecyclerView da Jessica Hoje", "https://st3.depositphotos.com/2572561/15967/v/600/depositphotos_159673464-stock-video-teacher-speaking-about-programming-on.jpg"));
//
//
//        return list;
//    }

    @Override
    public void onSuccess(Object object) {
        List<Posts> postList = (List<Posts>) object;
        adapter.setPosts(postList);
    }

    @Override
    public void onError(Throwable throwable) {
        Toast.makeText(this, "Error: " + throwable.getMessage(), Toast.LENGTH_SHORT).show();


    }
}
