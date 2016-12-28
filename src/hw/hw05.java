package hw;
/*
 * Topic: 有一 n x n的矩陣(1＜n＜21)，輸入 n 後，試以程式繪出此一方陣，方陣結構如下，例如 n=5 時：
 * Date: 2016/10/24
 * Author: 105021043 劉凱文
 */
import java.util.Scanner;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =  new Scanner(System.in);
		int n=0;
		while(n<=1||n>=21){
			n=scn.nextInt();
			if(n<=1||n>=21){
				System.out.println("1＜n＜21");
			}
		}
		int x=0;
		int y=0;
		int r=1;

		int data[][]=new int [n][n];
        for(int i=0;i<n;i++){
        	x=i;
        	y=0;
        	for(int j=0;j<i+1;j++){
        		data[x][y]=r;
        		r++;
                y++;
                x--;
        	}
        }
        for(int i=0;i<n-1;i++){
        	x=n-1;
        	y=i+1;
        	for(int j=i;j<n-1;j++){
        		data[x][y]=r;
        		r++;
        		y++;
        		x--;	
        	}
        }
        for(int i=0;i<n;i++){
        	for(int j=0;j<n;j++){
        		System.out.print(data[i][j]+"\t");
        	}        		System.out.println();
        }
	}

}
