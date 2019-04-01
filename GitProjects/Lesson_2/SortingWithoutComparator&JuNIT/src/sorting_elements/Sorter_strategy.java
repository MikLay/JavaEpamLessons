package sorting_elements;

import java.util.Comparator;

public interface Sorter_strategy
{
	String getName();
	
	<T> void sort(T[] array, Comparator<T> comparator);
	
	default <T> void sortRev(T[] array, Comparator<T> comparator) {
		sort(array, comparator.reversed());
	}
	
	default <T extends Comparable<T>> void sort(T[] array){
		sort(array, Comparator.naturalOrder());
	}
	default <T extends Comparable<T>> void sortRev(T[] array)
	{
		sortRev(array, Comparator.naturalOrder());
	}
	

}
