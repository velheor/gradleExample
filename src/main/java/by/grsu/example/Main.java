package by.grsu.example;

public class Main {
    public static void main(String[] argv) {
        Sum sum = new Sum();
        View view = new View();
        view.showInConsole(sum.sum(2, 3));
    }
}