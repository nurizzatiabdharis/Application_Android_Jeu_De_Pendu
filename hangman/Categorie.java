package com.example.my_pc.hangman;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Categorie extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorie);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
    }

    String arrayJoue[];
    String NomCategorie;

    public void choisir(View v){
        Button b =(Button) v;
        String key = b.getText().toString();
        //b.setBackgroundColor(Color.RED);

        switch (key){
            case "animaux":
                arrayJoue= new String[]{"CHIEN", "CHAT", "CHAUVE-SOURIS", "AUTRUCHE", "PARESSEUX", "ELEPHANT", "RENARD", "COQ", "ESCARGOT", "SURICATE", "ALLIGATOR", "AGNEAU", "SINGE", "TIGRE",
                     "DAUPHIM","PINGUIN","PORC","VACHE","PANTHERE","PUMA","PEROQUET","PELICAN","CHEVAL","BALEINE","REQUIN"};
                NomCategorie="animaux";
                break;
            case "fruits":
                arrayJoue= new String[]{"BANANE", "FRAMBOISE", "MYRTILLE", "ORANGE", "DURIAN", "PECHE", "RAISIN", "ABRICOT", "PRUNE", "MELON", "PASTEQUE", "AVOCAT", "CERISE", "MANGUE",
                    "CYTRON","GRENADE","KIWI","GROSEILLE","MANDARINE","ORANGE","PAPAYE","LITCHI","PAMPLEMOUSSE","TOMATE"};
                NomCategorie="fruits";
                break;
            case "sports":
                arrayJoue= new String[]{"HANDBALL","JOGGING","BADMINTON","FOOTBALL","TENNIS","ESCALADE","ESPORT","VOLLEY","BASKET","NATATION","BOWLING","AEROBIC","CRICKET",
                        "ZUMBA","ALPINISME","BASEBALL","CURLING","PATINAGE","HOCKEY","CAPOEIRA","YOGA","TAEKWONDO","PARKOUR"};
                NomCategorie="sports";
                break;
            case "pays":
                arrayJoue= new String[]{"EQUATOR","FRANCE","MALAISIE","ESPAGNE","ALLEMAGNE","TURQUIE","PANAMA","PEROU","BELGIQUE","JAPON","ITALIE","AUSTRALIE","ANDORRE","SUISSE", "IRLANDE",
                        "CHINE", "POLOGNE", "VATICAN", "FIDJI", "BIELORUSSIE", "HONGRIE", "VIETNAM", "MONGOLIE", "CAMBODGE", "KIRGHIZISTAN"};
                NomCategorie="pays";
                break;
            case "metiers":
                arrayJoue= new String[]{"ARCHITECTE","NETICIEN","TECHNICIEN","BOULANGERE","POMPIER","MANAGER","PROFESSEUR","SECRETAIRE","ASTRONAUTE","ACTEUR","BIBLIOTHECAIRE","CHANTEUR","CHAUFFEUR",
                        "CHANTEUR","PLOMBIER","PSYCHIATRE","PEDIATRE","PHOTOGRAPHE","HORTICULTEUR","HISTORIEN","HORLOGER","VOLCANOLOGUE","ZOOLOGISTE"};
                NomCategorie="metiers";
                break;
        }
        Intent Jouer = new Intent(this, Jouer2.class);
        Jouer.putExtra("array", arrayJoue);
        Jouer.putExtra("nom", NomCategorie);
        startActivity(Jouer);
        //Jouer2();
    }

    /* public void Joeur2(View view)
    {
        Intent Jouer = new Intent(this, Jouer2.class);
        startActivity(Jouer);
    }*/

  /*public void Jouer2(View view) {

      if(arrayJoue!=null && arrayJoue.length>0) {

            Intent Jouer = new Intent(this, Jouer2.class);
            Jouer.putExtra("array", arrayJoue);
            Jouer.putExtra("nom", NomCategorie);
            startActivity(Jouer);
       }else{
            Context context = getApplicationContext();
            CharSequence text = "Choisir une categorie SVP";
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        }
  }*/

}
