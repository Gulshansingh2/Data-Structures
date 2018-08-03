package sorting;

public class SelectionSort {  

    public static void main(String a[]){  
    	Integer[] res = selectionSort(new Integer[]{3,5,7,9,5,3,1});
		for (int i : res) {
			System.out.print(i + " ");
		}
    }  
    
    public static Integer[] selectionSort(Integer[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int iMin = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[iMin]){  
                    iMin = j; 
                }  
            }  
            int temp = arr[iMin];   
            arr[iMin] = arr[i];  
            arr[i] = temp;  
        }
        
        return arr;
    }  
}  
