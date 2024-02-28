package com.example.appbar;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.MenuInflater;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.appbar.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar =findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.menunew, menu);
        inflater.inflate(R.menu.menunew, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()){
            case R.id.item1:
            Toast.makeText(this, "ITEM1", Toast.LENGTH_SHORT).show();
            return true;

            case R.id.item2:
                Toast.makeText(this, "ITEM2", Toast.LENGTH_SHORT).show();
                return true;
//
//            case R.id.item3:
//                Toast.makeText(this, "ITEM3", Toast.LENGTH_SHORT).show();
//                return true;
//            case R.id.sub1:
//                Toast.makeText(this, "sub item 1", Toast.LENGTH_SHORT).show();
//                return true;
//            case R.id.sub2:
//                Toast.makeText(this, " sub ITEM1", Toast.LENGTH_SHORT).show();
//                return true;
            default:
                return super.onOptionsItemSelected(item);
        }


    }


}
