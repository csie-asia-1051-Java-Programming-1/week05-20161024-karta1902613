﻿package ex;
/*
 * Topic: 讓使用者輸入一正整數 n，並輸出 2^1+2^2+2^3+...+2^n 的值。
 * Date: 2016/10/24
 * Author: 105021043 劉凱文
 */

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long n=scn.nextInt();
		long sum=0;
		for(int i=1;i<=n;i++){
			Math.pow(2,i);
			sum+=Math.pow(2,i);
		}
		System.out.print((long)sum);
	}

}
