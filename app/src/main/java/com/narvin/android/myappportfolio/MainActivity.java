package com.narvin.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button moviesButton;
    private Button stockHawkButton;
    private Button buildBiggerButton;
    private Button makeAppMaterialButton;
    private Button goUbiquitousButton;
    private Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Setup the onClickHandlers for all the portfolio buttons
        moviesButton = (Button) findViewById(R.id.popular_movies_button);
        moviesButton.setOnClickListener(this);

        stockHawkButton = (Button) findViewById(R.id.stock_hawk_button);
        stockHawkButton.setOnClickListener(this);

        buildBiggerButton = (Button) findViewById(R.id.build_bigger_button);
        buildBiggerButton.setOnClickListener(this);

        makeAppMaterialButton = (Button) findViewById(R.id.make_material_button);
        makeAppMaterialButton.setOnClickListener(this);

        goUbiquitousButton = (Button) findViewById(R.id.go_ubiquitous_button);
        goUbiquitousButton.setOnClickListener(this);

        capstoneButton = (Button) findViewById(R.id.capstone_button);
        capstoneButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        // Respond to the click event based on the ID of the button pressed
        switch (v.getId()) {

            case R.id.popular_movies_button:
                Toast.makeText(this, getString(R.string.launch) +
                                getString(R.string.popular_movies),
                        Toast.LENGTH_SHORT).show();

                break;

            case R.id.stock_hawk_button:
                Toast.makeText(this, getString(R.string.launch) +
                                getString(R.string.stock_hawk),
                        Toast.LENGTH_SHORT).show();

                break;

            case R.id.build_bigger_button:
                Toast.makeText(this, getString(R.string.launch) +
                                getString(R.string.build_it_bigger),
                        Toast.LENGTH_SHORT).show();

                break;

            case R.id.make_material_button:
                Toast.makeText(this, getString(R.string.launch) +
                                getString(R.string.make_app_material),
                        Toast.LENGTH_SHORT).show();

                break;

            case R.id.go_ubiquitous_button:
                Toast.makeText(this, getString(R.string.launch) +
                                getString(R.string.go_ubiquitous),
                        Toast.LENGTH_SHORT).show();
                break;

            case R.id.capstone_button:
                Toast.makeText(this, getString(R.string.launch) +
                                getString(R.string.capstone),
                        Toast.LENGTH_SHORT).show();

                break;

        }

    }
}
