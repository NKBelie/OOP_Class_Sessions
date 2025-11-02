import java.util.Scanner;
public class Character {
    public static void main(String[] args) {
        Scanner Scanner =new Scanner(System.in);
        System.out.println("Enter Any Character");
        char CharVar = Scanner.next().charAt(0);
        int ASCII =(int)CharVar;
        System.out.println("ASCII value =" +ASCII);
    }

}
