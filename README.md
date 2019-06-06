# Week1Day3
Create an activity with an edittext for each item listed below.  On a button click, have the values from the edit text save to an Person Object. populate text views for each of the items below from the person object. (You have to make the person class)  
	First Name
	Last Name
	Street Address
	City
	State
	Zip
	
![Week1Day3](https://user-images.githubusercontent.com/51377425/59052396-047abf00-885d-11e9-9b1a-6d7f670b610a.png)

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


package com.example.week1day3;

public class Person {

    //declaring variables used
    private String firstName;
    private String lastName;
    private String Address;
    private String City;
    private String State;
    private String Zip;

    public Person(String fName, String lName, String address, String city, String state, String zip){ // constructor
        this.firstName = fName;
        this.lastName = lName;
        this.Address = address;
        this.City = city;
        this.State = state;
        this.Zip = zip;
    }
// Getters and setters below
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getZip() {
        return Zip;
    }

    public void setZip(String zip) {
        Zip = zip;
    }
}




