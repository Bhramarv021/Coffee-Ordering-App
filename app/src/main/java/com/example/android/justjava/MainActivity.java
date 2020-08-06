package com.example.android.justjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /* Variable to set or update quantity value */
    private TextView quantityTextView;
    private TextView priceTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quantityTextView = findViewById(R.id.quality_text_view);
        priceTextView = findViewById(R.id.price_text_view);
    }

    /* This method displays the given quantity value on the screen */
    private void display(){
        quantityTextView.setText("10");
        priceTextView.setText("20");
    }

    /* This method is called when the order button is clicked */
    public void submitOrder(View view){
        display();
    }
}
