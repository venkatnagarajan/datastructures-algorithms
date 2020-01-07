public class BubbleSort{
	public static void main(String args[]){
		int[] inputArr = {20, 27, -22, 3, 52, 15, 12};
		int temp;
		// iterate through the list n-1 times. During each iteration the largest elements bubbles up to the right end.
		for (int j=inputArr.length-1;j>0;j--){
			for (int i=0;i<j;i++){
				if (inputArr[i] > inputArr[i+1]){
					temp = inputArr[i+1];
					inputArr[i+1] = inputArr[i];
					inputArr[i] = temp;
				}
			}
		}
		for (int i : inputArr){
			System.out.println(i);
		}
	}

}