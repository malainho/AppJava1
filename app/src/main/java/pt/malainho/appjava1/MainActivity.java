package pt.malainho.appjava1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Variável para inteiros
    byte b=127;
    byte ba=0b01100000; // 8 bits ou 1 byte

    // Variável para inteiros
    short s=32000;
    short sa, sb, sc;

    // Variável para inteiros
    int idade=43;
    int n1, n2, n3;

    // Variável para inteiros
    long l=9_000_000;
    long la, lb, lc;

    // Variável para numeros fracionários
    float f=1F;
    float fa, fb, fc;

    // variável para numeros fracionários
    double d=1.50E+308;
    double da, db, dc;

    // Variável para conter apenas um caracter
    char letra='E';
    char sexo, nomePorta;

    // Variável para booleanos
    boolean casado=true;
    boolean x, y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Converter um short num inteiro
        // n1=s;

        // Converter um numero long num numero int de forma forçada
        // Poderá haver perder de dados
        // n2=(int) l;

        /*
            Comentário 1
            Comentário 2
            Comentário 3
        */

        constantes();
    }

    private void constantes(){
        // Constantes
        final double PI=3.14;
        final char SEXO_MASCULINO='M';
        final char SEXO_FEMININO='F';
    }
}