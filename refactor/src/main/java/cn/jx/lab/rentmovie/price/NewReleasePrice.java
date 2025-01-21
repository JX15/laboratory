package cn.jx.lab.rentmovie.price;

import cn.jx.lab.rentmovie.Movie;
import cn.jx.lab.rentmovie.Price;

public class NewReleasePrice extends Price {
    public int getPriceCode() {
        return Movie.NEW_RELEASE;
    }


    public double getCharge(int daysRented) {
        return daysRented * 3;
    }

    public int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }
}