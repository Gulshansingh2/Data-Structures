package sorting;

public class MergeSort {

	public static void main(String[] args) {
		int A[] = {6,2,3,1,9,10,15,13,12,17};
		mergeSort(A);
		
		for(int a: A) System.out.println(a);

	}
	
	static void merge(int[] L, int[] R, int[] A) {
		int nL = L.length;
		int nR = R.length;
		int i = 0; //smallest unpicked in L	
		int j = 0; //smallest unpicked in R
		int k = 0; //location to be filled in A
		
		while(i < nL && j < nR) {
			if(L[i] <= R[j]) {
				A[k] = L[i];
				i++;
			}else {
				A[k] = R[j];
				j++;
			}
			k++;
		}
		
		while(i < nL) {
			A[k] = L[i];
			i++;
			k++;
		}
		
		while(j < nR) {
			A[k] = R[j];
			j++;
			k++;
		}
	}
	
	static void mergeSort(int[] A) {
		int n = A.length;
		
		if(n < 2) return;
			
		int mid = n/2;
		int[] left = new int[mid];
		int[] right = new int[n - mid];
		
		for(int i = 0; i < mid; i++) {
			left[i] = A[i];
		}
		for(int i = mid; i < n; i++) {
			right[i - mid] = A[i];
		}
		
		mergeSort(left);
		mergeSort(right);
		merge(left, right, A);
		
	}

}
