package com.example.lucaslima.flatform;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.lucaslima.flatform.CheckBox.CheckableButton;
import com.rm.rmswitch.RMSwitch;


import org.angmarch.views.NiceSpinner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    View include_switch_basic_1, include_switch_basic_2, include_switch_basic_3, include_switch_basic_4;
    private RMSwitch switch_basic_1, switch_basic_2, switch_basic_3, switch_basic_4;

    View include_checkbox_basic_1, include_checkbox_basic_2, include_checkbox_basic_3, include_checkbox_basic_4, include_checkbox_circle_1, include_checkbox_circle_2, include_checkbox_circle_3, include_checkbox_circle_4;
    private CheckableButton checkbox_basic_1, checkbox_basic_2, checkbox_basic_3, checkbox_basic_4, checkbox_circle_1, checkbox_circle_2, checkbox_circle_3, checkbox_circle_4;
    private ImageView tick_1, tick_2, tick_3, tick_4, tick_5, tick_6, tick_7, tick_8;

    View include_switch_dual_1, include_switch_dual_2, include_switch_dual_3, include_switch_dual_4;
    private RMSwitch switch_dual_1, switch_dual_2, switch_dual_3, switch_dual_4;

    View include_checkbox_border_circle_1, include_checkbox_border_circle_2, include_checkbox_border_circle_3, include_checkbox_border_circle_4;
    private CheckableButton checkbox_border_circle_1, checkbox_border_circle_2, checkbox_border_circle_3, checkbox_border_circle_4;

    View include_expansion_panel;
    private NiceSpinner expansion_panel;

    Check isCheck = new Check();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        include_switch_basic_1 = findViewById(R.id.switch_basic_5);
        switch_basic_1 = include_switch_basic_1.findViewById(R.id.switch_basic_button);

        include_switch_basic_2 = findViewById(R.id.switch_basic_6);
        switch_basic_2 = include_switch_basic_2.findViewById(R.id.switch_basic_button);

        include_switch_basic_3 = findViewById(R.id.switch_basic_7);
        switch_basic_3 = include_switch_basic_3.findViewById(R.id.switch_basic_button);

        include_switch_basic_4 = findViewById(R.id.switch_basic_8);
        switch_basic_4 = include_switch_basic_4.findViewById(R.id.switch_basic_button);


        include_checkbox_basic_1 = findViewById(R.id.checkbox_basic_1);
        checkbox_basic_1 = include_checkbox_basic_1.findViewById(R.id.checkbox_basic_button);
        tick_1 = include_checkbox_basic_1.findViewById(R.id.tick);

        include_checkbox_basic_2 = findViewById(R.id.checkbox_basic_2);
        checkbox_basic_2 = include_checkbox_basic_2.findViewById(R.id.checkbox_basic_button);
        tick_2 = include_checkbox_basic_2.findViewById(R.id.tick);

        include_checkbox_basic_3 = findViewById(R.id.checkbox_basic_3);
        checkbox_basic_3 = include_checkbox_basic_3.findViewById(R.id.checkbox_basic_button);
        tick_3 = include_checkbox_basic_3.findViewById(R.id.tick);

        include_checkbox_basic_4 = findViewById(R.id.checkbox_basic_4);
        checkbox_basic_4 = include_checkbox_basic_4.findViewById(R.id.checkbox_basic_button);
        tick_4 = include_checkbox_basic_4.findViewById(R.id.tick);

        include_checkbox_circle_1 = findViewById(R.id.checkbox_circle_1);
        checkbox_circle_1 = include_checkbox_circle_1.findViewById(R.id.checkbox_circle_button);
        tick_5 = include_checkbox_circle_1.findViewById(R.id.tick_circle);

        include_checkbox_circle_2 = findViewById(R.id.checkbox_circle_2);
        checkbox_circle_2 = include_checkbox_circle_2.findViewById(R.id.checkbox_circle_button);
        tick_6 = include_checkbox_circle_2.findViewById(R.id.tick_circle);

        include_checkbox_circle_3 = findViewById(R.id.checkbox_circle_3);
        checkbox_circle_3 = include_checkbox_circle_3.findViewById(R.id.checkbox_circle_button);
        tick_7 = include_checkbox_circle_3.findViewById(R.id.tick_circle);

        include_checkbox_circle_4 = findViewById(R.id.checkbox_circle_4);
        checkbox_circle_4 = include_checkbox_circle_4.findViewById(R.id.checkbox_circle_button);
        tick_8 = include_checkbox_circle_4.findViewById(R.id.tick_circle);


        include_switch_dual_1 = findViewById(R.id.switch_dual_5);
        switch_dual_1 = include_switch_dual_1.findViewById(R.id.switch_dual_button);

        include_switch_dual_2 = findViewById(R.id.switch_dual_6);
        switch_dual_2 = include_switch_dual_2.findViewById(R.id.switch_dual_button);

        include_switch_dual_3 = findViewById(R.id.switch_dual_7);
        switch_dual_3 = include_switch_dual_3.findViewById(R.id.switch_dual_button);

        include_switch_dual_4 = findViewById(R.id.switch_dual_8);
        switch_dual_4 = include_switch_dual_4.findViewById(R.id.switch_dual_button);


        include_checkbox_border_circle_1 = findViewById(R.id.checkbox_border_circle_1);
        checkbox_border_circle_1 = include_checkbox_border_circle_1.findViewById(R.id.checkbox_border_button);

        include_checkbox_border_circle_2 = findViewById(R.id.checkbox_border_circle_2);
        checkbox_border_circle_2 = include_checkbox_border_circle_2.findViewById(R.id.checkbox_border_button);

        include_checkbox_border_circle_3 = findViewById(R.id.checkbox_border_circle_3);
        checkbox_border_circle_3 = include_checkbox_border_circle_3.findViewById(R.id.checkbox_border_button);

        include_checkbox_border_circle_4 = findViewById(R.id.checkbox_border_circle_4);
        checkbox_border_circle_4 = include_checkbox_border_circle_4.findViewById(R.id.checkbox_border_button);

        include_expansion_panel = findViewById(R.id.expansion_panels);
        expansion_panel = include_expansion_panel.findViewById(R.id.expansion_panel_button);

        Switch_Basic();

        Checkbox_Basic();

        Checkbox_Circle();

        Switch_Dual();

        Checkbox_Border_Circle();

        Expansion_panel();


    }

    public void Switch_Basic() {


        switch_basic_1.addSwitchObserver(new RMSwitch.RMSwitchObserver() {
            @Override
            public void onCheckStateChange(RMSwitch switchView, boolean isChecked) {
                isCheck.CheckOne(switch_basic_1, switch_basic_2, switch_basic_3, switch_basic_4);
            }
        });

        switch_basic_2.addSwitchObserver(new RMSwitch.RMSwitchObserver() {
            @Override
            public void onCheckStateChange(RMSwitch switchView, boolean isChecked) {
                isCheck.CheckOne(switch_basic_2, switch_basic_1, switch_basic_3, switch_basic_4);
            }
        });

        switch_basic_3.addSwitchObserver(new RMSwitch.RMSwitchObserver() {
            @Override
            public void onCheckStateChange(RMSwitch switchView, boolean isChecked) {
                isCheck.CheckOne(switch_basic_3, switch_basic_1, switch_basic_2, switch_basic_4);
            }
        });

        switch_basic_4.addSwitchObserver(new RMSwitch.RMSwitchObserver() {
            @Override
            public void onCheckStateChange(RMSwitch switchView, boolean isChecked) {
                isCheck.CheckOne(switch_basic_4, switch_basic_1, switch_basic_2, switch_basic_3);
            }
        });

    }


    public void Checkbox_Basic() {

        checkbox_basic_1.setOnCheckChangeLisnter(new CheckableButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(View buttonView, boolean isChecked) {
                isCheck.Check(checkbox_basic_1, tick_1);
            }
        });

        checkbox_basic_2.setOnCheckChangeLisnter(new CheckableButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(View buttonView, boolean isChecked) {
                isCheck.Check(checkbox_basic_2, tick_2);
            }
        });

        checkbox_basic_3.setOnCheckChangeLisnter(new CheckableButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(View buttonView, boolean isChecked) {
                isCheck.Check(checkbox_basic_3, tick_3);
            }
        });

        checkbox_basic_4.setOnCheckChangeLisnter(new CheckableButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(View buttonView, boolean isChecked) {
                isCheck.Check(checkbox_basic_4, tick_4);
            }
        });

    }

    public void Checkbox_Circle() {

        checkbox_circle_1.setOnCheckChangeLisnter(new CheckableButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(View buttonView, boolean isChecked) {
                //isCheck.Check(checkbox_circle_1, tick_5);
                isCheck.CheckOne_Circle(checkbox_circle_1, checkbox_circle_2, checkbox_circle_3, checkbox_circle_4, tick_5, tick_6, tick_7, tick_8);
            }
        });

        checkbox_circle_2.setOnCheckChangeLisnter(new CheckableButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(View buttonView, boolean isChecked) {
                //isCheck.Check(checkbox_circle_2, tick_6);
                isCheck.CheckOne_Circle(checkbox_circle_2, checkbox_circle_1, checkbox_circle_3, checkbox_circle_4, tick_6, tick_5, tick_7, tick_8);


            }
        });

        checkbox_circle_3.setOnCheckChangeLisnter(new CheckableButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(View buttonView, boolean isChecked) {
                //isCheck.Check(checkbox_circle_3, tick_7);
                isCheck.CheckOne_Circle(checkbox_circle_3, checkbox_circle_1, checkbox_circle_2, checkbox_circle_4, tick_7, tick_5, tick_6, tick_8);

            }
        });

        checkbox_circle_4.setOnCheckChangeLisnter(new CheckableButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(View buttonView, boolean isChecked) {
                //isCheck.Check(checkbox_circle_4, tick_8);
                isCheck.CheckOne_Circle(checkbox_circle_4, checkbox_circle_1, checkbox_circle_2, checkbox_circle_3, tick_8, tick_5, tick_6, tick_7);


            }
        });

    }

    public void Switch_Dual() {

        switch_dual_1.addSwitchObserver(new RMSwitch.RMSwitchObserver() {
            @Override
            public void onCheckStateChange(RMSwitch switchView, boolean isChecked) {
                isCheck.CheckOne(switch_dual_1, switch_dual_2, switch_dual_3, switch_dual_4);
            }
        });

        switch_dual_2.addSwitchObserver(new RMSwitch.RMSwitchObserver() {
            @Override
            public void onCheckStateChange(RMSwitch switchView, boolean isChecked) {
                isCheck.CheckOne(switch_dual_2, switch_dual_1, switch_dual_3, switch_dual_4);
            }
        });

        switch_dual_3.addSwitchObserver(new RMSwitch.RMSwitchObserver() {
            @Override
            public void onCheckStateChange(RMSwitch switchView, boolean isChecked) {
                isCheck.CheckOne(switch_dual_3, switch_dual_1, switch_dual_2, switch_dual_4);
            }
        });

        switch_dual_4.addSwitchObserver(new RMSwitch.RMSwitchObserver() {
            @Override
            public void onCheckStateChange(RMSwitch switchView, boolean isChecked) {
                isCheck.CheckOne(switch_dual_4, switch_dual_1, switch_dual_2, switch_dual_3);
            }
        });

    }

    public void Checkbox_Border_Circle() {

        checkbox_border_circle_1.setOnCheckChangeLisnter(new CheckableButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(View buttonView, boolean isChecked) {
                isCheck.CheckOne_Border_Circle(checkbox_border_circle_1, checkbox_border_circle_2, checkbox_border_circle_3, checkbox_border_circle_4);
            }
        });

        checkbox_border_circle_2.setOnCheckChangeLisnter(new CheckableButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(View buttonView, boolean isChecked) {
                isCheck.CheckOne_Border_Circle(checkbox_border_circle_2, checkbox_border_circle_1, checkbox_border_circle_3, checkbox_border_circle_4);
            }
        });

        checkbox_border_circle_3.setOnCheckChangeLisnter(new CheckableButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(View buttonView, boolean isChecked) {
                isCheck.CheckOne_Border_Circle(checkbox_border_circle_3, checkbox_border_circle_1, checkbox_border_circle_2, checkbox_border_circle_4);
            }
        });

        checkbox_border_circle_4.setOnCheckChangeLisnter(new CheckableButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(View buttonView, boolean isChecked) {
                isCheck.CheckOne_Border_Circle(checkbox_border_circle_4, checkbox_border_circle_1, checkbox_border_circle_2, checkbox_border_circle_3);
            }
        });

    }

    public void Expansion_panel() {

        List<String> dataset = new LinkedList<>(Arrays.asList("option 1", "option 2", "option 3", "option 4"));
        expansion_panel.setHintTextColor(Color.WHITE);
        expansion_panel.attachDataSource(dataset);
        expansion_panel.setTextColor(Color.WHITE);
        expansion_panel.setHintTextColor(Color.WHITE);

    }


}
