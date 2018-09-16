package com.mathsQuestionGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Temp {

	public static void main(String[] args) {
		int numOfAdditions = 5;
		int numOfDigits = 1;
		int numInEachAddition = 3;
		ArrayList<String> additions = new ArrayList<String>(numOfAdditions);

		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int k = 0; k < numOfAdditions; k++) {
			List<Integer> eachSum = new ArrayList<Integer>();
			StringBuffer stingBuff = new  StringBuffer();
			for (int i = 0; i < numInEachAddition; i++) {

				int aNumber = (int) ((Math.random() * 9000000) + 1000000);
				int desiredNumber =Integer.parseInt(new String("" + aNumber).substring(0, numOfDigits));
				eachSum.add(desiredNumber);
				stingBuff.append(i==numInEachAddition-1?""+desiredNumber + " = ":""+desiredNumber + " + ");
			}
			
			int sum = eachSum.stream().mapToInt(digit->digit).sum();
			
			System.out.println(stingBuff.toString() + sum);
		}

		/*
		 * for(int i =0; i<numOfAdditions; i++) {
		 * 
		 * Random rand = new Random();
		 * 
		 * IntStream intStream = rand.ints(numInEachAddition,1,10*numOfDigits);
		 * //intStream.forEach(System.out::println); StringBuffer additionString = new
		 * StringBuffer(); intStream.forEach(randNumber ->
		 * additionString.append(randNumber + " + "));
		 * System.out.println(additionString.toString());
		 * additions.add(additionString.toString()); }
		 * 
		 * System.out.println(additions);
		 */

	}

}
