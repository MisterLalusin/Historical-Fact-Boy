package pro.gr.ams.historicalfactboy;

/**
 * Created by Cuya Jeh on 18 Feb 2018.
 */

public class entirehistorymultiplechoiceseta003 {

    // array of questions
    private String textQuestions [] = {

            "1. Dito iprinoklama ang kalayaan ng Pilipinas noong ika-12 ng Hunyo taong 1898.",
            "2. Siya ang unang babaeng pangulo ng Republika ng Pilipinas.",
            "3. Siya ang unang Miss Universe mula sa Pilipinas.",
            "4. Ang kauna-unahang figure skater mula sa Timog Silangang Asya na nakapasok sa Olympics.",
            "5. Kilala siya bilang pambansang kamao ng Pilipinas.",
            "6. Dito nasawi ang 44 na miyembro ng SAF na naatasang hulihin ang teroristang si Marwan.",
            "7. Bagyong puminsala sa tacloban noong nobyembre taong 2013 at kumitil sa di bababa sa 3,976 katao.",
            "8. Isang insidente ng pamamaslang na naganap sa bayan ng Ampatuan noong ika-23 ng nobyembre taong 2009. ",
            "9. Siya ang pangulo ng Pilipinas na may pinakamahabang termino ng panunungkulan.",
            "10. Siya ay nanalo ng gold medal sa 1994 Asian Games at isang silver sa 1996 Summer Olympics.",

            "11. Pangulong nagpatupad ng patakarang \"Pilipino Muna\".",
            "12. Pagbibihag ng bus na puno ng mga turistang Tsino sa Quirino Grandstand noong ika-23 ng agosto 2010.",
            "13. Siya ang unang Pilipinong Santo.",
            "14. Santo Papang tatlong beses bumisita sa Pilipinas, ito ay noong mga taong 1973, 1981, at 1995.",
            "15. Pangulong namatay sa pagbagsak ng kanyang sinasakyang eroplano sa Bundok Manunggal sa Cebu.",
            "16. Siya ang nagsilbing pinuno ng Hukbalahap mula noong 1942 hanggang 1954.",
            "17. Samahang isinulong ni Diosdado Macapagal na naglalayong pagkaisahin ang mga Malay.",
            "18. Mapayapang demonstrasyong nagtagal ng apat na araw, ito ay mula ika-22 hangang 25 ng Pebrero 1986.",
            "19. Unang Pilipino na nakaayat sa isa sa mga Pitong Tuktok.",
            "20. Siya ang pinaniniwalaang mastermind sa Pork Barrel Scam.",

            "21. Nagsimula matapos maglayag ang 235 mga Pilipino, patungo sa Lahad Datu noong 11 Pebrero 2013.",
            "22. Ito ang itinuturing na pinakamalaking labanang pandagat noong Ikalawang Digmaang Pandaigdig.",
            "23. Dito naganap ang unang misa sa Pilipinas.",
            "24. Kinatipan siyang sumama at tumulong para sa kapitang Portuges na si Fernando Magallanes.",
            "25. Ikalawang Pilipinong Santo.",
            "26. Bayaning Pilipino na isinilang noong ika-30 ng nobyembre taong 1863.",
            "27. Pinta ni Juan Luna na pinarangalan ng gintong medalya sa Exposición Nacional de Bellas Artes noong 1884.",
            "28. Pintor na kilala sa pagiging malikhain at pagkadalubhasa sa paggamit ng liwanag sa aspeto ng sining.",
            "29. Gawad sa mga nakamit ang pinakamataas na pagkilala sa pag-ambag sa kaunlaran ng mga sining.",
            "30. Ang may pinakamatagal na rebelyon sa kasaysayan ng Pilipinas.",

            "31. Isang grupo ng sibilyang hukbo na lumalaban para sa rebolusyong komunista ng Pilipinas.",
            "32. Siya ang nagtatag ng Moro National Liberation Front.",
            "33. Nilikha ang rehiyong ito noong 1 Enero 1990 sa bisa ng Batas Republika Blg. 6734.",
            "34. Ang nag-iisang barkong nakabalik sa Espanya matapos ang ekspidisyon ni Magellan.",
            "35. Pagpupulong ng dalawang paksiyong manghihimagsik ng Himagsikang Pilipino sa Casa Hacienda ng Tejeros.",
            "36. Kauna-unahang babaeng naitalaga sa Kataas-taasang Hukuman ng Pilipinas.",
            "37. Kauna-unahang punong mahistradong na-impeach sa kasaysayan ng Pilipinas.",
            "38. Pangulo ng Republika ng Negros mula ika-5 ng November taong 1898 hanggang ika-30 ng Abril taong 1901.",
            "39. Isang 'di-kinikilalang estado sa Timog-silangang Asya na pinamunuan ni Nur Misuari, tagapangulo ng MNLF.",
            "40. Idineklarang kabisera ng Republikang Bangsamoro.",

            "41. Isang kapisanang pangheopolitika, pang-ekonomiya, at pangkultura ng mga bansa sa Timog-Silangang Asya.",
            "42. Isa sa mga nobela ni Rizal na nangangahulugang \"Huwag mo akong salingin\".",
            "43. Ito ang kauna-unang aklat na nilathala sa Pilipinas.",
            "44. Itinuturing na pinakamatandang ebidensya ng “tao” sa kapuluan.",
            "45. Isang paraan ng pagsusulat ng ating mga katutubo.",
            "46. Nagsilbi ito bilang pangunahing tanggulan para sa sa look at lungsod ng Manila.",
            "47. Siya ang pinuno ng pangkat ng Magdiwang.",
            "48. Paksyon ng katipunan na umusbong sa hilagang-kanlurang bahagi ng lalawigan ng Kabite.",
            "49. Tanyág na Simbahang Katolika na matatagpuan sa Maynila.",
            "50. Dito naganap ang pagbalangkas sa Konstitusyon ng Malolos.",

            "51. Isang Pilipinong senador na naging pangunahing kritiko ni Pangulong Ferdinand Marcos.",
            "52. Pangulong pinatalsik sa Edsa Dos.",
            "53. Siya ang kinikilala bilang \"the greatest Filipino basketball player of all time\".",
            "54. Bagyong nagdulot ng malakas na pagbuhos ng ulan sa kalakhang Maynila noong ika-26 Setyembre taong 2009.",
            "55. Pilipinong nagpasikat ng laruang Yoyo.",
            "56. Siya ang pumangalawa sa naganap na 2004 Philippine presidential election.",
            "57. Partido ng dating pangulong Noynoy Aquino.",
            "58. Lugar kung saan binaril si Gat Jose Rizal.",
            "59. Militanteng grupo na nabuo noong 1944 sa pangunguna nina Benigno Ramos at Artemio Ricarte.",
            "60. Bilang ng wikang alam ni Dr.Rizal.",

            "61. Kilala bilang Dakilang Paralitiko at Utak ng Rebolusyon.",
            "62. Pinamunuan niya ang pwersa ng Pilipinas sa laban sa Espanya noong mga huling taon ng Rebolusyong Pilipino.",
            "63. Matapang na asawa ng lider ng Ilokanong maghihimagsik na si Diego Silang.",
            "64. Tatlong pari ng Katolikong Pilipino na pinatay noong 17 Pebrero 1872 sa Bagumbayan.",
            "65. Kilala sa kanyang matagumpay na pag-atake sa mga kuwartel ng Espanyol sa Paombong, sa Labanan ng Quingua.",
            "66. Tagapagtatag ng Girl Scouts of the Philippines na pinapatay noong panahon ng mga Hapon.",
            "67. Isang dibuho ng pagkaladkad ng mga bangkay ng mga natalong gladyator sa Colosseum sa Roma.",
            "68. Kilala bilang “Ama ng Wikang Filipino.” Tinagurian ding “Ama ng Republika ng Pilipinas”.",
            "69. Sinikap niyang itaguyod ang makabayang sentimyento ng mga ilustradong Pilipino.",
            "70. Rebolusyonaryong Pilipino na kilala bilang \"Tandang Sora\" dahil sa kanyang edad.",

            "71. Huling Pilipinong heneral na sumuko sa mga Amerikano.",
            "72. Kinomisyon ni Bonifacio upang makipag-usap kay Rizal ukol sa planong bumangon laban sa mga Espanyol.",
            "73. Ang ika-7 Pangulo ng Pilipinas na kilala bilang \"Presidente ng Masang Pilipino\". ",
            "74. Ang ina ng pambansang bayani ng Pilipinas na si Jose Rizal.",
            "75. Unang babaeng mandirigma sa Panay at kilala bilang \"Joan of Arc ng Visayas\".",
            "76. Isang makabayang pahayagang nasa wikang Tagalog at Espanyol, na itinatag ni Marcelo del Pilar noong 1882.",
            "77. Pagbisita ng mga sundalong Amerikano sa Pilipinas upang magsanay simula pa noong ika-27 ng Mayo 1999.",
            "78. Siya ang unang Pilipinong nakatakdang makarating sa kalawakan.",
            "79. Amerikanong sangkot sa tinaguriang Subic Rape Case noong 2005.",
            "80. Lider ng \"Sige Sige\" na nagpasimula sa pinakalaking Riot sa New Bilibid Prison kung saan may pinugutan.",

            "81. Ito ang partido ng kasalukuyang pangulo ng Republika ng Pilipinas na si Rodrigo Duterte.",
            "82. Siya ang kasalukuyang bise-presidente ng Republika.",
            "83. Pandaigdigang labanán na nagsimula noong ika-1 ng Setyembre 1939 at natapos noong ika-2 ng Setyembre 1945.",
            "84. Siya ang nagbigay ng suplay sa mga submarino patungong Bataan at Corregidor sa pagsisimula ng digmaan.",
            "85. Dito lumisan si dating pangulong Marcos matapos mapatalsik sa Edsa I.",
            "86. Unang ginang ni pangulong Ferdinang Marcos.",
            "87. Bombang ibinagsak sa Hiroshima.",
            "88. Bayaning nanalo ng 6,200 piso sa lotto noong 1892.",
            "89. Isa siyang artista ng Moro-Moro bago nagging Supremo ng Katipunan.",
            "90. Isang Cabeza de Baranggay bago nagging Pangulo.",

            "91. Kilala rin ito bilang Philippine Rise.",
            "92. Bulkang pumutok noong ika-16 ng Hulyo taong 1991.",
            "93. Ito ang kapital ng bansang Pilipinas.",
            "94. Ang Banco Español-Filipino de Isabel II na kauna-unahang bangko sa Pilipinas ay kilala ngayon bilang.",
            "95. Tinagurian siyang Ina ng Demokrasya.",
            "96. Dito isinilang ang dating pangulong si Elpidio Quirino.",
            "97. Bombang ibinagsak sa Nagasaki.",
            "98. Dito matatagpuan ang kilometer zero ng bansa.",
            "99. Opisyal na tiráhan ng pangulo ng Pilipinas.",
            "100. Ito ang lugar ng kapanganakan ng pambansang bayani."
    };

