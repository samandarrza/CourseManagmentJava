package service.menu;

import bean.Config;
import bean.Student;
import bean.Teacher;
import service.SaveableProcess;
import service.inter.menu.MenuAddTeacherServiceInter;
import service.inter.menu.MenuShowTeachersServiceInter;

import java.util.Scanner;

public class MenuAddTeacherService implements MenuAddTeacherServiceInter {
    @Override
    public void processLogic()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter your surname: ");
        String surname = scanner.nextLine();

        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setSurname(surname);

        Config.instance().appendTeacher(teacher);
    }
}
