package com.example.lucaslima.flatform;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.lucaslima.flatform.CheckBox.CheckableButton;
import com.rm.rmswitch.RMSwitch;

public class Check extends AppCompatActivity {

    public void Check(final CheckableButton checkableButton, final ImageView tick) {

        if (checkableButton.isChecked()) {
            tick.setVisibility(View.VISIBLE);
        } else {
            tick.setVisibility(View.INVISIBLE);
        }
    }

    public void CheckOne(final RMSwitch rmSwitch1, final RMSwitch rmSwitch2, final RMSwitch rmSwitch3, final RMSwitch rmSwitch4) {


        if (rmSwitch1.isChecked()) {
            CheckSwitch(true, rmSwitch2, rmSwitch3, rmSwitch4);
            rmSwitch1.setClickable(false);
        } else if (rmSwitch2.isChecked()) {
            CheckSwitch(true, rmSwitch1, rmSwitch3, rmSwitch4);
            rmSwitch2.setClickable(false);
        } else if (rmSwitch3.isChecked()) {
            CheckSwitch(true, rmSwitch1, rmSwitch2, rmSwitch4);
            rmSwitch3.setClickable(false);
        } else if (rmSwitch4.isChecked()) {
            CheckSwitch(true, rmSwitch1, rmSwitch2, rmSwitch3);
            rmSwitch4.setClickable(false);
        }

    }

    public void CheckSwitch(Boolean ver, RMSwitch rmSwitch01, RMSwitch rmSwitch02, RMSwitch rmSwitch03) {

        if (ver) {
            rmSwitch01.setChecked(false);
            rmSwitch01.setClickable(true);
            rmSwitch02.setChecked(false);
            rmSwitch02.setClickable(true);
            rmSwitch03.setChecked(false);
            rmSwitch03.setClickable(true);
        }

    }

    public void CheckOne_Circle(final CheckableButton checkableButton1, final CheckableButton checkableButton2, final CheckableButton checkableButton3, final CheckableButton checkableButton4, final ImageView tick1, final ImageView tick2, final ImageView tick3, final ImageView tick4) {

        if (checkableButton1.isChecked()) {
            tick1.setVisibility(View.VISIBLE);
            CheckBox(checkableButton2, checkableButton3, checkableButton4, tick2, tick3, tick4);
            checkableButton1.setClickable(false);
        } else if (checkableButton2.isChecked()) {
            tick2.setVisibility(View.VISIBLE);
            CheckBox(checkableButton1, checkableButton3, checkableButton4, tick1, tick3, tick4);
            checkableButton2.setClickable(false);
        } else if (checkableButton3.isChecked()) {
            tick3.setVisibility(View.VISIBLE);
            CheckBox(checkableButton1, checkableButton2, checkableButton4, tick1, tick2, tick4);
            checkableButton3.setClickable(false);
        } else if (checkableButton4.isChecked()) {
            tick4.setVisibility(View.VISIBLE);
            CheckBox(checkableButton1, checkableButton2, checkableButton3, tick1, tick2, tick3);
            checkableButton4.setClickable(false);
        }
    }

    public void CheckBox(CheckableButton checkableButton01, CheckableButton checkableButton02, CheckableButton checkableButton03, ImageView tick01, ImageView tick02, ImageView tick03) {

        if (checkableButton01.isChecked()) {
            tick01.setVisibility(View.INVISIBLE);
            checkableButton01.setChecked(false);
            checkableButton01.setClickable(true);
        }
        if (checkableButton02.isChecked()) {
            tick02.setVisibility(View.INVISIBLE);
            checkableButton02.setChecked(false);
            checkableButton02.setClickable(true);
        }
        if (checkableButton03.isChecked()) {
            tick03.setVisibility(View.INVISIBLE);
            checkableButton03.setChecked(false);
            checkableButton03.setClickable(true);

        }

    }


    public void CheckOne_Border_Circle(final CheckableButton checkableButton1, final CheckableButton checkableButton2, final CheckableButton checkableButton3, final CheckableButton checkableButton4) {

        if (checkableButton1.isChecked()) {
            CheckBox_Circle(checkableButton2, checkableButton3, checkableButton4);
            checkableButton1.setClickable(false);
        } else if (checkableButton2.isChecked()) {
            CheckBox_Circle(checkableButton1, checkableButton3, checkableButton4);
            checkableButton2.setClickable(false);
        } else if (checkableButton3.isChecked()) {
            CheckBox_Circle(checkableButton1, checkableButton2, checkableButton4);
            checkableButton3.setClickable(false);
        } else if (checkableButton4.isChecked()) {
            CheckBox_Circle(checkableButton1, checkableButton2, checkableButton3);
            checkableButton4.setClickable(false);
        }
    }

    public void CheckBox_Circle(CheckableButton checkableButton01, CheckableButton checkableButton02, CheckableButton checkableButton03) {

        if (checkableButton01.isChecked()) {
            checkableButton01.setChecked(false);
            checkableButton01.setClickable(true);
        }
        if (checkableButton02.isChecked()) {
            checkableButton02.setChecked(false);
            checkableButton02.setClickable(true);
        }
        if (checkableButton03.isChecked()) {
            checkableButton03.setChecked(false);
            checkableButton03.setClickable(true);

        }

    }

}
