package src;

public class Section5ExpressionsStatementsMore {
    public static void main(String[] args) {
        System.out.println("Section 5: Expressions, Statements & More");

        lesson42();
        lesson43();
        lesson44();
        lesson45();
        lesson46();
        lesson47();
        lesson48();
        lesson49();
        lesson52();
        lesson53();
        lesson54();
    }

    private static void lesson42() {
        System.out.println("Lesson 42: Keywords and Expressions\n");

        int int2 = 5;

        double kilometers = (100 * 1.609344);
        // (100 * 1.609344) An expression
        // double kilometers = (100 * 1.609344) A statement
        // kilometers = (100 * 1.609344) An Expression

        int highScore = 50;

        if (highScore > 35) {
            highScore = 1000 + highScore;       // add bonus points
        }
    }

    private static void lesson43() {
        System.out.println("Lesson 43: Statements, Whitespace and Indentation (Code Organization)\n");

        int myVariable = 50;

        myVariable++;
        myVariable--;

        System.out.println("This is a test");
        System.out.println("This is" +
                " another" +
                " still more.");

        if (myVariable == 0) {
            System.out.println("It's now zero");
        }

        System.out.println();
    }

    private static void lesson44() {
        System.out.println("Lesson 44: Code Blocks And The If Then Else Control Statement\n");

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

        System.out.println();
    }

    private static void lesson45() {
        System.out.println("Lesson 45: if then else Challenge\n");

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        gameOver = true;
        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        finalScore = score;

        if (gameOver == true) {
            finalScore += (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        System.out.println();
    }

    private static void lesson46() {
        System.out.println("Lesson 46: Methods in Java\n");

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }

        calculateScore(true, 800, levelCompleted, bonus);

        System.out.println();
    }

    private static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    private static void lesson47() {
        System.out.println("Lesson 47: More on Methods\n");

        calculateScore(true, 10_000, 8, 200);
        System.out.println();

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;
        int highScore = calculateScore2(gameOver, score, levelCompleted, bonus);
        System.out.println("The highScore is " + highScore);
        System.out.println();

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println("The next highscore is " +
                calculateScore2(gameOver, score, levelCompleted, bonus));

        System.out.println();
    }

    public static int calculateScore2(boolean gameOver, int score, int levelCompleted, int bonus) {
        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }

    private static void lesson48() {
        System.out.println("Lesson 48: Methods Recap\n");


        System.out.println();
    }

    private static void lesson49() {
        System.out.println("Lesson 49: Method Challenge\n");

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", position);

        position = calculateHighScorePosition(999);
        displayHighScorePosition("Bob", position);

        position = calculateHighScorePosition(499);
        displayHighScorePosition("Percy", position);

        position = calculateHighScorePosition(99);
        displayHighScorePosition("Glbert", position);

        position = calculateHighScorePosition(-1000);
        displayHighScorePosition("James", position);

        System.out.println();
    }

    private static void displayHighScorePosition(String playerName, int playerPosition) {
        System.out.println(playerName + " managed to get into position " + playerPosition + " on the high score list");
    }

    private static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }

    private static void lesson52() {
        System.out.println("Lesson 52: Method Overloading\n");

        System.out.println("New score is " + calculateScore("Tim", 500));
        System.out.println("New score is " + calculateScore(10));

        System.out.println();
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        return calculateScore("Anonymous", score);
    }

    public static int calculateScore() {
        System.out.println("No player named, no player score.");
        return 0;
    }

    private static void lesson53() {
        System.out.println("Lesson 53: Method Overloading Challenge\n");

        System.out.println(convertToCentimeters(13));
        System.out.println(convertToCentimeters(5, 8));

        System.out.println();
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return convertToCentimeters((feet * 12) + inches);
    }

    private static void lesson54() {
        System.out.println("Lesson 54: Seconds And Minutes Challenge\n");

        System.out.println(getDurationString(3945));
        System.out.println(getDurationString(65, 45));

        System.out.println();
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "INVALID INPUT.";
        }

        int minutes = seconds / 60;
        seconds = seconds % 60;

        return getDurationString(minutes, seconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "INVALID INPUT.";
        }
        int hours = minutes / 60;

        return hours + "h + " + minutes + "m " + seconds + "s";
    }
}
