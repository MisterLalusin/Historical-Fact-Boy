package pro.gr.ams.historicalfactboy;

/**
 * Created by Cuya Jeh on 6 Feb 2018.
 */

public class prespanisheramultiplechoicesetc003 {

    // array of questions
    private String textQuestions [] = {
            "1. Ito ay isang awit ng digmaan na naging isang awit ng pag-ibig.",
            "2. Ito ay isang awit ng pagsasaya.",
            "3. Salaysay na nagpapaliwanag kung paano dumating ang mundo at tao sa kanilang kasalukuyang anyo.",
            "4. Paksa na naghahanap upang ipaliwanag ang mga natural na kababalaghan tulad ng kulog at kidlat.",
            "5. Ang mga ito ay mga alamat na nagsasabi sa atin kung paano nakikita ng diyos na nakipag-usap sa tao.",
            "6. Alin sa mga sumusunod ang isang tema ng mga pre-kolonyal na teksto?",
            "7. Kilalanin ang dalawang klasipikasyon ng katutubong panitikan.",
            "8. Isa sa dalawang pinakapopular na anyo ng matulaing pahayag sa buong Katagalugan.",
            "9. Ang diyos ng mga sinaunang Bisaya.",
            "10. Awiting-bayang nagpapahiwatig ng masayáng pagbatì sa panauhing dumalo sa kasal o anumang masayáng okasyon."
    };

    // array of multiple choices for each question
    private String prespanishera_multiplechoice [][] = {
            /*1*/{"talindaw", "uyayid", "kumintang", "hele"},
            /*2*/{"diyuna", "epiko", "uyayi", "sabi"},
            /*3*/{"epiko", "alamat", "pabula", "mito"},
            /*4*/{"maagang konsepto ng uniberso", "pagtatatag ng natural order", "ang araw, buwan at mga bituin", "pagkuha ng kultura"},
            /*5*/{"pinagmulan ng sunog", "relasyon sa pagitan ng mga diyos at tao", "ang mga diyos at ang paglikha ng mundo", "lahat ng mga ito"},
            /*6*/{"war", "reincarnation", "ideals", "karma"},
            /*7*/{"dynamic at static", "floating at oral", "local at global", "flat at round"},
            /*8*/{"diyona", "tanaga", "dalít", "uyayi"},
            /*9*/{"bathala", "kan-laon", "idiyanale", "apolaki"},
            /*10*/{"salidúmmay", "tagulayláy", "talingdaw", "ambahan"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {
            /*1*/"kumintang",
            /*2*/"diyuna",
            /*3*/"mito",
            /*4*/"pagtatatag ng natural order",
            /*5*/"relasyon sa pagitan ng mga diyos at tao",
            /*6*/"ideals",
            /*7*/"floating at oral",
            /*8*/"dalít",
            /*9*/"kan-laon",
            /*10*/"salidúmmay"
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