package problem_solving.sort;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_2752 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[3];
		for(int i =  0 ; i < 3; i ++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(arr);
		
		for(int i= 0 ; i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
