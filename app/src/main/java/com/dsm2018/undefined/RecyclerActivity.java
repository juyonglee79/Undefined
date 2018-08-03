package com.dsm2018.undefined;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        recyclerView = (RecyclerView) findViewById(R.id.my_recycler);
        ArrayList<Item> singModles = new ArrayList<>();
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(singModles);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        singModles.add(new Item(R.drawable.home1, "제 집에 놀러오세요!!", "저희집은 넓은 평수와 한강뷰를 자랑하고 있으며 야경이 아주 죽여주는 곳입니다. 사진을 보면....", "sopia님의 집"));
        singModles.add(new Item(R.drawable.home2, "Welcome to my house!!", " Hello! This is my house and I want to sell it.Please come to my house....", "hans님의 집"));
        singModles.add(new Item(R.drawable.home3, "제 집을 소개합니다!!", "저희집은 현재 제가 산지 1년 정도 지났고 제 아름다운 추억이 담겨있는 집입니다. 소중한...", "bob님의 집"));
        singModles.add(new Item(R.drawable.home4, "This is my house!!", "I live here for 5 years.I want to go to USA now. I want to sell this house....", "sam님의 집"));
        singModles.add(new Item(R.drawable.home5, "제 집 보고가실래요?", "저희집은 아주 좋은 전망과 한강뷰가 보이는 곳에 위치해 있으며 한채 평당 3000만원....", "mike님의 집"));
        singModles.add(new Item(R.drawable.home6, "제 집에 놀러오세요!!", "안녕하세요!저는 party를 즐기는 20살 여자 lily입니다! 저는 저희 집에서 party를 하는....", "lily님의 집"));
        singModles.add(new Item(R.drawable.home7, "반갑습니다! go입니다!!", "저는 오늘 처음 가입한 go입니다. 좋고 쾌적한 공간인 제 집을 공개하겠습니다. 아무도...", "go님의 집"));
        singModles.add(new Item(R.drawable.home8, "공주 julia의 집에 오신걸 환영합니다!!", "안녕하세요! 저는 공주 julia입니다. 지금부터 간단하게 제 집을 소개해드릴께ㅇㅛ!...", "julia님의 집"));

    }
}
