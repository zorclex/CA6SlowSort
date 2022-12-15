package pack;

public class Quicksort {
	
	public static int partition(int[] arr, int startIndex, int endIndex)
	{
		//have numbers we can change based on values passed in
		int mid = (startIndex + endIndex) / 2;
		int pivot = arr[mid];
		int low = startIndex;
		int high = endIndex;
		
		boolean done = false;
		while(!done)
		{
			//figure out a low number higher than pivot to be swapped
			while(arr[low] < pivot)
			{
				low++;
			}
			//figure out a high number lower than pivot to be swapped
			while(pivot < arr[high])
			{
				high--;
			}
			
			if(low >= high) //are we done yet?
			{
				done = true;
			}
			else //swap high and low until all items above pivot are higher than pivot and all below are lower than pivot, and adjust bounds as we go
			{
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				low++;
				high--;
			}
		}
		return high; //the new high that just passed low, and is now the high end of the next recursion
	}
	
	public static void quicksort(int[] arr, int startIndex, int endIndex)
	{
		if(endIndex <= startIndex) //if we are list.size(1) then end
		{
			return;
		}
		
		int high = partition(arr, startIndex, endIndex); //divide the list in two by marking high, and sort into higher and lower portions
		
		quicksort(arr, startIndex, high); //recurse and start over with the lower list - 0-5, z.B. (0 is start, 5 is now high)
		quicksort(arr, high + 1, endIndex); //recurse and start over with the higher list - 6-9, z.B. (6 is high+1, 9 is end)
		
	}
	
}

/* Pseudo!
 * there might have been a different way discussed in class, but this the resource I had to work off of and seems reasonable and simple to me
 * 
 * step 1: find pivot : the middle of the list (high/low) (if none, exit, because then it's size 1)
 * step 2: separate into lists higher than and lower than pivot 
 * step 3: compare each element below the pivot and see if any are higher than pivot itself, hold
 * step 4: do the same as #3, but with teh list above and for things which are lower than pivot, hold
 * step 5: swap higher and lower values
 * step 6: recurse
 * 
 * 
 */

