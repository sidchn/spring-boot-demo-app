package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	
	
	
	@RequestMapping("/home")
	public ModelAndView home(@RequestParam(value="name",required=false) String myName) {
		ModelAndView mv = new ModelAndView();
		System.out.println("Inside home");
		mv.addObject("name", myName);
		mv.setViewName("home");
		return mv;
	}
	@RequestMapping("/")
	public ModelAndView calculator(MyCalculator mycalc ){
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",mycalc);
		mv.setViewName("calc");
		return mv;
	
	}
	
	@RequestMapping("/result")
	public ModelAndView calcResults(MyCalculator mycalc,Model model ){
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",mycalc);
		System.out.println("operand 1: " + mycalc.getOperand1());

		System.out.println("operand 2: " + mycalc.getOperand2());
		
		System.out.println("operaton: " + mycalc.getOperation());
		
		int result=0;
		switch(mycalc.getOperation()) {
		case "+":
			result=mycalc.getOperand1()+mycalc.getOperand2();
			break;
		case "-":
			result=mycalc.getOperand1() - mycalc.getOperand2();
			break;
		case "*":
			result=mycalc.getOperand1() * mycalc.getOperand2();
			break;
		case "/":
			result=mycalc.getOperand1() / mycalc.getOperand2();
			break;
					}
		
		
		System.out.println(result);
		model.addAttribute("result",result);		
		mv.setViewName("calc");
		
		return mv;
	
	}
	
	
} 
