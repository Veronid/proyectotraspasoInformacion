package proyecto.vero.proyectotraspasoinformacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaPantalla extends AppCompatActivity {

    TextView TextoRecibido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda_pantalla);
        TextoRecibido = findViewById(R.id.txtrecibir);
        String mensaje = getIntent().getStringExtra("Mensaje");
        TextoRecibido.setText(mensaje);
    }
}