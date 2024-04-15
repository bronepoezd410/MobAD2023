package com.bronepoezd410.sixthlaba;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.bronepoezd410.sixthlaba.databinding.ActivityMain2Binding;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    public static final String TRANSMITTED_STRING = "transmittedString";
    public static final String TRANSMITTED_INT = "transmittedInt";
    public static final String TRANSMITTED_BOOLEAN = "transmittedBool";


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView textview = findViewById(R.id.second_activity_text_view);

        String transmittedString = getIntent().getStringExtra(TRANSMITTED_STRING);
        int transmittedInt = getIntent().getIntExtra(TRANSMITTED_INT, -1);
        boolean transmittedBool = getIntent().getBooleanExtra(TRANSMITTED_BOOLEAN, false);

        textview.setText("These values were passed from previous screen"
                + ": transmittedString " + transmittedString
                + ", transmittedInt " + transmittedInt
                + ", transmittedBool " + transmittedBool);

    }
}