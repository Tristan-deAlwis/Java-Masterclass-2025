package src;

import java.util.ArrayList;
import java.util.List;

public class Section12Generics {
    public static void main(String[] args) {
        System.out.println("Section 11: Abstraction in Java");

        lesson165();
//        lesson166();
//        lesson167();
//        lesson168();
//        lesson169();
//        lesson170();
//        lesson171();
//        lesson172();
//        lesson173();
//        lesson174();
//        lesson175();
    }

    private static void lesson165() {
        System.out.println("Lesson 165: Generics Part 1\n");

        BaseballTeam phillies = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros = new BaseballTeam("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        phillies.listTeamMembers();

        System.out.println();
    }

    record BaseballPlayer(String name, String position){};

    public static class BaseballTeam {
        private String teamName;
        private List<BaseballPlayer> teamMembers = new ArrayList<>();
        private int totalWins = 0;
        private int totalLosses = 0;
        private int totalTies = 0;

        public BaseballTeam(String teamName) {
            this.teamName = teamName;
        }

        public void addTeamMember(BaseballPlayer player) {
            if (!teamMembers.contains(player)) {
                teamMembers.add(player);
            }
        }

        public void listTeamMembers() {
            System.out.println(teamName + " Roster:");
            System.out.println(teamMembers);
        }

        public int ranking() {
            return (totalLosses * 2) + totalTies + 1;
        }

        public String setScore(int ourScore, int theirScore) {
            String message = "lost to";
            if (ourScore > theirScore) {
                totalWins++;
                message = "beat";
            } else if (ourScore == theirScore) {
                totalTies++;
                message = "tied";
            } else {
                totalLosses++;
            }
            return message;
        }

        @Override
        public String toString() {
            return teamName + " Ranked " + ranking() + ")";
        }
    }

    public static void scoreResult(BaseballTeam team1, int t1_score,
                                   BaseballTeam team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    private static void lesson166() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }

    private static void lesson167() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }

    private static void lesson168() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }

    private static void lesson169() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }

    private static void lesson170() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }

    private static void lesson171() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }

    private static void lesson172() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }

    private static void lesson173() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }

    private static void lesson174() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }

    private static void lesson175() {
        System.out.println("Lesson xx: XX\n");
        System.out.println();
    }
}
