package com.company;
import java.util.Scanner;
public class Game {
    private Player goodGuy;
    private Scanner scanner;
    public Game(){
        System.out.println("Welcome to KDgames Wild West Game!!!!");
    scanner = new Scanner(System.in);
        System.out.println("What Would you like your name to be?: ");
        goodGuy = new Player(scanner.nextLine());
        System.out.println("Success!!! Your player's name is: "); //goodGuy.getName());
        System.out.println("Get ready to play");


    }
}
