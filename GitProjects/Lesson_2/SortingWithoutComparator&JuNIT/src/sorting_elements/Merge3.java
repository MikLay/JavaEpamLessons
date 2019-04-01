package sorting_elements;

import java.util.Comparator;

public class Merge3 implements Sorter_strategy
{

	public <T> void sort(T[] a, Comparator<T> comparator)
	{
		doMergeSort(a, comparator, 0, a.length - 1);
	}

	private static <T> void doMergeSort(T[] array, Comparator<T> comparator, int lowerIndex, int higherIndex)
	{
		if (lowerIndex < higherIndex)
		{
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			doMergeSort(array, comparator, lowerIndex, middle);
			doMergeSort(array, comparator, middle + 1, higherIndex);
			if (comparator.compare(array[middle + 1], array[middle]) > 0)
				return;
			mergeParts(array, comparator, lowerIndex, middle, higherIndex);
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
		return "MergeSort with H&L";
	}
}
