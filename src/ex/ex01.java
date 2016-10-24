package ex;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入一正整數n，用for迴圈計算n!後輸出。
 * Date: 2016/10/24
 * Author: 105021043 劉凱文
 */

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long n=scn.nextInt();
	    long sum=1;
		for(long i=n;i>0;i--){
		  sum*=i;}
		System.out.print((long)sum);

	}

}
