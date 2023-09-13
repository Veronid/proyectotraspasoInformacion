package proyecto.vero.proyectotraspasoinformacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    //Lapso de tiempo que se mostrara (handler)
    Handler handler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Crear Objeto sub proceso
        handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(
                        //Se movera al activity principal
                        getApplicationContext(),
                        MainActivity.class
                );
                //se cargara
                startActivity(intent);
                finish();
            }
        },4000);
    }
}
