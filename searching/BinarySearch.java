package searching;

public class BinarySearch {

	public static boolean binarySearch(int []arr,int n)
	{
		int left = 0;//starting number or 1st index
		int right = arr.length-1;//last number or last index
		while(left<=right)//loop run until left is greater than right
		{
			int mid = (left+right)/2; //find mid index or number
			if(arr[mid]==n)//check mid number == target number
			{return true;}
			if(arr[mid]<n)
			{
				left = mid+1; //check if mid number is smaller than target then search on RIGHT side
			}
			else
			{
				right = mid-1; // else check on LEFT side
			}
		}
		return false; //loop end but number not found
	}
	public static void main(String []args)
	{
		int [] arr = {2,4,6,7,8,9,14};
		int n=1;//target number
		if(binarySearch(arr,n)) 
		{
			System.out.println("Number Found");
		}
		else
		{
			System.out.println("Number Not Found");
		}
	}
}
