package com.example.myrecyclerviewhw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class InfoActivity extends AppCompatActivity {
    TextView textInfo1, textInfo2, textInfo3, textInfo4;
    ImageView imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        init();
        Title title = (Title) getIntent().getSerializableExtra("key");
        if (title != null) {
            textInfo1.setText(title.getName());
            textInfo2.setText(title.getLastName());
            textInfo3.setText(title.getAge());
            textInfo4.setText(title.getGroup());
           Glide.with(this).load(title.getImageView()).into(imageView2);
            Log.e("TAG", "onCreate: " + title.getImageView());
        }

    }

    private void init() {
        textInfo1 = findViewById(R.id.txtInfo1);
        textInfo2 = findViewById(R.id.txtInfo2);
        textInfo3 = findViewById(R.id.txtInfo3);
        textInfo4 = findViewById(R.id.txtInfo4);
        imageView2 = findViewById(R.id.imageView2);
    }
}