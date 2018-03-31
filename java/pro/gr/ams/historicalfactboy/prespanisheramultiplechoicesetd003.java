package pro.gr.ams.historicalfactboy;

/**
 * Created by Cuya Jeh on 6 Feb 2018.
 */

public class prespanisheramultiplechoicesetd003 {

    // array of questions
    private String textQuestions [] = {
            "1. Isang maalamat na prinsesang mandirigma na kinikilang bayani sa Pangasinan.",
            "2. Isang epikong tula ng mga Ilokano.",
            "3. Isang talumpating patula ng mga Tausug na karaniwang ginagamit sa panliligaw at bilang ng ritwal ng kasal.",
            "4. Ito ang katawagan sa tagapamagitan sa panggagamot",
            "5. Sagutan sa pamamagitan ng awit ng mga Tausug",
            "6. Panitikan ng mga Hiligaynon na binubuo ng dalawang linya at magkakatugma ang mga dulong tunog.",
            "7. Siya ang kinikilalang diyos ng araw ng mga katutubong Pilipino.",
            "8. Isang uri ng paawit na sagutan ng mga Ilokano.",
            "9. Isang awitin ng pag-ibig mula sa Samal. Mula ito sa salitang “leleng” na nangangahulugang “sinta.”",
            "10. Isang awit na solo ng mga Tausug."
    };

    // array of multiple choices for each question
    private String prespanishera_multiplechoice [][] = {
            /*1*/{"urduja", "babalyan", "apolaki ", "amaya"},
            /*2*/{"ambahan", "biag ni lam-ang", "balitaw", "hurubaton"},
            /*3*/{"bantugën", "bumbaran", "daman", "gúman"},
            /*4*/{"babaylan", "djin", "umalohokan", "lupon"},
            /*5*/{"kulintang", "hele", "síndil", "suling"},
            /*6*/{"daman", "hurubaton", "ambahan", "balitaw"},
            /*7*/{"idiyanale", "apolaki", "bakunawa", "lam-ang"},
            /*8*/{"hele", "dállot", "saliada", "liyángkit"},
            /*9*/{"daman", "baléleng", "hurubaton", "djin"},
            /*10*/{"liyángkit", "síndil", "kulintang", "saliada"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {
            /*1*/"urduja",
            /*2*/"biag ni lam-ang",
            /*3*/"daman",
            /*4*/"djin",
            /*5*/"síndil",
            /*6*/"hurubaton",
            /*7*/"apolaki",
            /*8*/"dállot",
            /*9*/"baléleng",
            /*10*/"liyángkit"
    };

    // method returns number of questions
    public int getLength(){
        return textQuestions.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice(int index, int num) {
        String choice0 = prespanishera_multiplechoice[index][num-1];
        return choice0;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}