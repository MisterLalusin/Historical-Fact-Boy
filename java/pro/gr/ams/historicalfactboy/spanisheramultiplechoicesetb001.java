package pro.gr.ams.historicalfactboy;


import android.app.Dialog;
import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class spanisheramultiplechoicesetb001 extends AppCompatActivity {

    //gobacktohomealertdialog
    public Dialog mDialog;
    public Button mDialogyes,mDialogno;
    //gobacktohomealertdialog

    private spanisheramultiplechoicesetb003 mQuestionLibrary = new spanisheramultiplechoicesetb003();
    private TextView mScoreView;   // view for current total score
    private TextView mQuestionView;  //current question to answer
    private Button mButtonChoice1; // multiple choice 1 for mQuestionView
    private Button mButtonChoice2; // multiple choice 2 for mQuestionView
    private Button mButtonChoice3; // multiple choice 3 for mQuestionView
    private Button mButtonChoice4; // multiple choice 4 for mQuestionView

    private String mAnswer;  // correct answer for question in mQuestionView
    private int mScore = 0;  // current total score
    private int mQuestionNumber = 0; // current question number

    MediaPlayer spanisheraonclicksfx001;
    MediaPlayer spanisheraonclicksfx002;
    MediaPlayer spanisherabackgroundmusic001;
    private Dialog triviaDialog;//triviapopup

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.style_spanisheramultiplechoicesetb001);

        createDialog();   //gobacktohomealertdialog

        //triviapopup

        triviaDialog = new Dialog(this);//triviapopup
        triviaDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        triviaDialog.setContentView(R.layout.style_spanisheramultiplechoicesetbtrivia001);
        triviaDialog.show();

        //triviapopup

        overridePendingTransition(R.anim.alpha_enter, R.anim.alpha_exit);

        spanisheraonclicksfx001=MediaPlayer.create (getApplicationContext(),R.raw.soundeffects001);
        spanisheraonclicksfx002=MediaPlayer.create (getApplicationContext(),R.raw.soundeffects002);

        spanisherabackgroundmusic001 = MediaPlayer.create(this, R.raw.backgroundsfx006);
        spanisherabackgroundmusic001.setAudioStreamType(AudioManager.STREAM_MUSIC);
        spanisherabackgroundmusic001.setLooping(true);
        //spanisherabackgroundmusic001.start();

        // setup screen for the first question with four alternative to answer
        mScoreView = (TextView)findViewById(R.id.score);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);
        mButtonChoice4 = (Button)findViewById(R.id.choice4);
        updateQuestion();
        // show current total score for the user
        updateScore(mScore);
    }

    private void updateQuestion(){
        // check if we are not outside array bounds for questions
        if(mQuestionNumber<mQuestionLibrary.getLength() ){
            // set the text for new question, and new 4 alternative to answer on four buttons
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice(mQuestionNumber, 1));
            mButtonChoice2.setText(mQuestionLibrary.getChoice(mQuestionNumber, 2));
            mButtonChoice3.setText(mQuestionLibrary.getChoice(mQuestionNumber, 3));
            mButtonChoice4.setText(mQuestionLibrary.getChoice(mQuestionNumber,4));
            mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
            mQuestionNumber++;
        }

        else {
            overridePendingTransition(R.anim.alpha_enter, R.anim.alpha_exit);
            //Toast.makeText(getApplicationContext(), "It was the last question!", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(getApplicationContext(), spanisheramultiplechoicesetb002.class);
            intent.putExtra("score", mScore); // pass the current score to the second screen
            startActivity(intent);
            finish();
        }
    }

    // show current total score for the user
    private void updateScore(int point) {
        mScoreView.setText("" + mScore);//mScoreView.setText("" + mScore+"/"+mQuestionLibrary.getLength());
    }

    public void onClick(View view) {

        //spanisheraonclicksfx001.start();//yung feeling na nagimbento ka lang ng method wahaha

        //all logic for all answers buttons in one method
        Button answer = (Button) view;
        // if the answer is correct, increase the score
        if (answer.getText() == mAnswer){
            spanisheraonclicksfx001.start();//yung feeling na nagimbento ka lang ng method wahaha
            mScore = mScore + 1;
            //Toast.makeText(getApplicationContext(), "Correct!", Toast.LENGTH_SHORT).show();
        }else
            spanisheraonclicksfx002.start();//yung feeling na nagimbento ka lang ng method wahaha
        //Toast.makeText(getApplicationContext(), "Wrong!", Toast.LENGTH_SHORT).show();
        // show current total score for the user
        updateScore(mScore);
        // once user answer the question, we move on to the next one, if any
        updateQuestion();
    }


    @Override
    protected void onPause() {
        super.onPause();
        spanisherabackgroundmusic001.pause();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Level 2", Toast.LENGTH_SHORT).show();
        spanisherabackgroundmusic001.start();
    }

    //gobacktohomealertdialog

    protected void createDialog() {
        mDialog = new Dialog(this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(R.layout.style_gobacktohomealertdialog001);

        mDialog.setCanceledOnTouchOutside(true);
        mDialog.setCancelable(true);
        mDialogyes = (Button) mDialog.findViewById(R.id.yes);
        mDialogno = (Button) mDialog.findViewById(R.id.No);
        mDialogyes.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), loading002.class);
                startActivity(intent);
                finish();
            }
        });

        mDialogno.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                mDialog.dismiss();
            }
        });

    }

    @Override
    public void onBackPressed() {
        mDialog.show();
    }

//gobacktohomealertdialog

}
