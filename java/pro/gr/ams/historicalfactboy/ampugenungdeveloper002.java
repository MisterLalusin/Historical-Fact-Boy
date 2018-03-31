package pro.gr.ams.historicalfactboy;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ampugenungdeveloper002 extends AppCompatActivity {

    private MediaPlayer clickaudio001;

    String vowel001="A";
    String vowel002="E";
    String vowel003="I";
    String vowel004="O";
    String vowel005="U";

    String consonant001="B";
    String consonant002="C";
    String consonant003="D";
    String consonant004="F";
    String consonant005="G";
    String consonant006="H";
    String consonant007="J";
    String consonant008="K";
    String consonant009="L";
    String consonant010="M";
    String consonant011="N";
    String consonant012="P";
    String consonant013="Q";
    String consonant014="R";
    String consonant015="S";
    String consonant016="T";
    String consonant017="V";
    String consonant018="W";
    String consonant019="X";
    String consonant020="Y";
    String consonant021="Z";

    String space001=" ";

    String symbol001=".";
    String symbol002="?";
    String symbol003="!";

    String number001="0";
    String number002="1";
    String number003="2";
    String number004="3";
    String number005="4";
    String number006="5";
    String number007="6";
    String number008="7";
    String number009="8";
    String number010="9";

    String override001="SA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_ampugenungdeveloper002);

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
                        .replaceAll("sae", space001)

                        .replaceAll("aea",vowel001)
                        .replaceAll("ioe",vowel002)
                        .replaceAll("uai",vowel003)
                        .replaceAll("eio",vowel004)
                        .replaceAll("ouu",vowel005)

                        .replaceAll("bcb",consonant001)
                        .replaceAll("dfc",consonant002)
                        .replaceAll("ghd",consonant003)
                        .replaceAll("jkf",consonant004)
                        .replaceAll("lmg",consonant005)
                        .replaceAll("nph",consonant006)
                        .replaceAll("qrj",consonant007)
                        .replaceAll("stk",consonant008)
                        .replaceAll("vwl",consonant009)
                        .replaceAll("xym",consonant010)
                        .replaceAll("zbn",consonant011)
                        .replaceAll("cdp",consonant012)
                        .replaceAll("fgq",consonant013)
                        .replaceAll("hjr",consonant014)
                        .replaceAll("kls",consonant015)
                        .replaceAll("mnt",consonant016)
                        .replaceAll("pqv",consonant017)
                        .replaceAll("rsw",consonant018)
                        .replaceAll("tvx",consonant019)
                        .replaceAll("wxy",consonant020)
                        .replaceAll("yzz",consonant021)

                        .replaceAll("prd", symbol001)
                        .replaceAll("qnm", symbol002)
                        .replaceAll("enp", symbol003)

                        .replaceAll("010","#zero")
                        .replaceAll("231","#one")
                        .replaceAll("452","#two")
                        .replaceAll("673","#three")
                        .replaceAll("894","#four")
                        .replaceAll("015","#five")
                        .replaceAll("236","#six")
                        .replaceAll("457","#seven")
                        .replaceAll("678","#eight")
                        .replaceAll("899","#nine")

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

                        .replaceAll("kl a",override001);

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
        Intent i = new Intent(getApplicationContext(),ampugenungdeveloper001.class);
        startActivity(i);
    }

}
