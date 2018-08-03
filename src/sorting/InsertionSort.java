package sorting;

public class InsertionSort {

	public static void main(String[] args) {
		Integer[] res = insertionSort(new Integer[]{3,5,7,9,5,3,1});
		for (int i : res) {
			System.out.print(i + " ");
		}
		
	}

	public static Integer[] insertionSort(Integer[] integers) {
		int value, hole;
		for (int i = 1; i < integers.length; i++) {
			value = integers[i];
			hole = i;
			while(hole > 0 && integers[hole-1]>value) {
				integers[hole] =  integers[hole -1];
				hole--;
			}
			integers[hole] =  value;
		}
		return integers;
	}
}
