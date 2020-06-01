package com.java.datastructure.dynamic_programming;

import java.util.Arrays;
import java.util.Scanner;

public class Weighted_Jobj_Scheduling {
	
	public static void main(String[] args) {
		Weighted_Jobj_Scheduling instance = new Weighted_Jobj_Scheduling();
		instance.start();
	}
	
	public void start(){
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine().trim());
		Job jobs[] = new Job[N];
		for(int i=0;i<N;i++){
			String s[] = scanner.nextLine().trim().split(" ");
			int start = Integer.parseInt(s[0]);
			int end = Integer.parseInt(s[1]);
			int profit = Integer.parseInt(s[2]);
			jobs[i] = new Job(start, end, profit);
		}
		
		int output = findMaxProfit(jobs,N);
		System.out.println("Maximum Profit is :"+output);
		scanner.close();
	}
	
	private int findMaxProfit(Job jobs[],int N){
		Arrays.sort(jobs);
		int table[] = new int[N];
		table[0] = jobs[0].profit;
		for(int i=1;i<N;i++){
			int curProfit = jobs[i].profit;
			int k = nonConflictJob(jobs, i);
			if(k != -1)
				curProfit += table[k];
			table[i] = curProfit > table[i-1] ? curProfit : table[i-1];
		}
		return table[N-1];
	}
	
	private int nonConflictJob(Job jobs[], int i){
		for(int j=i-1;j>=0;j--)
			if(jobs[j].end <= jobs[i-1].start)
				return j;
		return -1;
	}
	
}
class Job implements Comparable<Job>{
	int start,end,profit;
	public Job(int start, int end, int profit) {
		super();
		this.start = start;
		this.end = end;
		this.profit = profit;
	}
	@Override
	public int compareTo(Job o) {
		return this.end - o.end;
	}
	@Override
	public String toString() {
		return "Job [start=" + start + ", end=" + end + ", profit=" + profit + "]";
	}
}
/*
Input
4
3 5 25
1 2 50
6 15 75
2 100 100
Output
150

Input
6
2 5 6
6 7 4
7 9 2
1 3 5
5 8 11
4 6 5
Output
17

Input
4
1 2 50
3 5 20
6 19 100
2 100 200 
Output
250
*/