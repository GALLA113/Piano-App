package com.example.pianogrupo11;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class PianoInfantil extends AppCompatActivity {

    private Button btnOso, btnLeon, btnMono, btnSerpiente, btnTucan, btnVaca, btnElefante;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano_infantil);

        btnOso = (Button) findViewById(R.id.btnOso);
        btnLeon = (Button) findViewById(R.id.btnLeon);
        btnMono = (Button) findViewById(R.id.btnMono);
        btnSerpiente = (Button) findViewById(R.id.btnSerpiente);
        btnTucan = (Button) findViewById(R.id.btnTucan);
        btnVaca = (Button) findViewById(R.id.btnVaca);
        btnElefante = (Button) findViewById(R.id.btnElefante);
        MediaPlayer oso = MediaPlayer.create(this, R.raw.oso);
        MediaPlayer leon = MediaPlayer.create(this, R.raw.leon);
        MediaPlayer mono = MediaPlayer.create(this, R.raw.mono);
        MediaPlayer serpiente = MediaPlayer.create(this, R.raw.serpiente);
        MediaPlayer tucan = MediaPlayer.create(this, R.raw.tucan);
        MediaPlayer vaca = MediaPlayer.create(this, R.raw.vaca);
        MediaPlayer elefante = MediaPlayer.create(this, R.raw.elefante);

        btnOso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Oso", Toast.LENGTH_SHORT).show();
                oso.start();
            }
        });

        btnLeon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Leon", Toast.LENGTH_SHORT).show();
                leon.start();
            }
        });

        btnMono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Mono", Toast.LENGTH_SHORT).show();
                mono.start();
            }
        });

        btnSerpiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Serpiente", Toast.LENGTH_SHORT).show();
                serpiente.start();
            }
        });

        btnTucan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Tucan", Toast.LENGTH_SHORT).show();
                tucan.start();
            }
        });

        btnVaca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Vaca", Toast.LENGTH_SHORT).show();
                vaca.start();
            }
        });

        btnElefante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Elefante", Toast.LENGTH_SHORT).show();
                elefante.start();
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
                final String[] pianos = {"Piano tradicional", "Piano de instrumentos musicales"};
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("Seleccione un piano diferente");
                builder.setItems(pianos, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        if(i == 0){
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
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