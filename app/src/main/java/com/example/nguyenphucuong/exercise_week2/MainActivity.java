package com.example.nguyenphucuong.exercise_week2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView tvMain = (TextView) findViewById(R.id.tvMain);
//        tvMain.setText("KHTN-DTVT");
//        tvMain.setTextColor(getColor(R.color.pink));

        Button btnChangeTitle = (Button) findViewById(R.id.btnChangeTitle);
        btnChangeTitle.setOnClickListener(onClickListener);
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        TextView tvMain = (TextView) findViewById(R.id.tvMain);
//        EditText edtChange = (EditText) findViewById(R.id.edtChange);
//        tvMain.setText(edtChange.getText());
//    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(MainActivity.this, ChangeTitleActivity.class);
            startActivity(i);
        }
    };
}
