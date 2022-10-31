package week2.CommonMethods;

import java.util.Objects;

public class Contact implements Cloneable,Comparable<Contact>{
    private Name name;
    private PhoneNumber phoneNumber;

    public Contact(Name name, PhoneNumber phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return Objects.equals(name, contact.name) && Objects.equals(phoneNumber, contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phoneNumber);
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name=" + name +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
    @Override
    protected Contact clone() {
        try {
            Contact contact= (Contact) super.clone();
            contact.name = name.clone();
            contact.phoneNumber = phoneNumber.clone();
            return contact;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }


    @Override
    public int compareTo(Contact o) {
        int nameCmp=name.compareTo(o.name);
        if(nameCmp==0)
            return phoneNumber.compareTo(o.phoneNumber);
        return nameCmp;
    }
}
