package com.mckenna.colin.challenge266;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NodeDegrees {

	public static void main(String[] args) {
		
		
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("challenge_input.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int numNodes = scanner.nextInt();
		int[] degrees = new int[numNodes];
		
		
		while(scanner.hasNext()){
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			degrees[num1 - 1]++;
			degrees[num2 - 1]++;
		}
		
		scanner.close();
		
		for(int i = 0; i < degrees.length; i++)
			System.out.println("Node " + (i + 1) + " has a degree of " + degrees[i] );
		

	}

}
