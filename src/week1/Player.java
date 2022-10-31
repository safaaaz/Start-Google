package week1;

import java.util.Random;

public class Player {
    String name;
    int jerseyNumber;
    int grade;
    positions position;

    public Player(String name, int jerseyNumber, int grade, positions position) {
        this.name = name;
        this.jerseyNumber = jerseyNumber;
        this.grade = grade;
        this.position = position;
    }

    public static Player newPlayerWithRandomPosition(String name, int jerseyNumber, int grade){
        int pick = new Random().nextInt(positions.values().length);
        return new Player(name,jerseyNumber,grade,positions.values()[pick]);
    }

    public static Player newPlayerWithRandomGrade(String name, int jerseyNumber,positions position){
        int grade = new Random().nextInt(50);
        return new Player(name,jerseyNumber,grade,position);
    }

    public static Player newPlayerWithoutPosition(String name, int jerseyNumber,int grade){
        return new Player(name,jerseyNumber,grade,null);
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", jerseyNumber=" + jerseyNumber +
                ", grade=" + grade +
                ", position=" + position +
                '}';
    }
}
