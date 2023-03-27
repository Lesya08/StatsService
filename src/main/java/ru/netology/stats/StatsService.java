package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {                //массив продаж за 12 мес
        long totalSale = 0;
        for (long sale : sales) {
            totalSale = totalSale + sale;          //сумма всех продаж за 12 мес
        }
        return totalSale;
    }

    public long average(long[] sales) {
        long totalSale = sum(sales);
        return totalSale / sales.length;            //средняя сумма продаж в месяц
    }

    public int monthMaxSale(long[] sales) {
        int monthMax = 0;
        long saleMax = sales[0];

        for (int i = 0; i < sales.length; i++) {    //цикл для поиска номера месяца с максимальной продажей
            if (sales[i] >= saleMax) {
                monthMax = i;
                saleMax = sales[i];
            }
        }
        return monthMax + 1;
    }

    public int monthMinSale(long[] sales) {
        int monthMin = 0;
        long saleMin = sales[0];

        for (int i = 0; i < sales.length; i++) {    //цикл для поиска номера месяца с минимальной продажей
            if (sales[i] <= saleMin) {
                monthMin = i;
                saleMin = sales[i];
            }
        }
        return monthMin + 1;
    }

    public int monthsBelowAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {                       //Количество месяцев, в которых продажи были ниже среднего
            if (sale < averageSale) {
                counter++;
            }
        }
        return counter;
    }

    public int monthsHigherAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0;
        for (long sale : sales) {                       //Количество месяцев, в которых продажи были выше среднего
            if (sale > averageSale) {
                counter++;
            }
        }
        return counter;
    }
}