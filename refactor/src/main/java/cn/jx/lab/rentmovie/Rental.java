package cn.jx.lab.rentmovie;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rental {
    private Movie _movie;
    private int _daysRented;


    public double getCharge() {
       return _movie.getCharge(_daysRented);
    }


    public int getFrequentRenterPoints() {
       return _movie.getFrequentRenterPoints(_daysRented);
    }
}