package pro.gr.ams.historicalfactboy;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class developersoption001 extends AppCompatActivity {

    private EditText command;
    private Button inputcommand;
    private MediaPlayer clickaudio001;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_developersoption001);

        overridePendingTransition(R.anim.alpha_enter, R.anim.alpha_exit);

        clickaudio001= MediaPlayer.create(getApplicationContext(),R.raw.soundeffects003);

        command = (EditText)findViewById(R.id.commandline);
        inputcommand = (Button)findViewById(R.id.btninput);


        inputcommand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(command.getText().toString());
            }
        });
    }

    private void validate(String inputStr) {

        clickaudio001.start();

        if ((inputStr.equals("yakis.developer.start(help);"))) {

            command.setText("yakis.developer.start(help);" +
                    "\n\nhelp.showText( {\n\n          help : to get the basic commands\n\n          lvl1: go to pre-spanish era quiz\n\n          lvl2: go to spanish era quiz\n" +
                    "\n          lvl3: go to american era quiz\n\n          lvl4: go to japanese era quiz\n\n           lvl5: go to entire history quiz\n" +
                    "\n          mira: atbash application\n\n          rovic: ultimo-cifrado application\n\n          signed: signed apk details\n\n});\n\n\n");

        }
        else if ((inputStr.equals("yakis.developer.start(lvl1);"))) {

            Intent i = new Intent(getApplicationContext(),prespanisheramultiplechoicerandom001.class);
            startActivity(i);
            finish();

            Toast.makeText(this, "Play Pre-Spanish Era Quiz.", Toast.LENGTH_SHORT).show();

        }
        else if ((inputStr.equals("yakis.developer.start(lvl2);"))) {

            Intent i = new Intent(getApplicationContext(),spanisheramultiplechoicerandom001.class);
            startActivity(i);
            finish();

            Toast.makeText(this, "Play Spanish Era Quiz.", Toast.LENGTH_SHORT).show();

        }
        else if ((inputStr.equals("yakis.developer.start(lvl2);"))) {

            Intent i = new Intent(getApplicationContext(),spanisheramultiplechoicerandom001.class);
            startActivity(i);
            finish();

            Toast.makeText(this, "Play Spanish Era Quiz.", Toast.LENGTH_SHORT).show();

        }
        else if ((inputStr.equals("yakis.developer.start(lvl3);"))) {

            Intent i = new Intent(getApplicationContext(),americaneramultiplechoicerandom001.class);
            startActivity(i);
            finish();

            Toast.makeText(this, "Play American Era Quiz.", Toast.LENGTH_SHORT).show();

        }
        else if ((inputStr.equals("yakis.developer.start(lvl4);"))) {

            Intent i = new Intent(getApplicationContext(),japaneseeramultiplechoicerandom001.class);
            startActivity(i);
            finish();

            Toast.makeText(this, "Play Japanese Era Quiz.", Toast.LENGTH_SHORT).show();

        }
        else if ((inputStr.equals("yakis.developer.start(lvl5);"))) {

            Intent i = new Intent(getApplicationContext(),entirehistorymultiplechoicerandom001.class);
            startActivity(i);
            finish();

            Toast.makeText(this, "Play Entire History Quiz.", Toast.LENGTH_SHORT).show();

        }
        else if ((inputStr.equals("yakis.developer.start(method);"))){

            Toast.makeText(this, "No method written", Toast.LENGTH_SHORT).show();

        }
        else if ((inputStr.equals("yakis.developer.start(mira);"))) {

            Intent i = new Intent(getApplicationContext(),alieninvasion001.class);
            startActivity(i);
            finish();

            Toast.makeText(this, "Elyen Pa More!", Toast.LENGTH_SHORT).show();

        }
        else if ((inputStr.equals("yakis.developer.start(rovic);"))) {

            Intent i = new Intent(getApplicationContext(),ampugenungdeveloper001.class);
            startActivity(i);
            finish();

            Toast.makeText(this, "Puge ko 'nu!", Toast.LENGTH_SHORT).show();

        }
        else if ((inputStr.equals("yakis.developer.start(signed);"))) {

            command.setText("yakis.developer.start(signed);" +
                    "\n\nsigned.showText( {\n\n          Signed Apk\n\n          alias : Yakis Game Develpers\n\n          password: ict102positionnumber69\n\n          first and last name: pakboy\n" +
                    "\n          years: 69\n\n});\n\n\n");


        }
        else if ((inputStr.equals("yakis.developer.start(xxx);"))) {

            command.setText("OW3W93E8JE94EJ4KJ3IO3UC309IC4OC9TU9U5IV5O55J5IOUT5IO5J9T55TUTITJ5T8T5J5IJT55V85VHJVIIJV598R3CHJ3CUCHC48CRU4Y8CU3CHJ4J4VJ58HU4H48HXUWNDKDXDWJ9EJE3I3U33J3J454KNV5IV5JKBKVVKFKTJT4K4KCJ3XK3JX3KC33JJI3IC833CHUC83ICJ84FHJC54FH484H45JJ8656HG8J8J4F9FJJT49JT49GJT94JI4TJDT9DTJ944JDJ4T9FJT4I4DWGH3UHWFUH48DHN4D7HJDHUEKH3GIXGEIEHISGKSHDSJEHDHHHE3JG3J34JU3JU3J3H4HJ33H4B3H3J4H4J4J3J33H3SKSKDJ4EM3EJ3MJ3M3JNSMDJJKDKFGJDKDKDNEEKDK3K3KM3KISDJSKJDJ8JE83DJ83J385YIWEU38RU33RI385J38HR83HR3U38RH83HR383H38JD83HR393J39JR39RJR39JRR93JR399JJR933JR933JRRJ3JRR939RJR939JR3837HR73HRR79EJEJEJEJEJEJE383RJJ38RJR38RH383HRR383HR3RHR8R3J3RR838URJE8JR38JR38RUJR83RJR93RJ39RJ39JRRJ93JRR93JRR93JR39RJR39RJR933JRJ39RJ39J393J93J393RJR39RRJR93RJR93RJ393RJR93JRRJR93JRR93J3RJ933J4UCJCXJZXOXI3ISIAK3A33K33LFK3DLLSMNCNV404I44OOEUIE4920I2KXI22J2JSJDKDJDLSS2O3K3944K44944I44I49KDI94JDJ94FJF449GJG5IGK595HJ5KG95KGK559K9O44IJ4VN4FJ494JF94JF94944JF4CM4J4C4I4JCC4MI8393J93U3C55555");

        }
        else {

            command.setText("yakis.developer.start(method);");

            Toast.makeText(this, "Command not found!", Toast.LENGTH_SHORT).show();

        }
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
