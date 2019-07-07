package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question2 {
public static void main(String[] args) {
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the values: ");
	int Length=sc.nextInt();
	sc.nextLine();
	for(int i=0;i<Length;i++)
	{
		numbers.add(Integer.parseInt(sc.nextLine()));
	}
	Question2 qns2=new Question2();
	System.out.println(qns2.listWithDuplicates(numbers));

}
public static <Integer> List<Integer> listWithDuplicates(List<Integer> numbers){
	
	return numbers;
	
        } 
}