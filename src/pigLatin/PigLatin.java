package pigLatin;

import java.util.Scanner;

//Program converts input words to pig latin

public class PigLatin {

	public String rules(String str) {
		String answer = null;
		if (str.substring(0,1).matches("[AEIOUaeiou]"))
			answer = str+"way";
		else if (str.substring(0,2).matches("(cl|gr|gl|pl|ch|ph|rh|tr|br|bl)")){
			String beginning = str.substring(0,2);
			String ending = str.substring(2);
			answer = ending+beginning+"ay";}
		else{
			String beginning = str.substring(0,1);
			String ending = str.substring(1);
			answer = ending+beginning+"ay";} 
		return answer;
	}
	
	public String sentence(String str){
		String[] words = str.split(" ");
		String answer = "";
		for(int i = 0; i< words.length; i++){
			String word = words[i];
			if (i > 0) answer += " ";
			answer += rules(word);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		PigLatin pl = new PigLatin();
		System.out.println("Please enter text to traslate:");
		int n = 0;
		while (n<10){
			Scanner input = new Scanner(System.in);
			String word = input.nextLine();
			String translate = pl.sentence(word);
			System.out.println(translate);
			n+=1;
		}
	}

}
