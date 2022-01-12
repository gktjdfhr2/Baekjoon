package Class1;

import java.util.Scanner;

public class numCount {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arrList; 
		int a,b,c;
		String parseResult="";
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();	
		
		int result = a * b * c;
		System.out.println(result);
		parseResult = String.valueOf(result);
		
		arrList = new int[parseResult.length()];
		
		System.out.println(parseResult);
		
		for (int i = 0; i < parseResult.length(); i++) {			
			arrList[(int)((int)parseResult.charAt(i))-48] +=1;
			System.out.println((int)((int)parseResult.charAt(i))-48);
		}
	}
		
		
		
		
	
}
