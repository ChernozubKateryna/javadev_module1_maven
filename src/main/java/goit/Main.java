package goit;

public class Main {
    public static void main(String[] args) {
        User user = new User("Kateryna", "Chernozub");

        Printer printer = new Printer();
        printer.printUserName(user);
    }
}
