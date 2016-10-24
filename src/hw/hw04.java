package hw;

import java.util.Scanner;

public class hw04 {
	/*
	 * Topic: 讓使用者輸入一正整數n，計算1/(1*2)+1/(3*4)+1/(5*6)+…+1/[(2n-1)*(2n)]並輸出結果
	 * Date: 2016/10/24
	 * Author: 105021043 劉凱文
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		float sum=0;
		float n=scn.nextInt();
		for(float i=1;i<=n;i++){
			float x=(float)1/((2*i-1)*(2*i));
			 sum+=x;}
		System.out.print(sum);}}
