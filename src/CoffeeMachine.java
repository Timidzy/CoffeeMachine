import java.util.Scanner;

public class CoffeeMachine {
    static Scanner myScan = new Scanner(System.in);
    static double milk = 1000;
    static double beans = 400;
    static double water = 3000;
    static double sugar = 200;
    static final String ESPRESSO = "Espresso";
    static final String AMERICANO = "Americano";
    static final String CAPPUCCINO = "Cappuccino";
    static final String LATTE = "Latte";
    static String chooseMessage = "You chase ";
    static double sugarAmount = generateSugarNumber();

    public static void main(String[] args) {
        char gram = 'g';
        String ml = "ml";
        String waterRemainderMessage = "Remainder of water is ";
        String beansRemainderMessage = "Remainder of beans is ";
        String milkRemainderMessage = "Remainder of milk is ";
        String sugarRemainderMessage = "Remainder of sugar is ";
        String helloChooseMessage = "Choose coffee u would like to drink\n1 - espresso\n2 - americano\n" +
                "3 - cappuccino\n4 - latte\n5 - exit";


        //espresso - water 20, beans 4
        //americano - water 50, beans 4
        //cappuccino - water 90, beans 4, milk 40
        //latte - water 100, beans 5, milk 50
        
        System.out.println("Hello!");
        while (true) {
            giveAChoice(helloChooseMessage);
            int coffee = askForCoffee(myScan);
            if (!cycleToExitEarly(coffee)) {
                break;
            }
            makeCoffeeDependingOnChoice(coffee);
            remindAboutGoods(waterRemainderMessage, ml, beansRemainderMessage, gram, milkRemainderMessage,
                    sugarRemainderMessage);


        }
        System.out.println("Have a nice day\nBye)");

    }

    static void giveAChoice(String helloMessage) {
        System.out.println(helloMessage);
    }

    static int askForCoffee(Scanner myScan) {
        return myScan.nextInt();
    }

    static double generateSugarNumber() {
        return 1 + (int) (Math.random() * 19);
    }

    static boolean cycleToExitEarly(int coffee) {
        boolean flag = true;
        if (coffee == 5) {
            flag = false;
        } else if (sugar == 0 || water == 0 || beans == 0 || milk == 0) {
            flag = false;
        }
        return flag;
    }

    static void makeCoffeeDependingOnChoice(int coffee) {
        switch (coffee) {
            case 1:
                makeEspresso();
                break;
            case 2:
                makeAmericano();
                break;
            case 3:
                makeCappuccino();
                break;
            case 4:
                makeLatte();
                break;
            default:
                System.out.println("Error !");

        }
    }

    static void makeEspresso() {
        System.out.println(chooseMessage + ESPRESSO);
        water -= 20;
        beans -= 4;
        sugar -= sugarAmount;
    }

    static void makeAmericano() {
        System.out.println(chooseMessage + AMERICANO);
        water -= 50;
        beans -= 4;
        sugar -= sugarAmount;
    }

    static void makeCappuccino() {
        System.out.println(chooseMessage + CAPPUCCINO);
        water -= 90;
        beans -= 4;
        milk -= 40;
        sugar -= sugarAmount;
    }

    static void makeLatte() {
        System.out.println(chooseMessage + LATTE);
        water -= 100;
        beans -= 5;
        milk -= 50;
        sugar -= sugarAmount;
    }

    static void remindAboutGoods(String waterRemainderMessage, String ml, String beansRemainderMessage, char gram,
                                 String milkRemainderMessage, String sugarRemainderMessage) {
        System.out.println(waterRemainderMessage + water + ml + "\n" + beansRemainderMessage + beans + gram +
                "\n" + milkRemainderMessage + milk + ml + "\n" + sugarRemainderMessage + sugar + gram);
    }
}
