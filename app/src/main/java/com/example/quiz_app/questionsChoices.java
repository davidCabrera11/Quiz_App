package com.example.quiz_app;

public class questionsChoices {

    public String strChoices[][]= {
            {"Always","Never","Sometimes"}, //0
            {"Yes with my life!","Not really","Sometimes"}, //1
            {"All the time","Never","Rarely"}, //2
            {"Were practically the same","A couple of things","Not much"}, //3
            {"Everything","Quite a bit","Not much"}, //4
            {"Yes! they are lots of fun","No they are boring","Meh"}, //5
            {"Yea always","Not much","Sometimes"}, //6
            {"Yep they never reveal my secrets","Not really they tells everyone !","Some secrets"}, //7
            {"Yep 24/7","Not really","Sometimes"}, //8
            {"Yes always there for me","No never been there for me","Sometimes"} //9
    };


    private String strCorrectAnswers [] = {"Always","Yes with my life!", "All the time",
                                            "Were practically the same", "Everything", "Yes! they are lots of fun",
                                            "Yea always", "Yep they never reveal my secrets", "Yep 24/7",
                                            "Yes always there for me"};



    public String getChoice1(int a){
        String strChoice = strChoices[a][0];
        return strChoice;
    }

    public String getChoice2(int a){

        String strChoice = strChoices[a][1];
        return strChoice;
    }

    public String getChoice3(int a){

        String strChoice = strChoices[a][2];
        return strChoice;
    }

    public String strGetCorrectAnswer(int a){

        String answer = strCorrectAnswers[a];
        return answer;
    }


}
