package com.example.my_pc.hangman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Jouer4 extends AppCompatActivity {

    public String[] TabMot;//liste de mots
    public String UnMot;
    public String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jouer4);

        Bundle b = this.getIntent().getExtras();
        TabMot=b.getStringArray("array");//recupere array de mots de activity precedent
        title=b.getString("nom");
    }

    public void Exit(View view)
    {
        Intent exito = new Intent(this, Accueil.class);
        startActivity(exito);

    }

    public void Replay(View view)
    {
        Intent replay = new Intent(this, Jouer2.class);
        replay.putExtra("array",TabMot);
        replay.putExtra("nom",title);
        startActivity(replay);

    }
}
