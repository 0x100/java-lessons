package t2;

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
		System.out.println("������ ������ "+b+" ��, ������ ��������� �� ������ " +a+ "��");
		int [] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
		    arr[i] =  (int) Math.round(Math.random()); //���� ���� ��������� arr[i]==1, ���� ��������� - arr[i]==0;
		    System.out.print(arr[i]+" ");
		}
		
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]==0) a--; else a+=2;
		}
		
	    if (a<=0) System.out.println("������ ������� � ������");
	    else if (a<b) System.out.println("������ ��������� �� ������ �� ������ "+a+" ��");
	    else System.out.println("������ ������� �� �������� ������");
		System.out.println(" ");
	    
	}
}
