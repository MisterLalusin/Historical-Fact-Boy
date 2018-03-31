package pro.gr.ams.historicalfactboy;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class alieninvasion001 extends AppCompatActivity {

    private MediaPlayer clickaudio001;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_alieninvasion001);

        overridePendingTransition(R.anim.alpha_enter, R.anim.alpha_exit);

        clickaudio001= MediaPlayer.create(getApplicationContext(),R.raw.soundeffects003);

        final Button btnans;

        final EditText txt1;
        EditText display;

        btnans = (Button) findViewById(R.id.btnEncryptorDecrypt);
        display = (EditText) findViewById(R.id.displayId);

        txt1 = (EditText) findViewById(R.id.txtnum1);

        final EditText finalDisplay = display;
        btnans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                clickaudio001.start();

                String inputTextfield = txt1.getText().toString();

                String ipakitamona = inputTextfield
                        .replaceAll("a", "1a")
                        .replaceAll("b", "1b")
                        .replaceAll("c", "1c")
                        .replaceAll("d", "1d")
                        .replaceAll("e", "1e")
                        .replaceAll("f", "1f")
                        .replaceAll("g", "1g")
                        .replaceAll("h", "1h")
                        .replaceAll("i", "1i")
                        .replaceAll("j", "1j")
                        .replaceAll("k", "1k")
                        .replaceAll("l", "1l")
                        .replaceAll("m", "1n")
                        .replaceAll("n", "m")
                        .replaceAll("o", "l")
                        .replaceAll("p", "k")
                        .replaceAll("q", "j")
                        .replaceAll("r", "i")
                        .replaceAll("s", "h")
                        .replaceAll("t", "g")
                        .replaceAll("u", "f")
                        .replaceAll("v", "e")
                        .replaceAll("w", "d")
                        .replaceAll("x", "c")
                        .replaceAll("y", "b")
                        .replaceAll("z", "a")

                        .replaceAll("1a", "z")
                        .replaceAll("1b", "y")
                        .replaceAll("1c", "x")
                        .replaceAll("1d", "w")
                        .replaceAll("1e", "v")
                        .replaceAll("1f", "u")
                        .replaceAll("1g", "t")
                        .replaceAll("1h", "s")
                        .replaceAll("1i", "r")
                        .replaceAll("1j", "q")
                        .replaceAll("1k", "p")
                        .replaceAll("1l", "o")
                        .replaceAll("1m", "n")
                        .replaceAll("A", "1A")

                        .replaceAll("B", "1B")
                        .replaceAll("C", "1C")
                        .replaceAll("D", "1D")
                        .replaceAll("E", "1E")
                        .replaceAll("F", "1F")
                        .replaceAll("G", "1G")
                        .replaceAll("H", "1H")
                        .replaceAll("I", "1I")
                        .replaceAll("J", "1J")
                        .replaceAll("K", "1K")
                        .replaceAll("L", "1L")
                        .replaceAll("M", "1N")
                        .replaceAll("N", "M")
                        .replaceAll("O", "L")
                        .replaceAll("P", "K")
                        .replaceAll("Q", "J")
                        .replaceAll("R", "I")
                        .replaceAll("S", "H")
                        .replaceAll("T", "G")
                        .replaceAll("U", "F")
                        .replaceAll("V", "E")
                        .replaceAll("W", "D")
                        .replaceAll("X", "C")
                        .replaceAll("Y", "B")
                        .replaceAll("Z", "A")

                        .replaceAll("1A", "Z")
                        .replaceAll("1B", "Y")
                        .replaceAll("1C", "X")
                        .replaceAll("1D", "W")
                        .replaceAll("1E", "V")
                        .replaceAll("1F", "U")
                        .replaceAll("1G", "T")
                        .replaceAll("1H", "S")
                        .replaceAll("1I", "R")
                        .replaceAll("1J", "Q")
                        .replaceAll("1K", "P")
                        .replaceAll("1L", "O")
                        .replaceAll("1M", "N");

                String displayans = ipakitamona;

                finalDisplay.setText(displayans);


            }
        });

    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(getApplicationContext(), loading002.class);
        startActivity(intent);
        finish();
    }

    public void onUserLeaveHint() {

        finish();

    }

}
