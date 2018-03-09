package com.example.nguyenphucuong.exercise_week2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ChangeBackgroundActivity extends AppCompatActivity {

    private ImageView selectedPic;
    private int picCode = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_background);

        selectedPic = findViewById(R.id.imv_topPanel);

        setAction();
    }

    private void setAction() {
        ImageView pic1 = findViewById(R.id.pic1);
        ImageView pic2 = findViewById(R.id.pic2);
        ImageView pic3 = findViewById(R.id.pic3);
        ImageView pic4 = findViewById(R.id.pic4);
        ImageView pic5 = findViewById(R.id.pic5);
        ImageView pic6 = findViewById(R.id.pic6);

        pic1.setOnClickListener(pic1Action);
        pic2.setOnClickListener(pic2Action);
        pic3.setOnClickListener(pic3Action);
        pic4.setOnClickListener(pic4Action);
        pic5.setOnClickListener(pic5Action);
        pic6.setOnClickListener(pic6Action);

        Button btnSave = findViewById(R.id.btnSavePic);
        btnSave.setOnClickListener(saveAction);
    }

    private View.OnClickListener saveAction = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    };

    @Override
    public void finish() {
        Intent intent = new Intent();
        intent.putExtra("pic_code", picCode);
        setResult(RESULT_OK, intent);
        super.finish();
    }

    private View.OnClickListener pic1Action = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            picCode = R.drawable.pic1;
            selectedPic.setImageResource(picCode);
        }
    };

    private View.OnClickListener pic2Action = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            picCode = R.drawable.pic2;
            selectedPic.setImageResource(picCode);
        }
    };

    private View.OnClickListener pic3Action = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            picCode = R.drawable.pic3;
            selectedPic.setImageResource(picCode);
        }
    };

    private View.OnClickListener pic4Action = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            picCode = R.drawable.pic4;
            selectedPic.setImageResource(picCode);
        }
    };

    private View.OnClickListener pic5Action = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            picCode = R.drawable.pic5;
            selectedPic.setImageResource(picCode);
        }
    };

    private View.OnClickListener pic6Action = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            picCode = R.drawable.pic6;
            selectedPic.setImageResource(picCode);
        }
    };
}
