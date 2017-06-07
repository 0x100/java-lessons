package main.java.ru.tn.courses.vdronik.task1.v5.subtask1;

public class Main {
	public static void main(String[] args) {
		int n = 20;
		int [] arr = new int[n];
		System.out.println("Исходная последовательность:");
		for (int i = 0; i < arr.length; i++) {
		    arr[i] =  (int) (Math.random() * 300 - 150);
		    System.out.print(arr[i]+" ");
		}
		
		int j = 0;
		int [] res = new int[n];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%2==0) {
				res[j]=arr[i];
				j++;
			}
		}
		
	    
		System.out.println(" ");
	    System.out.println("Массив чётных чисел");
		for (int i = 0; i < j; i++) {
		    System.out.print(res[i]+" ");
		}
	}
}
