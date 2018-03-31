package pro.gr.ams.historicalfactboy;

/**
 * Created by Cuya Jeh on 21 Jan 2018.
 */

public class americaneramultiplechoiceseta003 {

    // array of questions
    private String textQuestions [] = {
            "1. Ilang taong sinakop ng mga Amerikano ang Pilipinas?",
            "2. Anong taon tumuntong sa kapuluan ng Pilipinas ang mga sundalo ng Estados Unidos?",
            "3. Ito ang Ikalawang Komisyon ng Estados Unidos sa Pilipinas.",
            "4. Anong taon pinatupad ang Batas Organiko sa Pilipinas?",
            "5. Siya ang nagtatag ng Republika ng Katagalugan.",
            "6. Isa sa mga partidong itinatag ng mga elitista o mamayang Pilipino na nakapag-aral.",
            "7. Sasakyang tren na nag-uugnay sa Maynila hanggang Timog  Katagalugan.",
            "8. Mga gurong Amerikanong unang ipinadala sa Pilipinas sabay ng barkong Thomas.",
            "9. Itinatag ni Benigno Ramos noong 1933.",
            "10. Ito ang nagbigay ng batayan sa pananakop ng mga Amerikano sa Pilipinas.",
            "11. Sila ang nagsilbing unang guro noong panahon nang pananakop nang Amerikano.",
            "12. Nagbibigay ng pantay na karapatan sa mga Amerikano na gamitin ang mga likas na yaman ng Pilipinas.",
            "13. Prinsipyo ng pamahalaang Amerikano na naglalayong punan ang pamahalaan ng mga Pilipinong kawani.",
            "14. Ito ang batas na ipinatupad upang sikilin ang kalayaan ng mga Pilipino sa pagpapahayag.",
            "15. Kailan nagsimula ang Digmaang Pilipino-Amerikano?",
            "16. Sino ang naging tagapayo ni Pangulong Aguinaldo?",
            "17. Mga iskolar na Pilipino  na pinag-aral sa Estados Unidos.",
            "18. Programang ipinapatupad upang matugunan ang suliranin sa pabahay.",
            "19. Sistema ukol sa pag-aari ng lupa.",
            "20. Ano ang dalawang bahagi  ng Kongreso  ng Estados Unidos?"
    };

    // array of multiple choices for each question
    private String preamericanera_multiplechoice [][] = {
            /*1*/{"40 taon", "44 taon", "48 taon", "52 taon"},
            /*2*/{"1898", "1869", "1889", "1878"},
            /*3*/{"komisyon ni schurman", "taft commision", "komisyon ni otis", "howard taft"},
            /*4*/{"1902", "1903", "1904", "1899"},
            /*5*/{"macario sakay", "emilio jacinto", "andres bonifacio", "jose rizal"},
            /*6*/{"katipunan", "komunista ", "federalista", "mandirigma"},
            /*7*/{"manila expresses", "southern tagalog expresses ", "quezon expresses", "bicol expresses"},
            /*8*/{"thomasites", "thomasens", "thomasitics", "thomasina"},
            /*9*/{"katipunan", "abu sayaf", "milf", "kapisanang sakdalista"},
            /*10*/{"tratado sa amerika", "tratado sa london ", "tratado sa paris", "tratado sa washington"},
            /*11*/{"pastor", "sundalong amerikano", "thomasitics", "pari"},
            /*12*/{"parity rights", "balanced rights", "batas underwood-simmons", "batas militar"},
            /*13*/{"pilipinasasyon", "filipinoism", "heroism ", "pilipinohan"},
            /*14*/{"batas sedisyon", "batas sa brigansiya", "batas rekonsentrasyon", "batas militar"},
            /*15*/{"pebrero 4, 1899", "abril 20, 1897", "marso 6, 1899", "disyembre 8, 1897"},
            /*16*/{"emilio Jacinto", "apolinario mabini", "andres bonifacio", "macario Sakay"},
            /*17*/{"pensionado", "iskolars", "thomasites", "transferee"},
            /*18*/{"batas torrens", "homestead", "steadhome", "batas tornes"},
            /*19*/{"steamhome", "batas torrens", "batas tornes", "homestead"},
            /*20*/{"kongreso at senado", "ehukutibo at pambatasan", "kongreso at kapulugan", "senado at kapulungan"}
};

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {
            /*1*/"48 taon",
            /*2*/"1898",
            /*3*/"taft commision",
            /*4*/"1902",
            /*5*/"macario sakay",
            /*6*/"federalista",
            /*7*/"bicol expresses",
            /*8*/"thomasites",
            /*9*/"kapisanang sakdalista",
            /*10*/"tratado sa paris",
            /*11*/"sundalong amerikano",
            /*12*/"parity rights",
            /*13*/"pilipinasasyon",
            /*14*/"batas sedisyon",
            /*15*/"pebrero 4, 1899",
            /*16*/"apolinario mabini",
            /*17*/"pensionado",
            /*18*/"homestead",
            /*19*/"batas torrens",
            /*20*/"senado at kapulungan"
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