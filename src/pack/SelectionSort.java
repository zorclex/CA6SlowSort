package pack;

public class SelectionSort {
	
	public static void selectionSort(int[] arr) 
	{
	      for (int i = 0; i < arr.length - 1; i++) 
	      {
	         //find the index of the smallest remaining element
	         int smallest = i;
	         for (int j = i + 1; j < arr.length; j++) 
	         {
	            if (arr[j] < arr[smallest]) 
	            {
	               smallest = j;
	            }
	         }

	         //swap
	         int temp = arr[i];
	         arr[i] = arr[smallest];
	         arr[smallest] = temp;
	      }
	   }
	
}
