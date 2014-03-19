package example;

import java.text.DecimalFormat;

/**
 * Created by pushkala on 3/19/14.
 */
public class ValetParking {
    private int minutes;

    public void setParkingMinutes(int minutes){
        this.minutes = minutes;

    }
    public String getPaymentAmount(){
        return "$"+ new DecimalFormat("####.00").format(minutes*.40 );
    }
}
