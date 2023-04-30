package metodosDeOrdenaçao;
import java.util.Arrays;

public class BubbleSortArray {
 public static void main(String[] args) {
		
		int[] array = {5,3,8,2,6};
		int aux = 0;
		int i = 0;		
		System.out.print("Array Desordenado = " + Arrays.toString(array));
		
		for(i = 0; i < array.length; i++){
			for(int j = 0; j < 4; j++) {	
				if(array[j] > array[j + 1]) {
					aux = array[j];
					array[j] = array[j + 1];
					array[j + 1] = aux;
				}
			}
		}
		System.out.println(" ");
		System.out.print("Array Ordenado    = " + Arrays.toString(array));			
	}
}
