package com.pravilnoepitanie.propernutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class UzinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uzin);
    }

    public void btnUzinActOnClick1(View view){
        Intent intent = new Intent(this, OpisanieBludaActivity.class);

        ArrayList<String> modelPitenie = new ArrayList<String>();
        modelPitenie.add(getResources().getString(R.string.btnYzinAct1));
        modelPitenie.add(getResources().getString(R.string.btnYzinAct11));
        modelPitenie.add(getResources().getString(R.string.btnYzinAct12));
        modelPitenie.add(getResources().getString(R.string.btnYzinAct13));
        modelPitenie.add("uzin");

        intent.putStringArrayListExtra("modelPitanie", ( ArrayList<String>) modelPitenie);

        startActivity(intent);
        finish();
    }

    public void btnUzinActOnClick2(View view){
        Intent intent = new Intent(this, OpisanieBludaActivity.class);

        ArrayList<String> modelPitenie = new ArrayList<String>();
        modelPitenie.add(getResources().getString(R.string.btnYzinAct2));
        modelPitenie.add(getResources().getString(R.string.btnYzinAct21));
        modelPitenie.add(getResources().getString(R.string.btnYzinAct22));
        modelPitenie.add(getResources().getString(R.string.btnYzinAct23));
        modelPitenie.add("uzin");

        intent.putStringArrayListExtra("modelPitanie", ( ArrayList<String>) modelPitenie);

        startActivity(intent);
        finish();
    }

    public void btnUzinActOnClick3(View view){
        Intent intent = new Intent(this, OpisanieBludaActivity.class);

        ArrayList<String> modelPitenie = new ArrayList<String>();
        modelPitenie.add(getResources().getString(R.string.btnYzinAct3));
        modelPitenie.add(getResources().getString(R.string.btnYzinAct31));
        modelPitenie.add(getResources().getString(R.string.btnYzinAct32));
        modelPitenie.add(getResources().getString(R.string.btnYzinAct33));
        modelPitenie.add("uzin");

        intent.putStringArrayListExtra("modelPitanie", ( ArrayList<String>) modelPitenie);

        startActivity(intent);
        finish();
    }

    public void btnUzinActOnClick4(View view){
        Intent intent = new Intent(this, OpisanieBludaActivity.class);

        ArrayList<String> modelPitenie = new ArrayList<String>();
        modelPitenie.add(getResources().getString(R.string.btnYzinAct4));
        modelPitenie.add(getResources().getString(R.string.btnYzinAct41));
        modelPitenie.add(getResources().getString(R.string.btnYzinAct42));
        modelPitenie.add(getResources().getString(R.string.btnYzinAct43));
        modelPitenie.add("uzin");

        intent.putStringArrayListExtra("modelPitanie", ( ArrayList<String>) modelPitenie);

        startActivity(intent);
        finish();
    }

    public void btnUzinActOnClick5(View view){
        Intent intent = new Intent(this, OpisanieBludaActivity.class);

        ArrayList<String> modelPitenie = new ArrayList<String>();
        modelPitenie.add(getResources().getString(R.string.btnYzinAct5));
        modelPitenie.add(getResources().getString(R.string.btnYzinAct51));
        modelPitenie.add(getResources().getString(R.string.btnYzinAct52));
        modelPitenie.add(getResources().getString(R.string.btnYzinAct53));
        modelPitenie.add("uzin");

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