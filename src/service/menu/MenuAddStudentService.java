package service.menu;

import bean.Config;
import bean.Student;
import service.SaveableProcess;
import service.inter.menu.MenuAddStudentServiceInter;
import service.inter.menu.MenuShowStudentsServiceInter;

import java.util.Scanner;

public class MenuAddStudentService implements MenuShowStudentsServiceInter {
    @Override
    public void processLogic()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter your surname: ");
        String surname = scanner.nextLine();

        Student student = new Student();
        student.setName(name);
        student.setSurname(surname);

        Config.instance().appendStudent(student);
    }
}
