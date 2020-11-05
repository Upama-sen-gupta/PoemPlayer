package com.example.poemplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {

    Button btnTwinkle,btnRainbow,btnEarly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnTwinkle=findViewById(R.id.btn_twinkle);
        btnRainbow=findViewById(R.id.btn_rainbow);
        btnEarly=findViewById(R.id.btn_early);

        btnTwinkle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("poem","twinkle");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Twinkle Twinkle", Toast.LENGTH_SHORT).show();
            }
        });

        btnRainbow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("poem","rainbow");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Rainbow", Toast.LENGTH_SHORT).show();
            }
        });

        btnEarly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(HomeActivity.this,DetailsActivity.class);
                intent.putExtra("poem","early");
                startActivity(intent);
                Toast.makeText(HomeActivity.this, "Early to Bed", Toast.LENGTH_SHORT).show();
            }
        });

    }
}