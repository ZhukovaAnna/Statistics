package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void calculateSum() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.calculateSum(sale);
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void calculateAVG() {
        StatsService service = new StatsService();
        long[] sale ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.calculateAVG(sale);
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void findMax() {
        StatsService service = new StatsService();
        long[] sale ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.findMax(sale);
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void findMin() {
        StatsService service = new StatsService();
        long[] sale ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.findMin(sale);
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void lessAVG() {
        StatsService service = new StatsService();
        long[] sale ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.LessAVG(sale);
        assertEquals(expected,actual);
    }

    @org.junit.jupiter.api.Test
    void largerAVG() {
        StatsService service = new StatsService();
        long[] sale ={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.LargerAVG(sale);
        assertEquals(expected,actual);
    }
}