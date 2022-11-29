package com.example.pianogrupo11;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private Button btnDo, btnRe, btnMi, btnFa, btnSo, btnLa, btnSi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDo = (Button) findViewById(R.id.btnDO);
        btnRe = (Button) findViewById(R.id.btnRE);
        btnMi = (Button) findViewById(R.id.btnMI);
        btnFa = (Button) findViewById(R.id.btnFA);
        btnSo = (Button) findViewById(R.id.btnSO);
        btnLa = (Button) findViewById(R.id.btnLA);
        btnSi = (Button) findViewById(R.id.btnSI);
        MediaPlayer teclaDo = MediaPlayer.create(this, R.raw.tecla_do);
        MediaPlayer teclaRe = MediaPlayer.create(this, R.raw.re);
        MediaPlayer teclaMi = MediaPlayer.create(this, R.raw.mi);
        MediaPlayer teclaFa = MediaPlayer.create(this, R.raw.fa);
        MediaPlayer teclaSo = MediaPlayer.create(this, R.raw.so);
        MediaPlayer teclaLa = MediaPlayer.create(this, R.raw.la);
        MediaPlayer teclaSi = MediaPlayer.create(this, R.raw.si);


        btnDo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Tecla DO", Toast.LENGTH_SHORT).show();
                teclaDo.start();
            }
        });

        btnRe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Tecla RE", Toast.LENGTH_SHORT).show();
                teclaRe.start();
            }
        });

        btnMi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Tecla MI", Toast.LENGTH_SHORT).show();
                teclaMi.start();
            }
        });

        btnFa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Tecla FA", Toast.LENGTH_SHORT).show();
                teclaFa.start();
            }
        });

        btnSo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Tecla SO", Toast.LENGTH_SHORT).show();
                teclaSo.start();
            }
        });

        btnLa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Tecla LA", Toast.LENGTH_SHORT).show();
                teclaLa.start();
            }
        });

        btnSi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Tecla SI", Toast.LENGTH_SHORT).show();
                teclaSi.start();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_context1, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.diffPiano:
                final String[] pianos = {"Piano infantil de la selva", "Piano de instrumentos musicales"};
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Seleccione un piano diferente");
                builder.setItems(pianos, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(i == 0){
                            Intent intent = new Intent(getApplicationContext(), PianoInfantil.class);
                            startActivity(intent);
                            finish();
                        }
                        else if (i == 1){
                            Intent intent = new Intent(getApplicationContext(), PianoInstrumentosMusicales.class);
                            startActivity(intent);
                            finish();
                        }
                    }
                });
                builder.create();
                builder.show();
                return true;
            case R.id.aboutUs:
                Intent intent = new Intent(this, AcercaDe.class);
                startActivity(intent);
                return true;
            case R.id.exit:
                finish();
                System.exit(0);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}