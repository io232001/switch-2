package it.develhope.switchstatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Start
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (true) {
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();
            switch (input) {
                case "size":
                    System.out.println("Size: " + list.size());
                    break;
                case "clear":
                    list.clear();
                    System.out.println("Cleared ");
                    break;
                case "print":
                    System.out.println("Contents ");
                    for (String strings : list)
                    {
                        System.out.println(strings);
                    }
                    break;
                default:
                    list.add(input);
                    break;
            }
        }
    }
}




