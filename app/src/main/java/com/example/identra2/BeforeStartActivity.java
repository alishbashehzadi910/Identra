package com.example.identra2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class BeforeStartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_before_start);

        ImageButton btnBack = findViewById(R.id.btnBack);
        AppCompatButton btnContinue = findViewById(R.id.btnContinue);

        // Goes back to Screen 1 when '<' is clicked
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        // Moves to Screen 3 (ScanFrontActivity) when 'Continue ->' is clicked
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BeforeStartActivity.this, ScanFrontActivity.class);
                startActivity(intent);
            }
        });
    }
}
