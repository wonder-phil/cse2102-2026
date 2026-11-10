package com.example.demo.model.questions;

import java.util.ArrayList;
import java.util.List;

public class ArrayQuestionsTrueFalse {
    private static List<QuestionTrueFalse> arrayListQuestionsTF = new ArrayList<QuestionTrueFalse>();
    private int totalQuestions = 0;

    public ArrayQuestionsTrueFalse() {
        arrayListQuestionsTF.add(new QuestionTrueFalse("The earth is the 3rd planet from its star", true));
        arrayListQuestionsTF.add(new QuestionTrueFalse("The earth and mars have the same atmosphere", false));
        arrayListQuestionsTF.add(new QuestionTrueFalse("Saturn in the largest planet", false));
        arrayListQuestionsTF.add(new QuestionTrueFalse("Jupiter in the largest planet", true));
        arrayListQuestionsTF.add(new QuestionTrueFalse("No planets are retrograde in our solar system",false));
        totalQuestions = arrayListQuestionsTF.size();
    }

    public QuestionTrueFalse nextQuestion(int i) {
        return arrayListQuestionsTF.get(i % totalQuestions);
    }
    
}