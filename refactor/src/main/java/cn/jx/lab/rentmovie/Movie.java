package cn.jx.lab.rentmovie;

import cn.jx.lab.rentmovie.price.ChildrensPrice;
import cn.jx.lab.rentmovie.price.NewReleasePrice;
import cn.jx.lab.rentmovie.price.RegularPrice;
import lombok.Data;

@Data
public class Movie {
     public static final int CHILDRENS = 2;
     public static final int REGULAR = 0;
     public static final int NEW_RELEASE = 1;
     private String _title;
     private Price _price;
     
     public Movie(String title, int priceCode) {
          this._title = title;
          setPriceCode(priceCode);
     }
     
     public int getPriceCode() {
          return _price.getPriceCode();
     }

     private void setPriceCode(int arg) {
          switch (arg){
               case REGULAR:
                    _price = new RegularPrice();
                    break;
               case CHILDRENS:
                    _price = new ChildrensPrice();
                    break;
               case NEW_RELEASE:
                    _price = new NewReleasePrice();
                    break;
               default:
                    throw new IllegalArgumentException("Incorrect Price Code");
          }
     }


     public double getCharge(int daysRented) {
          return _price.getCharge(daysRented);
     }

     public int getFrequentRenterPoints(int daysRented) {
         return _price.getFrequentRenterPoints(daysRented);
     }
}