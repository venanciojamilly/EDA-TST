import java.util.Arrays;
import java.util.Scanner;

public class down {
    public static void selectionSort(String[] array, int index) {
        if (array.length - 1 == index){
            return;
        }
        
        int indexMenor = index;
        for (int j = index+1; j < array.length; j++) {
            if (Integer.parseInt(array[j])<Integer.parseInt(array[indexMenor])){
                indexMenor = j;
            }
        }
        String temp = array[index];
        array[index] = array[indexMenor];
        array[indexMenor] = temp;
       // System.out.println(Arrays.toString(array));
        selectionSort(array, index+1);
    }

    public static String out(String[] arr, int q) {
        String out = "";
        for (int i = 0; i <= q - 1; i++) {
            out += arr[i] + " ";
        }
        out.trim();
        return out;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] numbers = sc.nextLine().split(" ");
        int n = sc.nextInt();
        sc.close();
        selectionSort(numbers, 0);
        System.out.println(out(numbers, n));
    }
}
