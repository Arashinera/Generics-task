package app.service;

import app.entity.Client;

import java.util.Scanner;
import java.util.Locale;

public class InfoService01 {

    Scanner scanner;
    String name;
    String email;

    public String getData() {
       return formData(getInputs());
    }

    private Client<String, String> getInputs() {
        scanner = new Scanner(System.in);
        scanner.useLocale(Locale.ENGLISH);
        System.out.print("Enter client's name: ");
        name = scanner.nextLine();
        System.out.print("Enter client's email: ");
        email = scanner.nextLine();
        return new Client<>(name, email);
    }

    private String formData(Client<String, String> client) {
        return "Client's name is " + client.getKey() +
                ", email is " + client.getValue();
    }

}
