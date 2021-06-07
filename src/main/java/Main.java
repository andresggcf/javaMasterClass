import Section7.codingExercises.Exercise40.DeluxeBurger;
import Section7.codingExercises.Exercise40.HealthyBurger;

public class Main {
    static int count = 0;
    public static void main(String[] args) {
        /*
        System.out.println(
                "Has shared digit: "
                        + SharedDigit.hasSharedDigit(23,21));

        System.out.println(
                "Has shared last digit: "
                        + LastDigitChecker.hasSameLastDigit(41, 22, 71));

        System.out.println(
                "Greatest common denominator: "
                        + Divisors.getGreatestCommonDivisor(12, 30));

        Divisors.printFactors(32);

        System.out.println(
                "Is perfect number 6?: "
                        + Divisors.isPerfectNumber(6));

        System.out.println(
                "Numbers to words: "
                        + NumbersToWords.numberToWords(234));

        System.out.println(
                "Reverse: "
                        + NumbersToWords.reverse(234));*/

        /*BankAccount bankAccount = new BankAccount();
        bankAccount.depositFunds(45000);
        bankAccount.withdrawFunds(11100.0);*/

        /*VipCustomer vipCustomer = new VipCustomer();
        System.out.println(
                "Customer name: " + vipCustomer.getName()
                        + "\nEmail: " + vipCustomer.getEmail()
                        + "\nLimit: " + vipCustomer.getCreditLimit());*/

        /*Wall wall = new Wall(1.125,-1.0);
        System.out.println("area = " + wall.getArea());

        System.out.println("width = " + wall.getWidth());
        System.out.println("height = " + wall.getHeight());
        System.out.println("area = " + wall.getArea());*/

        /**
        * Excercise 32
        * Point
        */
        /*Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance (0,0) = " + first.distance());
        System.out.println("distance(second) = " + first.distance(second));
        System.out.println("distance(2,2) = " + first.distance(2,2));
        Point point = new Point();
        System.out.println("distance() = " + point.distance());*/

        /**
        * Excercise 33
        * Carpet Cost Calculator
        */
        /*Carpet carpet = new Carpet(3.5);
      Floor floor = new Floor(2.75, 4.0);
      Calculator calculator = new Calculator(floor, carpet);
      System.out.println("Total = " + calculator.getTotalCost());*/

        /**
        * Excercise 34
        * Complex number
        */
        /*ComplexNumber one = new ComplexNumber(1.0, 1.0);
      ComplexNumber number = new ComplexNumber(2.5, -1.5);
      one.add(1,1);
      System.out.println("one.real = " + one.getReal());
      System.out.println("one.imaginary = " + one.getImaginary());
      one.subtract(number);
      System.out.println("one.real = " + one.getReal());
      System.out.println("one.imaginary = " + one.getImaginary());
      number.subtract(one);
      System.out.println("number.real = " + number.getReal());
      System.out.println("number.imaginary = " + number.getImaginary());*/

        /**
        * Lesson 81 and 82
        * inheritance
        */
        /*Animal animal = new Animal("Chanda", 1, 1, 20, 45);
      Dog dog = new Dog("Yorkie", 8, 15, 2, 4, 20, "long");
      dog.eat();
      dog.run();

      Fish fish = new Fish("Beta", 2, 3, 2, 2, 3);
      fish.swim(20);*/

        /**
        * Lesson 87
        * static vs instance variables
        */
        /*
      //static variables are shared between instances
      Dog rex = new Dog("Rex");
      Dog fluffy = new Dog ("Fluffy");

      rex.printName(); //Fluffy
      fluffy.printName(); //Fluffy
      */

        /**
        * Lesson 88-89 challenge
        * Start with a basic class of a vehicle, then create a Car class that inherits from this base class.
        * Finally, create another class, a specific type of car that inherits from Car class.
        * You should be able to hand steer, change gear, and move(speed).
        * You will want to decide where to put the appropriate behaviours.
        * Change gear and increase / decrease speed should be included.
        */
        /*Modena modena = new Modena();
      System.out.println("Vehicle info: "
      + "\nType = " + modena.getType()
      + "\nGearbox = " + modena.getGearbox()
      + "\nCar Type = " + modena.getCarType()
      + "\nMax Speed = " + modena.getMaxSpeed() + "\n\n");

      modena.accelerate(33);
      modena.accelerate(140);
      modena.stop();
      */

        /**
        * Excercise 35
        * Cylinder area
        */
        /*Circle circle = new Circle(3.75);
        System.out.println("circle.radius = " + circle.getRadius());
        System.out.println("circle.area = " + circle.getArea());

        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius = " + cylinder.getRadius());
        System.out.println("cylinder.height = " + cylinder.getHeight());
        System.out.println("cylinder.area = " + cylinder.getArea());
        System.out.println("cylinder.volume = " + cylinder.getVolume());
         */

        /**
         * Excercise 36
         * Pool Area
         */
        /*Rectangle rectangle = new Rectangle(10, 1);
        System.out.println("rectangle.width = " + rectangle.getWidth());
        System.out.println("rectangle.length = " + rectangle.getLength());
        System.out.println("rectangle.area = " + rectangle.getArea());

        Cuboid cuboid = new Cuboid(10, 5, 5);
        System.out.println("cuboid.width = " + cuboid.getWidth());
        System.out.println("cuboid.length = " + cuboid.getLength());
        System.out.println("cuboid.height = " + cuboid.getHeight());
        System.out.println("cuboid.volume = " + cuboid.getVolume());
         */

        /**
         * Lesson 91
         * Composition
         */
        /*Dimensions dimensions = new Dimensions(20, 20, 15);
        Case pcCase = new Case("220B", "Dell", "240", dimensions);

        Monitor pcMonitor = new Monitor("XB22W-3", "ASUS", 27, new Resolution(1440, 3560));

        Motherboard pcMotherboard = new Motherboard("3299XEW", "ROG", 4, 2);

        Computer computer = new Computer(pcCase, pcMonitor, pcMotherboard);
        computer.getMonitor().drawPixelAt(400, 233, "Red");
        computer.getPcCase().turnOn();
        computer.getMotherboard().loadProgram("Windows 10");*/

        /**
         * Lesson 92
         * Composition Challenge
         */
        /*Wall wall1 = new Wall("white", 180, 180);
        Wall wall2 = new Wall("white", 230, 180);
        Wall wall3 = new Wall("grey", 230, 180);
        Wall wall4 = new Wall("grey", 180, 180);

        Bed bed = new Bed("Classic", 6, 20, "King");

        Table table = new Table("Wood", 35, "Blue");

        Bedroom bedroom = new Bedroom("mine", wall1, wall2, wall3, wall4, bed, table);
        bedroom.makeBed();
        bedroom.getTable().turnOn();*/

        /**
         * Excercise 37
         * Composition
         */
        /*Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("AASDF", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();

        bedroom.getLamp().turnOn();
        */

        /**
         * Lesson 93
         * Encapsulation
         */
        /*Player player = new Player();
        player.name = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        player.loseHealth(10);
        System.out.println("Remaining health: " + player.getHealth());

        player.loseHealth(11);

        //change of field directly which is not intended:
        player.health = 200;
        System.out.println("Remaining health: " + player.getHealth());

        //////////////////
        //Proper way of encapsulation
        /////////////////

        EnhancedPlayer player1 = new EnhancedPlayer("Tim", 250, "sword");
        System.out.println("Enhanced -> Initial health is " + player1.getHealth());
        */

        /**
         * Lesson 94
         * Encapsulation challenge
         */
        /*Printer printer = new Printer(50, false);
        System.out.println("Initial pages = " + printer.getPagesPrinted());
        printer.printPages(9);
        System.out.println("Pages printed = " + printer.getPagesPrinted());
        printer.printPages(1);
        System.out.println("Pages printed = " + printer.getPagesPrinted());*/


        /**
         * Excercise 38
         * Encapsulation
         */
        /*Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count = "
        + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count = "
            + printer.getPagesPrinted());*/

        /**
         * Lesson 95
         * Polymorphism
         */

        /*for (int i = 1; i < 11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie # " + i
                + ": " + movie.getName() + "\n"
                + "Plot: " + movie.plot() + "\n");
        }*/

        /**
         * Lesson 96
         * Polymorphism Challenge
         */

        /*Car car = new Car("Base", 4);
        System.out.println(car.startEngine());
        car.accelerate(20);
        car.brake(10);

        Mitsubishi lancer = new Mitsubishi("Lancer", 4);
        System.out.println(lancer.startEngine());
        lancer.accelerate(22);
        lancer.brake(26);

        Ford fiesta = new Ford("Fiesta", 4);
        System.out.println(fiesta.startEngine());
        fiesta.accelerate(33);
        fiesta.brake(22);

        Holden wtf = new Holden("Wtf", 2);
        System.out.println(wtf.startEngine());*/

        /**
         * Exercise 39
         * Polymorphism
         */

        /*Car car = new Car (8, "Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitsubishi mitsubishi = new Mitsubishi(6, "Outlander");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Ford ford = new Ford(6, "Fiesta");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());*/

        /**
         * Lesson 97
         * OOP Master Challenge
         */

        /*HealthyBurger healthyBurger = new HealthyBurger("beef");
        healthyBurger.addAddition("Cheese");
        healthyBurger.addAddition("Cheese");
        healthyBurger.addAddition("Avocado");
        System.out.println(healthyBurger.getACount());
        healthyBurger.removeAddition("Cheese");
        System.out.println(healthyBurger.getACount());
        */

        /**
         * Exercise 40
         * Bill's burgers
         */

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is: " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();


    }

    /**
     * Lesson 95
     * Polymorphism
     */

    /*public static Movie randomMovie() {
        int random = (int) (Math.random() * 5) + 1;
        System.out.println("Random number: " + random);
        switch (random) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new ForgettableMovie();

        }
        return null;
    }*/
}
