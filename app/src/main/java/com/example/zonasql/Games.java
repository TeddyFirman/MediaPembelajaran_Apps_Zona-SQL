package com.example.zonasql;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.DragEvent;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

public class Games extends AppCompatActivity {

    LinearLayout target1, target2, target3, target4, target5, target6, target7, target8;
    Button test1, test2, test3, test4, test5, test6, test7, test8, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8;
    MediaPlayer correct;
    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        setContentView(R.layout.activity_games);

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        target1 = findViewById(R.id.target1);
        target2 = findViewById(R.id.target2);
        target3 = findViewById(R.id.target3);
        target4 = findViewById(R.id.target4);
        target5 = findViewById(R.id.target5);
        target6 = findViewById(R.id.target6);
        target7 = findViewById(R.id.target7);
        target8 = findViewById(R.id.target8);

        test1 = findViewById(R.id.test1);
        test2 = findViewById(R.id.test2);
        test3 = findViewById(R.id.test3);
        test4 = findViewById(R.id.test4);
        test5 = findViewById(R.id.test5);
        test6 = findViewById(R.id.test6);
        test7 = findViewById(R.id.test7);
        test8 = findViewById(R.id.test8);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);

        target1.setOnDragListener(dragListener);
        target2.setOnDragListener(dragListener);
        target3.setOnDragListener(dragListener);
        target4.setOnDragListener(dragListener);
        target5.setOnDragListener(dragListener);
        target6.setOnDragListener(dragListener);
        target7.setOnDragListener(dragListener);
        target8.setOnDragListener(dragListener);

        btn1.setOnLongClickListener(longClickListener);
        btn2.setOnLongClickListener(longClickListener);
        btn3.setOnLongClickListener(longClickListener);
        btn4.setOnLongClickListener(longClickListener);
        btn5.setOnLongClickListener(longClickListener);
        btn6.setOnLongClickListener(longClickListener);
        btn7.setOnLongClickListener(longClickListener);
        btn8.setOnLongClickListener(longClickListener);

        correct = MediaPlayer.create(Games.this, R.raw.correct);
    }

    View.OnLongClickListener longClickListener = new View.OnLongClickListener() {
        @Override
        public boolean onLongClick(View v) {
            ClipData data = ClipData.newPlainText("", "");
            View.DragShadowBuilder myshadowbuilder = new View.DragShadowBuilder(v);
            v.startDrag(data, myshadowbuilder, v , 0);
            return true;
        }
    };

    View.OnDragListener dragListener = new View.OnDragListener() {
        @Override
        public boolean onDrag(View v, DragEvent event) {

            int dragEvent = event.getAction();
            final View view = (View) event.getLocalState();

            switch (dragEvent){
                case DragEvent.ACTION_DRAG_ENTERED:

                    break;
                case DragEvent.ACTION_DRAG_EXITED:
                    break;
                case DragEvent.ACTION_DROP:
                    if (view.getId() == R.id.btn7 && v.getId() == R.id.target1){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        LinearLayout newParrent = (LinearLayout) v;
                        test1.setVisibility(View.GONE);
                        newParrent.addView(view);
                        i++;
                        if (i == 8){
                            correct.start();
                        }
                    }
                    else if (view.getId() == R.id.btn2 && v.getId() == R.id.target2){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        LinearLayout newParrent = (LinearLayout) v;
                        test2.setVisibility(View.GONE);
                        newParrent.addView(view);
                        i++;
                        if (i == 8){
                            correct.start();
                        }
                    }
                    else if (view.getId() == R.id.btn5 && v.getId() == R.id.target3){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        LinearLayout newParrent = (LinearLayout) v;
                        test3.setVisibility(View.GONE);
                        newParrent.addView(view);
                        i++;
                        if (i == 8){
                            correct.start();
                        }
                    }
                    else if (view.getId() == R.id.btn8 && v.getId() == R.id.target4){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        LinearLayout newParrent = (LinearLayout) v;
                        test4.setVisibility(View.GONE);
                        newParrent.addView(view);
                        i++;
                        if (i == 8){
                            correct.start();
                        }
                    }
                    else if (view.getId() == R.id.btn4 && v.getId() == R.id.target5){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        LinearLayout newParrent = (LinearLayout) v;
                        test5.setVisibility(View.GONE);
                        newParrent.addView(view);
                        i++;
                        if (i == 4){
                            correct.start();
                        }
                    }
                    else if (view.getId() == R.id.btn3 && v.getId() == R.id.target6){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        LinearLayout newParrent = (LinearLayout) v;
                        test6.setVisibility(View.GONE);
                        newParrent.addView(view);
                        i++;
                        if (i == 8){
                            correct.start();
                        }
                    }
                    else if (view.getId() == R.id.btn1 && v.getId() == R.id.target7){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        LinearLayout newParrent = (LinearLayout) v;
                        test7.setVisibility(View.GONE);
                        newParrent.addView(view);
                        i++;
                        if (i == 8){
                            correct.start();
                        }
                    }
                    else if (view.getId() == R.id.btn6 && v.getId() == R.id.target8){
                        LinearLayout oldparent = (LinearLayout) view.getParent();
                        oldparent.removeView(view);
                        LinearLayout newParrent = (LinearLayout) v;
                        test8.setVisibility(View.GONE);
                        newParrent.addView(view);
                        i++;
                        if (i == 8){
                            correct.start();
                        }
                    }
                    else {
                        MediaPlayer media = MediaPlayer.create(Games.this, R.raw.wrong);
                        media.start();
                    }
                    break;
            }
            return true;
        }
    };
}