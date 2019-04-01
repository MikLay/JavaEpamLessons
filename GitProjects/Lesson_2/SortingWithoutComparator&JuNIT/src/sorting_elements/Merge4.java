package sorting_elements;

import java.util.Comparator;


public class Merge4 implements Sorter_strategy
{
	public final static int INSERTION_SORT_THERSHOLD = 6;
	
	public <T> void sort(T[] a, Comparator<T> comparator)
	{
		doMergeSort(a, comparator, 0, a.length - 1);
	}

	private static <T> void doMergeSort(T[] array, Comparator<T> comparator, int lowerIndex, int higherIndex)
	{
		if(higherIndex<= lowerIndex - 1 +6)
		{
			insertionsort(array, lowerIndex, higherIndex, comparator);
			return;
		}

			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			doMergeSort(array, comparator, lowerIndex, middle);
			doMergeSort(array, comparator, middle + 1, higherIndex);
			if (comparator.compare(array[middle + 1], array[middle]) > 0)
				return;
			mergeParts(array, comparator, lowerIndex, middle, higherIndex);
	}

	private static <T> void insertionsort(T[] a, int lo, int hi, Comparator<T> comparator)
	{
		for (int i = lo; i < hi; i++)
		{
			for (int j = i; j > lo; j--)
			{
				if (comparator.compare(a[j], a[j - 1]) < 0)
					Utillits.swapper(a, j, j - 1);
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	private static <T> void mergeParts(T[] array, Comparator<T> comparator, int lowerIndex, int middle, int higherIndex)
	{

		T temp[] = (T[]) new Object[array.length];

		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while (i <= middle && j <= higherIndex)
		{
			if (comparator.compare(array[i], array[j]) <= 0)
			{
				temp[k] = array[i];
				i++;
			} else
			{
				temp[k] = array[j];
				j++;
			}
			k++;
		}
		while (i <= middle)
		{
			array[k] = array[i];
			k++;
			i++;
		}

		
	}
	@Override
	public String getName()
	{
		return "Improved MergeSort";
	}
}
