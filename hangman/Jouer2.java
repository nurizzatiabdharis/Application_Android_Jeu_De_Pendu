package com.example.my_pc.hangman;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Jouer2 extends AppCompatActivity {

    private TextView Mots;
    private TextView Win;
    private ImageView E;


    public char tabLettre[];
    public String[] TabMot;//liste de mots
    public String UnMot;
    public int fois=0;//variable qui indique combien de fois qu'on a clicke
    public int vraie[];
    public int fauxCompteur=0; //variable pour indique combien de fois qu'on est faux
    public int vraiMot;
    public int photo;
    public String title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jouer2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        Bundle b = this.getIntent().getExtras();
        TabMot=b.getStringArray("array");//recupere array de mots de activity precedent
        title=b.getString("nom");
        Random s = new Random();                     //generer un numero aleatoire
        UnMot = TabMot[produceNumero(s,TabMot)];    //selectionner un mot aleatoirement
        tabLettre = UnMot.toCharArray();
        vraie = new int[tabLettre.length];

        Mots =(TextView) findViewById(R.id.textView);
        Win = (TextView)findViewById(R.id.textView9);
        E = (ImageView)findViewById(R.id.imageView5);
        Win.setText(title);
        if(getFois()==0) {
            Mots.setText(RandomMot());
        }
    }

    public int produceNumero(Random s,String[] sList) {//donner un numero according to length of array

        int Select = (s.nextInt(sList.length));
        return Select;
    }

    public int getFois()
    {
        return fois;
    }



    public String RandomMot()
    {
        /* KAT SINI BOLEH TULIS CODE UTK GENERER MOTS*/
        //String UnMot = "SINGAPORE";
        String reponse="";

        if(getFois()==0)
        {
            for(int i=0; i< vraie.length ; i++)
                vraie[i] = 0;

           fois++;
        }

        for (int i = 0; i < tabLettre.length; i++) {
            if (vraie[i] == 1)
                reponse = reponse + " " + Character.toString(tabLettre[i]) + " ";
            else
                reponse = reponse + " _ ";
        }


        /*for(int i=0 ; i<tabLettre.length ; i++)
        {
            //reponse = reponse + " " + tabLettre[i] + " ";
            reponse = reponse + " _ ";
        }*/

        return reponse;
    }

    public void input(View view)
    {
        photo = 0;

        Button b = (Button) view;
        String charactere = b.getText().toString();
        b.setVisibility(View.INVISIBLE);

        char let = charactere.charAt(0);

        for (int i = 0; i < tabLettre.length; i++) {
            if (vraie[i] == 0) {
                if (let == tabLettre[i]) {
                    vraie[i] = 1;
                    photo = 1;
                }
            }
        }

        Mots.setText(RandomMot());

        vraiMot=1;
        for (int k = 0; k < vraie.length; k++) {
            if (vraie[k] == 0) {
                vraiMot = 0;
            }
        }


        if(photo ==0 || vraiMot==1)
        {
            if(vraiMot==1)
            {
                //Win.setText("MENANG");

                Intent Resultat = new Intent(this, Jouer4.class);
                Resultat.putExtra("array",TabMot);
                Resultat.putExtra("nom",title);
                startActivity(Resultat);
            }
            else
            {
                if(fauxCompteur < 6 || fauxCompteur == 6){
                    fauxCompteur++;
                    AffichePhoto(fauxCompteur);
                }
                else
                {
                    //Win.setText("KALAH");
                    Intent Resultat = new Intent(this, Jouer5.class);
                    Resultat.putExtra("array",TabMot);
                    Resultat.putExtra("nom",title);
                    Resultat.putExtra("vraireponse", UnMot);
                    startActivity(Resultat);
                }
            }

        }

    }

    public void AffichePhoto(int faux)
    {
        switch (faux) {
            case 1:
                E.setImageResource(R.drawable.o);
                break;
            case 2:
                E.setImageResource(R.drawable.b);
                break;
            case 3:
                E.setImageResource(R.drawable.c);
                break;
            case 4:
                E.setImageResource(R.drawable.d);
                break;
            case 5:
                E.setImageResource(R.drawable.e);
                break;
            case 6:
                E.setImageResource(R.drawable.f);
                break;
            case 7:
                E.setImageResource(R.drawable.g);
                break;
            case 8:
                E.setImageResource(R.drawable.h);
                break;
        }
    }

}
