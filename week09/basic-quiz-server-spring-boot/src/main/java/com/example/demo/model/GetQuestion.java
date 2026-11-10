package com.example.demo.model;

import com.example.demo.model.*;
import com.example.demo.model.questions.*;

public class GetQuestion {
    private static ArrayQuestionsTrueFalse arrayListQuestionsTF = new ArrayQuestionsTrueFalse();

    public GetQuestion() { }

    public com.example.demo.model.questions.QuestionTrueFalse nextQuestion(int count) {
        return arrayListQuestionsTF.nextQuestion(count);
    }

}