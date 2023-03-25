package com.example.yssa_textimgageaudiovideointent;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class ShowGallery extends AppCompatActivity {

    TextView gtitle;
    TextView gauthor;
    TextView gbody;
    ImageView picture;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_gallery);

        gtitle = (TextView) findViewById(R.id.gtitle);
        gauthor = (TextView) findViewById(R.id.gauthor);
        gbody = (TextView) findViewById(R.id.gbody);
        picture = (ImageView) findViewById(R.id.picture);

        Intent it = getIntent();
        String tag = it.getStringExtra( "it_tag");
        Resources res = getResources();

        //제목
        int id = res.getIdentifier("gtitle" + tag, "string", getPackageName());
        String title = res.getString(id);
        gtitle.setText(title);

        // 이름
        id = res.getIdentifier("gauthor"+tag, "string", getPackageName());
        String author = res.getString(id);
        gauthor.setText(author);

        //
        id = res.getIdentifier("gbody"+tag, "string", getPackageName());
        String body = res.getString(id);
        gbody.setText(body);
    }
    public void goBack(View view){
        finish();
    }
}