
/*
* In a selection sort , the largest element in unsorted partition is swapped with the last element in unsorted partition
*/
public class SelectionSort{
	public static void main(String args[]){
		//int[] inputArr = {20, 27, -22, 3, 52, 15, 12};
		int[] inputArr = {20, 27, -22, 3, 52, 15, 12, 77};
		
		// Outer loop - keeps populating the highest values to the right
		for (int rightunsortedIdx = inputArr.length-1; rightunsortedIdx > 0; rightunsortedIdx--){
			int max=0;
			// this loop is to identify the max value in the unsorted partition. max variable will hold the index
			for (int i=0; i<rightunsortedIdx;i++){
					max = (inputArr[max] > inputArr[i+1])? max : i+1;
			}
			// swap the max element with the last element of the unsorted partition
			swap(inputArr, max, rightunsortedIdx);
			
		}
		// display the array
		for (int j: inputArr) {
			System.out.print(j + " ");
		}
	}
	// method to swap the elements of an array
	public static void swap(int[] inputArr, int a, int b){
		int temp;		
		temp = inputArr[a];
		inputArr[a] = inputArr[b];
		inputArr[b] = temp;
	}
}