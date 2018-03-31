package pro.gr.ams.historicalfactboy;

/**
 * Created by Cuya Jeh on 18 Feb 2018.
 */

public class americaneramultiplechoicesetc003 {

    // array of questions
    private String textQuestions [] = {
            "1. Siya ang pinakabatang heneral na lumaban sa Digmaang Pilipino-Amerikano",
            "2. Petsa kung kailan pormal na naghayag ng pakikipagdigma ang pamahalaan ng Republikang Pilipino laban sa Amerika.",
            "3. Unang bangkong Amerikano sa Pilipinas",
            "4. Tinanggal nito ang limitasyon at buwis sa mga produktong iniluluwas ng Pilipinas sa Estados Unidos.",
            "5. Relihiyong ipinakilala ng mga Amerikano.",
            "6. Nagpasimula ng komersiyal na paglalakbay sa pamamagitan ng eroplano.",
            "7. Dito ipinatapon ang mga rebolusyonaryong lider matapos magpahayag ng katapatan sa Amerika.",
            "8. Tawag pampulitika sa Pilipinas noong 1935 hanggang 1946.",
            "9. Pangulo ng Estados Unidos noong sakupin nito ang Pilipinas.",
            "10. Sa labanang ito napasalang ang bayaning si Heneral Gregorio del Pilar.",
            "11. Tinagurian siya bilang pinakamahusay na Pilipinong opisyal ng militar noong digmaan.",
            "12. Petsa kung kailan iprinoklama ni Pangulong Roosevelt ang pagtatapos ng Digmaang Pilipino-Amerikano.",
            "13. Naglingkod siya bilang gobernador heneral sa pilipinas mula taong 1898 hanggang taong 1900.",
            "14. Komisyong sumiyasat at umalam kalagayan ng Pilipinas upang maging batayan ng mga planong pagbabago.",
            "15. Siya ang inatasang mamuno sa pagsalakay sa Hapon noong Nobyembre 1945.",
            "16. Petsa kung kailan nahuli ng Pwersang Amerikano ang pangulo ng republika.",
            "17. Batas na nabigyang-bisa ang pagtatayo ng dalawang pampublikong paaralan sa bawat lalawigan.",
            "18. Pamantasaang ipinatayo noong taong 1908.",
            "19. Petsa kung kelan ipinag-utos na ipinatapon ang mga rebolusyonaryong lider sa Guam.",
            "20. Wikang ginamit bilang wikang panturo noong panahon ng mga Amerikano."
    };

    // array of multiple choices for each question
    private String preamericanera_multiplechoice [][] = {
            /*1*/{"heneral antonio luna", "heneral gregorio del pilar", "heneral emilio jacinto", "heneral miguel marval"},
            /*2*/{"ika-12 ng hunyo taong 1898", "ika-12 ng hulyo taong 1901", "ika-2 ng hunyo taong 1899", "ika-2 ng hunyo taong 1897"},
            /*3*/{"american bank", "us bank", "bdo", "bpi"},
            /*4*/{"jones act", "payne-aldrich tariff act", "underwood-simmons act", "homestead act of 1924"},
            /*5*/{"romano katoliko", "protestanismo", "iglesia ni cristo", "kritiyanismo"},
            /*6*/{"philippine aerial taxi company", "cebu pacific", "philippine airlines", "qatar airways"},
            /*7*/{"dapitan", "guam", "mariveles", "palawan"},
            /*8*/{"komonwelt ng maynila", "komonwelt ng luzon", "komonwelt ng pilipinas", "komonwelt ng bataan"},
            /*9*/{"william howard taft", "theodore roosevelt", "barack obama", "abraham lincoln"},
            /*10*/{"labanan sa san juan del monte", "labanan sa tulay ng zapote", "labanan sa pasong tirad", "labanan sa mendiola"},
            /*11*/{"heneral gregorio del pilar", "heneral emilio jacinto", "heneral antonio luna", "heneral miguel marval"},
            /*12*/{"ika-14 hunyo taong 1905", "ika-4 hulyo taong 1902", "ika-8 enero taong 1901", "ika-10 hulyo taong 1922"},
            /*13*/{"william mckinley", "elwell stephen otis", "arthur macarthur jr.", "henry ware lawton"},
            /*14*/{"komisyong schurman", "komisyong taft", "national heritage commission", "commission on audit"},
            /*15*/{"william howard taft", "elwell stephen otis", "douglas macarthur", "william mckinley"},
            /*16*/{"ika-23 ng enero taong 1911", "ika-5 ng enero taong 1899", "ika-13 ng marso taong 1901", "ika-15 ng pebrero taong 1898"},
            /*17*/{"batas gabaldon", "underwood-simmons act", "batas jones", "homestead act of 1924"},
            /*18*/{"unibersidad ng pilipinas", "silliman university", "eastern university", "centro escolar university"},
            /*19*/{"ika-7 ng enero taong 1901", "ika-14 ng pebrero taong 1913", "ika-1 ng nobyembre taong 1911", "ika-28 ng pebrero taong 1899"},
            /*20*/{"espanyol", "ingles", "filipino", "bisaya"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {
            /*1*/"heneral gregorio del pilar",
            /*2*/"ika-2 ng hunyo taong 1899",
            /*3*/"american bank",
            /*4*/"payne-aldrich tariff act",
            /*5*/"protestanismo",
            /*6*/"philippine aerial taxi company",
            /*7*/"guam",
            /*8*/"komonwelt ng pilipinas",
            /*9*/"theodore roosevelt",
            /*10*/"labanan sa pasong tirad",
            /*11*/"heneral antonio luna",
            /*12*/"ika-4 hulyo taong 1902",
            /*13*/"elwell stephen otis",
            /*14*/"komisyong schurman",
            /*15*/"douglas macarthur",
            /*16*/"ika-13 ng marso taong 1901",
            /*17*/"batas gabaldon",
            /*18*/"unibersidad ng pilipinas",
            /*19*/"ika-7 ng enero taong 1901",
            /*20*/"ingles"
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