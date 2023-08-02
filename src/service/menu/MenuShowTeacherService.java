package service.menu;

import bean.Config;
import bean.Student;
import bean.Teacher;
import service.inter.menu.MenuShowTeachersServiceInter;

public class MenuShowTeacherService implements MenuShowTeachersServiceInter {
    @Override
    public void processLogic() {
        Teacher[] allTeachers = Config.instance().getTeachers();
        for (int i = 0; i< allTeachers.length;i++)
        {
            System.out.println(allTeachers[i]);
        }
    }
}
