package Dz1_JAVA2;

public class Dracula extends Exercise {

    String name;

    int maxSinkTheShipDistance;

    int maxShootDown_a_Plane;

    int maxStealThePrincess;

    boolean active;

    public Dracula(String name){
        this.name =name;
        this.maxShootDown_a_Plane =2000;
        this.maxSinkTheShipDistance = 2000;
        this.maxStealThePrincess =2000;
        this.active = true;
    }

    @Override
    public void sinkTheShip(int distance) {
        if (distance<= maxSinkTheShipDistance){
            System.out.println(name+" Успешно выполнил ипытание, затопил корабли.");
        }else {
            System.out.println(name+" Не смог потопить корабль.");
            active = false;
        }
    }

    @Override
    void shootDown_a_Plane(int distance) {
        if (distance<= maxShootDown_a_Plane){
            System.out.println(name+" Успешно выполнил ипытание, сбил самолёт.");
        }else {
            System.out.println(name+" Не смог сбить самолёт.");
            active = false;
        }
    }

    @Override
    void stealThePrincess(int distance) {
        if (distance<= maxStealThePrincess){
            System.out.println(name+" Успешно выполнил ипытание, спас принцессу.\n");
        }else {
            System.out.println(name+" Не смог спасти принцессу.\n");
            active = false;
        }
    }

    @Override
    public boolean onDistance() {
        return active;
    }
    @Override
    public void information(){System.out.println(name+" " + active);}
}