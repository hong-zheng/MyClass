import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
//		int arr[]= {12,3,4,567,8,89,2,21,0,5,4};
//		insertSort(arr);
//		print(arr);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个整数:>");
		int num = sc.nextInt();
		System.out.println(num);
		
		System.out.println("end");
	}
	
	static void print(int arr[]) {
		for(int i = 0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	// 插入排序
	static void insertSort(int arr[]) {
		for(int i = 1;i<arr.length;i++) {
			if( arr[i] < arr[i-1]) {
				int cur=arr[i];
				int j = 0;
				for( j = i -1;j>=0 && cur<arr[j] ; j--) {
					arr[j+1] = arr[j];
				}
				arr[j+1] = cur;
			}
		}
	}
}
