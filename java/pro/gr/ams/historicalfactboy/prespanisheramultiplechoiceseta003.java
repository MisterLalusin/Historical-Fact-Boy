package pro.gr.ams.historicalfactboy;

/**
 * Created by Cuya Jeh on 16 Jan 2018.
 */

public class prespanisheramultiplechoiceseta003 {

    // array of questions
    private String textQuestions [] = {
            "1. Hinango mismo ang salitang barangay mula sa lumang bangkang Malay na tinatawag na?",
            "2. Dito nabibilang ang mga datu, raja, sultan at ang kanilang pamilya at kaanak.",
            "3. Tawag sa mga katutubong may pinakamababang antas sa lipunan.",
            "4. Pinakalumang kasulatan na natagpuan sa kasaysayan ng Pilipinas. Natagpuan ito ni Ginoong Ernesto Lacerna Legisma.",
            "5. Isang katawagan, pangalan, o pamagat para sa mga pinuno o monarka ng Islam.",
            "6. Isang salitang katawagan para sa mga katutubong Pilipinong manggagamot at pinuno ng pamayanan.",
            "7. Isang diyos na pinapaniwalaan ng mga sinaunang Pilipino bago dumating ang mga Kastila.",
            "8. Siya ang kinikilalang diyosa ng pagsasaka.",
            "9. Isang nilalang na may mala-kabayong hitsura",
            "10. Ang makapangyarihang diyos na mula sa mitolohiya ng mga lumang Tagalog."
    };

    // array of multiple choices for each question
    private String prespanishera_multiplechoice [][] = {
            /*1*/{"arangay", "barang", "brgy.", "balangay"},
            /*2*/{"maharlika", "timawa", "aliping namamahay", "aliping saguiguilid"},
            /*3*/{"indio", "alipin", "timawa", "badjao"},
            /*4*/{"laguna copperplate inscription", "baybayin", "alibata", "sanskrit"},
            /*5*/{"gobernador", "sultan", "rajah", "datu"},
            /*6*/{"babaylan", "katalonan", "amain", "papa isio"},
            /*7*/{"maykapal", "anito", "minukawa", "kabunian"},
            /*8*/{"hayo", "idiyanale", "lakambini", "Lingga"},
            /*9*/{"aswang", "kapre", "maligno", "tikbalang"},
            /*10*/{"kabunian", "maykapal", "anito", "bathala"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {
            /*1*/"balangay",
            /*2*/"maharlika",
            /*3*/"alipin",
            /*4*/"laguna copperplate inscription",
            /*5*/"sultan",
            /*6*/"babaylan",
            /*7*/"anito",
            /*8*/"idiyanale",
            /*9*/"tikbalang",
            /*10*/"bathala"
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