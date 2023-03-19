package ru.netology.statistics.statistic.services;

public class StatsService {
    public long sum(long[] sales) {
        long totalSales = 0;
        for (long sale : sales) {
            totalSales += sale;
        }
        return totalSales;
    }

    public long average(long[] sales) {
        return (sum(sales) / sales.length);
    }

    public int maxSales(long[] sales) {
        int maxMounth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMounth]) {
                maxMounth = month;
            }
            month = month + 1;
        }
        return maxMounth + 1;
    }

    public int minSales(long[] sales) {
        int minMounth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMounth]) {
                minMounth = month;
            }
            month = month + 1;
        }
        return minMounth + 1;
    }

    public int monthUnderAverageSale(long[] sales) {
        int monthUnderAverage = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                monthUnderAverage++;
            }
        }
        return monthUnderAverage;

    }

    public int monthOverAverageSale(long[] sales) {
        int monthOverAverage = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                monthOverAverage++;
            }
        }
        return monthOverAverage;

    }
}



