package problem_solving.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_2693 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int T = Integer.parseInt(sc.next());
		
		sc.nextLine();
		while(T>0) {
			String s = sc.nextLine();
			String [] arr = s.split(" ");
			int [] arrNum = new int[arr.length];
			
			for(int i= 0 ;  i < arr.length;i++) {
				arrNum[i] = Integer.parseInt(arr[i]);
			}
			
			Arrays.sort(arrNum);
			
			System.out.println(arrNum[arrNum.length-3]);
			
			
			
			T--;
		}
	}

}
