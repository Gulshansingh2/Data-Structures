package sorting;

public class BubbleSort {

	public static void main(String[] args) {
		Integer[] res = bubbleSort(new Integer[]{3,5,7,9,5,3,1});
		for (int i : res) {
			System.out.print(i + " ");
		}
		
	}

	public static Integer[] bubbleSort(Integer[] integers) {
		boolean flag;
		for (int i = 0; i < integers.length; i++) {
			flag = false;
			for (int j = 0; j < integers.length-i-1; j++) {
				if (integers[j] > integers[j+1]) {
					int temp = integers[j];
					integers[j] = integers[j+1];
					integers[j+1] = temp;
					flag = true;
				}
			}
			if(flag==false)
				break;
		}
		return integers;
	}
}
