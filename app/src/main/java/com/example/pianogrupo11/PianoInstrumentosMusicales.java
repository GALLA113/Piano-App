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

public class PianoInstrumentosMusicales extends AppCompatActivity {

    private Button btnBongo, btnGuitarra, btnMaraca, btnPlatillo, btnTambor, btnTrompeta, btnViolin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano_instrumentos_musicales);

        btnBongo = (Button) findViewById(R.id.btnBongo);
        btnGuitarra = (Button) findViewById(R.id.btnGuitarra);
        btnMaraca = (Button) findViewById(R.id.btnMaraca);
        btnPlatillo = (Button) findViewById(R.id.btnPlatillo);
        btnTambor = (Button) findViewById(R.id.btnTambor);
        btnTrompeta = (Button) findViewById(R.id.btnTrompeta);
        btnViolin = (Button) findViewById(R.id.btnViolin);

        MediaPlayer bongo = MediaPlayer.create(this, R.raw.bongo);
        MediaPlayer guitarra = MediaPlayer.create(this, R.raw.guitarra);
        MediaPlayer maraca = MediaPlayer.create(this, R.raw.maracas);
        MediaPlayer platillo = MediaPlayer.create(this, R.raw.platillos);
        MediaPlayer tambor = MediaPlayer.create(this, R.raw.tambor);
        MediaPlayer trompeta = MediaPlayer.create(this, R.raw.trompeta);
        MediaPlayer violin = MediaPlayer.create(this, R.raw.violin);

        btnBongo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Bongos", Toast.LENGTH_SHORT).show();
                bongo.start();
            }
        });

        btnGuitarra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Guitarra", Toast.LENGTH_SHORT).show();
                guitarra.start();
            }
        });

        btnMaraca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Maracas", Toast.LENGTH_SHORT).show();
                maraca.start();
            }
        });

        btnPlatillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Platillos", Toast.LENGTH_SHORT).show();
                platillo.start();
            }
        });

        btnTambor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Tambor", Toast.LENGTH_SHORT).show();
                tambor.start();
            }
        });

        btnTrompeta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Trompeta", Toast.LENGTH_SHORT).show();
                trompeta.start();
            }
        });

        btnViolin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Violin", Toast.LENGTH_SHORT).show();
                violin.start();
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
                final String[] pianos = {"Piano tradicional", "Piano infantil"};
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
                            Intent intent = new Intent(getApplicationContext(), PianoInfantil.class);
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