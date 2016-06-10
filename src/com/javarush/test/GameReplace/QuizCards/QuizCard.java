package com.javarush.test.GameReplace.QuizCards;

/**
 * Created by Администратор on 10.06.2016.
 */
public class QuizCard
{
    private String Answer;
    private String Question;
    public QuizCard(String q, String a){
        this.Question = q;
        this.Answer = a;
    }

    public String getAnswer()
    {
        return Answer;
    }

    public String getQuestion()
    {
        return Question;
    }
}
