package sorting_elements;

import java.util.Comparator;

public class Sorter
{
	private Sorter_strategy currentSortStrategy;

	
	
	public Sorter(){	
	}
	public Sorter(Sorter_strategy currentSortStrategy) {
		this.currentSortStrategy = currentSortStrategy;
	}
	public void setCurrentSortStrategy(Sorter_strategy currentSortStrategy)
	{
		this.currentSortStrategy = currentSortStrategy;
	}
	
	public <T extends Comparable<T>> void sortUp(T[] a)
	{
		currentSortStrategy.sort(a);
	}

	public <T extends Comparable<T>> void sortDwn(T[] a)
	{
		currentSortStrategy.sortRev(a);
	}
	
	public <T> void sortUp(T[] a , Comparator<T> comparator)
	{
		currentSortStrategy.sort(a, comparator);
	}
	
	public <T> void sortDwn(T[] a , Comparator<T> comparator)
	{
		currentSortStrategy.sortRev(a, comparator);
	}
	
}

