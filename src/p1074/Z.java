package p1074;

import java.util.Scanner;

public class Z {
	static int getPath(int n, int x, int y) {		
		int count=0;
		int p=(int)Math.pow(2, n-1);		
		if(n==1) {
			if(y==1)
				count++;
			if(x==1)
				count+=2;
			
			return count;
		}
		if(x>=p&&y<p) {//2
			x-=p;
			count+=2*((p*p-1)+1);
		}
		else if(x<p&&y>=p) {//3
			y-=p;
			count+=((p*p-1)+1);
		}
		else if(x>=p&&y>=p) {//4
			x-=p;
			y-=p;
			count+=3*((p*p-1)+1);
		}		
		return count+getPath(n-1,x,y);
	}
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int x=input.nextInt();
		int y=input.nextInt();
		System.out.println(getPath(n, x, y));
	}
}
