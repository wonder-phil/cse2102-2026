package com.example.demo.model.questions;

public class QuestionTrueFalse {
    private String question;
    private Boolean answer;

    public QuestionTrueFalse(String question, Boolean answer) {
        this.question = question;
        this.answer = answer;
    }

    public void setQuestion(String q) {
        question = q;
    }

    public String getQuestion() {
        return question;
    }
    public void setAnswer(Boolean a) {
        answer = a;
    }
    public Boolean getAnswer() {
        return answer;
    }

};