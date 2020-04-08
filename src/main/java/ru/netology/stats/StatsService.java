package ru.netology.stats;

public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for(long sale:sales)
        {
            sum+=sale;
        }
      return sum;
    }

    public  long calculateAVG(long[] sales)
    {
        long sum = calculateSum(sales);
        long avg = sum/(sales.length);
        return avg;
    }
    public  long findMax (long[] sales)
    {
        long mounth = 0;
        long currentMaxSale = 0;
        for(int number = 0; number < sales.length; number++)
        {
            if (currentMaxSale <= sales[number]) {
                currentMaxSale = sales[number];
                mounth = number+1;
            }
            }
        return mounth;
    }

    public long findMin (long[] sales)
    {
        long mounth = 0;
        long currentMinSale = sales[0];
        for(int number = 0; number < sales.length; number++)
        {
            if (currentMinSale >= sales[number]) {
                currentMinSale = sales[number];
                mounth = number+1;
            }
        }
        return mounth;
    }

    public int LessAVG(long[] sales)
    {
        long avg = calculateAVG(sales);
        int monthCount = 0;
                for (long sale:sales)
                {
                    if (sale <avg)
                        monthCount++;
                }

        return monthCount;
    }

    public int LargerAVG(long[] sales)
    {
        long avg = calculateAVG(sales);
        int monthCount = 0;
        for (long sale:sales)
        {
            if (sale > avg)
                monthCount++;
        }
        return monthCount;
    }
    /*
    Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
    Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
    Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
    Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
     */
}

