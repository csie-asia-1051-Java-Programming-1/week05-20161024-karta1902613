package ex;
/*
 * Topic: 某個陣列中含有所有學生的學號，但並沒有按照大小次序排列。請寫一程式依學號大小排列並將結果輸出。
 * Date: 2016/10/24
 * Author: 105021043 劉凱文
 */

import java.util.Scanner;

public class ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		System.out.print("輸入學生數量");
		int n=scn.nextInt();
		int data[]=new int[n];
		System.out.println("輸入學生學號");
		for(int i=0;i<n;i++){
			int sn=scn.nextInt();
			data[i]=sn;}
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1;j++){
				if (data[j]<data[j+1]){
					int v=data[j];
					data[j]=data[j+1];
					data[j+1]=v;}}}
		for(int i=0;i<n;i++){
			System.out.print(data[i]+" ");}}}
