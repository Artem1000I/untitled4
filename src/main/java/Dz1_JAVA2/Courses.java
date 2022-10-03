package Dz1_JAVA2;

//Добавить класс Course (полоса препятствий), в котором будут находиться: массив препятствий, метод который будет просить команду пройти всю полосу;
public class Courses {
    Task[] course = new Task[3];

    // Создаём полосу препятствий

    public  Courses(Task b1,Task b2, Task b3){
        course[0] = b1;
        course[1] = b2;
        course[2] = b3;

    }

    // Метод, который просит всю команду пройти полосу препятствий

    public void passing (Team t){
        System.out.println("\nTeam \"" + t.nameTeam +"\":\n");

        for (Exercise competitor: t.getNameTeam())
            for (Task b : course) {
                b.passing(competitor);
            }
    }

}