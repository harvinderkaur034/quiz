package com.example.android.quiz;

import android.content.Intent;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }


    public void submit(View view) {
        result = 0;
        EditText name = (EditText) findViewById(R.id.name);
        String username = name.getText().toString();
        RadioButton DelhiRadioButton = (RadioButton) findViewById(R.id.q11);
        boolean hasDelhi = DelhiRadioButton.isChecked();

        if (hasDelhi) {
            result = result + 1;
        }


        RadioButton JaipurRadioButton = (RadioButton) findViewById(R.id.q21);
        boolean hasJaipur = JaipurRadioButton.isChecked();
        if (hasJaipur)

        {
            result = result + 1;
        }
        RadioButton AmritsarRadioButton = (RadioButton) findViewById(R.id.q34);
        boolean hasAmritsar = AmritsarRadioButton.isChecked();

        if (hasAmritsar) {
            result = result + 1;
        }

        RadioButton ChandigarhRadioButton = (RadioButton) findViewById(R.id.q42);
        boolean hasChandigarh = ChandigarhRadioButton.isChecked();

        if (hasChandigarh) {
            result = result + 1;

        }


        CheckBox PunjabCheckBox = (CheckBox) findViewById(R.id.q52);
        boolean hasPunjab = PunjabCheckBox.isChecked();
        CheckBox HaryanaCheckBox = (CheckBox) findViewById(R.id.q51);
        boolean hasHaryana = HaryanaCheckBox.isChecked();
        CheckBox GandhiNagarCheckBox = (CheckBox) findViewById(R.id.q53);
        boolean hasGandhiNagar = GandhiNagarCheckBox.isChecked();
        CheckBox PatialaCheckBox = (CheckBox) findViewById(R.id.q54);
        boolean hasPatiala = PatialaCheckBox.isChecked();

        if (hasPunjab && hasHaryana && !hasGandhiNagar && !hasPatiala)
            result = result + 2;

        EditText state = (EditText) findViewById(R.id.q6);
        String stateName = state.getText().toString();
        if (stateName.equalsIgnoreCase("chandigarh"))
            result = result + 3;

        if (result == 9)
            Toast.makeText(this, "your record has submitted successfully. You score 100 % marks. Congrats..!!", Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(this, "your record has submitted successfully. Your score=" + result, Toast.LENGTH_SHORT).show();
    }
}



