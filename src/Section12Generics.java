package src;

import java.util.*;

public class Section12Generics {
    public static void main(String[] args) {
        System.out.println("Section 11: Abstraction in Java");

        lesson165();
        lesson166();
        lesson167();
        lesson168();
        lesson169();
        lesson170();
        lesson171();
        lesson172();
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

    record BaseballPlayer(String name, String position) implements Player {};

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
            return teamName + " (Ranked "  + ranking() + ")";
        }
    }

    public static void scoreResult(BaseballTeam team1, int t1_score,
                                   BaseballTeam team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportsTeam team1, int t1_score,
                                   SportsTeam team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1_score,
                                   Team team2, int t2_score) {

        String message = team1.setScore(t1_score, t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    private static void lesson166() {
        System.out.println("Lesson 166: Generics Part 2\n");

        var philly = new Affiliation("city", "Philadelphia, PA",
                "US");

        BaseballTeam phillies1 = new BaseballTeam("Philadelphia Phillies");
        BaseballTeam astros1 = new BaseballTeam("Houston Astros");
        scoreResult(phillies1, 3, astros1, 5);

        SportsTeam phillies2 = new SportsTeam("Philadelphia Phillies");
        SportsTeam astros2 = new SportsTeam("Houston Astros");
        scoreResult(phillies2, 3, astros2, 5);

        Team<BaseballPlayer, Affiliation> phillies =
                new Team<>("Philadelphia Phillies", philly);
        Team<BaseballPlayer, Affiliation> astros = new Team<>("Houston Astros");
        scoreResult(phillies, 3, astros, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        phillies.addTeamMember(harper);
        phillies.addTeamMember(marsh);
        var guthrie = new BaseballPlayer("D Guthrie", "Center Fielder");
        phillies.addTeamMember(guthrie);
        phillies.listTeamMembers();

        SportsTeam afc1 = new SportsTeam ("Adelaide Crows");
        Team<FootballPlayer, String> afc = new Team<>("Adelaide Crows",
                "City of Adelaide, South Australia, in AU");
        var tex = new FootballPlayer("Tex Walker" , "Centre half forward");
        afc.addTeamMember(tex);
        var rory = new FootballPlayer("Rory Laird", "Midfield");
        afc.addTeamMember(rory);
        afc.listTeamMembers();

        Team<VolleyballPlayer, Affiliation> adelaide = new Team<>("Adelaide Storm");
        adelaide.addTeamMember(new VolleyballPlayer("N Roberts", "Setter"));
        adelaide.listTeamMembers();

        var canberra = new Team<VolleyballPlayer, Affiliation>("Canberra Heat");
        canberra.addTeamMember(new VolleyballPlayer("B Black", "Opposite"));
        canberra.listTeamMembers();
        scoreResult(canberra, 0, adelaide, 1);

        System.out.println();
    }

    interface Player {

        String name();
    }

    record FootballPlayer(String name, String position) implements Player {}

    public static class Team<T extends Player, S> {

        private String teamName;
        private List<T> teamMembers = new ArrayList<>();
        private int totalWins = 0;
        private int totalLosses = 0;
        private int totalTies = 0;
        private S affiliation;

        public Team(String teamName) {
            this.teamName = teamName;
        }

        public Team(String teamName, S affiliation) {
            this.teamName = teamName;
            this.affiliation = affiliation;
        }

        public void addTeamMember(T t) {

            if (!teamMembers.contains(t)) {
                teamMembers.add(t);
            }
        }

        public void listTeamMembers() {

            System.out.print(teamName + " Roster:");
            System.out.println((affiliation == null ? "" : " AFFILIATION: "+ affiliation));
            for (T t : teamMembers) {
                System.out.println(t.name());
            }
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
            return teamName + " (Ranked "  + ranking() + ")";
        }
    }

    public static class SportsTeam {

        private String teamName;
        private List<Player> teamMembers = new ArrayList<>();
        private int totalWins = 0;
        private int totalLosses = 0;
        private int totalTies = 0;

        public SportsTeam(String teamName) {
            this.teamName = teamName;
        }

        public void addTeamMember(Player player) {

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
            return teamName + " (Ranked "  + ranking() + ")";
        }
    }

    private static void lesson167() {
        System.out.println("Lesson 167: Generics Part 3\n");

        Team<VolleyballPlayer, Affiliation> adelaide = new Team<>("Adelaide Storm");
        adelaide.addTeamMember(new VolleyballPlayer("N Roberts", "Setter"));
        adelaide.listTeamMembers();

        var canberra = new Team<VolleyballPlayer, Affiliation>("Canberra Heat");
        canberra.addTeamMember(new VolleyballPlayer("B Black", "Opposite"));
        canberra.listTeamMembers();
        scoreResult(canberra, 0, adelaide, 1);

        System.out.println();
    }

    record VolleyballPlayer(String name, String position) implements Player {}

    record Affiliation(String name, String type, String countryCode) {

        @Override
        public String toString() {
            return name + " (" + type + " in " + countryCode + ")";
        }
    }

    private static void lesson168() {
        System.out.println("Lesson 168: Generic Class Challenge\n");
        System.out.println();
    }

    public interface Mappable {

        void render();

        static double[] stringToLatLon(String location) {

            var splits = location.split(",");
            double lat = Double.valueOf(splits[0]);
            double lng = Double.valueOf(splits[1]);
            return new double[]{lat, lng};
        }
    }

    abstract static class Point implements Mappable {

        private double[] location = new double[2];

        public Point(String location) {
            this.location = Mappable.stringToLatLon(location);
        }

        @Override
        public void render() {

            System.out.println("Render " + this + " as POINT (" + location() + ")");
        }

        private String location() {
            return Arrays.toString(location);
        }
    }


    abstract static class Line implements Mappable {

        private double[][] locations;

        public Line(String... locations) {
            this.locations = new double[locations.length][];
            int index = 0;
            for (var l : locations) {
                this.locations[index++] = Mappable.stringToLatLon(l);
            }
        }

        @Override
        public void render() {
            System.out.println("Render " + this + " as LINE (" + locations() + ")");
        }

        private String locations() {
            return Arrays.deepToString(locations);
        }
    }

    private static void lesson169() {
        System.out.println("Lesson 169: Generic Class Challenge, Part 2\n");
        var nationalUSParks = new Park[]{
                new Park("Yellowstone", "44.4882, -110.5916"),
                new Park("Grand Canyon", "36.1085, -112.0965"),
                new Park("Yosemite", "37.8855, -119.5360")
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorUSRivers = new River[]{
                new River("Mississippi",
                        "47.2160, -95.2348", "29.1566, -89.2495",
                        "35.1556, -90.0659"),
                new River("Missouri",
                        "45.9239, -111.4983", "38.8146, -90.1218")
        };

        Layer<River> riverLayer = new Layer<>(majorUSRivers);

        riverLayer.addElements(
                new River("Colorado",
                        "40.4708, -105.8286", "31.7811, -114.7724"),
                new River("Delaware",
                        "42.2026, -75.00836", "39.4955, -75.5592"));

        riverLayer.renderLayer();

        System.out.println();
    }

    public static class Layer <T extends Mappable> {

        private List<T> layerElements;

        public Layer(T[] layerElements) {
            this.layerElements = new ArrayList<T>(List.of(layerElements));
        }

        public void addElements(T... elements) {
            layerElements.addAll(List.of(elements));
        }

        public void renderLayer() {

            for (T element : layerElements) {
                element.render();
            }
        }
    }

    public static class River extends Line {

        private String name;

        public River(String name, String... locations) {
            super(locations);
            this.name = name;
        }

        @Override
        public String toString() {
            return name + " River";
        }
    }

    public static class Park extends Point {

        private String name;

        public Park(String name, String location) {
            super(location);
            this.name = name;
        }

        @Override
        public String toString() {
            return name + " National Park";
        }
    }

    private static void lesson170() {
        System.out.println("Lesson 170: Comparable Revisited: Sorting Objects by Natural Order\n");

        Integer five = 5;
        Integer[] others = {0, 5, 10, -50, 50};

        for (Integer i : others) {
            int val = five.compareTo(i);
            System.out.printf("%d %s %d: compareTo=%d%n", five, (val == 0 ? "==" : (val <0) ? "<" : ">"), i, val);
        }

        String banana = "banana";
        String[] fruit = {"apple", "banana", "pear", "BANANA"};

        for (String s : fruit) {
            int val = banana.compareTo(s);
            System.out.printf("%s %s %s: compareTo=%d%n", banana, (val == 0 ? "==" : (val <0) ? "<" : ">"), s, val);
        }

        Arrays.sort(fruit);
        System.out.println(Arrays.toString(fruit));

        System.out.println("A:"+(int)'A' + " " + "a:"+(int)'a');
        System.out.println("B:"+(int)'B' + " " + "b:"+(int)'b');
        System.out.println("P:"+(int)'P' + " " + "p:"+(int)'p');

        Student tim = new Student ("Tim");
        Student [] students = {new Student("Zach"), new Student("Tim"),
                new Student("Ann")};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

//        System.out.println("result = " + tim.compareTo("Mary"));

        System.out.println();
    }

    public static class StudentGPAComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            return (o1.gpa + o1.name).compareTo(o2.gpa + o2.name);
        }
    }

    public static class Student implements Comparable<Student> {

        private static int LAST_ID = 1000;
        private static Random random = new Random();

        String name;
        private int id;
        protected double gpa;

        public Student(String name) {
            this.name = name;
            id = LAST_ID++;
            gpa = random.nextDouble(1.0, 4.0);
        }

        @Override
        public String toString() {
            return "%d - %s (%.2f)".formatted(id, name, gpa);
        }

        @Override
        public int compareTo(Student o) {
            return Integer.valueOf(id).compareTo(Integer.valueOf(o.id));
        }

//    @Override
//    public int compareTo(Object o) {
//        Student other = (Student) o;
//        return name.compareTo(other.name);
//    }
    }

    private static void lesson171() {
        System.out.println("Lesson 171: Comparable vs. Comparator: Distinctions & Sorting Strategies\n");

        Student tim = new Student ("Tim");
        Student [] students = {new Student("Zach"), new Student("Tim"),
                new Student("Ann")};

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));

        System.out.println("result = " + tim.compareTo(new Student("TIM")));

        Comparator<Student> gpaSorter = new StudentGPAComparator();
        Arrays.sort(students, gpaSorter.reversed());
        System.out.println(Arrays.toString(students));

        System.out.println();
    }

    private static void lesson172() {
        System.out.println("Lesson 172: Generic Classes as Reference Types: Wildcards & Method Parameters\n");

        int studentCount = 10;
        List<Student2> students = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            students.add(new Student2());
        }
        students.add(new LPAStudent());
        printList(students);

        List<LPAStudent> lpaStudents = new ArrayList<>();
        for (int i = 0; i < studentCount; i++) {
            lpaStudents.add(new LPAStudent());
        }
        printList(lpaStudents);

        System.out.println();
    }

    public static void printList(List students) {

        for (var student : students) {
            System.out.println(student);
        }
        System.out.println();
    }

    public static class LPAStudent extends Student2 {

        private double percentComplete;

        public LPAStudent() {
            percentComplete = random.nextDouble(0, 100.001);
        }

        @Override
        public String toString() {
            return "%s %8.1f%%".formatted(super.toString(), percentComplete);
        }

        public double getPercentComplete() {
            return percentComplete;
        }
    }

    public static class Student2 {

        private String name;
        private String course;
        private int yearStarted;

        protected static Random random = new Random();

        private static String[] firstNames = {"Ann", "Bill", "Cathy", "John", "Tim"};
        private static String[] courses = {"C++", "Java", "Python"};

        public Student2() {
            int lastNameIndex = random.nextInt(65, 91);
            name = firstNames[random.nextInt(5)] + " " + (char) lastNameIndex;
            course = courses[random.nextInt(3)];
            yearStarted = random.nextInt(2018, 2023);
        }

        @Override
        public String toString() {
            return "%-15s %-15s %d".formatted(name, course, yearStarted);
        }

        public int getYearStarted() {
            return yearStarted;
        }
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
