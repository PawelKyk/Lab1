import java.util.Scanner;
public class Load {
    public static void main(String[ ] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wprowadz imie studenta: ");
        String imie = scanner.nextLine();
        System.out.print("Wprowadz nazwisko studenta: ");
        String nazwisko = scanner.nextLine();
        System.out.print("Wprowadz date urodzenia studenta: ");
        String data = scanner.nextLine();
        System.out.print("Wprowadz miejsce urgitodzenia studenta: ");
        String miejsce = scanner.nextLine();
        System.out.print("Wprowadz nr indeksu studenta: ");
        String indeks = scanner.nextLine();
        System.out.print("Wprowadz nr PESEL studenta: ");
        String pesel = scanner.nextLine();

        System.out.println("Imie i nazwissko studenta: " + imie + " " + nazwisko);
        System.out.println("Data i miejsce urodzenia studenta: " + data + " " + miejsce);
        System.out.println("Nr indeksu studenta: " + indeks);
        System.out.println("Nr PESEL studenta: " + pesel);

        scanner.close();
    }

}