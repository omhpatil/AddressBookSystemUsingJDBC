package com.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = AddressBook.getInstance(); // Get Singleton instance
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Address Book Menu:");
            System.out.println("1. Add New Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Edit Contacts");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addContact(scanner, addressBook);
                    break;
                case 2:
                    addressBook.viewContacts();
                    break;
                case 3:
                    editContact(scanner, addressBook);
                    break;
                case 4:
                    deleteContact(scanner, addressBook);
                    break;
                case 5:
                    exit = true;
                    System.out.println("Exiting Address Book!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void addContact(Scanner scanner, AddressBook addressBook) {
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter City: ");
        String city = scanner.nextLine();

        System.out.print("Enter State: ");
        String state = scanner.nextLine();

        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter Phone Number: ");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Enter Pin Code: ");
        int pinCode = scanner.nextInt();
        scanner.nextLine();

        Contact contact = new Contact(firstName, lastName, city, state, email, phoneNumber, pinCode);
        addressBook.addContact(contact);
    }

    private static void editContact(Scanner scanner, AddressBook addressBook) {
        System.out.print("Enter First Name of the contact to edit: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name of the contact to edit: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter New City: ");
        String city = scanner.nextLine();

        System.out.print("Enter New State: ");
        String state = scanner.nextLine();

        System.out.print("Enter New Email: ");
        String email = scanner.nextLine();

        System.out.print("Enter New Phone Number: ");
        long phoneNumber = scanner.nextLong();
        scanner.nextLine();

        System.out.print("Enter New Pin Code: ");
        int pinCode = scanner.nextInt();
        scanner.nextLine();

        Contact contact = new Contact(firstName, lastName, city, state, email, phoneNumber, pinCode);
        addressBook.editContacts(contact);
    }


    private static void deleteContact(Scanner scanner, AddressBook addressBook) {
        System.out.print("Enter First Name to delete: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name to delete: ");
        String lastName = scanner.nextLine();

        boolean isDeleted = addressBook.deleteContactByName(firstName, lastName);
        if (isDeleted) {
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Contact not found!");
        }
    }
}
