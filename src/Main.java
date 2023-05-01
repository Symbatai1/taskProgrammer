import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Programmer programmer = new Programmer(scan.nextLine(), scan.nextLine(), scan.nextInt());
        programmer.getBirthYear();
        System.out.println(programmer.name + "\n" + programmer.surname + "\n" + programmer.age);

        Scanner scan1 = new Scanner(System.in);
        Programmer programmer2 = new Programmer(scan1.nextLine(), scan1.nextLine(), scan1.nextInt());
        programmer2.getBirthYear();
        System.out.println(programmer2.name + "\n" + programmer2.surname + "\n" + programmer2.age);

    }
}