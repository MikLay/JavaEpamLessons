package sorting_elements;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortStrategyUnitTester extends SortStrategyUnitTester
{

	@BeforeClass
	public static void setSortStrategy()
	{
		mySorter.setCurrentSortStrategy(new Insertion());
	}

	@SuppressWarnings("unchecked")
	@Override
	@Test
	public void testSortAscNoComparator()
	{
		mySorter.sortUp(testDataCopy);
		assertTrue(isSortedAsc(testDataCopy));
	}

	@SuppressWarnings("unchecked")
	@Override
	@Test
	public void testSortDescNoComparator()
	{
		mySorter.sortDwn(testDataCopy);
		assertTrue(isSortedDesc(testDataCopy));
	}
}
