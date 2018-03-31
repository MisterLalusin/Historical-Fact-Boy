package pro.gr.ams.historicalfactboy;

/**
 * Created by Cuya Jeh on 17 Feb 2018.
 */

public class japaneseeramultiplechoicesetb003 {

    // array of questions
    private String textQuestions [] = {
            "1. Ang unang pilotong Pilipinong pinarangalan sa kanyang pakikidigma sa himpapawid.",
            "2. Pagpapalakad sa mga sundalong Pilipino at Amerikano mula Mariveles hanggang San Fernando.",
            "3. Saang pangkat kabilang ang Estados Unidos noong Ikalawang Digmaang Pandaigdig. ",
            "4. Ang tunay na layunin ng mga Hapon sa pagsakop sa Pilipinas.",
            "5. Ipinahayag ng mga Hapon na layunin nilang palaganapin ito sa buong mundo.",
            "6. Alin sa mga sumusunod and hindi nangyari sa panahon ng pananakop ng Hapon sa Pilipinas?",
            "7. Saang pangkat nabibilang ang Hapon sa panahon ng Ikalawang Digmaang Pandaigdig?",
            "8. Siya ang namuno sa USIP na sumuko sa mga Hapon sa Corregidor.",
            "9. Bakit kailangang lisanin ang Maynila ng tropang USAFFE at magtungo sa Bataan?",
            "10. Ang kumander ng puwersa sa Bataan na napilitang sumuko sa mga Hapon.",
            "11. Paano madaling nagapi ng mga Hapon ang puwersang Pilipino-Amerikano?",
            "12. Ano ang ginawa ng mga Pilipinong opisyal nang sumuko na ang tropang Amerikano sa mga Hapon? ",
            "13. Petsa kung kelan idineklarang “open city” ang Maynila ",
            "14. Bakit nasali ang Pilipinas sa Ikalawang Digmaang Pandaigdig?",
            "15. Saan nagtapos ang paglalakad ng mga bilanggong kawal sa tinaguriang “Death march”?",
            "16. Sino ang Amerikanong heneral ng tropang Visayas at Mindanao na sumuko sa mga Hapon sa Malaybalay, Bukidnon? ",
            "17. Anong bansa ang nambomba sa Hiroshima at Nagasaki sa Japan?",
            "18. Ito ang tawag sa mga kababaihang sekwal na inabuso ng mga sundalong hapon noong digmaan.",
            "19. Heneral na Hapones na may dala ng mga nakaw na yaman mula sa ibat-ibang bansa sa Asya?",
            "20. Mga bansang kabilang sa Axis Power.",
            "21. Mga bansang kabilang sa Allied Power.",
            "22. Sino ang ikatlo at huling pangulo ng komonwelt?",
            "23. Ano ang nakasulat sa unahan ng salapi noong panahon ng hapon?",
            "24. Isang tula na kinagigiliwan ng mga hapones.",
            "25. Isang uri ng tula na mas maikli kumpara sa Haiku."
    };

    // array of multiple choices for each question
    private String prejapaneseera_multiplechoice [][] = {
            /*1*/{"tinyente cesar basa", "tinyente geronimo aclan", "kapitan jesus villamor", "major jorge b. vargas"},
            /*2*/{"martsa ng kamatayan sa mariveles", "martsa ng kamatayan sa bataan", "martsa ng kamatayan sa san fernando", "martsa ng kamatayan sa pampangga"},
            /*3*/{"allied powers", "nato", "united nations", "axis"},
            /*4*/{"kasunduan nila ng amerika", "pagpapatunay ng kapangyarihan", "pakiusap ng mga pilipino", "utos ng united nations "},
            /*5*/{"usaffe", "axis", "greater asia co-prosperity sphere", "allied"},
            /*6*/{"pagbagsak ng bataan", "pagpapatuloy ng Komonwelt sa us", "pagbagsak ng corregidor", "pagbili sa pilipinas"},
            /*7*/{"axis", "asean", "allied powers", "united nations"},
            /*8*/{"hen. douglas macarthur", "hen. jonathan wainwright", "hen. william f. sharp jr.", "hen. edward p. king"},
            /*9*/{"sapagkat napakalaki nito", "sapagkat maraming gerilya doon", "sapagkat naroon ang mga hapon", "labis itong mawawasak"},
            /*10*/{"hen. douglas macarthur", "hen. william f. sharp jr.", "hen. edward p. king", "hen. jonathan wainwright"},
            /*11*/{"pagpatay sa mga sumukong sundalo", "propaganda", "pagbabayad ng malaking halaga", "walang humpay na pambobomba"},
            /*12*/{"sumuko na rin", "naglunsad ng pakikidigmang gerilya", "nagtago sa malalayong lugar", "nakipagtulungan sa mga hapon"},
            /*13*/{"ika-22 ng nobyembre taong 1941", "ika-26 ng disyembre taong 1941", "ika-1 ng nobyembre taong 1941", "ika-21 ng agosto taong 1941"},
            /*14*/{"dahil mayaman ito ", "ito ay isang komonwelt", "ginalit nito ang mga hapon", "ito ay bahagi ng kolonya ng amerika"},
            /*15*/{"san fernando, pampanga", "clark field, pampanga ", "capas, tarlac ", "maynila"},
            /*16*/{"hen. jonathan wainwright", "hen. douglas macarthur ", "hen. william f. sharp jr.", "hen. edward p. king"},
            /*17*/{"amerika", "germany", "pilipinas", "russia"},
            /*18*/{"sex workers", "sex victims", "comfort women", "rapbeh"},
            /*19*/{"heneral tomoyuki", "heneral homa", "heneral yamashita", "heneral macarthur"},
            /*20*/{"italya, germany, japan", "pilipinas, amerika, china", "china, amerika, russia", "pilipinas, japan, amerika"},
            /*21*/{"great britain at france", "pilipinas at amerika", "japan at germany", "russia at china"},
            /*22*/{"manuel roxas", "fidel ramos", "emilio aguinaldo", "manuel quezon"},
            /*23*/{"black letters", "block letters", "bleak letters", "broad letters"},
            /*24*/{"tanaga", "haiku", "tula", "ang pagong at ang matsing"},
            /*25*/{"ang pagong at ang matsing", "tula", "spoken word poetry", "tanaga"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {
            /*1*/"kapitan jesus villamor",
            /*2*/"martsa ng kamatayan sa bataan",
            /*3*/"allied powers",
            /*4*/"pagpapatunay ng kapangyarihan",
            /*5*/"axis",
            /*6*/"pagbili sa pilipinas",
            /*7*/"axis",
            /*8*/"hen. douglas macarthur",
            /*9*/"labis itong mawawasak",
            /*10*/"hen. edward p. king",
            /*11*/"walang humpay na pambobomba",
            /*12*/"naglunsad ng pakikidigmang gerilya",
            /*13*/"ika-26 ng disyembre taong 1941",
            /*14*/"ito ay bahagi ng kolonya ng amerika",
            /*15*/"san fernando, pampanga",
            /*16*/"hen. william f. sharp jr.",
            /*17*/"amerika",
            /*18*/"comfort women",
            /*19*/"heneral yamashita",
            /*20*/"italya, germany, japan",
            /*21*/"great britain at france",
            /*22*/"manuel roxas",
            /*23*/"block letters",
            /*24*/"haiku",
            /*25*/"tanaga"
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