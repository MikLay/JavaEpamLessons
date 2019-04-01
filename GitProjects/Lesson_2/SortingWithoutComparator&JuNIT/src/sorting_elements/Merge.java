package sorting_elements;

import java.util.Comparator;

public class Merge implements Sorter_strategy
{

	@Override
	public <T> void sort(T[] inputArr, Comparator<T> comparator) {
		T[] tempMergArr = inputArr.clone();
		for (int i = 0; i < tempMergArr.length; i++) {
			tempMergArr[i] = null;
		}
		doMergeSort(inputArr, tempMergArr, comparator, 0, inputArr.length - 1);
	}

	private <T> void doMergeSort(T[] array, T[] tempMergArr, Comparator<T> comparator, int lowerIndex,
			int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			doMergeSort(array, tempMergArr, comparator, lowerIndex, middle);
			doMergeSort(array, tempMergArr, comparator, middle + 1, higherIndex);
			mergeParts(array, tempMergArr, comparator, lowerIndex, middle, higherIndex);
		}
	}

	private <T> void mergeParts(T[] array, T[] tempMergArr, Comparator<T> comparator, int lowerIndex, int middle,
			int higherIndex) {
		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempMergArr[i] = array[i];
		}

		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;

		while (i <= middle && j <= higherIndex) {
			if (comparator.compare(tempMergArr[i], tempMergArr[j]) <= 0) {
				array[k] = tempMergArr[i];
				i++;
			} else {
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempMergArr[i];
			k++;
			i++;
		}

	}
	@Override
	public String getName()
	{
		return "MergeSort";
	}
}
