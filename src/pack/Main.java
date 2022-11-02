package pack;

public class Main {

	public static void main(String[] args) {
		
		//selection sort
		int[] nums1 = {4,9,3,6,1,0,7,8,2,5};
		SelectionSort.selectionSort(nums1);
		System.out.println("Running Selection Sort on array nums1 (4,9,3,6,1,0,7,8,2,5): ");
		for(int i = 0; i < nums1.length; i++)
		{
			System.out.print(nums1[i] + ", ");
		}
		System.out.println("\n=-=-=-=-=-=-=-=-=-=\n");
		
		//insertion sort
		int[] nums2 = {4,9,3,6,1,0,7,8,2,5};
		InsertionSort.insertionSort(nums2);
		System.out.println("Running Insertion Sort on array nums2 (4,9,3,6,1,0,7,8,2,5): ");
		for(int i = 0; i < nums2.length; i++)
		{
			System.out.print(nums2[i] + ", ");
		}
		System.out.println("\n=-=-=-=-=-=-=-=-=-=\n");
		
		//shell sort
		int[] nums3 = {4,9,3,6,1,0,7,8,2,5};
		int[] gapVals = {2, 1};
		ShellSort.shellSort(nums3, gapVals);
		System.out.println("Running Shell Sort on array nums3 (4,9,3,6,1,0,7,8,2,5): ");
		for(int i = 0; i < nums3.length; i++)
		{
			System.out.print(nums3[i] + ", ");
		}
		System.out.println("\n=-=-=-=-=-=-=-=-=-=\n");
		
		//insertion sort
		int[] nums4 = {4,9,3,6,1,0,7,8,2,5};
		BubbleSort.bubbleSort(nums4);
		System.out.println("Running Bubble Sort on array nums4 (4,9,3,6,1,0,7,8,2,5): ");
		for(int i = 0; i < nums4.length; i++)
		{
			System.out.print(nums4[i] + ", ");
		}
		System.out.println("\n=-=-=-=-=-=-=-=-=-=\n");
		
		//cabbage
	}

}
