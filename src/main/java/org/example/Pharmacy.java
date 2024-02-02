package org.example;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    Map<String, Medication> medications = new HashMap<>();

    public int getCount() {
        return medications.size();
    }

    public void save(Medication medication) {
        medications.put(medication.getName(), medication);
    }

    public Medication find(String medicationName) {
        if (medications.containsKey(medicationName)) {
            return medications.get(medicationName);
        }
        System.out.println("Medication not found");
        return null;
    }

    public void delete(String medicationName) {
        if (medications.containsKey(medicationName)) {
            medications.remove(medicationName);
            System.out.println("Medication " + medicationName + " deleted");
        }
    }

    public void printAll() {
        for (Map.Entry<String, Medication> entry : medications.entrySet()) {
            Medication medication = entry.getValue();
            System.out.println("Name: " + medication.getName() +
                    ", Price: " + medication.getPrice() +
                    ", Availability: " + medication.getAvailability());
        }
    }


}
