package pro.gr.ams.historicalfactboy;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ampugenungdeveloper001 extends AppCompatActivity {

    private MediaPlayer clickaudio001;

    String vowel001="AEA";
    String vowel002="IOE";
    String vowel003="UAI";
    String vowel004="EIO";
    String vowel005="OUU";

    String consonant001="BCB";
    String consonant002="DFC";
    String consonant003="GHD";
    String consonant004="JKF";
    String consonant005="LMG";
    String consonant006="NPH";
    String consonant007="QRJ";
    String consonant008="STK";
    String consonant009="VWL";
    String consonant010="XYM";
    String consonant011="ZBN";
    String consonant012="CDP";
    String consonant013="FGQ";
    String consonant014="HJR";
    String consonant015="KLS";
    String consonant016="MNT";
    String consonant017="PQV";
    String consonant018="RSW";
    String consonant019="TVX";
    String consonant020="WXY";
    String consonant021="YZZ";

    String space001="SAE";

    String symbol001="PRD";
    String symbol002="QNM";
    String symbol003="ENP";

    String number001="010";
    String number002="231";
    String number003="452";
    String number004="673";
    String number005="894";
    String number006="015";
    String number007="236";
    String number008="457";
    String number009="678";
    String number010="899";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_ampugenungdeveloper001);

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

                String inputTextfield = txt1.getText().toString().toLowerCase();

                String ipakitamona = inputTextfield
                        .replaceAll("a",vowel001)
                        .replaceAll("e",vowel002)
                        .replaceAll("i",vowel003)
                        .replaceAll("o",vowel004)
                        .replaceAll("u",vowel005)

                        .replaceAll("b",consonant001)
                        .replaceAll("c",consonant002)
                        .replaceAll("d",consonant003)
                        .replaceAll("f",consonant004)
                        .replaceAll("g",consonant005)
                        .replaceAll("h",consonant006)
                        .replaceAll("j",consonant007)
                        .replaceAll("k",consonant008)
                        .replaceAll("l",consonant009)
                        .replaceAll("m",consonant010)
                        .replaceAll("n",consonant011)
                        .replaceAll("p",consonant012)
                        .replaceAll("q",consonant013)
                        .replaceAll("r",consonant014)
                        .replaceAll("s",consonant015)
                        .replaceAll("t",consonant016)
                        .replaceAll("v",consonant017)
                        .replaceAll("w",consonant018)
                        .replaceAll("x",consonant019)
                        .replaceAll("y",consonant020)
                        .replaceAll("z",consonant021)

                        .replaceAll("\\s", space001)

                        .replaceAll("\\.", symbol001)
                        .replaceAll("\\?", symbol002)
                        .replaceAll("\\!", symbol003)

                        .replaceAll("0","#zero")
                        .replaceAll("1","#one")
                        .replaceAll("2","#two")
                        .replaceAll("3","#three")
                        .replaceAll("4","#four")
                        .replaceAll("5","#five")
                        .replaceAll("6","#six")
                        .replaceAll("7","#seven")
                        .replaceAll("8","#eight")
                        .replaceAll("9","#nine")

                        .replaceAll("#zero",number001)
                        .replaceAll("#one",number002)
                        .replaceAll("#two",number003)
                        .replaceAll("#three",number004)
                        .replaceAll("#four",number005)
                        .replaceAll("#five",number006)
                        .replaceAll("#six",number007)
                        .replaceAll("#seven",number008)
                        .replaceAll("#eight",number009)
                        .replaceAll("#nine",number010)

                        ;

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

    public void change(View v) {
        Intent i = new Intent(getApplicationContext(),ampugenungdeveloper002.class);
        startActivity(i);
    }

}
