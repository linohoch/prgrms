package prgrms;

import java.util.ArrayList;

public class 같은숫자는싫어 {

	public static void main(String[] args) {
		int[] ar = {1, 1, 3, 3, 0, 1, 1};
		for(int i : solution(ar)) {
			System.out.print(i+" ");
		}
	}
	public static ArrayList<Integer> solution(int []arr) {
		ArrayList<Integer> list = new ArrayList<>();
		for(int i=0;i<arr.length-1;i++) {
			if( arr[i]!=arr[i+1]){
				list.add(arr[i]);
			}
		}list.add(arr[arr.length-1]);

		return list;
	}
}
