package p1074;

import java.util.Scanner;

class Path{
	public int getPath(int n, int x, int y) {
		if(x<=3&&y<=3) {
			return ;
		}			
		return getPath(n,x,y);
	}
}

public class Z {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);

		System.out.print("����: ");
		int n=input.nextInt();
		System.out.print("��: ");
		int x=input.nextInt();
		System.out.print("��: ");
		int y=input.nextInt();

		Path p=new Path();

		System.out.println(p.getPath(n, x, y));

	}

}
