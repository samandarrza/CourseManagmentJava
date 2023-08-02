package util;

import bean.Config;
import service.Process;
import service.menu.*;

public enum Menu {
    LOGIN(1,"1.Login", new MenuLoginService()),
    REGISTER(2,"2.Register", new MenuRegisterService()),
    ADD_STUDENT(3,"3.Add Student", new MenuAddStudentService()),
    ADD_TEACHER(4,"4.Add Teacher", new MenuAddTeacherService()),
    SHOW_ALL_STUDENT(5,"5.Show All Student", new MenuShowStudentService()),
    SHOW_ALL_TEACHER(6,"6.Show All Teacher", new MenuShowTeacherService()),
    UNKNOWN;

    private int number;
    private String label;
    private Process service;


    Menu()
    {

    }
  Menu(int number, String label, Process service) {
      this.number = number;
      this.label = label;
      this.service = service;
  }

    public String getLabel() {
        return number + "." + label;
    }

    public int getNumber() {
        return this.number;
    }

    @Override
    public String toString() {
        return label;
    }

    public void process()
    {
        service.process();
        MenuUtil.showMenu();
    }
    public static Menu find(int number)
    {
        Menu[] menu = Menu.values();
        for(int i=0;i<menu.length;i++)
        {
            if(menu[i].getNumber() == number)
            {
                return menu[i];
            }
        }

        return Menu.UNKNOWN;
    }

    public static void showAllMenu()
    {
        Menu[] menu = Menu.values();
        for(int i=0;i<menu.length;i++)
        {
            if(menu[i]!=Menu.UNKNOWN) {
                if(menu[i] == LOGIN || menu[i] == REGISTER)
                {
                    if (!Config.isLoggedIn()) {
                        System.out.println(menu[i]);
                    }
                } else if (Config.isLoggedIn()) {
                    System.out.println(menu[i]);
                }

            }
        }
    }



}

