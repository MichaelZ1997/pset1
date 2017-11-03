package com.example.michael.michaelvanderzwet_pset1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    CheckBox cb1, cb2, cb3, cb4, cb5, cb6, cb7, cb8, cb9, cb10;
    ImageView iv1, iv2, iv3, iv4, iv5, iv6, iv7, iv8, iv9, iv10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = (CheckBox) findViewById(R.id.neus);
        cb2 = (CheckBox) findViewById(R.id.mond);
        cb3 = (CheckBox) findViewById(R.id.snor);
        cb4 = (CheckBox) findViewById(R.id.schoenen);
        cb5 = (CheckBox) findViewById(R.id.armen);
        cb6 = (CheckBox) findViewById(R.id.hoed);
        cb7 = (CheckBox) findViewById(R.id.oren);
        cb8 = (CheckBox) findViewById(R.id.bril);
        cb9 = (CheckBox) findViewById(R.id.ogen);
        cb10 = (CheckBox) findViewById(R.id.wenkbrauwen);

        iv1 = (ImageView) findViewById(R.id.arms);
        iv2 = (ImageView) findViewById(R.id.ears);
        iv3 = (ImageView) findViewById(R.id.eyebrows);
        iv4 = (ImageView) findViewById(R.id.eyes);
        iv5 = (ImageView) findViewById(R.id.glasses);
        iv6 = (ImageView) findViewById(R.id.hat);
        iv7 = (ImageView) findViewById(R.id.mouth);
        iv8 = (ImageView) findViewById(R.id.mustache);
        iv9 = (ImageView) findViewById(R.id.nose);
        iv10 = (ImageView) findViewById(R.id.shoes);


}

    public void CheckBoxClicked(View view) {
        if (cb1.isChecked()) {
            iv9.setVisibility(View.VISIBLE);
        } else {
            iv9.setVisibility(View.INVISIBLE);
        }

        if (cb2.isChecked()) {
            iv7.setVisibility(View.VISIBLE);
        } else {
            iv7.setVisibility(View.INVISIBLE);
        }

        if (cb3.isChecked()) {
            iv8.setVisibility(View.VISIBLE);
        } else {
            iv8.setVisibility(View.INVISIBLE);
        }

        if (cb4.isChecked()) {
            iv10.setVisibility(View.VISIBLE);
        } else {
            iv10.setVisibility(View.INVISIBLE);
        }

        if (cb5.isChecked()) {
            iv1.setVisibility(View.VISIBLE);
        } else {
            iv1.setVisibility(View.INVISIBLE);
        }

        if (cb6.isChecked()) {
            iv6.setVisibility(View.VISIBLE);
        } else {
            iv6.setVisibility(View.INVISIBLE);
        }

        if (cb7.isChecked()) {
            iv2.setVisibility(View.VISIBLE);
        } else {
            iv2.setVisibility(View.INVISIBLE);
        }

        if (cb8.isChecked()) {
            iv5.setVisibility(View.VISIBLE);
        } else {
            iv5.setVisibility(View.INVISIBLE);
        }

        if (cb9.isChecked()) {
            iv4.setVisibility(View.VISIBLE);
        } else {
            iv4.setVisibility(View.INVISIBLE);
        }

        if (cb10.isChecked()) {
            iv3.setVisibility(View.VISIBLE);
        } else {
            iv3.setVisibility(View.INVISIBLE);
        }

    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        Integer imageViewValue3 = iv10.getVisibility();
        outState.putInt("iv10", imageViewValue3);

        Integer imageViewValue = iv9.getVisibility();
        outState.putInt("iv9", imageViewValue);

        Integer imageViewValue2 = iv8.getVisibility();
        outState.putInt("iv8", imageViewValue2);

        Integer imageViewValue4 = iv7.getVisibility();
        outState.putInt("iv7", imageViewValue4);

        Integer imageViewValue5 = iv6.getVisibility();
        outState.putInt("iv6", imageViewValue5);

        Integer imageViewValue6 = iv5.getVisibility();
        outState.putInt("iv5", imageViewValue6);

        Integer imageViewValue7 = iv4.getVisibility();
        outState.putInt("iv4", imageViewValue7);

        Integer imageViewValue8 = iv3.getVisibility();
        outState.putInt("iv3", imageViewValue8);

        Integer imageViewValue9 = iv2.getVisibility();
        outState.putInt("iv2", imageViewValue9);

        Integer imageViewValue10 = iv1.getVisibility();
        outState.putInt("iv1", imageViewValue10);

        }


    @Override
    public void onRestoreInstanceState(Bundle inState) {
        super.onRestoreInstanceState(inState);

        Integer imageViewValueRestored3 = inState.getInt("iv10");
        iv10.setVisibility(imageViewValueRestored3);

        Integer imageViewValueRestored = inState.getInt("iv9");
        iv9.setVisibility(imageViewValueRestored);

        Integer imageViewValueRestored2 = inState.getInt("iv8");
        iv8.setVisibility(imageViewValueRestored2);

        Integer imageViewValueRestored4 = inState.getInt("iv7");
        iv7.setVisibility(imageViewValueRestored4);

        Integer imageViewValueRestored5 = inState.getInt("iv6");
        iv6.setVisibility(imageViewValueRestored5);

        Integer imageViewValueRestored6 = inState.getInt("iv5");
        iv5.setVisibility(imageViewValueRestored6);

        Integer imageViewValueRestored7 = inState.getInt("iv4");
        iv4.setVisibility(imageViewValueRestored7);

        Integer imageViewValueRestored8 = inState.getInt("iv3");
        iv3.setVisibility(imageViewValueRestored8);

        Integer imageViewValueRestored9 = inState.getInt("iv2");
        iv2.setVisibility(imageViewValueRestored9);

        Integer imageViewValueRestored10 = inState.getInt("iv1");
        iv1.setVisibility(imageViewValueRestored10);
    }

}


