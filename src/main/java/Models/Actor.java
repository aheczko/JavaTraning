package Models;

public class Actor {
    private String firstName;
    private String lastName;
    private int rating;
    private boolean isOscarPriset;

    public Actor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Actor() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public boolean isOscarPriset() {
        return isOscarPriset;
    }

    public void setOscarPriset(boolean oscarPriset) {
        isOscarPriset = oscarPriset;
    }

    //moje własne metody
    public int calculateSalary(int stawka, int iloscFilmow) {
        int rezultat = stawka * iloscFilmow;
        return rezultat;
    }

    public int giveBonus(int rating, int salary) {
        int rezultat;
        if (rating < 11) {
            rezultat = salary * 2;
        } else {
            rezultat = salary;
        }
        return rezultat;
    }
}
