package Dz1_JAVA2;

public class FantasticBeasts extends Exercise {

    String type;
    String name;

    int maxSinkTheShipDistance;
    int maxShootDown_a_Plane;
    int maxStealThePrincess;

    boolean onDistance;

    public FantasticBeasts(String type,String name,int maxSinkTheShipDistance,int maxShootDown_a_Plane, int maxStealThePrincess){
        this.type =type;
        this.name = name;
        this.maxSinkTheShipDistance = maxSinkTheShipDistance;
        this.maxShootDown_a_Plane = maxShootDown_a_Plane;
        this.maxStealThePrincess = maxStealThePrincess;
        this.onDistance = true;
    }

    public void sinkTheShip(int distance){
        if (distance<= maxSinkTheShipDistance){
            System.out.println(type+" "+ name+" Успешно выполнил ипытание, затопил корабли.");
        }else {
            System.out.println(type+" "+ name + " Не смог потопить корабль.");
            onDistance = false;
        }
    }

    public void shootDown_a_Plane(int distance){
        if (distance<= maxShootDown_a_Plane){
            System.out.println(type+" "+ name+" Успешно выполнил ипытание, сбил самолёт.");
        }else {
            System.out.println(type+" "+ name + " Не смог сбить самолёт.");
            onDistance = false;
        }
    }

    public void stealThePrincess(int distance){
        if (distance<= maxStealThePrincess){
            System.out.println(type+" "+ name+" Успешно выполнил ипытание, спас принцессу.\n");
        }else {
            System.out.println(type+" "+ name + " Не смог спасти принцессу.\n");
            onDistance = false;
        }
    }

    public boolean onDistance(){return  onDistance;}

    @Override
    public void information(){System.out.println(type+" "+ name+ " "+ onDistance);}



}