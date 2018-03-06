package com.example.nguyenphucuong.exercise_week2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.PaintDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by Nguyen Phu Cuong on 03/05/18.
 */

public class ChangeTitleActivity extends Activity {

    private View color;
    private EditText edtChange;
    public static final String COLORVALUE = "key_color_value";
    public static final String TEXT = "key_text";

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
        color = (View) findViewById(R.id.vSample);
        edtChange = (EditText) findViewById(R.id.edtChange);

        imageViewPink.setOnClickListener(onClickListenerPink);
        imageViewPurple.setOnClickListener(onClickListenerPurple);
        imageViewIndigo.setOnClickListener(onClickListenerIndigo);
        imageViewBlue.setOnClickListener(onClickListenerBlue);
        imageViewTeal.setOnClickListener(onClickListenerTeal);
        imageViewGreen.setOnClickListener(onClickListenerGreen);

        Button btnSave =  (Button) findViewById(R.id.btnSave);
        btnSave.setOnClickListener(onClickListenerSave);

        Intent data = getIntent();
        if (data != null) {
            String text = data.getStringExtra(MainActivity.TEXT);
            int colorValue = data.getIntExtra(MainActivity.COLOR,0);
            edtChange.setText(text);
            edtChange.setTextColor(colorValue);
            color.setBackgroundColor(colorValue);
        }
    }

    private View.OnClickListener onClickListenerSave = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            Intent i = new Intent(ChangeTitleActivity.this, MainActivity.class);
            i.putExtra(COLORVALUE, ((ColorDrawable) color.getBackground()).getColor());
            i.putExtra(TEXT, edtChange.getText().toString());
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

            edtChange.setTextColor(getColor(R.color.pink));
        }
    };

    private View.OnClickListener onClickListenerPurple = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            View vSample = (View) findViewById(R.id.vSample);
            vSample.setBackgroundColor(getColor(R.color.purple));

            edtChange.setTextColor(getColor(R.color.purple));
        }
    };

    private View.OnClickListener onClickListenerIndigo = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            View vSample = (View) findViewById(R.id.vSample);
            vSample.setBackgroundColor(getColor(R.color.indigo));

            edtChange.setTextColor(getColor(R.color.indigo));
        }
    };

    private View.OnClickListener onClickListenerBlue = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            View vSample = (View) findViewById(R.id.vSample);
            vSample.setBackgroundColor(getColor(R.color.blue));

            edtChange.setTextColor(getColor(R.color.blue));
        }
    };

    private View.OnClickListener onClickListenerTeal = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            View vSample = (View) findViewById(R.id.vSample);
            vSample.setBackgroundColor(getColor(R.color.teal));

            edtChange.setTextColor(getColor(R.color.teal));
        }
    };

    private View.OnClickListener onClickListenerGreen = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            View vSample = (View) findViewById(R.id.vSample);
            vSample.setBackgroundColor(getColor(R.color.green));

            edtChange.setTextColor(getColor(R.color.green));
        }
    };
}
