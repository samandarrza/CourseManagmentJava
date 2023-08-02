package util;

import java.util.Scanner;

public class MenuUtil {
    public static void showMenu() {
        System.out.println("Please select menu");
        Menu.showAllMenu();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                int selectedMenuNumber = scanner.nextInt();
                Menu selectedMenu = Menu.find(selectedMenuNumber);
                selectedMenu.process();
            } catch (Exception ex) {
                System.out.println("Invalid input. You must enter a number.");
                scanner.nextLine();
            }
        }
    }
    public static void processMenu(Menu menu)
    {
        menu.process();
    }
}
