package com.example.identra2;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class ScanFrontActivity extends AppCompatActivity {

    private boolean isFlashOn = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_front);

        ImageButton btnBack = findViewById(R.id.btnBackFront);
        ImageButton btnCapture = findViewById(R.id.btnCaptureFront);
        LinearLayout btnFlash = findViewById(R.id.btnFlashFront);
        LinearLayout btnGallery = findViewById(R.id.btnGalleryFront);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btnFlash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isFlashOn = !isFlashOn;
                Toast.makeText(ScanFrontActivity.this, isFlashOn ? "Flashlight ON" : "Flashlight OFF", Toast.LENGTH_SHORT).show();
            }
        });

        btnGallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ScanFrontActivity.this, "CNIC Front Selected from Gallery", Toast.LENGTH_SHORT).show();
            }
        });

        btnCapture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ScanFrontActivity.this, "Front CNIC Captured!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
