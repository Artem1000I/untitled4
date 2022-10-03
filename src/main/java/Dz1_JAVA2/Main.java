package Dz1_JAVA2;

public class Main {
    public static void main(String[] args){
        Courses c = new Courses(new TaskOne(3000), new TaskTwo(1000), new TaskThree (1000)); // Создаем полосу препятствий
        Team team= new Team("Monsters",new Dracula("Дракула"),new Hydra("Горыныч"),new Kong("Кинконг"));  // Создаем команду
        c.passing(team); // Просим команду пройти полосу

        System.out.println("\nПрошли испытания:");
        team.passedObstacles();

        System.out.println("\nРезультаты всех участниках:");// Показываем результаты
        team.nfoTeam();

    }
}