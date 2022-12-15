package pack;

public class Main {

	public static void main(String[] args) {
		//If you want to run this Main and see the lists as they're sorted and displayed, you'll need to disable to character limit on the console because these lists are massive.

		//create and initialize masterList
		int[] masterList = new int[10000];
		for (int i = 0; i < masterList.length; i++)
		{
			masterList[i] = i+1;
//			System.out.print(masterList[i] + " ");
		}
		shuffle(masterList);
		printArray(masterList);
		System.out.println("=-=-=-=-=- list initialized and displayed =-=-=-=-=-");

		int[] nums1 = copyToNewArray(masterList); //for Selection Sort
		int[] nums2 = copyToNewArray(masterList); //for Insertion Sort
		int[] nums3 = copyToNewArray(masterList); //for Shell Sort
		int[] nums4 = copyToNewArray(masterList); //for Bubble Sort
		int[] nums5 = copyToNewArray(masterList); //for Quicksort Sort
		int[] nums6 = copyToNewArray(masterList); //for Mergesort Sort
		int[] nums7 = copyToNewArray(masterList); //for Mergesort2 Sort
		
		long startTime;
		long endTime;

		// {4,9,3,6,1,0,7,8,2,5}; small array for testing
		
		//selection sort
		startTime = System.currentTimeMillis();
		SelectionSort.selectionSort(nums1);
		endTime = System.currentTimeMillis();
		System.out.println("Ran Selection Sort on list nums1 with a duration of " + (endTime - startTime) + " milliseconds.");
//		printArray(nums1);
		
		//insertion sort
		startTime = System.currentTimeMillis();
		InsertionSort.insertionSort(nums2);
		endTime = System.currentTimeMillis();
		System.out.println("Ran Insertion Sort on list nums2 with a duration of " + (endTime - startTime) + " milliseconds.");
//		printArray(nums2);
		
		//shell sort
		int[] gapVals = {2, 1}; //probably could be optimized?
		startTime = System.currentTimeMillis();
		ShellSort.shellSort(nums3, gapVals);
		endTime = System.currentTimeMillis();
		System.out.println("Ran Shell Sort on list nums3 with a duration of " + (endTime - startTime) + " milliseconds.");
//		printArray(nums3);
		
		//bubble sort
		startTime = System.currentTimeMillis();
		BubbleSort.bubbleSort(nums4);
		endTime = System.currentTimeMillis();
		System.out.println("Ran Bubble Sort on list nums4 with a duration of " + (endTime - startTime) + " milliseconds.");
//		printArray(nums4);
		
		//QuickSort sort
		startTime = System.currentTimeMillis();
		Quicksort.quicksort(nums5, 0, nums5.length - 1);
		endTime = System.currentTimeMillis();
		System.out.println("Ran Quick Sort on list nums5 with a duration of " + (endTime - startTime) + " milliseconds.");
//		printArray(nums5);
		
		//MergeSort sort
		startTime = System.currentTimeMillis();
		Mergesort.mergeSort(nums6, 0, (nums6.length - 1));
		endTime = System.currentTimeMillis();
		System.out.println("Ran Merge Sort on list nums6 with a duration of " + (endTime - startTime) + " milliseconds.");
//		printArray(nums5);	
		
		//MergeSort sort
		startTime = System.currentTimeMillis();
		Mergesort2.mergeSort2(nums7, 0, (nums7.length - 1));
		endTime = System.currentTimeMillis();
		System.out.println("Ran Merge Sort 2 on list nums7 with a duration of " + (endTime - startTime) + " milliseconds.");
//		printArray(nums5);	
		
		//cabbage
	}
	
	public static void shuffle(int [] arr) 
	{
		for (int i = 0; i < arr.length; i++) 
        {
			int index = (int) (Math.random() * arr.length);
			int temp = arr[i];
			arr[i] = arr[index];
            arr[index] = temp;
        }
		System.out.println("shuffling list");
    }
	
	public static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + ", ");
		}
		System.out.println("\n=-=-=-=-=-=-=-=-=-=\n");
	}
	
	public static int[] copyToNewArray(int[] arr1)
	{
		int[] arr2 = new int[arr1.length];
		for(int i = 0; i < arr1.length; i++)
		{
			arr2[i] = arr1[i];
		}
		return arr2;
	}

}
