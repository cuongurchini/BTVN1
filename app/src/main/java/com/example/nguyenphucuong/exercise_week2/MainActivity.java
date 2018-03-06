package com.example.nguyenphucuong.exercise_week2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String TEXT = "text";
    public static final String COLOR = "key_color";
    TextView tvMain;

    private static boolean firstRun = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMain = findViewById(R.id.tvMain);

        Button btnChangeTitle = findViewById(R.id.btnChangeTitle);
        btnChangeTitle.setOnClickListener(btnChangeTitleAction);

        if (firstRun) {
            tvMain.setText("KHTN-DTVT");
            tvMain.setTextColor(getColor(R.color.pink));
            firstRun=false;
        } else {
            Intent data = getIntent();
            if (data != null) {
                String text = data.getStringExtra(ChangeTitleActivity.TEXT);
                int colorValue = data.getIntExtra(ChangeTitleActivity.COLORVALUE,0);

                tvMain.setText(text);
                tvMain.setTextColor(colorValue);
            }
        }

    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        TextView tvMain = (TextView) findViewById(R.id.tvMain);
//        EditText edtChange = (EditText) findViewById(R.id.edtChange);
//        tvMain.setText(edtChange.getText());
//    }

    private View.OnClickListener btnChangeTitleAction = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this, ChangeTitleActivity.class);
            i.putExtra(TEXT, tvMain.getText().toString());
            i.putExtra(COLOR, tvMain.getCurrentTextColor());
            startActivity(i);
        }
    };
}
