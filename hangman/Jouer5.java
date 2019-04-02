package com.example.my_pc.hangman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Jouer5 extends AppCompatActivity {

    public String reponse;
    private TextView A;
    public String[] TabMot;//liste de mots
    public String UnMot;
    public String title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jouer5);

        Bundle b = this.getIntent().getExtras();
        reponse = b.getString("vraireponse");
        TabMot=b.getStringArray("array");//recupere array de mots de activity precedent
        title=b.getString("nom");

        A = (TextView) findViewById(R.id.textView7);
        A.setText(reponse);


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
