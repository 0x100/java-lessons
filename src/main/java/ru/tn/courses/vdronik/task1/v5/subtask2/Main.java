package main.java.ru.tn.courses.vdronik.task1.v5.subtask2;

public class Main {
	public static void main(String[] args) {
		int n = 30;
		int a = (int)(Math.random()*100);
		int b = (int)(Math.random()*100);
		if (a>b) {
			int t = a;
			a=b;
			b=t;
		}
		System.out.println("Высота дерева "+b+" см, улитка находится на высоте " +a+ "см");
		int [] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
		    arr[i] =  (int) Math.round(Math.random()); //Если день солнечный arr[i]==1, если пасмурный - arr[i]==0;
		    System.out.print(arr[i]+" ");
		}
		
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]==0) a--; else a+=2;
		}
		
	    if (a<=0) System.out.println("улитка сползла с дерева");
	    else if (a<b) System.out.println("улитка находится на дереве на высоте "+a+" см");
	    else System.out.println("улитка залезла на верхушку дерева");
		System.out.println(" ");
	    
	}
}
