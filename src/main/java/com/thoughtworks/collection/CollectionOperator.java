package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        return left < right ?
                IntStream.rangeClosed(left, right)
                .boxed()
                .sorted()
                .collect(toList())
                :
                IntStream.rangeClosed(right, left)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .collect(toList());
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        return left < right ?
                IntStream.rangeClosed(left, right)
                        .filter(v -> v % 2 == 0)
                        .boxed()
                        .sorted()
                        .collect(toList())
                :
                IntStream.rangeClosed(right, left)
                        .filter(v -> v % 2 == 0)
                        .boxed()
                        .sorted(Comparator.reverseOrder())
                        .collect(toList());
    }

    public List<Integer> popEvenElments(int[] array) {
        return IntStream.of(array)
                .filter(v -> v % 2 == 0)
                .boxed()
                .collect(toList());
    }

    public int popLastElment(int[] array) {
        return IntStream.of(array)
                .reduce((prxNum ,nextNum) -> nextNum)
                .getAsInt();
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
