
import java.util.Arrays;
import java.util.Scanner;

class insereprimeiro {
	public static String[] ordena(String[] v) {
		for (int i = 0; i < v.length; i++) {
			int i_menor = i;
			for (int j = i + 1; j < v.length; j++) {
				if (Integer.parseInt(v[j]) < Integer.parseInt(v[i_menor])) {
					i_menor = j;
				}
			}
			String aux = v[i];
			v[i] = v[i_menor];
			v[i_menor] = aux;
		}
		return v;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] numbers = sc.nextLine().split(" ");
		System.out.println(Arrays.toString(ordena(numbers)));
	}
}
