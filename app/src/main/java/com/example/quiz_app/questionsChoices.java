package com.example.quiz_app;

public class questionsChoices {

    public String strChoices[][]= {
            {"Always","Never","Sometimes"}, //0
            {"Yes with my life!","Not really","Sometimes"}, //1
            {"All the time","Never","Rarely"}, //2
            {"Were practically the same","A couple of things","Not much"}, //3
            {"Everything","Quite a bit","Not much"}, //4
            {"Yes! lots of fun","No they are boring","Sort of"}, //5
            {"Yea always","Not much","Sometimes"}, //6
            {"Yep they never reveal my secrets","Not really they tell everyone !","Some secrets"}, //7
            {"Yep 24/7","Not really","Sometimes"}, //8
            {"Yes always there for me","No never been there for me","Sometimes there for me"} //9
    };


    private String strCorrectAnswer10points [] = {"Always",
                                                  "Yes with my life!",
                                                  "All the time",
                                                  "Were practically the same",
                                                  "Everything",
                                                  "Yes! lots of fun",
                                                  "Yea always",
                                                  "Yep they never reveal my secrets",
                                                  "Yep 24/7",
                                                  "Yes always there for me"};


    private String strCorrectAnswer6points [] = {"Sometimes",
                                                 "Sometimes",
                                                 "Rarely",
                                                 "A couple of things",
                                                 "Quite a bit",
                                                 "Sort of",
                                                 "Sometimes",
                                                 "Some secrets",
                                                 "Sometimes",
                                                 "Sometimes there for me"};

    private String strCorrectAnswer3points [] = {"Never",
                                                 "Not really",
                                                 "Never",
                                                 "Not much",
                                                 "Not much",
                                                 "No they are boring",
                                                 "Not much",
                                                 "Not really they tell everyone !",
                                                 "Not really",
                                                 "No never been there for me"};


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

    public String strGetCorrectAnswer10points(int a){

        String answer = strCorrectAnswer10points[a];
        return answer;
    }
    public String strGetCorrectAnswer6points(int a){

        String answer = strCorrectAnswer6points[a];
        return answer;
    }
    public String strGetCorrectAnswer3points(int a){

        String answer = strCorrectAnswer3points[a];
        return answer;
    }


}
