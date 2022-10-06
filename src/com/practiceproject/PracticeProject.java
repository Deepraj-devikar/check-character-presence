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
		scanner.close();
		String character = scanner.nextLine();
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
	
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ajay");
		list.add("Vijay");
		list.add("Prajay");
		list.add("Prakash");
		
		printCharacterPresence(list);
	}

}
