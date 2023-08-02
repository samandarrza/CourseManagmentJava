package service.menu;

import bean.Config;
import service.inter.menu.MenuLoginServiceInter;

import java.util.Scanner;

public class MenuLoginService implements MenuLoginServiceInter {
    @Override
    public void processLogic() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your username: ");
        String username = scanner.nextLine();
        System.out.println("Please enter your password: ");
        String password = scanner.nextLine();

        if(!username.equals("Semender") && !password.equals("123456"))
        {
            throw new IllegalArgumentException("Username or password is invalid");
        }

        Config.setLoggedIn(true);

    }
}
