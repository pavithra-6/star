package sumave1;

import java.util.Scanner;

public class Starpattern {
	public static void main(String[] args) {
		Scanner u=new Scanner(System.in);
		System.out.println("how many row you want");
		int row=u.nextInt();
		for(int i=1;i<=row;i++){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}

