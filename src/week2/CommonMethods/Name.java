package week2.CommonMethods;

import java.util.Objects;

public class Name implements Cloneable,Comparable<Name>{
    private Prefix prefix;
    private String firstName;
    private String lastName;

    public Name(Prefix prefix, String firstName, String lastName) {
        this.prefix = prefix;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name = (Name) o;
        return Objects.equals(prefix, name.prefix) && Objects.equals(firstName, name.firstName) && Objects.equals(lastName, name.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prefix, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Name{" +
                "prefix='" + prefix + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    @Override
    protected Name clone() {
        try {
            return (Name) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public int compareTo(Name o) {
        return firstName.compareTo(o.firstName);
    }
}
