package Aggregation;

class Team{
    private String teamName;
    private String city;
    private String sportType;

    public Team(String teamName, String city, String sportType){
        this.teamName = teamName;
        this.city = city;
        this.sportType = sportType;
    }

    public String getTeamName(){
        return teamName;
    }

    public String getSportType(){
        return sportType;
    }

    public String getCity(){
        return city;
    }

    public void displayTeamDetails() {
        System.out.println("Team Name: " + teamName);
        System.out.println("Sport Type: " + sportType);
        System.out.println("City: " + city);
    }
}

class Player{
    private String name;
    private int age;
    private  String role;
    private String nationality;
    private Team team;

    public Player(String name, int age, String role, String nationality, Team team){
        this.name = name;
        this.age = age;
        this.role = role;
        this.nationality = nationality;
        this.team = team;
    }

    public void displayPlayerDetails() {
        System.out.println("Player Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
        System.out.println("Nationality: " + nationality);
        System.out.println("Team: " + team.getTeamName() + " (" + team.getCity() + ")");
        System.out.println();
    }
}
public class MainTeamPlayers {
    public static void main(String[] args) {
        Team team = new Team("Mumbai Indians", "Cricket", "Mumbai");

        // Create Player objects and associate them with the Team
        Player player1 = new Player("Rohit Sharma", 35, "Batsman", "Indian", team);
        Player player2 = new Player("Jasprit Bumrah", 29, "Bowler", "Indian", team);
        Player player3 = new Player("Hardik Pandya", 30, "All-rounder", "Indian", team);

        // Display team details
        System.out.println("Team Details:");
        team.displayTeamDetails();
        System.out.println();

        // Display individual player details
        System.out.println("Player Details:");
        player1.displayPlayerDetails();
        player2.displayPlayerDetails();
        player3.displayPlayerDetails();
    }
}
