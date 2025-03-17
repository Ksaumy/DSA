package Arrays;

public class LargestAndSmallest {
	public static void largest_smallest(int[]arr)
	{
		int largest = arr[0];
		int smallest = arr[0];
		// loop iterates over each element in array
		for(int i =0;i<arr.length;i++)
		{
			//check largest number
			if(arr[i]>=largest)
				largest =arr[i];
			//check smallest number
			if(arr[i]<=smallest)
				smallest =arr[i];
		}
		System.out.println("Largest Number is :"+largest+"\n Smallest Number is :"+smallest);
	}

	public static void main(String[] args) {
		int[]arr = {1,53,564,4,3,14};
		LargestAndSmallest.largest_smallest(arr);

	}

}
