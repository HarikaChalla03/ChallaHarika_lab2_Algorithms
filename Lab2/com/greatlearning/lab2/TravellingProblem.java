package com.greatlearning.lab2;

import java.util.Scanner;

import com.greatlearning.sorting.MergeSort;

public class TravellingProblem {
     private static final Scanner sc = new Scanner(System.in);
 
     public static void main(String[] args) {
	 System.out.println("Enter the number of currency denominations=");
	 int noOfDenominations = sc.nextInt();
	 System.out.println("Enter the currency denominations =");
	 int[] denominationsArray = new int[noOfDenominations];
	 for(int index = 0; index < noOfDenominations;) {
		 denominationsArray[index] = sc.nextInt();
		 if(denominationsArray[index]!=0) {
			 
		 }
	 }
	 MergeSort mergeSort = new MergeSort();
	 mergeSort.mergeSort(denominationsArray, 0, denominationsArray.length - 1);
	 for(int i=0; i< denominationsArray.length; i++) {
		 System.out.println(denominationsArray[i]);
		 System.out.println(",");
		 }
	 System.out.println("Enter the target amount=");
	 int target=sc.nextInt();
	 NotesCounter notesCounter = new NotesCounter();
	int[] notesCounterArray= notesCounter.notesCount(denominationsArray, target);
	for(int index=0; index<notesCounterArray.length; index++) {
		System.out.println(denominationsArray[index] + ":" + notesCounterArray[index]);
		  if(notesCounterArray[index]!=0) {
			  System.out.println(denominationsArray[index] + ":" + notesCounterArray[index]);
		  }
	  }
	}
}
