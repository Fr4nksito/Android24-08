package Frank.Bailey.ano.dos.android24_08;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button Calcular;
    TextView Resultado;
    EditText Peso, Estatura;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Peso = findViewById(R.id.txtPeso);
        Estatura = findViewById(R.id.txtEstatura);
        Resultado = findViewById(R.id.txtResultado);
        Calcular = findViewById(R.id.btonCalcular);


        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String pesoStr = Peso.getText().toString();
                String estaturaStr = Estatura.getText().toString();

                float p = Float.parseFloat(pesoStr);
                float e = Float.parseFloat(estaturaStr)/100;

                float imc = p /(e * e);
                Resultado.setText(String.format("IMC: %.2f",imc));
            }
        });
    }
}