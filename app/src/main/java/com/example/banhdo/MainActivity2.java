package com.example.banhdo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    ImageView imgDonutDt;
    TextView tvNameDt, tvPriceDt, tvDesDt, tvSoDt;
    Button btn_addToCart, btn_Cong, btn_Tru;
    Donut mDonut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imgDonutDt = findViewById(R.id.imgDonutDt);
        tvNameDt = findViewById(R.id.tvNameDt);
        tvPriceDt = findViewById(R.id.tvPriceDt);
        tvDesDt = findViewById(R.id.tvDesDt);
        tvSoDt = findViewById(R.id.tvSoDt);
        btn_addToCart = findViewById(R.id.btn_addToCart);
        btn_Cong = findViewById(R.id.btnCong);
        btn_Tru = findViewById(R.id.btnTru);

        //Lấy dữ liệu được truyền qua bởi main1
        Intent intent = getIntent();
        if(intent != null){
            mDonut = (Donut) intent.getSerializableExtra("key1");
            imgDonutDt.setImageResource(mDonut.getAnh());
            tvNameDt.setText(mDonut.getName());
            tvPriceDt.setText(mDonut.getPrice()+ ""); //Chỗ price nhớ + ""
            tvDesDt.setText(mDonut.getDes());

        }

    }
}