package ex;
/*
 * Topic: 讓使用者輸入一正整數n，用while迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021043 劉凱文
 */

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long n=scn.nextInt();
		int i=0;
		long sum=1;
		while(i<=n){
		i++;
		sum*=i;	
		
	}
	System.out.print(sum);
	}
}
