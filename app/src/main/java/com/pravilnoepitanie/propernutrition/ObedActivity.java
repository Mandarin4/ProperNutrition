package com.pravilnoepitanie.propernutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class ObedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obed);
    }

    public void btnObedActOnClick1(View view){
        Intent intent = new Intent(this, OpisanieBludaActivity.class);

        ArrayList<String> modelPitenie = new ArrayList<String>();
        modelPitenie.add(getResources().getString(R.string.btnObedAct1));
        modelPitenie.add(getResources().getString(R.string.btnObedAct11));
        modelPitenie.add(getResources().getString(R.string.btnObedAct12));
        modelPitenie.add(getResources().getString(R.string.btnObedAct13));
        modelPitenie.add("obed");

        intent.putStringArrayListExtra("modelPitanie", ( ArrayList<String>) modelPitenie);

        startActivity(intent);
        finish();
    }

    public void btnObedActOnClick2(View view){
        Intent intent = new Intent(this, OpisanieBludaActivity.class);

        ArrayList<String> modelPitenie = new ArrayList<String>();
        modelPitenie.add(getResources().getString(R.string.btnObedAct2));
        modelPitenie.add(getResources().getString(R.string.btnObedAct21));
        modelPitenie.add(getResources().getString(R.string.btnObedAct22));
        modelPitenie.add(getResources().getString(R.string.btnObedAct23));
        modelPitenie.add("obed");

        intent.putStringArrayListExtra("modelPitanie", ( ArrayList<String>) modelPitenie);

        startActivity(intent);
        finish();
    }

    public void btnObedActOnClick3(View view){
        Intent intent = new Intent(this, OpisanieBludaActivity.class);

        ArrayList<String> modelPitenie = new ArrayList<String>();
        modelPitenie.add(getResources().getString(R.string.btnObedAct3));
        modelPitenie.add(getResources().getString(R.string.btnObedAct31));
        modelPitenie.add(getResources().getString(R.string.btnObedAct32));
        modelPitenie.add(getResources().getString(R.string.btnObedAct33));
        modelPitenie.add("obed");

        intent.putStringArrayListExtra("modelPitanie", ( ArrayList<String>) modelPitenie);

        startActivity(intent);
        finish();
    }

    public void btnObedActOnClick4(View view){
        Intent intent = new Intent(this, OpisanieBludaActivity.class);

        ArrayList<String> modelPitenie = new ArrayList<String>();
        modelPitenie.add(getResources().getString(R.string.btnObedAct4));
        modelPitenie.add(getResources().getString(R.string.btnObedAct41));
        modelPitenie.add(getResources().getString(R.string.btnObedAct42));
        modelPitenie.add(getResources().getString(R.string.btnObedAct43));
        modelPitenie.add("obed");

        intent.putStringArrayListExtra("modelPitanie", ( ArrayList<String>) modelPitenie);

        startActivity(intent);
        finish();
    }

    public void btnObedActOnClick5(View view){
        Intent intent = new Intent(this, OpisanieBludaActivity.class);

        ArrayList<String> modelPitenie = new ArrayList<String>();
        modelPitenie.add(getResources().getString(R.string.btnObedAct5));
        modelPitenie.add(getResources().getString(R.string.btnObedAct51));
        modelPitenie.add(getResources().getString(R.string.btnObedAct52));
        modelPitenie.add(getResources().getString(R.string.btnObedAct53));
        modelPitenie.add("obed");

        intent.putStringArrayListExtra("modelPitanie", ( ArrayList<String>) modelPitenie);

        startActivity(intent);
        finish();
    }

    // Системная кнопка назад
    @Override
    public void onBackPressed(){
        Intent backintent = new Intent(this, MainActivity.class);
        startActivity(backintent);finish();
    }
}