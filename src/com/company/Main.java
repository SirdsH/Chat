package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            BufferedReader br = new BufferedReader(new FileReader("chat.txt"));
            BufferedWriter myWriter = new BufferedWriter(new FileWriter("chat.txt"));
            System.out.println("Zadej jméno:");
            String nameone = sc.nextLine();
            myWriter.write(nameone);
            myWriter.newLine();
            String content = "";
            String nextLine = br.readLine();
            while (nextLine != null){
                content += nextLine;
                nextLine = br.readLine();
            }
            System.out.println(br.readLine());
            for ( ; ; ) {
                myWriter.write(sc.nextLine());
                myWriter.newLine();
                myWriter.close();
            }
        } catch (IOException e) {
        }
    }
}