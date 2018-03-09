package com.example.nguyenphucuong.exercise_week2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    public static final String TEXT = "text";
    public static final String COLOR = "key_color";
    TextView tvMain;
    ImageView backgroundImg;

    private static boolean firstRun = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMain = findViewById(R.id.tvMain);

        Button btnChangeTitle = findViewById(R.id.btnChangeTitle);
        btnChangeTitle.setOnClickListener(btnChangeTitleAction);

        Button btnChangeBackground = findViewById(R.id.btnChangeBackground);
        btnChangeBackground.setOnClickListener(btnChangeBackgroundAction);

        backgroundImg = findViewById(R.id.img_background);

    }


    private View.OnClickListener btnChangeTitleAction = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this, ChangeTitleActivity.class);
            i.putExtra(TEXT, tvMain.getText().toString());
            i.putExtra(COLOR, tvMain.getCurrentTextColor());
            startActivityForResult(i, 1);
        }
    };

    private View.OnClickListener btnChangeBackgroundAction = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this, ChangeBackgroundActivity.class);
            startActivityForResult(i, 2);
        }
    };

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 1) {
            String text = data.getStringExtra(ChangeTitleActivity.TEXT);
            int colorValue = data.getIntExtra(ChangeTitleActivity.COLORVALUE,0);

            tvMain.setText(text);
            tvMain.setTextColor(colorValue);
        }

        if (requestCode == 2) {
            int picCode = data.getExtras().getInt("pic_code");
            if (picCode != 0) {
                Picasso.with(this).load(picCode).into(backgroundImg);
            }
        }

    }
}
