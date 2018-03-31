package pro.gr.ams.historicalfactboy;

/**
 * Created by Cuya Jeh on 27 Jan 2018.
 */

public class prespanisheramultiplechoicesetb003 {

    // array of questions
    private String textQuestions [] = {
            "1. Isang ritwal kung saan ihinahalo ang dugo ng kasapi sa ritwal at iniinom.",
            "2. Noon ay madalas matatagpuan sa mga tabing dagat o tabing ilog. Ngayon ay ang batayang yunit pulitikal.",
            "3. Ang taga anunsyo o taga balita sa mga barangay noong unang panahon.",
            "4. Isang Malayong preacher o tagapang-aral mula sa Johor na unang nagdala ng Islam sa gitnang Mindanao.",
            "5. Islamikong kaharian sa katimugang Pilipinas na itinatag bilang isang sultanato noong 1450 ni Rajah Baguinda.",
            "6. Ang Atubang ng datu ay mga matatanda at marurunong na nagpapayo sa datu ay kilala din sa katawagang?",
            "7. Ang katawan ng batas na pang-Islam, na isang panuntunan ng pag-uugali, o batas panrelihiyon, ng Islam.",
            "8. Ang lupong tagapayo na katuwang ng sultan.",
            "9. Tawag sa tumutulong  sa sultan sa pagpapalaganap ng islam.",
            "10. Batas ng kaugalian ng Tausug na sumasaklaw sa bawat bahagi ng buhay, panlipunan, pampolitika at panrelihiyon."
    };

    // array of multiple choices for each question
    private String prespanishera_multiplechoice [][] = {
            /*1*/{"suyuan", "talisayon", "sanduguan", "ranao"},
            /*2*/{"balanghai", "barangay", "balangay", "tagalog"},
            /*3*/{"datu", "babaylan", "umalohokan", "sultan"},
            /*4*/{"shariff kabungsuwan", "muhammed", "allah", "abu bakr"},
            /*5*/{"sultanato ng delhi", "sultanato ng sulu", "bangsamoro", "sultanato ng maguindanao"},
            /*6*/{"konseho", "agorang", "tata", "katalonan"},
            /*7*/{"allah", "qur'an", "makkah", "sharia"},
            /*8*/{"rajah", "ruma bichara", "pandita", "datu"},
            /*9*/{"pandita", "datu", "ruma bichara", "rajah"},
            /*10*/{"adat", "sharia", "dakilang utos", "sampung utos"}
    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {
            /*1*/"sanduguan",
            /*2*/"barangay",
            /*3*/"umalohokan",
            /*4*/"shariff kabungsuwan",
            /*5*/"sultanato ng sulu",
            /*6*/"agorang",
            /*7*/"sharia",
            /*8*/"ruma bichara",
            /*9*/"pandita",
            /*10*/"adat"
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