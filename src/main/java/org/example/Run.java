package org.example;

import Models.Movie;

import javax.management.modelmbean.InvalidTargetObjectTypeException;
import java.util.Objects;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        Movie film1 = new Movie();
        film1.setTitle("Tytuł 1");
        film1.setBudget(1000);
        film1.setCategory('H');
        film1.setRating(15);
        film1.setMovieProzed(true);

        Movie film2 = new Movie();
        film2.setTitle("Tytuł 2");
        film2.setBudget(1100);
        film2.setCategory('H');
        film2.setRating(16);
        film2.setMovieProzed(true);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Jak masz na imię?");
        String imie = scanner.nextLine();

        if(Objects.equals(imie, "Donald"))
        {
            System.out.println("Spierdalaj");
            System.exit(1);

        } else if(!Objects.equals(imie, "Donald"))  {
            System.out.println("Witaj " +imie);
        }


        /*if(film1.getRating()>film2.getRating())
        {
            System.out.println("Film 1 ma większy rating");
        }
        else if (film1.getRating()<film2.getRating())
        {
            System.out.println("Film 2 ma większy rating \n" +
                    "lalala");
        }
        else if(film1.getRating()==film2.getRating())
            System.out.println("Filmy równe");*/
    }

}
