package com.company;

//import com.company.db.persistence.ItemRepository;

import java.util.List;
import java.util.Scanner;

import static com.company.DeleteElements.deleteElement;
import static com.company.Displaying.display;
import static com.company.FindElements.findElement;

public class Main {

    public static void main(String[] args) {
        System.out.println("-----STARTING------");
        display();
        //new ItemRepository().list().forEach(System.out::println);

    }
}
