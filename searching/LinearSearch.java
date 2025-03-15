package searching;

public class LinearSearch {

	public static boolean linearSearch(int arr[],int n)
	{
		for(int i=0;i<arr.length;i++) //Traverse Array
		{
			if(arr[i]==n) //Number match with target number
			{
				return true; //found
			}
		}
		return false;// not found
	}
	public static void main(String[] args) {
		int arr[]= {2,6,8,9,27,25};
		int n=1;
		if(linearSearch(arr,n)) //call function to perform linear search
		{
			System.out.println("Number Found");
		}
		else
		{
			System.out.println("Number not Found");
		}
		

	}

}
