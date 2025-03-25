package com.example.myapplication1;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lista = findViewById(R.id.lista); // criar a lista de itens

        Pessoa hamilton = new Pessoa("Lewis Hamilton",
                "WDC: 7", "WINS: 105", "lewis_hamilton", "PODIUMS: 202", "POLES: 104");
        Pessoa verstappen = new Pessoa("Max Verstappen",
                "WDC: 4", "WINS: 63", "max_verstappen", "PODIUMS: 113", "POLES: 40");
        Pessoa leclerc = new Pessoa("Charles Leclerc",
                "WDC: 0", "WINS: 8", "charles_leclerc", "PODUIMS: 43", "POLES: 26");
        Pessoa norris = new Pessoa("Lando Norris",
                "WDC: 0", "WINS: 5", "lando_norris", "PODIUMS: 28", "POLES: 10");
        Pessoa russell = new Pessoa("George Russsell",
                "WDC: 0", "WINS: 3", "george_russell", "PODIUMS: 17", "POLES: 5");
        Pessoa piastri = new Pessoa("Oscar Piastri",
                "WDC: 0", "WINS: 3", "oscar_piastri", "PODIUMS: 11", "POLES: 1");
        Pessoa antonelli = new Pessoa("Kimi Antonelli",
                "WDC: 0", "WINS: 0", "kimi_antonelli", "PODIUMS: 0", "POLES: 0");
        Pessoa albon = new Pessoa("Alexander Albon",
                "WDC: 0", "WINS: 0", "alexander_albon", "PODIUMS: 2", "POLES: 0");
        Pessoa ocon = new Pessoa("Esteban Ocon",
                "WDC: 0", "WINS: 1", "esteban_ocon", "PODIUMS: 4", "POLES: 0");
        Pessoa stroll = new Pessoa("Lance Stroll",
                "WDC: 0", "WINS: 0", "lance_stroll", "PODIUMS: 3", "POLES: 1");
        Pessoa hulkenberg = new Pessoa("Nico Hulkenberg",
                "WDC: 0", "WINS: 0", "nico_kulkenberg", "PODIUMS: 0", "POLES: 1");
        Pessoa bearman = new Pessoa("Oliver Bearman",
                "WDC: 0", "WINS: 0", "oliver_bearman", "PODIUMS: 0", "POLES: 0");
        Pessoa tsunoda = new Pessoa("Yuki Tsunoda",
                "WDC: 0", "WINS: 0", "yuki_tsunoda", "PODIUMS: 0", "POLES: 0");
        Pessoa sainz = new Pessoa("Carlos Sainz",
                "WDC: 0", "WINS: 4", "carlos_sainz", "PODIUMS: 27", "POLES: 6");
        Pessoa hadjar = new Pessoa("Isack Hadjar",
                "WDC: 0", "WINS: 0", "isack_hadjar", "PODIUMS: 0", "POLES: 0");
        Pessoa gasly = new Pessoa("Pierre Gasly",
                "WDC: 0", "WINS: 1", "pierre_gasly", "PODIUMS: 5", "POLES: 0");
        Pessoa lawson = new Pessoa("Liam Lawson",
                "WDC: 0", "WINS: 0", "liam_lawson", "PODIUMS: 0", "POLES: 0");
        Pessoa doohan = new Pessoa("Jack Doohan",
                "WDC: 0", "WINS: 0", "jack_doohan", "PODIUMS: 0", "POLES: 0");
        Pessoa bortoleto = new Pessoa("Gabriel Bortoleto",
                "WDC: 0", "WINS: 0", "gabriel_bortoleto", "PODIUMS: 0", "POLES: 0");


        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(hamilton);
        pessoas.add(verstappen);
        pessoas.add(leclerc);
        pessoas.add(norris);
        pessoas.add(russell);
        pessoas.add(piastri);
        pessoas.add(antonelli);
        pessoas.add(albon);
        pessoas.add(ocon);
        pessoas.add(stroll);
        pessoas.add(hulkenberg);
        pessoas.add(bearman);
        pessoas.add(tsunoda);
        pessoas.add(sainz);
        pessoas.add(hadjar);
        pessoas.add(gasly);
        pessoas.add(lawson);
        pessoas.add(doohan);
        pessoas.add(bortoleto);

        ListaAdapter adapter = new ListaAdapter(this, R.layout.layout_lista, pessoas);
        lista.setAdapter(adapter);

    }
}