package com.example.my_pc.hangman;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Categorie2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categorie2);
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
}
