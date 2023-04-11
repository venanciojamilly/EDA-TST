import java.util.Arrays;
import java.util.Scanner;

class quicksort {
    public static int[] numbers(String[] n){
        int[] numbers = new int[n.length];
        for(int i = 0 ; i < n.length; i++){
            numbers[i] = Integer.parseInt(n[i]);
        }
        return numbers;
    }
    public static int partition(int[] values, int left, int right) {
        
        int pivot = values[left];
        int i = left;

        for (int j = left + 1; j <= right; j++) {
            if (values[j] <= pivot) {
                i+=1;
                swap(values, i, j);
            }
        }

        // troca pivot (values[left]) com i.
        swap(values, left, i);
        
        return i; 
    }
    public static void swap(int[] v, int i,int j){
        int aux = v[j];
        v[j] = v[i];
        v[i] = aux;  
    }

    public static void quickSort(int[] values, int left, int right) {
        if (left < right) {
            int index_pivot = partition(values, left, right);
            System.out.println(formatar(values));
            quickSort(values, left, index_pivot - 1);
            quickSort(values, index_pivot + 1, right);	
        }
    }
    public static String formatar(int[] v){
        String out = "";
        for (int i = 0; i < v.length; i++){
            out += v[i] + " ";
        }return out.trim();
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numbers = numbers(sc.nextLine().split(" "));
        sc.close();
        quickSort(numbers, 0,numbers.length - 1);
    }
}

