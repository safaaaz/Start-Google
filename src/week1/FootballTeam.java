package week1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

import static sun.audio.AudioPlayer.player;


public class FootballTeam {
    String name;
    Collection<Player> team;
    static NameGenerator namesSet;
    public static void main(String[] args) {
        //FootballTeam team1 = new FootballTeam("team");
        //team1.addPlayer(positions.Attacker);
        //System.out.println(team1);
        FootballTeam team2 = newTeam(1,4,4,2);
        namesSet = new NameGenerator(Arrays.asList("israa","ahmed"));
        team2.writeDataToFile();
    }

    public static FootballTeam addPlayersByCount(FootballTeam team,positions position,int count){
        for (int i = 0; i < count; i++) {
            team.addPlayer(position);
        }
        return team;
    }
    public static FootballTeam newTeam(int gk,int defense,int middlefiled,int attack){
        if(gk!=1 || defense<2 ||middlefiled<2 || attack<2){
            System.out.println("The team should have one goal keeper and at least two from other positions");
            return null;
        }
        FootballTeam team1 = new FootballTeam("team1");
        List<Integer> positionscount = Arrays.asList(gk,defense,middlefiled,attack);
        for (int i = 0; i < 4; i++) {
            team1 = addPlayersByCount(team1,positions.values()[i],positionscount.get(i));
        }
        namesSet=new NameGenerator(Arrays.asList("safaa","dalya","saja"));
        return team1;
    }
    private FootballTeam(String name) {
        this.name=name;
        this.team = new ArrayList<>();
    }

    public void addPlayer(positions position){
        if(team.size()>=11){
            System.out.println("The team is full:( (have 11 players already)");
            return;
        }
        if(position==positions.GoalKeeper)
            for (Player p:team
                 ) {
                if(p.position==position){
                    System.out.println("There is alredy goal keeper in the team");
                    return;
                }
            }
        boolean isunique = false;
        int playerJersey=0;
        while (!isunique){
            playerJersey = new Random().nextInt(50);
            int i=0;
            for (Player p:team) {
                if(p.grade==playerJersey){ break; }
                i++;
            }
            if(i==team.size())
                isunique=true;
        }

        int playerGrade = new Random().nextInt(100);
        int pick = new Random().nextInt(Arrays.asList(namesSet.getNames()).size());
        String playerName= String.valueOf(Arrays.asList(namesSet.getNames()).get(pick));
        team.add(new Player(playerName,playerJersey,playerGrade,position));
        System.out.println("The player added successfully:)");
    }

    public boolean isTeamCompleted(){
        Map<positions, Integer> positionCount = new HashMap<>();
        for (positions pos:positions.values()
        ) {
            positionCount.put(pos,0);
        }
        for (Player p:team
        ) {
            positionCount.put(p.position, positionCount.get(p.position) + 1);
        }
        for (Map.Entry<positions, Integer> entry : positionCount.entrySet()) {
            if(entry.getValue()<2 && entry.getKey()!=positions.GoalKeeper)
                return false;
            if(entry.getKey()==positions.GoalKeeper && entry.getValue()!=1)
                return false;
        }
        if(team.size()!=11)
            return false;
        return true;
    }
    public void writeDataToFile(){
        try(FileWriter myWriter = new FileWriter("TeamData.txt");) {
            myWriter.write(this.toString());
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "FootballTeam{" +
                "name='" + name + '\'' +
                ", team=" + team +
                '}';
    }
}
