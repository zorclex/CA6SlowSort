package pack;

public class ShellSort {
	
	public static void insertionSortByGaps(int[] arr, int start, int gap) 
	{
		for (int i = start + gap; i < arr.length; i+= gap)
		{
			int j = i;
			while(j - gap >= start && arr[j] < arr[j - gap])
			{
				int temp = arr[j];
				arr[j] = arr[j -gap];
		        arr[j -gap] = temp;
		        j -= gap;
			}
		}
	}
	
	public static void shellSort(int[] arr, int[]gapVals)
	{
		for(int g = 0; g < gapVals.length; g++)
		{
			for(int i = 0; i < gapVals[g]; i++)
			{
				insertionSortByGaps(arr, i, gapVals[g]);
			}
		}
	}
	
}
