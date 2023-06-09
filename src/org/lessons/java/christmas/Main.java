package org.lessons.java.christmas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        ArrayList<String> giftList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        String choice = "yes";
        while (choice.equalsIgnoreCase("yes")) {
            System.out.print("Inserisci il nome del regalo: ");
            String gift = scanner.nextLine();
            giftList.add(gift);

            System.out.println("Lunghezza della lista: " + giftList.size());
            System.out.print("Vuoi aggiungere un altro regalo? (yes/no): ");
            choice = scanner.nextLine();
        }

        Collections.sort(giftList);

        System.out.println("Lista regali ordinata:");
        for (String gift : giftList) {
            System.out.println(gift);
        }
    }

}
