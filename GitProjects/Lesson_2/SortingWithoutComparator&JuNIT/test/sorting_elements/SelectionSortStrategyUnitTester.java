package sorting_elements;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SelectionSortStrategyUnitTester extends SortStrategyUnitTester
{

	@BeforeClass
	public static void setSortStrategy()
	{
		mySorter.setCurrentSortStrategy(new Selection());
	}

	@SuppressWarnings("unchecked")
	@Override
	@Test
	public void testSortAscNoComparator()
	{
		mySorter.sortUp(testDataCopy);
		assertTrue(isSortedDesc(testDataCopy));
	}

	@SuppressWarnings("unchecked")
	@Override
	@Test
	public void testSortDescNoComparator()
	{
		mySorter.sortDwn(testDataCopy);
		assertTrue(isSortedAsc(testDataCopy));
	}
}
