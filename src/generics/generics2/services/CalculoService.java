package generics.generics2.services;

import java.util.List;

public class CalculoService {

	public static <T extends Comparable<T>> T max(List<T> list) {
		if (list.isEmpty()) {
			throw new IllegalStateException("A lista n�o pode estar vazia.");
		}
		T max = list.get(0);
		for (T item : list) {
			if (item.compareTo(max) > 0) {
				max = item;
			}
		}
		return max;
	}

}
