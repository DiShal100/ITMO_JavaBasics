package ITMO.Java.lecture_2;

public class Calculator {
    // Перегруженные методы суммирования
    public double sum(double x, double y) {
        return x + y;
    }

    public double sum(int x, int y) {
        return (double) x + y;
    }

    public double sum(long x, long y) {
        return (double) x + y;
    }

    public double sum(double x, int y) {
        return x + y;
    }

    public double sum(double x, long y) {
        return x + y;
    }

    public double sum(int x, double y) {
        return (double) x + y;
    }

    public double sum(int x, long y) {
        return (double) x + y;
    }

    public double sum(long x, double y) {
        return (double) x + y;
    }

    public double sum(long x, int y) {
        return (double) x + y;
    }
    //////////////////////////////////////////

    // Перегруженные методы деления
    public double div(double x, double y) {
        return x / y;
    }

    public double div(int x, int y) {
        return (double) x / y;
    }

    public double div(long x, long y) {
        return (double) x / y;
    }

//    public double div(double x, int y) {
//        return x / y;
//    }

//    public double div(double x, long y) {
//        return x / y;
//    }

    public double div(int x, double y) {
        return (double) x / y;
    }

    public double div(int x, long y) {
        return (double) x / y;
    }

    public double div(long x, double y) {
        return (double) x / y;
    }

    public double div(long x, int y) {
        return (double) x / y;
    }
    //////////////////////////////////////////

    // Перегруженные методы умножения
    public double multiplic(double x, double y) {
        return x * y;
    }

    public double multiplic(int x, int y) {
        return (double) x * y;
    }

    public double multiplic(long x, long y) {
        return (double) x * y;
    }

    public double multiplic(double x, int y) {
        return x * y;
    }

    public double multiplic(double x, long y) {
        return x * y;
    }

    public double multiplic(int x, double y) {
        return (double) x * y;
    }

    public double multiplic(int x, long y) {
        return (double) x * y;
    }

    public double multiplic(long x, double y) {
        return (double) x * y;
    }

    public double multiplic(long x, int y) {
        return (double) x * y;
    }
    //////////////////////////////////////////

    // Перегруженные методы вычитания
    public double sub(double x, double y) {
        return x - y;
    }

    public double sub(int x, int y) {
        return (double) x - y;
    }

    public double sub(long x, long y) {
        return (double) x - y;
    }

    public double sub(double x, int y) {
        return x - y;
    }

    public double sub(double x, long y) {
        return x - y;
    }

    public double sub(int x, double y) {
        return (double) x * y;
    }

    public double sub(int x, long y) {
        return (double) x - y;
    }

    public double sub(long x, double y) {
        return (double) x - y;
    }

    public double sub(long x, int y) {
        return (double) x - y;
    }
}
