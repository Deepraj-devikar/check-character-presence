package com.practiceproject;

import java.util.ArrayList;
import java.util.Scanner;

public class PracticeProject {

	/**
	 * Take input from user and check in which element that input characters are present
	 * 
	 * @param character
	 * @param list
	 * @return list of string which contains character
	 */
	public static ArrayList<String> characterPresent(ArrayList<String> list){
		System.out.print("Enter character to search in list elements : ");
		Scanner scanner = new Scanner(System.in);
		String character = scanner.nextLine();
		scanner.close();
		ArrayList<String> resultList = new ArrayList<String>();
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).contains(character)) {
				resultList.add(list.get(i));
			}
		}
		return resultList;
	}
	
	/**
	 * Print in which list element character is present
	 * 
	 * @param list
	 */
	public static void printCharacterPresence(ArrayList<String> list) {
		System.out.println("Check character is present in strings are : ");
		ArrayList<String> elementsHaveCharacter = characterPresent(list);
		if(elementsHaveCharacter.size() != 0) {
			System.out.println("Character is found in strings are");
			for (String element : elementsHaveCharacter) {
				System.out.println(element);		
			}
		} else {
			System.out.println("Character is not found in any strings");
		}
	}
	
	/**
	 * check input number is prime or not and output
	 * 
	 * @param number
	 * @return true if number is prime false if it is not
	 */
	public static boolean isPrime(int number) {
		boolean isPrime = true;
		for(int divisor = 2; divisor < number / 2 ; divisor++) {
			if(number % divisor == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
	
	/**
	 * print number which are prime numbers up to that number
	 * 
	 * @param number
	 */
	public static void printPrimeNumberUpTo(int number) {
		System.out.println("Prime numbers up to "+number+" are : ");
		for(int tempNumber = 1; tempNumber <= number; tempNumber++) {
			if(isPrime(tempNumber)) {
				System.out.println(tempNumber);
			}
		}
	}
	
	/**
	 * make string value reverse of that like first character will be last character 
	 * and last character will be first character 
	 * 
	 * @param value
	 * @return reverse of string value
	 */
	public static String reverseString(String value) {
		String result = "";
		for(int i = value.length() - 1; i >= 0; i--) {
			result += value.charAt(i);
		}
		return result;
	}
	
	/**
	 * print the string value and its reverse string value
	 * 
	 * @param value
	 */
	public static void printReverseString(String value) {
		System.out.println("Reverse of "+value+" is "+reverseString(value));
	}
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ajay");
		list.add("Vijay");
		list.add("Prajay");
		list.add("Prakash");
		
		printCharacterPresence(list);
		
		printPrimeNumberUpTo(50);
		
		printReverseString("Deepraj");
	}

}
