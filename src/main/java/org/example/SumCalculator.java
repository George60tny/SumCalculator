package org.example;

public class SumCalculator {
    public int sum(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Input must be a positive integer.");
        }
        return (n * (n + 1)) / 2;
    }
}