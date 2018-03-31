package pro.gr.ams.historicalfactboy;

/**
 * Created by Cuya Jeh on 16 Feb 2018.
 */

public class japaneseeramultiplechoiceseta003 {

    // array of questions
    private String textQuestions [] = {
            "1. Kailan idineklara ni Douglas MacArthur na ang Maynila ay isang open city?",
            "2. Heneral na nagdeklara ng pagtatapos ng pananakop ng mga Amerikano at nagpasimula ng martial law.",
            "3. Ang huling dalawang letra sa USAFFE ay kumakatawan sa  mga salitang?",
            "4. Kailan nangyari ang pagbomba ng mga Hapon sa Maynila?",
            "5. Petsa kung kailan naganap ang Bataan Death March.",
            "6. Petsa kung kailan sumuko ang mga Hapones. ",
            "7. Petsa kung kailan nagpasabog ng bomba ang Amerika sa Hiroshima,Japan.",
            "8. Petsa kung kailan sumuko ang pwersang Amerikano at Pilipino sa mga Hapones.",
            "9. Gaano katagal ang pananakop ng mga Hapones? ",
            "10. Ayon sa estima gaano karami ang kasama sa Death March.",
            "11. Petsa kung kailan bumalik si Heneral Douglas MacArthur.",
            "12. Ano ang pamosong linya ni Douglas MacArthur noong siya ay muling nagbalik?",
            "13. Kailan naideklara na malaya na ang Pilipinas sa pananakop ng Hapones?",
            "14. Ang letrang A sa USAFFE ay kumakatawan sa  mga salitang?",
            "15. Salaping inilabas noong panahon ng Hapones.",
            "16. Inatake ito ng mga hapones bago lumusob sa Pilipinas.",
            "17. Sa petsang ito ihinayag na muli nang nabawi ang Pilipinas mula sa mga Hapones.",
            "18. Wikang itinuro ng Hapones sa mga Pilipino noong sila ay nanakop.",
            "19. Tawag sa pulis na Hapones.",
            "20. Itinatag ng mga Hapones sa kanilang pananakop sa Pilipinas.",
            "21. Sino ang namahala noong kasagsagan ng pananakop ng mga Hapones?",
            "22. Sino ang namuno sa KALIBAPI?",
            "23. Ano ang itinawag sa panahon ng pananakop ng mga Hapones sa Pilipinas? ",
            "24. Anong probisyon ang nagpalaya sa Pilipinas sa kamay ng Amerikano? ",
            "25. Kailan bumalik ang pwersang Amerikano sa Leyte?"
    };

    // array of multiple choices for each question
    private String prejapaneseera_multiplechoice [][] = {
            /*1*/{"ika-26 disyembre taong 1941", "ika-26 disyembre taong 1942", "ika-27 disyembre taong 1941", "ika-27 disyembre taong 1942"},
            /*2*/{"heneral mohammad homa", "heneral murasma homma", "heneral masaharu hommus", "heneral masaharu homma"},
            /*3*/{"far east", "far eastern", "far england", "force in east"},
            /*4*/{"ika-27 disyembre taong 1941", "ika-27 disyembre taong 1943", "ika-30 disyembre taong 1941", "ika-30 disyembre taong 1943"},
            /*5*/{"abril 26-31 1942", "abril 10-15 1942", "abril 15-20 1942", "abril 5-10 1942"},
            /*6*/{"ika-2 ng setyembre taong 1945", "ika-3 ng setyembre taong 1945", "ika-9 ng setyembre taong 1945", "ika-18 ng setyembre taong 1945"},
            /*7*/{"ika-6 ng agosto taong 1945", "ika-8 ng agosto taong 1947", "ika-6 ng agosto taong 1947", "ika-8 ng agosto taong 1945"},
            /*8*/{"ika-9 ng abril taong 1942", "ika-9 ng abril taong 1946", "ika-9 ng abril taong 1947", "ika-9 ng abril taong 1949"},
            /*9*/{"3 taon", "7 taon", "35 taon", "69 taon"},
            /*10*/{"76,000", "35,000", "45,000", "69,000"},
            /*11*/{"ika-20 ng oktobre taong 1944", "ika-21 ng oktobre taong 1944", "ika-22 ng oktobre taong 1944", "ika-26 ng oktobre taong 1944"},
            /*12*/{"“i am back”", "“i have returned”", "“thank god i'm here”", "“i am glad to be back”"},
            /*13*/{"ika-4 ng hulyo taong 1945", "ika-4 ng hulyo taong 1969", "ika-4 ng hulyo taong 1956", "ika-4 ng hulyo taong 1944"},
            /*14*/{"american", "armed", "america", "army"},
            /*15*/{"yen", "pokemon money", "mickeymouse money", "bitcoin"},
            /*16*/{"statue of liberty", "china", "pearl harbor", "bohol"},
            /*17*/{"ika-5 ng hulyo taong 1945", "ika-5 ng hulyo taong 1969", "ika-7 ng hulyo taong 1967", "ika-7 ng hulyo taong 1945"},
            /*18*/{"nihonggo", "ingles", "hanggul", "mandarin"},
            /*19*/{"keisatsu", "army", "kempetai", "pulis"},
            /*20*/{"pampublikong paaralan", "ospital", "base militar", "pribadong paaralan"},
            /*21*/{"manuel l. quezon", "fidel v. ramos", "emilio aguinaldo", "ferdinand marcos"},
            /*22*/{"jose p. laurel", "fidel v. ramos", "sergio osmeña", "mannuel l. quezon"},
            /*23*/{"panahon ng kadiliman", "panahon ng kasarinlan", "panahon ng pighati", "panahon ng kaliwanagan"},
            /*24*/{"mcduffie-tydings act", "american provision", "philippine-american provision", "philippine act"},
            /*25*/{"ika-20 ng octobre taong 1944", "ika-20 ng octobre taong 1969", "ika-30 ng octobre taong 1994", "ika-30 ng octobre taong 1969"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {
            /*1*/"ika-26 disyembre taong 1941",
            /*2*/"heneral masaharu homma",
            /*3*/"far east",
            /*4*/"ika-27 disyembre taong 1941",
            /*5*/"abril 10-15 1942",
            /*6*/"ika-2 ng setyembre taong 1945",
            /*7*/"ika-6 ng agosto taong 1945",
            /*8*/"ika-9 ng abril taong 1942",
            /*9*/"3 taon",
            /*10*/"76,000",
            /*11*/"ika-20 ng oktobre taong 1944",
            /*12*/"“i have returned”",
            /*13*/"ika-4 ng hulyo taong 1945",
            /*14*/"armed",
            /*15*/"mickeymouse money",
            /*16*/"pearl harbor",
            /*17*/"ika-5 ng hulyo taong 1945",
            /*18*/"nihonggo",
            /*19*/"kempetai",
            /*20*/"pampublikong paaralan",
            /*21*/"manuel l. quezon",
            /*22*/"jose p. laurel",
            /*23*/"panahon ng kadiliman",
            /*24*/"mcduffie-tydings act",
            /*25*/"ika-20 ng octobre taong 1944"
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
        String choice0 = prejapaneseera_multiplechoice[index][num-1];
        return choice0;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}