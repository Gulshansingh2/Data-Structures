package sorting;

public class QuickSort {

	public static void main(String[] args) {
		int A[] = {6,2,3,1,9,10,15,13,12,17};
		quickSort(A, 0, A.length-1);
		
		for(int a: A) System.out.println(a);

	}
	
	static void quickSort(int[] A, int start, int end) {
		 if(start <  end) {
			int pIndex = partition(A, start, end);
			quickSort(A, start, pIndex - 1);
			quickSort(A, pIndex + 1, end);
		 }
	}

	static int partition(int[] A, int start, int end) {
		int pivot = A[end];
		int pIndex = start;
		
		for(int i = start; i <  end; i++) {
			if( A[i] <= pivot) {
				swap(A, i, pIndex); // swap if element is lesser than pivot
				
				pIndex++;
			}
		}
		swap(A, pIndex, end);
		return pIndex;
	}

	private static void swap(int[] A, int i, int j) {
		int a =  A[i];
		int b = A[j];
		a = a + b;
		b = a - b;
		a =  a - b;
		A[i] = a;
		A[j] = b;
	}

}
