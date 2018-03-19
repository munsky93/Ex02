package com.javaex.ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a[] = new int[5];
		double sum = 0;
		for(int b = 0; b < a.length; b++) {
			
				a[b] = sc.nextInt();
			
		sum = a[b] + sum;
		
		}
		   System.out.println("평균은" + sum/5 + "입니다.");
			sc.close();
		}
        
	}


