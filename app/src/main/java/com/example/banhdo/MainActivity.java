package com.example.banhdo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnclickListener {
    RecyclerView rcv_Donut;
    CustomAdapterDonut adt;
    ArrayList<Donut> mDonuts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDonuts = new ArrayList<>();
        rcv_Donut = findViewById(R.id.rec_Donut);

        //Them du lieu
        mDonuts.add(new Donut(R.drawable.donut_yellow, "Tasty Donut", "Spicy tasty donut family", 10, R.drawable.vector6));
        mDonuts.add(new Donut(R.drawable.tasty_donut, "Pink Donut", "Xạo lồn hông có gì zui", 20, R.drawable.vector6));
        mDonuts.add(new Donut(R.drawable.green_donut, "Floatting Donut", "Con đỹ nốn lừng", 30, R.drawable.vector6));
        mDonuts.add(new Donut(R.drawable.donut_red, "Tasty Donut", "Cụ lao công đang cạo lông", 40, R.drawable.vector6));
        mDonuts.add(new Donut(R.drawable.tasty_donut, "Pink Donut", "Ngu dốt phá hoại tăng động", 20, R.drawable.vector6));
        mDonuts.add(new Donut(R.drawable.green_donut, "Floatting Donut", "xúc xích heo gà bò", 30, R.drawable.vector6));
        mDonuts.add(new Donut(R.drawable.donut_red, "Tasty Donut", "Hello các bạn", 40, R.drawable.vector6));


        //
        adt = new CustomAdapterDonut(mDonuts, this);
        rcv_Donut.setHasFixedSize(true);
        rcv_Donut.setAdapter(adt);
        //Layout
        rcv_Donut.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

    }

    @Override
    public void itemClick(Donut donut) {
        //Sự kiện chuyển màn hình
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        //truyền dữ liệu
        intent.putExtra("key1", donut);
        startActivity(intent);
    }
}