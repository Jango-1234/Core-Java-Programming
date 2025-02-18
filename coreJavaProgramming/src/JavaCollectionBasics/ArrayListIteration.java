package JavaCollectionBasics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {

		ArrayList<String> tvSeries = new ArrayList<String>();
		tvSeries.add("Game of Thrones");
		tvSeries.add("Breaking Bad");
		tvSeries.add("The Big Band Theory");
		tvSeries.add("Prison Break");

		// 1. using java 8 with for each method & lambda expression
		System.out.println("---print using java 8 with for each method & lambda expression----");
		tvSeries.forEach(shows -> {
			System.out.println(shows);
		});

		// 2. using Iterator
		System.out.println("---print using Iterator----");
		Iterator<String> it = tvSeries.iterator();
		while (it.hasNext()) {
			String shows = it.next();
			System.out.println(shows);
		}

		// 3. using java 8 with forEachRemaining method
		System.out.println("---print using java 8 with forEachRemaining method----");
		it = tvSeries.iterator();
		it.forEachRemaining(show -> {
			System.out.println(show);
		});

		// 4.using for each loop
		System.out.println("---print using for each loop----");
		for (String show : tvSeries) {
			System.out.println(show);
		}

		// 5. using for loop with order/index
		System.out.println("---print using for loop with order/index----");
		for (int i = 0; i < tvSeries.size(); i++) {
			System.out.println(tvSeries.get(i));
		}

		// 6. using a listIterator() to traverse in both the direcetion
		System.out.println("---print listIterator() to traverse in both the direcetion----");
		ListIterator<String> tvSeriesListIterator = tvSeries.listIterator(tvSeries.size());
		while (tvSeriesListIterator.hasPrevious()) {
			String show = tvSeriesListIterator.previous();
			System.out.println(show);

		}
	}

}
