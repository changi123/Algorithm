package problem_solving.greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BaekJoon_16435 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		int l = Integer.parseInt(sc.next());
		
		int [] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		Arrays.sort(arr);
		for(int i= 0 ; i <arr.length;i++) {
			if( l >= arr[i]) {
				l++;
			}else {
				break;
			}
		}
		System.out.println(l);
	}

}
