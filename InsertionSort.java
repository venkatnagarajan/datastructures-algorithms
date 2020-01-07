/*
* Unlike the selection sort that sorts from right to left, Insertion sort sorts from left from right.
*/
public class InsertionSort {
	public static void main (String args[]){
		int[] inputArr = {20, 27, -22, 3, 52, 15, 12, 77};
		
		// Option#1 - by swapping elements
		for (int leftUnsortedIdx=1; leftUnsortedIdx < inputArr.length; leftUnsortedIdx++){
			for (int i= leftUnsortedIdx; i>0;i--){
				if (inputArr[i] < inputArr[i-1]){
					// swap
					swap(inputArr, i, i-1);
				} else {
					break;
				}
			}
		}
		display(inputArr);
		
		// Option#2 - by moving elements till the correct position is found. this avoids swapping logic. Source -- Udemy Data Structure and Algorithms Deep Dive using Java
		for (int leftUnsortedIdx =1; leftUnsortedIdx < inputArr.length; leftUnsortedIdx++){
			int newElement = inputArr[leftUnsortedIdx];
			int i;
			for (i= leftUnsortedIdx; i>0 && inputArr[i-1] > newElement; i--){
					inputArr[i] = inputArr[i-1];
			}
			inputArr[i] = newElement;
		}
		display(inputArr);
		
	}
	// method to swap numbers
	public static void swap (int[] inputArr, int i, int j){
		int temp;
		temp = inputArr[i];
		inputArr[i] = inputArr[j];
		inputArr[j] = temp;
	}
	public static void display (int[] inputArr){
			// display the elements in the array
		for (int i : inputArr){
			System.out.print(i + " ");
		}
		System.out.println("");
	}

}