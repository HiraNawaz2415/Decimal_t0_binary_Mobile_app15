package com.cs2415.decimalcoverter;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText decimalInput;
    private Button convertButton;
    private TextView binaryOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        decimalInput = findViewById(R.id.decimalInput);
        convertButton = findViewById(R.id.convertButton);
        binaryOutput = findViewById(R.id.binaryOutput);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                convertToBinary();
            }
        });
    }

    private void convertToBinary() {
        try {
            String decimalStr = decimalInput.getText().toString();
            int decimal = Integer.parseInt(decimalStr);
            String binary = Integer.toBinaryString(decimal);
            binaryOutput.setText("Binary Result: " + binary);
        } catch (NumberFormatException e) {
            binaryOutput.setText("Invalid Input");
        }
    }
}
