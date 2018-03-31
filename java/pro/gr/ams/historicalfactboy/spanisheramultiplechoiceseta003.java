package pro.gr.ams.historicalfactboy;

/**
 * Created by Cuya Jeh on 21 Jan 2018.
 */

public class spanisheramultiplechoiceseta003 {

    // array of questions
    private String textQuestions [] = {
            "1. Ilang taon tumagal ang pananakop ng mga espanyol?",
            "2. Siya ang pinuno ng mactan na pumigil sa pananakop ng espanyol.",
            "3. Eksplorador na Portuges na kauna-unahang nakapaglayag mula sa Europa pakanluran patungong Asya.",
            "4. Dito ipinahayag ng Katipunan ang nagging hudyat ng Himagsikang Pilipino laban sa Imperyong Kastila.",
            "5. Siya ay isang ilustradong kilala sa pagsulat niya ng Noli me tangere at El Filibusterismo?",
            "6. Samahang itinatag ni Jose Rizal sa Pilipinas noong Hulyo 3, 1892.",
            "7. Sila ay binitay sa pamamagitan ng garote noong Pebrero 17, 1872.",
            "8. Siya ang pangalawang asawa ni Andres Bonifacio at kilala rin bilang Lakambini ng Katipunan.",
            "9. Siya ang unang supremo ng Kataas-taasan, Kagalang-galangang Katipunan ng mga Anak ng Bayan.",
            "10. Sa petsang ito ay pinatay sa Bagumbayan sa pamamagitan ng firing squad ang bayaning si Dr.Jose Rizal.",
            "11. Grupo ng ilustrado na naghangad na magkaroon ng representasyon ang Pilipinas sa Cortes Generales.",
            "12. Layunin ng kilusang ito ang kilalanin ng mga Kastila ang Pilipinas bilang bahagi at lalawigan ng Espanya.",
            "13. Isang ilustrado noong panahon ng Espanyol. Ang kanyang pangalan sa dyaryo ay Plaridel.",
            "14. Siya ang puminta ng Spoliarium.",
            "15. Bilang parangal kay Haring Filipe II ay tinawag ang Pilipinas bilang ano?"
    };

    // array of multiple choices for each question
    private String prespanishera_multiplechoice [][] = {
            /*1*/{"232 Taon", "333 Taon", "59 Taon", "69 Taon"},
            /*2*/{"lapu-Lapu", "raja humabon", "sultan kudarat", "lakandula"},
            /*3*/{"miguel lopez de legazpi", "ferdinand magellan", "marco polo", "ruy lópez de villalobos"},
            /*4*/{"unang sigaw ng nueva ecija", "kumbensyon sa tejeros", "sigaw ng pugad lawin", "himagsikan ng balintawak"},
            /*5*/{"graciano lópez jaena", "dr. jose rizal", "antonio luna", "marcelo h. del pilar"},
            /*6*/{"la liga filipina", "la solidaridad", "katipunan", "cofradía de san josé"},
            /*7*/{"brijida", "gomburza", "kilusang propaganda", "katipunan"},
            /*8*/{"josephine bracken", "monica bonifacio", "gregoria de jesus", "leonor rivera–kipping"},
            /*9*/{"jose rizal", "deodato dela cruz arellano", "andres bonifacio", "melchora aquino"},
            /*10*/{"mayo 10, 1897", "disyembre 30, 1896", "nobyembre 30, 1863", "hunyo 19, 1861"},
            /*11*/{"la solidaridad", "la liga filipina", "cofradía de san josé", "gomburza"},
            /*12*/{"la liga filipina", "cofradía de san josé", "kilusang propaganda", "la solidaridad"},
            /*13*/{"graciano lópez jaena", "marcelo h. del pilar", "mariano ponce,", "antonio luna"},
            /*14*/{"juan luna", "marcelo h. del pilar", "antonio luna", "mariano ponce"},
            /*15*/{"filipe island", "isla filipinas", "las islas filipinas", "pilipinas"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {
            /*1*/"333 Taon",
            /*2*/"lapu-Lapu",
            /*3*/"ferdinand magellan",
            /*4*/"sigaw ng pugad lawin",
            /*5*/"dr. jose rizal",
            /*6*/"la liga filipina",
            /*7*/"gomburza",
            /*8*/"gregoria de jesus",
            /*9*/"deodato dela cruz arellano",
            /*10*/"disyembre 30, 1896",
            /*11*/"la solidaridad",
            /*12*/"kilusang propaganda",
            /*13*/"marcelo h. del pilar",
            /*14*/"juan luna",
            /*15*/"las islas filipinas"
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