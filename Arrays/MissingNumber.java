package Arrays;



public class MissingNumber {
	public static void missing(int[]arr)
	{
		int n = arr.length;
		int total = (n+1)*((n+1)+1)/2;//calculate expected sum
		int sum=0;
		//calculate sum of array
		for(int i =0; i<n; i++)
		{
			sum=sum+arr[i];
		}
	System.out.println("Missing Number is :"+(total-sum));
	}

	public static void main(String[] args) {
		int[]arr= {1,2,8,4,5,6,7,9,10};
		MissingNumber.missing(arr);//Method call by classname.method name

	}

}
