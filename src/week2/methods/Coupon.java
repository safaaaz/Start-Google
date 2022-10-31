package week2.methods;

import java.util.Date;

public class Coupon {
    final private int id;
    final private Date expiryDate;
    final private double value;

    public Coupon(int id, Date expiryDate, double value) {
        this.id = id;
        this.expiryDate = expiryDate;
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public Date getExpiryDate() {
        return new Date(expiryDate.getTime());
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Coupon{" +
                "id=" + id +
                ", expiryDate=" + expiryDate +
                ", value=" + value +
                '}';
    }
}
