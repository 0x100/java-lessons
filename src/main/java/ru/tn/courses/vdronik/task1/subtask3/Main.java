package t3;

public class Main {
	public static void main(String[] args) {
		int n = 20;
		double[] arr = new double[n];
		System.out.println("Массив до сортировки:");
		for (int i = 0; i < arr.length; i++) {
		    arr[i] =  Math.random() * 300 - 150;
		    System.out.print(arr[i]+" ");
		}
		
		int k = n/2;
		while (k>0) {
			for (int i = 0; i<n-k; i++) {
				int j = i;
				while (j>=0 && arr[j]>arr[j+k]) {
					double t = arr[j];
					arr[j]=arr[j+k];
					arr[j+k]=t;
					j--;
				}
			}
			k/=2;
		}
	    
		System.out.println(" ");
	    System.out.println("Массив после сортировки:");
		for (int i = 0; i < arr.length; i++) {
		    System.out.print(arr[i]+" ");
		}
	}
}
