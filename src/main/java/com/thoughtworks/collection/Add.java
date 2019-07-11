package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int min = Math.min(leftBorder, rightBorder);
        int max = Math.max(leftBorder, rightBorder);
        return IntStream.rangeClosed(min, max)
                .filter(number -> number % 2 == 0)
                .sum();
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        int min = Math.min(leftBorder, rightBorder);
        int max = Math.max(leftBorder, rightBorder);
        return IntStream.rangeClosed(min, max)
                .filter(number -> number % 2 == 1)
                .sum();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {

        return arrayList.stream().map(item -> item * 3 + 2).collect(toList())
        .stream().mapToInt(v -> v).sum();
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map(item -> item = item % 2 == 0 ? item : item * 3 + 2).collect(toList());
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

//    public double getMedianOfEven(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return arrayList.stream().filter(item -> item % 2 == 0)
                .mapToInt(v -> v)
                .summaryStatistics()
                .getAverage();
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        return arrayList.stream().filter(v -> v % 2 == 0)
                .distinct()
                .collect(toList());
    }

//    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }

//    public List<Integer> getProcessedList(List<Integer> arrayList) {
//        throw new NotImplementedException();
//    }
}
