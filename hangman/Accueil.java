package com.example.my_pc.hangman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Accueil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil);
    }


    public void Jouer(View view)
    {
        Intent Categorie = new Intent(this, Categorie.class);
        startActivity(Categorie);

    }

    public void Aide(View view)
    {
        Intent MainActivity = new Intent(this, MainActivity.class);
        startActivity(MainActivity);

    }
}
