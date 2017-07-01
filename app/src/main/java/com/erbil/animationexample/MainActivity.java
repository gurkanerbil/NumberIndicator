package com.erbil.animationexample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView a;
    ImageView b;
    ImageView c;
    ImageView d;
    ImageView e;
    ImageView f;

    TextView aText;
    TextView bText;
    TextView cText;
    TextView dText;
    TextView eText;
    TextView fText;

    Button backButton;
    Button forwardButton;

    EditText editTextTotalId;

    int currId = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = (ImageView) findViewById(R.id.a);
        b = (ImageView) findViewById(R.id.b);
        c = (ImageView) findViewById(R.id.c);
        d = (ImageView) findViewById(R.id.d);
        e = (ImageView) findViewById(R.id.e);
        f = (ImageView) findViewById(R.id.f);

        aText = (TextView) findViewById(R.id.aText);
        bText = (TextView) findViewById(R.id.bText);
        cText = (TextView) findViewById(R.id.cText);
        dText = (TextView) findViewById(R.id.dText);
        eText = (TextView) findViewById(R.id.eText);
        fText = (TextView) findViewById(R.id.fText);

        backButton = (Button) findViewById(R.id.backButton);
        forwardButton = (Button) findViewById(R.id.forwardButton);

        editTextTotalId = (EditText) findViewById(R.id.editTextTotalId);

        backButton.setOnClickListener(this);
        forwardButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (TextUtils.isEmpty(editTextTotalId.getText().toString())) {
            editTextTotalId.setError("Total ID cannot be null!");
        } else {
            int totalId = Integer.parseInt(String.valueOf(editTextTotalId.getText()));

            switch (view.getId()) {
                case R.id.backButton:
                    if (currId != 0)
                        currId--;
                    Log.e("123", "onClick: backward");
                    changeCircle(currId, totalId);

                    break;
                case R.id.forwardButton:
                    if (currId != totalId)
                        currId++;
                    Log.e("123", "onClick: forward");
                    changeCircle(currId, totalId);
                    break;
            }
        }
    }

    public void changeCircle(int currId, int totalId) {
        if (currId == 0) {

            a.setImageResource(R.drawable.sub_empty_circle);
            b.setImageResource(R.drawable.sub_empty_circle);
            c.setImageResource(R.drawable.sub_empty_circle);
            d.setImageResource(R.drawable.sub_empty_circle);
            e.setImageResource(R.drawable.sub_empty_circle);
            f.setImageResource(R.drawable.sub_empty_circle);

            aText.setTextSize(14);
            bText.setTextSize(14);
            cText.setTextSize(14);
            dText.setTextSize(14);
            eText.setTextSize(14);
            fText.setTextSize(14);

        }
        if (currId == 1) {
            a.setImageResource(R.drawable.sub_reading_circle);
            b.setImageResource(R.drawable.sub_empty_circle);
            c.setImageResource(R.drawable.sub_empty_circle);
            d.setImageResource(R.drawable.sub_empty_circle);
            e.setImageResource(R.drawable.sub_empty_circle);
            f.setImageResource(R.drawable.sub_empty_circle);

            aText.setTextSize(23);
            bText.setTextSize(14);
            cText.setTextSize(14);
            dText.setTextSize(14);
            eText.setTextSize(14);
            fText.setTextSize(14);

        } else if (currId == 2) {

            a.setImageResource(R.drawable.sub_read_circle);
            b.setImageResource(R.drawable.sub_reading_circle);
            c.setImageResource(R.drawable.sub_empty_circle);
            d.setImageResource(R.drawable.sub_empty_circle);
            e.setImageResource(R.drawable.sub_empty_circle);
            f.setImageResource(R.drawable.sub_empty_circle);

            aText.setTextSize(14);
            bText.setTextSize(23);
            cText.setTextSize(14);
            dText.setTextSize(14);
            eText.setTextSize(14);
            fText.setTextSize(14);

        } else if (currId >= 3 && currId <= totalId - 3) {

            a.setImageResource(R.drawable.sub_read_circle);
            b.setImageResource(R.drawable.sub_read_circle);
            c.setImageResource(R.drawable.sub_reading_circle);
            d.setImageResource(R.drawable.sub_empty_circle);
            e.setImageResource(R.drawable.sub_empty_circle);
            f.setImageResource(R.drawable.sub_empty_circle);

            aText.setText(String.valueOf(currId - 2));
            bText.setText(String.valueOf(currId - 1));
            cText.setText(String.valueOf(currId));
            dText.setText(String.valueOf(currId + 1));
            eText.setText(String.valueOf(currId + 2));
            fText.setText(String.valueOf(currId + 3));

            aText.setTextSize(14);
            bText.setTextSize(14);
            cText.setTextSize(23);
            dText.setTextSize(14);
            eText.setTextSize(14);
            fText.setTextSize(14);

        } else if (currId == totalId - 2) {

            a.setImageResource(R.drawable.sub_read_circle);
            b.setImageResource(R.drawable.sub_read_circle);
            c.setImageResource(R.drawable.sub_read_circle);
            d.setImageResource(R.drawable.sub_reading_circle);
            e.setImageResource(R.drawable.sub_empty_circle);
            f.setImageResource(R.drawable.sub_empty_circle);

            aText.setTextSize(14);
            bText.setTextSize(14);
            cText.setTextSize(14);
            dText.setTextSize(23);
            eText.setTextSize(14);
            fText.setTextSize(14);

        } else if (currId == totalId - 1) {

            a.setImageResource(R.drawable.sub_read_circle);
            b.setImageResource(R.drawable.sub_read_circle);
            c.setImageResource(R.drawable.sub_read_circle);
            d.setImageResource(R.drawable.sub_read_circle);
            e.setImageResource(R.drawable.sub_reading_circle);
            f.setImageResource(R.drawable.sub_empty_circle);

            aText.setTextSize(14);
            bText.setTextSize(14);
            cText.setTextSize(14);
            dText.setTextSize(14);
            eText.setTextSize(23);
            fText.setTextSize(14);

        } else if (currId == totalId) {

            a.setImageResource(R.drawable.sub_read_circle);
            b.setImageResource(R.drawable.sub_read_circle);
            c.setImageResource(R.drawable.sub_read_circle);
            d.setImageResource(R.drawable.sub_read_circle);
            e.setImageResource(R.drawable.sub_read_circle);
            f.setImageResource(R.drawable.sub_reading_circle);

            aText.setTextSize(14);
            bText.setTextSize(14);
            cText.setTextSize(14);
            dText.setTextSize(14);
            eText.setTextSize(14);
            fText.setTextSize(23);

        }
    }
}
