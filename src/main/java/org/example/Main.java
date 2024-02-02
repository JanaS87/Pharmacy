package org.example;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();
        Medication medication1 = new Medication("Paracetamol", 5.5, true);
        Medication medication2 = new Medication("Ibuprofen", 7.5, false);

        pharmacy.save(medication1);
        pharmacy.save(medication2);

        pharmacy.printAll();
    }
}