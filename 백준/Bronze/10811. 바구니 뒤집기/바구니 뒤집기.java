import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[sc.nextInt()];
		int M = sc.nextInt();
		
	    for (int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		for (int i = 0; i < M; i++) {
			List<Integer> lst = new ArrayList<>();
			int a = sc.nextInt();
			int b = sc.nextInt();

			for (int j=0; j < (b-a+1); j++) {
				lst.add(j, arr[a-1+j]);
			}
			Collections.reverse(lst);
			
			for (int j=0; j < lst.size(); j++) {
				arr[a-1+j] = lst.get(j);
			}
		}
		sc.close();
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}