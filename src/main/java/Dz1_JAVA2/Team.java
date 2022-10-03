package Dz1_JAVA2;

public class Team {

    String nameTeam;

    Exercise[] lineUp = new  Exercise[3];
    FantasticBeasts[] monsters ={new Hydra("Cunning"), new Kong("King")};

    //Формируем команду
    public Team(String nameTeam, Exercise team1,Exercise team2,Exercise team3){
        this.nameTeam = nameTeam;

        lineUp[0] = team1;
        lineUp[1] = team2;
        lineUp[2] = team3;
    }

    //Вывод информации о членах команды
    public void nfoTeam() {
        for (Exercise competitor : lineUp){
            competitor.information();
        }
    }

    //Вывод информации кто прошел дистанцию

    public void passedObstacles(){
        for (Exercise competitor : lineUp){
            if (competitor.onDistance()){ // Если участник onDistance == true, выводим его
                competitor.information();
            }
        }
    }

    //геттер участников команды


    public Exercise[] getNameTeam() {return lineUp;}

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }
}
