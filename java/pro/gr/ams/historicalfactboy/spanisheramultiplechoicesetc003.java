package pro.gr.ams.historicalfactboy;

/**
 * Created by Cuya Jeh on 12 Feb 2018.
 */

public class spanisheramultiplechoicesetc003 {

    // array of questions
    private String textQuestions [] = {
            "1. Titulo ng pamahalaang tagapaganap noong pananakop ng mga Kastila.",
            "2. Taong pinapadala ng Espanya upang suriin ang pamamahala ng mga nakatalagang opisyales sa pilipinas?",
            "3. Sino ang kaunaunahang gobernador heneral ng Pilipinas?",
            "4. Kinabibilangan ng mga mayayaman at edukadong mga Espanyol na kadalasan ay may katungkulan sa bayan.",
            "5. Ito ang tawag sa mga hukuman sa panahon ng mga Espanyol.",
            "6. Tawag sa mga Pilipinong may pinagaralan at maituturing na mga taong nakaluluwag sa buhay.",
            "7. Tawag sa mga may purong dugo ng Espanyol na pinaganak sa Pilipinas.",
            "8. Kinabibilangan ito ng mga may purong dugong Espanyol na pinanganak sa Espanya o Europa.",
            "9. Ika-44 na Gobernador Heneral, na naglagay ng mas higit na pansin sa ekonomiya ng pilipinas kaysa sa militar.",
            "10. Paghahati ng mga lupain sa maliliit nay unit upang mas madaling masakop ang mga katutubong populasyon.",
            "11. Kanino ipinangalan ang mga isla ng Pilipinas nang ito ay madiskubre ni Magellan?",
            "12. Ang gobernador heneral na nagpatapon kay Rizal sa Mindanao? ",
            "13. Tawag sa ruta pabalik ng Pilipinas mula Mexico na sadyang dinaraanan ng Galleon.",
            "14. Kastilang prayle at nabigador na naging kapitan sa paglalayag ni Miguel Lopez de Legazpi.",
            "15. Ito ang tawag sa mga Kastilang Pari noong panahon ng Espanyol."
    };

    // array of multiple choices for each question
    private String prespanishera_multiplechoice [][] = {
            /*1*/{"gobernadorcillo", "gobernador-heneral", "cabeza de barangay", "residencia"},
            /*2*/{"principalia", "residencia", "royal audiencia", "visitador"},
            /*3*/{"ruy lopez de villalobos", "ferdinand magellan", "haring philip ii", "miguel lopez de legazpi"},
            /*4*/{"royal", "prinapalia", "residencia", "insulares"},
            /*5*/{"insulares", "la solidaridad", "council of indies", "real audencia"},
            /*6*/{"royal", "principalia", "ilustrados", "residencia"},
            /*7*/{"insulares", "ilustrados", "peninsulas", "residencia"},
            /*8*/{"ilustrados ", "peninsulares", "insulares", "residencia"},
            /*9*/{"jose basco y vargas", "antonio de urbitondo", "pedro sarrio", "andres alcaraz "},
            /*10*/{"audencia", "bullion", "enkomyenda", "galleon"},
            /*11*/{"miguel lopez de legzpi", "jose francisco de obando", "haring Philip ii", "eugelio despijo i"},
            /*12*/{"fernando primo de rivera", "emilio terrero", "rafael de echague", "eugelio despujol"},
            /*13*/{"acapulco", "ruta de manila", "viaje de manila", "tornaviaje"},
            /*14*/{"emilio terrero", "andres de urdaneta", "juan de lara", "jose basco y vargas"},
            /*15*/{"prayle", "pare", "frail", "prayl"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {
            /*1*/"gobernador-heneral",
            /*2*/"residencia",
            /*3*/"miguel lopez de legazpi",
            /*4*/"prinapalia",
            /*5*/"real audencia",
            /*6*/"ilustrados",
            /*7*/"insulares",
            /*8*/"peninsulares",
            /*9*/"jose basco y vargas",
            /*10*/"enkomyenda",
            /*11*/"haring Philip ii",
            /*12*/"eugelio despujol",
            /*13*/"tornaviaje",
            /*14*/"andres de urdaneta",
            /*15*/"prayle"
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