package com.falskim.prolangbook;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String title = "Mode List";
    private RecyclerView listRecylerView;
    private ArrayList<Prolang> list = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        listRecylerView = findViewById(R.id.list_recycler_view);
        listRecylerView.setHasFixedSize(true);

        list.addAll(ProlangData.getListData());
        System.out.println("List data " + list);
        showRecyclerList();
    }

    private void showRecyclerList() {
        listRecylerView.setLayoutManager(new LinearLayoutManager(this));
        ProlangAdapter listHeroAdapter = new ProlangAdapter(list);
        listRecylerView.setAdapter(listHeroAdapter);

        listHeroAdapter.setOnItemClickCallback(new ProlangAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Prolang data) {
                showSelectedHero(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            startActivity(new Intent(this, About.class));
        }

        return super.onOptionsItemSelected(item);
    }

    private void showSelectedHero(Prolang prolang) {
        Toast.makeText(this, "Kamu memilih " + prolang.getName(), Toast.LENGTH_SHORT).show();
        Intent moveDetail = new Intent(this, Detail.class);
        moveDetail.putExtra("NAME", prolang.getName());
        moveDetail.putExtra("YEAR", prolang.getYear());
        moveDetail.putExtra("DESIGNER", prolang.getDesigner());
        moveDetail.putExtra("PARADIGM", prolang.getParadigm());
        moveDetail.putExtra("EXTENSION", prolang.getExtension());
        moveDetail.putExtra("VERSION", prolang.getVersion());
        moveDetail.putExtra("IMAGE", prolang.getImage());
        startActivity(moveDetail);
    }
}
