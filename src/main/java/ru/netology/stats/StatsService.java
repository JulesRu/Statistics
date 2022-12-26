package ru.netology.stats;

public class StatsService {

    public int annualSales(long[] sales) {

        int sum = 0;

        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int averageMonthlySales(long[] sales) {

        int sum = annualSales(sales);
        int average = sum / sales.length;
        return average;

    }

    public int maxSales(long[] sales) {

        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int underAverageMonthlySales(long[] sales) {

        int i;
        int lowSales = 0;

        int average = averageMonthlySales(sales);

        for (i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                lowSales++;
            }
        }
        return lowSales;
    }

    public int aboveAverageMonthlySales(long[] sales) {

        int i;
        int highSales = 0;

        int average = averageMonthlySales(sales);

        for (i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                highSales++;
            }
        }
        return highSales;
    }
}
