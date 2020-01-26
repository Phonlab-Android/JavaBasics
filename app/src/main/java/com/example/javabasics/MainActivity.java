package com.example.javabasics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //We can write comments that your computer ignores by starting a line with two forward slashes

    //This is the method that runs when our app starts. It tells us to set our screen to activity_main.xml
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //This is a method that is called when our button is clicked by the user
    public void clickButton(View view) {
        updateTextView(1);
    }

    //This method will update our TextView with the id "out_first_text_view"
    public void updateTextView(int number) {
        TextView ourFirstTextView = findViewById(R.id.our_first_text_view);
        ourFirstTextView.setText("" + number);
    }
}
