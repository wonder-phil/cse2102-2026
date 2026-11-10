package com.example.demo.controller;

import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Greeting;
import com.example.demo.model.MyString;
import com.example.demo.model.GetQuestion;
import com.example.demo.model.Count;
import com.example.demo.model.MyString;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.annotation.RequestParam;
import com.example.demo.model.questions.*;

@SessionAttributes("count")

@Controller 
public class HomeController { 

	@GetMapping("/") 
	public String home() { 
		return "home";  // for home.html 
	} 

	@GetMapping("/greeting")
		public String greetingForm(Model model) {
			Count count = new Count();
			count.count = count.count + 1;
			model.addAttribute("greeting", new Greeting());
			model.addAttribute("count", new Count());
			
			return "greeting";
	}

	@PostMapping("/greeting")
	public String greetingSubmit(@ModelAttribute Greeting greeting, @ModelAttribute Count count, Model model) {
		model.addAttribute("greeting", greeting);
		model.addAttribute("count", count);
		return "result";
  	}

	@GetMapping({"/get_question", "/get-question"})
	public String questionForm(Model model) {
		Count count = model.containsAttribute("count") ? (Count) model.getAttribute("count") : new Count();
		count.count = count.count + 1;
		System.out.println("Count is " + count.getCount());	
		model.addAttribute("count", count);
		
		MyString myStringObject = model.containsAttribute("myString") ? (MyString) model.getAttribute("myString") : new MyString();
		GetQuestion getQuestion = new GetQuestion();
		myStringObject.setMyString(getQuestion.nextQuestion(count.getCount()).getQuestion());
		model.addAttribute("myString", myStringObject );

		return "question";
	}

	@PostMapping({"/get_question", "/get-question"})
	public String questionFormPOST(	@ModelAttribute("count") Count count, 
									@ModelAttribute("myString") MyString myStringObject, 
									@RequestParam String answer, 
									Model model) {
		System.out.println("The answer is " + answer);
		
		GetQuestion getQuestion = new GetQuestion();
		QuestionTrueFalse qtf = getQuestion.nextQuestion(count.count);
		model.addAttribute("QuestionTrueFalse", qtf);
		
		System.out.println("Count is " + count.getCount());	

		count.count = count.count + 1;
		model.addAttribute("count", count);
		
		myStringObject.setMyString(getQuestion.nextQuestion(count.count).getQuestion());
		model.addAttribute("myString", myStringObject );

		// Compare Boolean values correctly (avoid reference equality)
		Boolean answerBool = Boolean.valueOf(answer);
		if (answerBool.equals(qtf.getAnswer())) {
			System.out.println("Correct!");
		} else {
			System.out.println("Wrong!");
		}		
		
		return "question";
	}

}
