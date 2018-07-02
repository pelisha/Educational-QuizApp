package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user touches the button */
    public void sendMessage(View view) {
        // Do something in response to button click
    }
    public class ScrollView
            extends FrameLayout

java.lang.Object.
   	android.view.View
 	android.view.ViewGroup
 	android.widget.FrameLayout
 	android.widget.ScrollView

    public void submitOrder(View view){
        CheckBox CoulombsCheckBox=(checkBox) find
    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.question_one_A:
                if (checked)
                    // Potential Energy
                    break;
            case R.id.question_one_B:
                if (checked)
                    // Primary Element
                    break;
            case R.id.question_one_C:
                if (checked)
                    // Primary Energy
                    break;
            case R.id.question_one_D:
                if (checked)
                    // Kilowatt
                    break;
        }

        public void onRadioButtonClicked(View view) {
            // Is the button now checked?
            boolean checked = ((RadioButton) view).isChecked();

            // Check which radio button was clicked
            switch(view.getId()) {
                case R.id.question_four_A:
                    if (checked)
                        // 15 ohms
                        break;
                case R.id.question_four_B:
                    if (checked)
                        // 8 ohms
                        break;
                case R.id.question_four_C:
                    if (checked)
                        // 4 ohms
                        break;

            }
        }
    }}
}