    // array of multiple choices for each question
    private String preentirehistory_multiplechoice [][] = {

            /*1*/{"maynila", "kawit, cavite", "pugad lawin", "mariveles, bataan"},
            /*2*/{"miriam defensor santiago", "corazon aquino", "grace poe", "gloria macapagal arroyo"},
            /*3*/{"pia wurtzbach", "margarita moran", "gloria diaz", "shamcey supsup"},
            /*4*/{"albert martinez", "michael martinez", "mansueto velasco", "nick joaquin"},
            /*5*/{"nonito donaire", "donnie \"ahas\" nietes", "manny pacquiao", "mark magsayo"},
            /*6*/{"marawi", "mamasapano", "ampatuan, maguindano", "tacloban"},
            /*7*/{"bagyong ondoy", "bagyong yolanda", "bagyong glenda", "bagyong vinta"},
            /*8*/{"maguindanao massacre", "mamasapano clash", "zamboanga siege", "manila hostage crisis"},
            /*9*/{"bong bong Marcos", "ninoy aquino", "ferdinand marcos", "imelda marcos"},
            /*10*/{"roel velasco", "mansueto \"onyok\" velasco, Jr.", "leopoldo serantes", "manny \"pacman\" pacquiao"},

            /*11*/{"carlos p. garcia", "diosdado macapagal", "ramon magsaysay", "elpidio quirino"},
            /*12*/{"maguindanao massacre", "manila hostage crisis", "mamasapano clash", "zamboanga siege"},
            /*13*/{"san lorenzo ruiz", "san pedro calungsod", "gomburza", "saint pope john paul ii"},
            /*14*/{"pope john paul i", "pope john paul ii", "pope benedict xvi", "pope francis"},
            /*15*/{"ramon magsaysay", "carlos p. garcia", "elpidio quirino", "diosdado macapagal"},
            /*16*/{"luis taruc", "sandra aguinaldo", "jay taruc", "howie severino"},
            /*17*/{"asean", "maphilindo", "united nations", "european union"},
            /*18*/{"rebolusyon sa edsa ng 1986", "esda dos", "edsa tres", "edsa dos bente dos"},
            /*19*/{"heracleo \"leo\" oracion", "romeo \"romi\" garduce", "dale abenojar", "erwin emata"},
            /*20*/{"juan ponce enrile", "ramon revilla jr.", "jinggoy estrada", "janet lim-napoles"},

            /*21*/{"zamboanga siege", "2013 lahad datu standoff", "mamasapano clash", "maguindanao massacre"},
            /*22*/{"battle of mactan", "battle of manila bay", "battle of san juan hill", "battle of leyte gulf"},
            /*23*/{"mactan", "limasawa", "bohol", "leyte"},
            /*24*/{"marco polo", "miguel lopez de legazpi", "antonio pigafetta", "ruy lópez de villalobos"},
            /*25*/{"saint pope john paul ii", "gomburza", "san lorenzo ruiz", "san pedro calungsod"},
            /*26*/{"dr.jose rizal", "andres bonifacio", "emilio aguinaldo", "antonio luna"},
            /*27*/{"mona lisa", "spoliarium", "the last supper", "the creation of adam"},
            /*28*/{"victor edades", "fernando amorsolo", "juan luna", "jose t. joya"},
            /*29*/{"medal of valor", "pambansang alagad ng sining", "order of sikatuna ", "pmpc star awards"},
            /*30*/{"rebelyon ni dagohoy", "rebelyong silang", "rebolusyon ng babaylang tamblot", "rebelyong komunista"},

            /*31*/{"bagong hukbong bayan", "hukbalahap", "milf", "mnlf"},
            /*32*/{"andres bonifacio", "nur misuari", "antonio luna", "emilio aguinaldo"},
            /*33*/{"car", "armm", "negros island region", "region iv-a"},
            /*34*/{"barkong victoria", "barkong santiago", "barkong san antonio", "barkong trinidad"},
            /*35*/{"kumbensiyon sa tejeros", "1987 constitutional convention", "convention of states", "constitutional convention"},
            /*36*/{"maria lourdes sereno", "cecilia muñoz-palma", "corazon aquino", "gloria arroyo"},
            /*37*/{"renato corona", "maria lourdes sereno", "hugo gutierrez", "reynato puno"},
            /*38*/{"emilio aguinaldo", "elpidio quirino", "ramon magsaysay", "aniceto lacson"},
            /*39*/{"republika ng negros", "republikang bangsamoro", "unang republika", "ikatlong republika"},
            /*40*/{"lungsod ng dabaw", "lungsod ng cebu", "lungsod ng maynila", "lungsod ng makati"},

            /*41*/{"asean", "un", "eu", "maphilindo"},
            /*42*/{"noli me tangere", "el filibusterismo", "makamisa", "ibong adarna"},
            /*43*/{"ang pasyon", "noli me tangere", "doctrina cristiana", "el filibusterismo"},
            /*44*/{"taong tabon", "taong callao", "taong peking", "taong cagayan"},
            /*45*/{"sanskrit", "alibata", "hieroglyphics", "calligraphy"},
            /*46*/{"bataan", "spratlys", "corregidor", "bajo de masinlok"},
            /*47*/{"andres bonifacio", "emilio aguinaldo", "hen.mariano alvares ", "jose rizal"},
            /*48*/{"magdalo", "magdiwang", "liberal", "federal"},
            /*49*/{"simbahan ng taal", "katedral ng maynila", "simbahan ng barasoain", "cathedral ng imus"},
            /*50*/{"simbahan ng quiapo", "simbahan ng barasoain", "simbahan ng taal", "katedral ng maynila"},

            /*51*/{"benigno aquino, sr.", "benigno aquino, jr.", "benigno aquino, iii", "juan ponce enrile"},
            /*52*/{"gloria macapagal arroyo", "joseph estrada", "corazonn aquino", "ferdinand marcos"},
            /*53*/{"caloy loyzaga", "benjie paras", "kobe paras", "jordan clarkson"},
            /*54*/{"bagyong ondoy", "bagyong yolanda", "bagyong maring", "bagyong glenda"},
            /*55*/{"agapito flores", "caloy loyzaga", "pedro flores", "cecilia muñoz-palma"},
            /*56*/{"panfilo lacson", "fernando poe, jr.", "gloria macapagal-arroyo", "eddie villanueva"},
            /*57*/{"pdp laban", "partido liberal", "partido nacionalista", "una"},
            /*58*/{"makati", "bagumbayan", "mactan", "dapitan"},
            /*59*/{"hukbalahab", "makapili", "npa", "katipunan"},
            /*60*/{"labing-isa", "labing-dalawa", "dalawampu't dalawa", "animnapu't siyam"},

            /*61*/{"emilio jacinto", "apolinario mabini", "emilio aguinaldo", "andres bonifacio"},
            /*62*/{"emilio aguinaldo", "manuel quezon", "jose p. laurel", "manuel roxas"},
            /*63*/{"gabriela silang", "josephine bracken", "monica bonifacio", "leonor rivera–kipping"},
            /*64*/{"jose rizal", "katipunan", "gomburza", "paring regular"},
            /*65*/{"emilio jacinto", "gregorio del pilar", "juan luna", "emilio aguinaldo"},
            /*66*/{"josefa llanes escoda", "monica bonifacio", "josephine bracken", "gabriela silang"},
            /*67*/{"mga kababaihan at mga tanawin", "spoliarium", "mona lisa", "lavandera"},
            /*68*/{"manuel roxas", "emilio aguinaldo", "manuel quezon", "emilio jacinto"},
            /*69*/{"marcelo h. del pilar", "gregorio del pilar", "jose rizal", "andres bonifacio"},
            /*70*/{"corazon aquino", "melchora aquino", "miriam defensor santiago", "monica bonifacio"},

            /*71*/{"miguel malvar", "gregorio del pilar", "emilio aguinaldo", "emilio jacinto"},
            /*72*/{"gregorio del pilar", "pio valenzuela", "miguel malvar", "emilio jacinto"},
            /*73*/{"carlos p. garcia", "ramon magsaysay", "elpidio quirino", "manuel roxas"},
            /*74*/{"teodora alonzo", "melchora aquino", "monica bonifacio", "josephine bracken"},
            /*75*/{"melchora aquino", "teresa magbanua", "josephine bracken", "teodora alonzo"},
            /*76*/{"diariong tagalog", "la solidaridad", "the varsitarian", "manila bulletin"},
            /*77*/{"edca", "visiting forces agreement", "bfa", "dfa"},
            /*78*/{"chino roque", "chino roces", "jessy mendiola", "chris tiu"},
            /*79*/{"leo echegaray", "daniel smith", "joseph scott pemberton", "baby ama"},
            /*80*/{"marvin mercado", "baby ama", "leo echegaray", "emilio chango"},

            /*81*/{"liberal", "pdp-laban", "magdalo", "una"},
            /*82*/{"bong bong marcos", "allan peter cayetano", "leni robredo", "jesse robredo"},
            /*83*/{"world war i", "world war ii", "world war iii", "cold war"},
            /*84*/{"douglas macarthur", "charles thomas parsons, jr.", "george patton", "chester w. nimitz"},
            /*85*/{"guam", "hawaii", "ilocos", "japan"},
            /*86*/{"aimee Marcos", "irene marcos", "imee marcos", "imelda marcos"},
            /*87*/{"little boy", "fat man", "nagasaki bomb", "thin man bomb"},
            /*88*/{"dr.jose rizal", "manuel l. quezon", "emilio aguinaldo", "emilio jacinto"},
            /*89*/{"teodoro plata", "deodato arellano", "ladislao diwa", "andres bonifacio"},
            /*90*/{"manuel l. quezon", "macario sakay", "manuel roxas", "emilio aguinaldo"},

            /*91*/{"spratlys", "bajo de masinloc", "scarborough shoal", "benjam rise"},
            /*92*/{"bulkang mayon", "bundok pinatubo", "bundok apo", "bundok arayat"},
            /*93*/{"makati", "bataan", "lipa", "maynila"},
            /*94*/{"bdo", "bpi", "china bank", "bangko sentral ng pilipnas"},
            /*95*/{"corazon aquino", "gloria macapagal arroyo", "miriam defenson santiago", "melchora aquino"},
            /*96*/{"capas, tarlac", "vigan, ilocos sur", "maasin, leyte", "puerto princesa, palawan"},
            /*97*/{"nagasaki bomb", "thin man bomb", "little boy", "fat man"},
            /*98*/{"malacañang", "luneta", "manila cathedral", "san juan"},
            /*99*/{"white house", "blue house", "malacañang", "mendiola"},
            /*100*/{"lipa, batangas", "calamba, laguna", "ortigas, cainta", "vigan, ilocos sur"}

    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {

            /*1*/"kawit, cavite",
            /*2*/"corazon aquino",
            /*3*/"gloria diaz",
            /*4*/"michael martinez",
            /*5*/"manny pacquiao",
            /*6*/"mamasapano",
            /*7*/"bagyong yolanda",
            /*8*/"maguindanao massacre",
            /*9*/"ferdinand marcos",
            /*10*/"mansueto \"onyok\" velasco, Jr.",

            /*11*/"carlos p. garcia",
            /*12*/"manila hostage crisis",
            /*13*/"san lorenzo ruiz",
            /*14*/"pope john paul ii",
            /*15*/"ramon magsaysay",
            /*16*/"luis taruc",
            /*17*/"maphilindo",
            /*18*/"rebolusyon sa edsa ng 1986",
            /*19*/"romeo \"romi\" garduce",
            /*20*/"janet lim-napoles",

            /*21*/"2013 lahad datu standoff",
            /*22*/"battle of leyte gulf",
            /*23*/"limasawa",
            /*24*/"antonio pigafetta",
            /*25*/"san pedro calungsod",
            /*26*/"andres bonifacio",
            /*27*/"spoliarium",
            /*28*/"fernando amorsolo",
            /*29*/"pambansang alagad ng sining",
            /*30*/"rebelyon ni dagohoy",

            /*31*/"bagong hukbong bayan",
            /*32*/"nur misuari",
            /*33*/"armm",
            /*34*/"barkong victoria",
            /*35*/"kumbensiyon sa tejeros",
            /*36*/"cecilia muñoz-palma",
            /*37*/"renato corona",
            /*38*/"aniceto lacson",
            /*39*/"republikang bangsamoro",
            /*40*/"lungsod ng dabaw",

            /*41*/"asean",
            /*42*/"noli me tangere",
            /*43*/"doctrina cristiana",
            /*44*/"taong callao",
            /*45*/"alibata",
            /*46*/"corregidor",
            /*47*/"andres bonifacio",
            /*48*/"magdalo",
            /*49*/"katedral ng maynila",
            /*50*/"simbahan ng barasoain",

            /*51*/"benigno aquino, jr.",
            /*52*/"joseph estrada",
            /*53*/"caloy loyzaga",
            /*54*/"bagyong ondoy",
            /*55*/"pedro flores",
            /*56*/"fernando poe, jr.",
            /*57*/"partido liberal",
            /*58*/"bagumbayan",
            /*59*/"makapili",
            /*60*/"dalawampu't dalawa",

            /*61*/"apolinario mabini",
            /*62*/"emilio aguinaldo",
            /*63*/"gabriela silang",
            /*64*/"gomburza",
            /*65*/"gregorio del pilar",
            /*66*/"josefa llanes escoda",
            /*67*/"spoliarium",
            /*68*/"manuel quezon",
            /*69*/"marcelo h. del pilar",
            /*70*/"melchora aquino",

            /*71*/"miguel malvar",
            /*72*/"pio valenzuela",
            /*73*/"ramon magsaysay",
            /*74*/"teodora alonzo",
            /*75*/"teresa magbanua",
            /*76*/"diariong tagalog",
            /*77*/"visiting forces agreement",
            /*78*/"chino roque",
            /*79*/"daniel smith",
            /*80*/"baby ama",

            /*81*/"pdp-laban",
            /*82*/"leni robredo",
            /*83*/"world war ii",
            /*84*/"charles thomas parsons, jr.",
            /*85*/"hawaii",
            /*86*/"imelda marcos",
            /*87*/"little boy",
            /*88*/"dr.jose rizal",
            /*89*/"andres bonifacio",
            /*90*/"emilio aguinaldo",

            /*91*/"benjam rise",
            /*92*/"bundok pinatubo",
            /*93*/"maynila",
            /*94*/"bpi",
            /*95*/"corazon aquino",
            /*96*/"vigan, ilocos sur",
            /*97*/"fat man",
            /*98*/"luneta",
            /*99*/"malacañang",
            /*100*/"calamba, laguna"

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
        String choice0 = preentirehistory_multiplechoice[index][num-1];
        return choice0;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }
}