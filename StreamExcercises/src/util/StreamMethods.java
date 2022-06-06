package util;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMethods {
	public static <T> Set<T> findDuplicates(List<T> list) {
		return list.stream().filter(i -> Collections.frequency(list, i) > 1).collect(Collectors.toSet());
	}
	
	public static <T> List<T> removeDuplicates(List<T> list) {
		return list.stream().distinct().collect(Collectors.toList());
	}
	
	public static int findMax(List<Integer> list) {
		return list.stream().max(Comparator.comparing(Integer::valueOf)).get();
	}
	
	public static int findMin(List<Integer> list) {
		return list.stream().min(Comparator.comparing(Integer::valueOf)).get();
	}
}