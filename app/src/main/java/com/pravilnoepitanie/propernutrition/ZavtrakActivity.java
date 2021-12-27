package com.pravilnoepitanie.propernutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class ZavtrakActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zavtrak);
    }

    public void btnZavtrakActOnClick1(View view){
        Intent intent = new Intent(this, OpisanieBludaActivity.class);

        ArrayList<String> modelPitenie = new ArrayList<String>();
        modelPitenie.add(getResources().getString(R.string.btnZavtrakAct1));
        modelPitenie.add(getResources().getString(R.string.btnZavtrakAct11));
        modelPitenie.add(getResources().getString(R.string.btnZavtrakAct12));
        modelPitenie.add(getResources().getString(R.string.btnZavtrakAct13));
        modelPitenie.add("zavtrak");

        intent.putStringArrayListExtra("modelPitanie", ( ArrayList<String>) modelPitenie);

        startActivity(intent);
        finish();
    }

    public void btnZavtrakActOnClick2(View view){
        Intent intent = new Intent(this, OpisanieBludaActivity.class);

        ArrayList<String> modelPitenie = new ArrayList<String>();
        modelPitenie.add(getResources().getString(R.string.btnZavtrakAct2));
        modelPitenie.add(getResources().getString(R.string.btnZavtrakAct21));
        modelPitenie.add(getResources().getString(R.string.btnZavtrakAct22));
        modelPitenie.add(getResources().getString(R.string.btnZavtrakAct23));
        modelPitenie.add("zavtrak");

        intent.putStringArrayListExtra("modelPitanie", ( ArrayList<String>) modelPitenie);

        startActivity(intent);
        finish();
    }

    public void btnZavtrakActOnClick3(View view){
        Intent intent = new Intent(this, OpisanieBludaActivity.class);

        ArrayList<String> modelPitenie = new ArrayList<String>();
        modelPitenie.add(getResources().getString(R.string.btnZavtrakAct3));
        modelPitenie.add(getResources().getString(R.string.btnZavtrakAct31));
        modelPitenie.add(getResources().getString(R.string.btnZavtrakAct32));
        modelPitenie.add(getResources().getString(R.string.btnZavtrakAct33));
        modelPitenie.add("zavtrak");

        intent.putStringArrayListExtra("modelPitanie", ( ArrayList<String>) modelPitenie);

        startActivity(intent);
        finish();
    }

    public void btnZavtrakActOnClick4(View view){
        Intent intent = new Intent(this, OpisanieBludaActivity.class);

        ArrayList<String> modelPitenie = new ArrayList<String>();
        modelPitenie.add(getResources().getString(R.string.btnZavtrakAct4));
        modelPitenie.add(getResources().getString(R.string.btnZavtrakAct41));
        modelPitenie.add(getResources().getString(R.string.btnZavtrakAct42));
        modelPitenie.add(getResources().getString(R.string.btnZavtrakAct43));
        modelPitenie.add("zavtrak");

        intent.putStringArrayListExtra("modelPitanie", ( ArrayList<String>) modelPitenie);

        startActivity(intent);
        finish();
    }

    public void btnZavtrakActOnClick5(View view){
        Intent intent = new Intent(this, OpisanieBludaActivity.class);

        ArrayList<String> modelPitenie = new ArrayList<String>();
        modelPitenie.add(getResources().getString(R.string.btnZavtrakAct5));
        modelPitenie.add(getResources().getString(R.string.btnZavtrakAct51));
        modelPitenie.add(getResources().getString(R.string.btnZavtrakAct52));
        modelPitenie.add(getResources().getString(R.string.btnZavtrakAct53));
        modelPitenie.add("zavtrak");

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