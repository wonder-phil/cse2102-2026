package com.example.demo.model.questions;

public class CurrentQuestionTrueFalse {
    private static int currentTFquestion = 0;

    public static int getCurrentTFquestion() {
        return currentTFquestion;
    }

    public static void setCurrentTFquestion(int currentTFquestion) {
        CurrentQuestionTrueFalse.currentTFquestion = currentTFquestion;
    }
}