package com.example.mernmarketplace;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class ProductActivityCustomer extends AppCompatActivity {
    TextView nameText,descText,priceText;
    ImageView prodImage,homeImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing);
        String image = getIntent().getStringExtra("image");
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        String price =  getIntent().getStringExtra("price");
        nameText = findViewById(R.id.prodName);
        descText = findViewById(R.id.prodDesc);
        priceText = findViewById(R.id.prodPrice);
        prodImage = findViewById(R.id.prodImg);
        homeImage = findViewById(R.id.imageView3);
        nameText.setText(title);
        descText.setText(description);
        priceText.setText(price);
        Picasso.with(ProductActivityCustomer.this).load(image).into(prodImage);
        homeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}