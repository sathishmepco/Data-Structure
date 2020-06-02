package com.java.datastructure.dynamic_programming;

import java.util.Arrays;
import java.util.Scanner;

public class Bridge_Building {
	public static void main(String[] args) {
		Bridge_Building objecct = new Bridge_Building();
		objecct.run();
	}

	public void run(){
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine().trim());
		Pair pairs[] = new Pair[N];
		String strx[] = scanner.nextLine().trim().split(" ");;
		String stry[] = scanner.nextLine().trim().split(" ");
		for(int i=0;i<N;i++){
			int x = Integer.parseInt(strx[i]);
			int y = Integer.parseInt(stry[i]);
			pairs[i] = new Pair(x, y);
		}
		Arrays.sort(pairs);
//		int max = solution1(N, pairs);
		int max = solution2(N, pairs);
		System.out.println(max);
		scanner.close();
	}
	
	public int solution1(int N,Pair pairs[]){
		int table[] = new int[N];
		Arrays.fill(table, 1);
		for(int i=1; i<N; i++){
			for(int j=0; j<i; j++){
				if(pairs[i].y > pairs[j].y){
					table[i] = Math.max(table[i], table[j]+1);
				}
			}
		}
		int max = table[0];
		for(int i=1;i<N;i++)
			if(max < table[i])
				max = table[i];
		return max;
	}
	
	public int solution2(int N,Pair pairs[]){
		int count = 1;
		for(int i=1;i<N;i++){
			if(pairs[i-1].y < pairs[i].y)
				count++;
		}
		return count;
	}
	
	class Pair implements Comparable<Pair>{
		int x,y;
		public Pair(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
		@Override
		public int compareTo(Pair o) {
			return this.x-o.x;
		}
	}
}

/*
Input
4
2 5 8 10
6 4 1 2
Output
2

Input
8
8 1 4 3 5 2 6 7 
1 2 3 4 5 6 7 8
Output
5

Input
4
6 4 2 1
2 3 6 5
Output
2

*/