package org.example;
import Models.Actor;
import Models.Movie;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        Movie film1 = new Movie();
        film1.setTitle("Pulp Fiction");
        film1.setBudget(10.09);
        film1.setCategory('C');
        film1.setRating(9);
        film1.setMovieProzed(true);

        if(film1.getRating()>10.00)
        {
            System.out.println("Film jest popularny");
        }
        else
        {
            System.out.println("Film nie jest popularny");
        }

        double l1;
        l1 = film1.getBudget();
        System.out.println(l1);

        Actor aktor1 = new Actor("Tom","Cruise");
        Actor aktor2 = new Actor("Sandra","Bulok");
        Actor aktor3 = new Actor("Edward","Gierek");
        System.out.println(aktor1.getFirstName()+" "+aktor1.getLastName()+" "+ aktor1.getRating()+ " "+ aktor1.isOscarPriset());
        System.out.println(aktor2.getFirstName()+" "+aktor2.getLastName()+" "+ aktor2.getRating()+ " "+ aktor2.isOscarPriset());
        System.out.println(aktor3.getFirstName()+" "+aktor3.getLastName()+" "+ aktor3.getRating()+ " "+ aktor3.isOscarPriset());


        System.out.println("Wynagrodzenie:"+aktor1.calculateSalary(1000000,12));





    }


}
