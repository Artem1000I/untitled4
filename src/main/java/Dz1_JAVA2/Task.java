package Dz1_JAVA2;

public abstract class Task {

    public abstract void passing(Exercise exercise);
}


class TaskOne extends Task{
    int height;
    public TaskOne(int height){ this.height = height;}
    @Override
    public void passing(Exercise exercise) {
        exercise.sinkTheShip(height);
    }
}

class TaskTwo extends Task{
    int height;
    public TaskTwo(int height){ this.height = height;}
    @Override
    public void passing(Exercise exercise) {
        exercise.shootDown_a_Plane(height);
    }
}

class TaskThree extends Task{
    int height;
    public TaskThree(int height){ this.height = height;}
    @Override
    public void passing(Exercise exercise) {
        exercise.stealThePrincess(height);
    }
}
class MainCourse {
    public static void main(String[] args){
        Exercise[] exercises ={new Dracula("Dracula"),new Hydra("Hydra"),new Kong("Kong") };
        Task[] tasks = {new TaskOne(1500),new TaskTwo(1700),new TaskThree(1555)};


        for (Exercise c : exercises){
            for (Task b: tasks){
                b.passing(c);
                if (!c.onDistance()){
                    break;
                }
            }
        }
        for (Exercise c: exercises){
            c.information();
        }
    }
}
