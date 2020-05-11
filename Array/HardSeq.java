package Array;

import java.util.Scanner;

public class HardSeq {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int arr[] = new int[129];
			int value = sc.nextInt();
			int visited[] = new int[256];
			
			for(int i = 0; i<256; i++) {
				visited[i] = 0;
			}
			arr[1] = 0;
			for(int i = 2;i < 129;i++) {
				if(visited[arr[i-1]] != 0) {
					arr[i] = (i-1) - visited[arr[i-1]];
				}else {
					arr[i] = 0;
				}
			visited[arr[i-1]] = i -1;
			}
			
			int count = 0;
			for(int i = 1; i <=value; i++) {
				if(arr[value] == arr[i]) {
					count++;
				}
			}
			
			System.out.println(count);
		}
		
	}

}
