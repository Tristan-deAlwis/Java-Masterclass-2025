package src;

public class Section7OOPPart1Inheritance {
    public static void main() {
        System.out.println("Section 6: Control Flow");

//        lesson77();
//        lesson78();
        lesson79();
//        lesson80();
//        lesson81();
//        lesson82();
//        lesson83();
//        lesson84();
//        lesson85();
//        lesson86();
//        lesson87();
//        lesson88();
//        lesson89();
//        lesson90();
//        lesson91();
//        lesson92();
//        lesson100();
    }

    private static void lesson77() {
        System.out.println("Lesson 77: Introduction to Classes and Objects\n");



        System.out.println();
    }

    public static class Car {

        private String make = "Tesla";
        private String model = "Model X";
        private String color = "Gray";
        private int doors = 2;
        private boolean convertible = true;

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public String getColor() {
            return color;
        }

        public int getDoors() {
            return doors;
        }

        public boolean isConvertible() {
            return convertible;
        }

        public void setMake(String make) {
            if (make == null) make = "Unknown";
            String lowercaseMake = make.toLowerCase();
            switch (lowercaseMake) {
                case "holden", "porsche", "tesla" -> this.make = make;
                default -> {
                    this.make = "Unsupported";
                }
            }
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setDoors(int doors) {
            this.doors = doors;
        }

        public void setConvertible(boolean convertible) {
            this.convertible = convertible;
        }

        public void describeCar() {
            System.out.println(doors + "-Door " +
                    color + " " +
                    make + " " +
                    model + " " +
                    (convertible ? "Convertible" : ""));
        }


    }

    private static void lesson78() {
        System.out.println("Lesson 78: Introduction to Classes, Using Getter Methods\n");

        Car car = new Car();
//        car.make() = "Porsche";
//        car.model() = "Carrera";
//        car.color() = "Red";
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        System.out.println();
    }

    private static void lesson79() {
        System.out.println("Lesson 79: Classes, Using Setters, and Creating Objects\n");

        // "this" is a special keyword in java

        Car car = new Car();
        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(true);
        car.setColor("black");
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();

        Car targa = new Car();
        car.setMake("Porsche");
        car.setModel("Targa");
        car.setDoors(2);
        car.setConvertible(false);
        car.setColor("red");

        System.out.println();
    }

    private static void lesson80() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson81() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson82() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson83() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson84() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson85() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson86() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson87() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson88() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson89() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson90() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson91() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson92() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }

    private static void lesson100() {
        System.out.println("Lesson xx: XX\n");

        System.out.println();
    }
}
