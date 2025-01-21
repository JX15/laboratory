package cn.jx.lab.rentmovie.price;

import cn.jx.lab.rentmovie.Movie;
import cn.jx.lab.rentmovie.Price;

public class ChildrensPrice extends Price {
    public int getPriceCode() {
        return Movie.CHILDRENS;
    }

    public double getCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3)
            result += (daysRented - 3) * 1.5;
        return result;
    }

}