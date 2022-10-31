package week2.CommonMethods;

import java.util.Objects;

public class PhoneNumber implements Cloneable,Comparable<PhoneNumber>{
    private int areaCode;
    private int number;

    public PhoneNumber(int areaCode, int number) {
        this.areaCode = areaCode;
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return areaCode == that.areaCode && number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(areaCode, number);
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "areaCode=" + areaCode +
                ", number=" + number +
                '}';
    }
    @Override
    protected PhoneNumber clone() {
        try {
            return (PhoneNumber) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int compareTo(PhoneNumber o) {
        return ((Integer)number).compareTo(o.number);
    }
}
