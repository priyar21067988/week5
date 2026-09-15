import java.util.Arrays;

class Team {
    // final keyword
    final int teamId;

    // instance variables
    String teamName;
    int score;

    // static variable
    static int teamCount = 0;

    // Default constructor
    Team() {
        this(0, "Unknown", 0);   // this() constructor chaining
    }

    // Parameterized constructor
    Team(int teamId, String teamName, int score) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.score = score;
        teamCount++;
    }

    // Constructor overloading
    Team(int teamId, String teamName) {
        this(teamId, teamName, 0);
    }

    // this keyword usage
    void display() {
        System.out.println("Team ID: " + this.teamId);
        System.out.println("Team Name: " + this.teamName);
        System.out.println("Score: " + this.score);
    }

    // static method
    static void showTeamCount() {
        System.out.println("Total teams: " + teamCount);
    }
}

public class Main {

    // Modifies the original array directly
    static void curveScores(int[] scores, int bonus) {
        for (int i = 0; i < scores.length; i++) {
            scores[i] += bonus;
        }
    }

    public static void main(String[] args) {

        // Default constructor
        Team team1 = new Team();

        // Parameterized constructor
        Team team2 = new Team(101, "Alpha", 80);

        // Overloaded constructor
        Team team3 = new Team(102, "Beta");

        // this keyword
        team2.display();

        // static usage
        Team.showTeamCount();

        // instanceof type checking
        if (team2 instanceof Team) {
            System.out.println("team2 is an instance of Team");
        }

        // Hackathon Score Curve Booster
        int[] scores = {70, 85, 60};

        curveScores(scores, 10);

        // Print using Arrays.toString()
        System.out.println(Arrays.toString(scores));
    }
}
