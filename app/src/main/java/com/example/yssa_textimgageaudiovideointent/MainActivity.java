package com.example.yssa_textimgageaudiovideointent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowGallery(View view){
        int id = view.getId();
        LinearLayout layout =  (LinearLayout) findViewById(id);
        String tag = (String) layout.getTag();

        Intent it = new Intent(this, ShowGallery.class);
        it.putExtra( "it_tag", tag);
        startActivity(it); }
}