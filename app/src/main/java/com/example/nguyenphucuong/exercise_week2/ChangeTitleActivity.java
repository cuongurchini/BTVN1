package com.example.nguyenphucuong.exercise_week2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by Nguyen Phu Cuong on 03/05/18.
 */

public class ChangeTitleActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changetitle);

        ImageView imageViewPink = (ImageView) findViewById(R.id.ivPink);
        ImageView imageViewPurple = (ImageView) findViewById(R.id.ivPurple);
        ImageView imageViewIndigo = (ImageView) findViewById(R.id.ivIndigo);
        ImageView imageViewBlue = (ImageView) findViewById(R.id.ivBlue);
        ImageView imageViewTeal = (ImageView) findViewById(R.id.ivTeal);
        ImageView imageViewGreen = (ImageView) findViewById(R.id.ivGreen);

        imageViewPink.setOnClickListener(onClickListenerPink);
        imageViewPurple.setOnClickListener(onClickListenerPurple);
        imageViewIndigo.setOnClickListener(onClickListenerIndigo);
        imageViewBlue.setOnClickListener(onClickListenerBlue);
        imageViewTeal.setOnClickListener(onClickListenerTeal);
        imageViewGreen.setOnClickListener(onClickListenerGreen);

        Button btnSave =  (Button) findViewById(R.id.btnSave);
        btnSave.setOnClickListener(onClickListenerSave);
    }

    private View.OnClickListener onClickListenerSave = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(ChangeTitleActivity.this, MainActivity.class);
            startActivity(i);

//            EditText edtChange = (EditText) findViewById(R.id.edtChange);
//            TextView tvMain = (TextView) findViewById(R.id.tvMain);
//            tvMain.setText(edtChange.getText());

//            View vSample = (View) findViewById(R.id.vSample);
//            tvMain.setText((CharSequence) edtChange);
//            tvMain.setTextColor(vSample.getSolidColor());
        }
    };

    private View.OnClickListener onClickListenerPink = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            View vSample = (View) findViewById(R.id.vSample);
            vSample.setBackgroundColor(getColor(R.color.pink));

            EditText edtChange = (EditText) findViewById(R.id.edtChange);
            edtChange.setTextColor(getColor(R.color.pink));
        }
    };

    private View.OnClickListener onClickListenerPurple = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            View vSample = (View) findViewById(R.id.vSample);
            vSample.setBackgroundColor(getColor(R.color.purple));

            EditText edtChange = (EditText) findViewById(R.id.edtChange);
            edtChange.setTextColor(getColor(R.color.purple));
        }
    };

    private View.OnClickListener onClickListenerIndigo = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            View vSample = (View) findViewById(R.id.vSample);
            vSample.setBackgroundColor(getColor(R.color.indigo));

            EditText edtChange = (EditText) findViewById(R.id.edtChange);
            edtChange.setTextColor(getColor(R.color.indigo));
        }
    };

    private View.OnClickListener onClickListenerBlue = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            View vSample = (View) findViewById(R.id.vSample);
            vSample.setBackgroundColor(getColor(R.color.blue));

            EditText edtChange = (EditText) findViewById(R.id.edtChange);
            edtChange.setTextColor(getColor(R.color.blue));
        }
    };

    private View.OnClickListener onClickListenerTeal = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            View vSample = (View) findViewById(R.id.vSample);
            vSample.setBackgroundColor(getColor(R.color.teal));

            EditText edtChange = (EditText) findViewById(R.id.edtChange);
            edtChange.setTextColor(getColor(R.color.teal));
        }
    };

    private View.OnClickListener onClickListenerGreen = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            View vSample = (View) findViewById(R.id.vSample);
            vSample.setBackgroundColor(getColor(R.color.green));

            EditText edtChange = (EditText) findViewById(R.id.edtChange);
            edtChange.setTextColor(getColor(R.color.green));
        }
    };
}
