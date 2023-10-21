import java.util.Arrays;
import java.util.Scanner;

class merge_passo {
    public static int[] numbers(String[] n) {
        int[] numbers = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            numbers[i] = Integer.parseInt(n[i]);
        }
        return numbers;
    }

    public static void merge(int[] v, int ini, int meio, int fim) {

        // transfere os elementos entre left e right para o array auxiliar.
        int[] helper = new int[v.length];
        for (int i = ini; i <= fim; i++) {
            helper[i] = v[i];
        }

        int i = ini;
        int j = meio + 1;
        int k = ini;

        while (i <= meio && j <= fim) {

            if (helper[i] < helper[j]) {
                v[k] = helper[i];
                i++;

            } else {
                v[k] = helper[j];
                j++;

            }
            k++;

        }

        // se a metade inicial não foi toda consumida, faz o append.
        while (i <= meio) {
            v[k] = helper[i];
            i++;
            k++;
        }

        // se a metade final não foi toda consumida, faz o append.
        while (j <= fim) {
            v[k] = helper[j];
            j++;
            k++;
        }

    }

    public static void mergeSort(int[] array) {
		mergeSort(array, 0, array.length - 1);

	}

	public static void mergeSort(int[] array, int leftIndex, int rightIndex) {
		imprimeArray(array, leftIndex, rightIndex);
		if (leftIndex < rightIndex) {

			int meio = (leftIndex + rightIndex) / 2;
			mergeSort(array, leftIndex, meio);
			mergeSort(array, meio + 1, rightIndex);
			merge(array, leftIndex, meio, rightIndex);

			if (rightIndex - leftIndex < array.length-1) {
				imprimeArray(array, leftIndex, rightIndex);
			}

		}
	}
    public static void imprimeArray(int[] array, int leftIndex, int rightIndex) {
		System.out.println(Arrays.toString(Arrays.copyOfRange(array, leftIndex, rightIndex + 1)));
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = numbers(sc.nextLine().split(" "));
        sc.close();
        mergeSort(numbers);
        System.out.println(Arrays.toString(numbers));
    }
}
