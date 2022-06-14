import java.util.Scanner;

public class EliminateDuplicates
{
	public static void main(String[] args) {
	    int []arr = new int[10];
	    Scanner s = new Scanner(System.in);
		System.out.print("Enter 10 integers: ");
		for(int i=0;i<10;i++){
		    arr[i] = s.nextInt();
		}
		arr = eliminateDuplicates(arr);
		System.out.print("The distinct numbers are: ");
		for(int i : arr)
		    System.out.print( i + " ");
	}
	public static int[] eliminateDuplicates(int[] arr){
    int last = arr.length;

    for (int i = 0; i < last; i++) {
        for (int j = i + 1; j < last; j++) {
            if (arr[i] == arr[j]) {
                arr[j] = arr[last-1];
                last--;
                j--;
            }
        }
    }

    int[] newList = new int[last];
    System.arraycopy(arr, 0, newList, 0, last);
    return newList;
}
}
