package week2.CommonMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PhoneBook implements Cloneable,Comparable<PhoneBook>{
    private String name;
    private List<Contact> contacts;

    public static void main(String[] args) {
        Contact c1 = new Contact(new Name(Prefix.Ms,"safaa","azbarqa"),new PhoneNumber(972,507138055));
        Contact c2 = new Contact(new Name(Prefix.Mr,"ahmed","ajaj"),new PhoneNumber(972,502615755)).clone();
        Contact c3 = new Contact(new Name(Prefix.Miss,"Maram","haj").clone(),new PhoneNumber(278,502628066).clone());
        Contact c4 = new Contact(new Name(Prefix.Miss,"Maram","haj"),new PhoneNumber(278,502628066));
        PhoneBook book = new PhoneBook("safaa's book", Arrays.asList(c1,c2));
        System.out.println(book);
        if (book.contacts.get(0).compareTo(book.contacts.get(1)) == -1) {
            System.out.println(book.contacts.get(0));
        } else {
            System.out.println(book.contacts.get(1));
        }
        if(c3.equals(c4)) System.out.println("c3 equals to c4");

    }
    public PhoneBook(String name, List<Contact> contacts) {
        this.name = name;
        this.contacts = contacts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneBook phoneBook = (PhoneBook) o;
        return Objects.equals(name, phoneBook.name) && Objects.equals(contacts, phoneBook.contacts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contacts);
    }

    @Override
    public String toString() {
        return "PhoneBook{" +
                "name='" + name + '\'' +
                ", contacts=" + contacts +
                '}';
    }

    @Override
    protected PhoneBook clone() {
        try {
            PhoneBook book= (PhoneBook) super.clone();
            book.contacts = new ArrayList<>(contacts);
            return book;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int compareTo(PhoneBook o) {
        return name.compareTo(o.name);
    }
}
