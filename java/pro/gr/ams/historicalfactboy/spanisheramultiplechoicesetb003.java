package pro.gr.ams.historicalfactboy;

/**
 * Created by Cuya Jeh on 12 Feb 2018.
 */

public class spanisheramultiplechoicesetb003 {

    // array of questions
    private String textQuestions [] = {
            "1. Sino ang manlalakbay na naglayag mula sa Espanya upang isagawa ang unang paglalayag sa paligid ng mundo?",
            "2. Ilang taon tumagal ang pamamahala ng mga kastila sa Pilipinas?",
            "3. Sa  anong taon natagpuan ni Magellan ang Pilipinas? ",
            "4. Sino ang bininyagan ni Magellan sa ngalan ng kristyanismo?",
            "5. Sino ang unang katutubo na lumaban sa pananakop ng mga Kastila?",
            "6. Sino ang sunod na Espanyol ang dumating sa Pilipinas pag katapos ng ekspedisyon Magellan?",
            "7. Nagtatag ng unang Kolonya sa Pilipinas.",
            "8. Rebolusyonaryong nakipagsabwatan sa mga pwersang Britanyo upang patalsikin ang pamamahalang Kastila.",
            "9. Anong kasunduan ang nagbalik sa Maynila sa kapangyarihan ng Espanya?",
            "10. Sino ang ika-44 na kastilang Gobernador Heneral ng pilipinas?",
            "11. Aling lugar ang pinili ni Legazpi na maging kabisera ng kolonya?",
            "12. Barkong pangkalakalan ng Espanya na lumalayag sa karagatang pasipiko patungong Mehiko.",
            "13. Lahat ng ito maliban sa isa ay ang mga dahilan sa kolonisasyon ng Espanya sa Pilipinas.",
            "14. Tinulungan siya ni Magellan na labanan si Lapu lapu.",
            "15. Anong lugar ang unang narating ng expedisyon ni Magellan?"
    };

    // array of multiple choices for each question
    private String prespanishera_multiplechoice [][] = {
            /*1*/{"ferdinand magellan", "ruy lopez de villalobos", "philip ii", "miguel lopez de legazpi"},
            /*2*/{"333 taon", "334 taon", "335 taon", "336 taon"},
            /*3*/{"1521", "1512", "1511", "1522"},
            /*4*/{"datu lapu lapu", "raha humabon", "raha kolambu", "raha siagu"},
            /*5*/{"raha kolambu", "lapu lapu", "datu zula", "raha humabon"},
            /*6*/{"miguel lopez de legazpi", "philip ii", "ruy lopez de villalobos", "juan salcedo"},
            /*7*/{"philip ii", "juan salcedo", "ruy lopez de villalobos", "miguel Lopez de legazpi"},
            /*8*/{"diego silang", "gabriela silang", "apolinario mabini", "andres bonifacio"},
            /*9*/{"kasunduan sa biak na bato", "kasunduan sa versailles", "kasunduan sa paris", "lumang tipan"},
            /*10*/{"jose basco y vargas", "miguel lopez de legazpi", "ruy Lopez de villalobos", "pedro sarrio"},
            /*11*/{"maynila", "batanes", "cebu", "mactan"},
            /*12*/{"galleon ng maynila", "barko ng victoria", "barkong trinidad", "barkong concepcion"},
            /*13*/{"virtue", "god", "gold", "glory"},
            /*14*/{"raha kolambu", "raha siagu", "datu zula", "raha humabon"},
            /*15*/{"samar", "leyte", "mactan", "spice islands"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {
            /*1*/"ferdinand magellan",
            /*2*/"333 taon",
            /*3*/"1521",
            /*4*/"raha humabon",
            /*5*/"lapu lapu",
            /*6*/"ruy lopez de villalobos",
            /*7*/"miguel Lopez de legazpi",
            /*8*/"diego silang",
            /*9*/"kasunduan sa paris",
            /*10*/"jose basco y vargas",
            /*11*/"maynila",
            /*12*/"galleon ng maynila",
            /*13*/"virtue",
            /*14*/"raha humabon",
            /*15*/"samar"
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