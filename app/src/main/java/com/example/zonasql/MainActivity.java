package com.example.zonasql;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import kotlin.Suppress;

public class MainActivity extends AppCompatActivity {

    ImageView pndhMateriLayout;
    ImageView pndhAboutLayout;
    ImageView pndhGameLayout;
    ImageView pndhQuizLayout;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pndhMateriLayout = findViewById(R.id.materiLayout);
        pndhAboutLayout = findViewById(R.id.aboutLayout);
        pndhGameLayout = findViewById(R.id.gameLayout);
        pndhQuizLayout = findViewById(R.id.quizLayout);

        pndhMateriLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MateriActivity.class);
                startActivity(intent);
            }
        });

        pndhAboutLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AboutActivity.class);
                startActivity(intent);
            }
        });

        // Layout
//        pndhGameLayout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(MainActivity.this, Games.class);
//                startActivity(intent);
//
//            }
//        });

        // Alerrt Dialog
        pndhGameLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN){

                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

                    builder.setTitle("Petunjuk Game");
                    builder.setMessage("Ada 8 kotak diatas adalah soal, sedangkan 8 kotak dibawah adalah jawaban.\nTugas anda seret kotak yang dibawah kemudian lepaskan di kotak diatas!");

                    builder.setPositiveButton("Mulai", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(MainActivity.this, Games.class);
                            startActivity(intent);
                        }
                    });

                    builder.setNegativeButton("Beranda", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(MainActivity.this, MainActivity.class);
                            startActivity(intent);
                        }
                    });

                    AlertDialog alert = builder.create();
                    alert.show();
                }

                return false;
            }
        });

        pndhQuizLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(intent);
            }
        });
    }
}