package pro.gr.ams.historicalfactboy;

/**
 * Created by Cuya Jeh on 13 Feb 2018.
 */

public class spanisheramultiplechoicesetd003 {

    // array of questions
    private String textQuestions [] = {
            "1. Kautusan ng sapilitang paglipat ng tirahan ng mga Pilipino sa mga bagong tayong pamayanan.",
            "2. Tawag sa pera na ginamit ng Espanya mula ika-14 na siglo",
            "3. Namumuno ng pamamahala sa isang encomienda.",
            "4. Teritoryong ipinagkatiwala ng hari ng Espanya sa Conquistador.",
            "5. Salita na ang ibig sabihin ay bayan.",
            "6. Tawag sa mga taong hindi sumusunod sa mga patakarang Espanyol.",
            "7. Sundalong Espanyol na nakatulong sa pagpapatupad at pagpapalaganap ng kolonyalismo.",
            "8. Uri ng buwis noong panahon ng Espanyol",
            "9. Kapirasong papel na katibayan ng pagbabayad ng buwis.",
            "10. Taga singil o taga kolekta ng buwis.",
            "11. Sapilitang pag gawa.",
            "12. Tawag sa taong nagtatrabaho sa sapilitang paggawa.",
            "13. Ugnayang simbahan at pamahalaan upang mapalaganap ang Kristyanismo.",
            "14. Pamumuno ng paring Kastila.",
            "15. Paring Espanyol na Kabilang sa ordeng relihyoso."
    };

    // array of multiple choices for each question
    private String prespanishera_multiplechoice [][] = {
            /*1*/{"reduccion", "reales", "rotasyon", "rebolusyon"},
            /*2*/{"rebolusyon", "reduccion", "reales", "rotasyon"},
            /*3*/{"gobernadorcillo", "encomendero", "illustrado", "encomienda"},
            /*4*/{"encomendero", "reduccion", "encomienda", "reales"},
            /*5*/{"kolonya", "reduccion", "pueblo", "hacienda"},
            /*6*/{"indio", "tulisanes", "ilustrado", "rebolusyonaryo"},
            /*7*/{"conquistador", "falua", "bandala", "tributo"},
            /*8*/{"tributo", "bandala", "falua", "conquistador"},
            /*9*/{"cedula personal", "reales", "tributo", "bandala"},
            /*10*/{"gobernadorcillo", "encomendero", "cabeza de baranggay", "prayle"},
            /*11*/{"tributo", "polo y servicio", "encomienda", "reales"},
            /*12*/{"indio", "ilustrado", "poblacion", "polista"},
            /*13*/{"cabecera", "praylokasya", "patronato real", "prayle"},
            /*14*/{"praylokrasya", "prayle", "patronato real", "cabecera"},
            /*15*/{"paring regular", "paring sekular", "mestizo", "prayle"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {
            /*1*/"reduccion",
            /*2*/"reales",
            /*3*/"encomendero",
            /*4*/"encomienda",
            /*5*/"pueblo",
            /*6*/"tulisanes",
            /*7*/"conquistador",
            /*8*/"tributo",
            /*9*/"cedula personal",
            /*10*/"cabeza de baranggay",
            /*11*/"polo y servicio",
            /*12*/"polista",
            /*13*/"patronato real",
            /*14*/"praylokrasya",
            /*15*/"paring regular"
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