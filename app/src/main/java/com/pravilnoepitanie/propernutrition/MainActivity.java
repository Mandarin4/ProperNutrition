package com.pravilnoepitanie.propernutrition;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private long backPressedtimer;
    private Toast backToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnMainActOnClick1(View view){
        Intent intent = new Intent(this, ZavtrakActivity.class);
        startActivity(intent); finish();
    }

    public void btnMainActOnClick2(View view){
        Intent intent = new Intent(this, ObedActivity.class);
        startActivity(intent); finish();
    }

    public void btnMainActOnClick3(View view){
        Intent intent = new Intent(this, UzinActivity.class);
        startActivity(intent); finish();
    }



    // Системная кнопка назад
    @Override
    public void onBackPressed(){
        if (backPressedtimer + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        }else{
            backToast = Toast.makeText(getBaseContext(), "Нажмите еще раз, чтобы выйти!", Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedtimer = System.currentTimeMillis();
    }
}