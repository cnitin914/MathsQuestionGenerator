package com.mathsQuestionGenerator.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class QuestionGeneratorController {
	
	
	
	@RequestMapping(path = "/add", method = RequestMethod.GET)
	public String add(@RequestParam(value = "numberOfAdditions", defaultValue = "1") int numberOfAdditions, 
			@RequestParam(value = "numbersInEachAddition", defaultValue = "1") int numbersInEachAddition,
			@RequestParam(value = "digitsInEachNumber", defaultValue = "1") int digitsInEachNumber){
		
		StringBuffer html = new StringBuffer();
		html.append("<html><head><title>Calculations for Abacus practice.</title></head><body>");
		for (int additonCount = 0; additonCount < numberOfAdditions; additonCount++) {
			
			List<Integer> eachSum = new ArrayList<Integer>();
			StringBuffer stingBuff = new  StringBuffer();
			stingBuff.append("<h1 ");
			
			if(additonCount%2==0) {
				stingBuff.append("style=\"border:2px solid Tomato;\" >");
			} else {
				stingBuff.append("style=\"border:2px solid DodgerBlue; \" >");
			}
			
			for (int i = 0; i < numbersInEachAddition; i++) {

				int aNumber = (int) ((Math.random() * 9000000) + 1000000);
				int desiredNumber =Integer.parseInt(new String("" + aNumber).substring(0, digitsInEachNumber));
				eachSum.add(desiredNumber);
				stingBuff.append(i==numbersInEachAddition-1?""+desiredNumber + " = ":""+desiredNumber + " + ");
			}
			
			int sum = eachSum.stream().mapToInt(digit->digit).sum();
			stingBuff.append(sum+"</h1>");
			html.append(stingBuff);
		
		}
		
		html.append("</body></html>");
		System.out.println(html);
		return html.toString();
	}

}
