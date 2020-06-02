package com.java.datastructure.dynamic_programming;

import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubsequence {
	
	public static void main(String[] args) {
		LongestIncreasingSubsequence object = new LongestIncreasingSubsequence();
		object.run();
	}
	
	public void run(){
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine().trim());
		String str[] = scanner.nextLine().trim().split(" ");;
		int array[] = new int[N];
		for(int i=0;i<N;i++){
			array[i] = Integer.parseInt(str[i]);
		}
		int output = solution2(N, array);
		System.out.println(output);
		scanner.close();
	}
	
	public int solution1(int N,int array[]){
		int table[] = new int[N];
		Arrays.fill(table, 1);
		for(int i=1;i<N;i++)
			for(int j=0;j<i;j++)
				if(array[i] > array[j])
					table[i] = Math.max(table[i], table[j]+1);
		System.out.println(Arrays.toString(table));
		int max = table[0];
		for(int v : table)
			if(max < v)
				max = v;
		return max;
	}
	
	public int solution2(int N,int array[]){
		int count = 1;
		for(int i=1;i<N;i++)
			if(array[i-1] < array[i])
				count++;
		return count;
	}
}
/*
Input
5
3 10 2 1 20
Output
3

Input
6
50 3 10 7 40 80
Output
4

Input
4
3 10 2 1
Output
2

Input
8
10 22 9 33 21 50 41 60
Output
5
*/