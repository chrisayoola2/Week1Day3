package com.example.week1day3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //declaring variables
    EditText etFirstName;
    EditText etLastName;
    EditText etAddress;
    EditText etCity;
    EditText etState;
    EditText etZip;
    TextView firstDisplay;
    TextView lastDisplay;
    TextView addressDisplay;
    TextView cityDisplay;
    TextView stateDisplay;
    TextView zipDisplay;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirstName = findViewById(R.id.etFirstName);
        etLastName = findViewById(R.id.etLastName);
        etAddress = findViewById(R.id.etAddress);
        etCity = findViewById(R.id.etCity);
        etState = findViewById(R.id.etState);
        etZip = findViewById(R.id.etZip);
        firstDisplay = findViewById(R.id.firstDisplay);
        lastDisplay = findViewById(R.id.lastDisplay);
        addressDisplay = findViewById(R.id.addressDisplay);
        cityDisplay = findViewById(R.id.cityDisplay);
        stateDisplay = findViewById(R.id.stateDisplay);
        zipDisplay = findViewById(R.id.zipDisplay);


    }

    public void onClick(View view) {
        String first = etFirstName.getText().toString(); //gets string from the user and enters into the variables
        String last = etLastName.getText().toString();
        String address = etAddress.getText().toString();
        String city = etCity.getText().toString();
        String state = etState.getText().toString();
        String zip = etZip.getText().toString();

        Person person = new Person(first, last, address, city, state, zip); // passes the user input to create new instance
        // on click displays information into single text view on the screen
        firstDisplay.setText(person.getFirstName());
        lastDisplay.setText(person.getLastName());
        addressDisplay.setText(person.getAddress());
        cityDisplay.setText(person.getCity());
        stateDisplay.setText(person.getState());
        zipDisplay.setText(person.getZip());


    }
}
