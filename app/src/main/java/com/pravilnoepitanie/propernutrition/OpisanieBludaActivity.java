package com.pravilnoepitanie.propernutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class OpisanieBludaActivity extends AppCompatActivity {
    TextView textTitleOpisBlu1, textTitleOpisBlu2, textTitleOpisBlu3;
    ImageView imageViewOpis;
    ArrayList<String> modelPitenie = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opisanie_bluda);

        textTitleOpisBlu1 = (TextView) findViewById(R.id.textTitleOpisBlu1);
        textTitleOpisBlu2 = (TextView) findViewById(R.id.textTitleOpisBlu2);
        textTitleOpisBlu3 = (TextView) findViewById(R.id.textTitleOpisBlu3);
        imageViewOpis = (ImageView) findViewById(R.id.imageViewOpis);

        modelPitenie = getIntent().getExtras().getStringArrayList("modelPitanie");

        textTitleOpisBlu1.setText(modelPitenie.get(0));
        try {
            imageViewOpis.setBackgroundResource(R.drawable.class.getField(modelPitenie.get(1)).getInt(getResources()));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        textTitleOpisBlu2.setText(modelPitenie.get(2));
        textTitleOpisBlu3.setText(modelPitenie.get(3));
    }

    // Системная кнопка назад
    @Override
    public void onBackPressed(){
        if (modelPitenie.get(4).equals("zavtrak")){
            Intent backintent = new Intent(this, ZavtrakActivity.class);
            startActivity(backintent);finish();
        } else if (modelPitenie.get(4).equals("obed")){
            Intent backintent = new Intent(this, ObedActivity.class);
            startActivity(backintent);finish();
        }else {
            Intent backintent = new Intent(this, UzinActivity.class);
            startActivity(backintent);finish();
        }

    }
}