package pro.gr.ams.historicalfactboy;

/**
 * Created by Cuya Jeh on 17 Feb 2018.
 */

public class americaneramultiplechoicesetb003 {

    // array of questions
    private String textQuestions [] = {
            "1. Kailan dumating ang mga Thomasites na lulan ng barkong S.S. Thomas.",
            "2. Siya ang nagtatag ng Iglesia Filipina Independiente.",
            "3. Sa pamamagitan ng batas na ito ay naitatag ang Senado na pinamumunuan na ng mga Pilipino.",
            "4. Itinatag ng Philippine Commision noong 1901.",
            "5. Siya ang patnugot ng pahayagang El Renacimiento.",
            "6. Siya ang may-ari ng pahayagang El Renacimiento.",
            "7. Kailan ipinatupad ni Pangulong William McKinley ang Benevolent Assimilation?",
            "8. Siya ang unang natatanging Pilipinong makata sa Ingles.",
            "9. Wikang ginagamit noong panahon ng Amerikano.",
            "10. Ang unang pahayagang Amerikano na umikot sa Pilipinas.",
            "11. Sumulat ng kauna-unahang nobelang Pilipino sa wikang Ingles na pinamagatang “A Child of Sorrow”.",
            "12. Sino ang unang pangulo ng Pamahalaang Komonwelt?",
            "13. Ito ay pagbabawal ng paglalabas at pagwawagayway ng bandila ng Pilipinas.",
            "14. Kailan namatay si Heneral Antonio Luna?",
            "15. Kailan nadakip si Pangulong Emilio Aguinaldo ng mga Amerikano?",
            "16. Sino ang namuno sa sa Unang Komisyon sa Pilipinas?",
            "17. Naging daan sa pagbili ng mga lupain ng mga prayleng at sa pamamahagi ng mga lupaing ito sa mga Pilipino.",
            "18. Isa sa pangunahing paraalang itinatag ng mga Amerikano.",
            "19. Ano ang pangunahing kontribusyon ng mga Amerikano sa Pilipinas",
            "20. Kailan idineklara ang kasarinlan ng Pilipinas?"
    };

    // array of multiple choices for each question
    private String preamericanera_multiplechoice [][] = {
            /*1*/{"ika-20 ng pebrero taong 1900", "ika-23 ng agosto taong 1901", "ika-20 ng abril taong 1900", "ika-8 ng disyembre taong 1901"},
            /*2*/{"juan aglipay ", "macario aglipay", "gregorio aglipay", "gregorio sakay"},
            /*3*/{"batas jones", "batas calvin", "batas taft", "batas commonwealth"},
            /*4*/{"batas hemminggway", "batas taft", "batas sa panunulisan", "batas sedisyon"},
            /*5*/{"martin kalaw", "teodoro ocampo", "teodoro kalaw", "martin ocampo"},
            /*6*/{"teodoro ocampo", "martin ocampo", "martin kalaw", "teodoro kalaw "},
            /*7*/{"ika-21 ng hunyo taong 1898", "ika-21 ng setyembre taong 1898", "ika-21 ng marso taong 1898", "ika-21 ng disyembre taong 1898"},
            /*8*/{"fernando maramag", "fernando balagtas", "francisco balagbatas", "juan luna"},
            /*9*/{"ingles", "espanyol", "tagalog", "filipino"},
            /*10*/{"american time", "american era", "american soldier", "the america"},
            /*11*/{"zoilo galang", "jorge bacobo", "jose garcia villa", "nmv gonzales"},
            /*12*/{"manuel quezon", "sergio osmena", "manuel roxas", "emilio aguinaldo"},
            /*13*/{"american law", "flag rule", "flag law", "american era"},
            /*14*/{"hunyo 1900", "hunyo 1902", "hunyo 1899", "hunyo 1901"},
            /*15*/{"ika-25 ng marso taong 1900", "ika-12 ng hunyo taong 1901", "ika-23 ng marso taong 1901", "ika-12 ng hulyo taong 1900"},
            /*16*/{"george dewey", "jacob schurman", "elwell otis", "pangulong mckinley"},
            /*17*/{"pangulong mckinley", "gobernador heneral taft", "jacob shcurman", "elwell otis"},
            /*18*/{"systems technology institute", "ateneo de manila", "paaralang normal", "unibersidad ng sto. tomas"},
            /*19*/{"pera ", "relihiyon", "edukasyon", "politika"},
            /*20*/{"ika-12 ng hunyo taong 1899", "ika-12 ng hulyo taong 1889", "ika-12 ng hulyo taong 1898", "ika-12 ng hunyo taong 1898"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {
            /*1*/"ika-23 ng agosto taong 1901",
            /*2*/"gregorio aglipay",
            /*3*/"batas jones",
            /*4*/"batas sedisyon",
            /*5*/"teodoro kalaw",
            /*6*/"martin ocampo",
            /*7*/"ika-21 ng disyembre taong 1898",
            /*8*/"fernando maramag",
            /*9*/"ingles",
            /*10*/"american soldier",
            /*11*/"zoilo galang",
            /*12*/"manuel quezon",
            /*13*/"flag law",
            /*14*/"hunyo 1899",
            /*15*/"ika-23 ng marso taong 1901",
            /*16*/"jacob schurman",
            /*17*/"gobernador heneral taft",
            /*18*/"paaralang normal",
            /*19*/"edukasyon",
            /*20*/"ika-12 ng hunyo taong 1898"
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
        String choice0 = preamericanera_multiplechoice[index][num-1];
        return choice0;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}