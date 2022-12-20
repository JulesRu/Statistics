package ru.netology.stats;

public class StatsService {

    public int AnnualSales(long[] sales) {

        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        return sum;
    }

    public int AverageMonthlySales(long[] sales) {

        int sum = 0;

        for (int i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
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

    public int UnderAverageMonthlySales(long[] sales) {

        int sum = 0;
        int lowSales = 0;

        int i = 0;
        for (i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        int average = sum / sales.length;
        for (i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                lowSales++;
            }
        }
        return lowSales;
    }

    public int aboveAverageMonthlySales(long[] sales) {

        int sum = 0;
        int highSales = 0;

        int i = 0;
        for (i = 0; i < sales.length; i++) {
            sum += sales[i];
        }
        int average = sum / sales.length;
        for (i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                highSales++;
            }
        }
        return highSales;
    }
}
