package com.tandamloop.project;

import java.util.Scanner;

public class Problem_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		StringBuffer sb = new StringBuffer();
		
		for(int i =1;i<=n;i++) {
			
			int a = (i*2)-1;
			sb.append(a);
			
			if (i!=n) {
				sb.append(", ");
			}
			
		}
		System.out.println(sb);
	}

}
