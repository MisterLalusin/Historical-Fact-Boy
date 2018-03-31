package pro.gr.ams.historicalfactboy;

/**
 * Created by Cuya Jeh on 11 Feb 2018.
 */

public class prespanisheramultiplechoicesete003 {

    // array of questions
    private String textQuestions [] = {
            "1. Ito ay ang kalakalan na hindi gumagamit ng salapi. Palitan lamang ito ng kalakal o palitan ng paninda.",
            "2. Ang kathang-isip na \"TheWrath of Kaptan\" mula sa Visayas ay isang halimbawa ng isang alamat sa ilalim ng.",
            "3. Ito ang sinaunang pangalan sa kabuuang lupain ng tangway ng Bikol.",
            "4. Ito ay isang epiko ng mga Ifugao.",
            "5. Isang dragon sa mitolohiyang Pilipino na kadalasang kinakatawan bilang isang malahiganteng serpyenteng pang-dagat.",
            "6. Isang alipin na walang anumang ari-arian at nakatira sa tahanan ng kanyang pinaglilingkuran.",
            "7. Sa mitolohiya ng Pilipinas, ito ang pinaniniwalaan ng mga Tagalog bilang isang panandang ibon.",
            "8. Isang uri ng katutubong manggagamot sa na gumagamit ng mga dahon at yerba para lunasan ang mga karamdaman.",
            "9. Ang mga sumusunod ay iba pang katawagan sa barter maliban sa isa.",
            "10. Siya ang kinikilalang diyosa ng kamatayan."
    };

    // array of multiple choices for each question
    private String prespanishera_multiplechoice [][] = {
            /*1*/{"galyon", "tanaga", "kalakalan", "barter"},
            /*2*/{"the great flood", "origin of land features", "origin of water features", "origin of animals"},
            /*3*/{"kudaman", "ibalon", "manuvu", "agyu"},
            /*4*/{"ulahingan", "lumalindaw", "biag ni lam-ang", "hudhud ni aliguyon"},
            /*5*/{"kan-laon", "idinayale", "sidapa", "bakunawa"},
            /*6*/{"timawa", "aliping namamahay", "maharlika", "aliping saguiguilid"},
            /*7*/{"bakunawa", "apolaki", "adat", "tigmamanukan"},
            /*8*/{"babaylan", "katalonan", "djin", "medikong-tapal"},
            /*9*/{"tuwayan", "pasingáw", "kamkalatse", "kambyo"},
            /*10*/{"padron", "sidapa", "manaul", "kan-laon"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {
            /*1*/"barter",
            /*2*/"the great flood",
            /*3*/"ibalon",
            /*4*/"hudhud ni aliguyon",
            /*5*/"bakunawa",
            /*6*/"aliping saguiguilid",
            /*7*/"tigmamanukan",
            /*8*/"medikong-tapal",
            /*9*/"pasingáw",
            /*10*/"sidapa"
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