package com.example.firebase_analytics_with_custom_events;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.analytics.FirebaseAnalytics;

public class MainActivity extends AppCompatActivity {

    FirebaseAnalytics analytics;
    Button addToCart_btn,cod_btn,directTransfer_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        analytics= FirebaseAnalytics.getInstance(this);

        addToCart_btn=findViewById(R.id.addToCart_btn);
        cod_btn=findViewById(R.id.cod_btn);
        directTransfer_btn=findViewById(R.id.directTransfer_btn);

        addToCart_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle=new Bundle();
                bundle.putString("Cart","Cart Button");
                analytics.logEvent("Cart_Button",bundle);
            }
        });

        cod_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle=new Bundle();
                bundle.putString("Cod","Cod Button");
                analytics.logEvent("Cod_Button",bundle);
            }
        });

        directTransfer_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle=new Bundle();
                bundle.putString("directTransfer","directTransfer Button");
                analytics.logEvent("directTransfer_Button",bundle);
            }
        });

    }
}
