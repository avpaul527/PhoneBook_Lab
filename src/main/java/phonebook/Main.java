package phonebook;

public class Main {
    public static void main(String[] args) {

        PhoneBook phonebook = new PhoneBook();

        phonebook.add("Alexandria", "123-456-7890");
        phonebook.addAll("Paul", "100-200-3000", "400-500-6000");
        phonebook.add("Bug", "616-616-6161");


        phonebook.remove("Bug");

        System.out.println("Entry for Alexandria?" + phonebook.hasEntry("Alexandria"));
        System.out.println("Entry for Paul?" + phonebook.hasEntry("Paul"));
        System.out.println("Entry for Bug?" + phonebook.hasEntry("Bug"));

        System.out.println(" ");


        System.out.println("Contact: Alexandria -> " + phonebook.lookup("Alexandria"));
        System.out.println("Contact: Paul -> " + phonebook.lookup("Paul"));
        System.out.println(" ");
        System.out.println("(123)456-7890  ->  " + phonebook.reverseLookup("123-456-7890"));

        System.out.println(" ");

        System.out.println("Contacts: \n" + phonebook.getAllContactNames());




    }
}
