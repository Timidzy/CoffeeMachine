import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        final String espresso = "Espresso";
        final String americano = "Americano";
        final String cappuccino = "Cappuccino";
        final String latte = "Latte";
        char gram = 'g';
        String ml = "ml";
        String chooseMessage = "You chase ";
        String waterRemainderMessage = "Remainder of water is ";
        String beansRemainderMessage = "Remainder of beans is ";
        String milkRemainderMessage = "Remainder of milk is ";
        String sugarRemainderMessage = "Remainder of sugar is ";
        String helloChooseMessage = "Choose coffee u would like to drink\n1 - espresso\n2 - americano\n" +
                "3 - cappuccino\n4 - latte\n5 - exit";

        double milk = 1000;
        double beans = 400;
        double water = 3000;
        double sugar = 200;

        //espresso - water 20, beans 4
        //americano - water 50, beans 4
        //cappuccino - water 90, beans 4, milk 40
        //latte - water 100, beans 5, milk 50
        System.out.println("Hello!");
        while (true) {
            giveAChoice(helloChooseMessage);
            int coffee = askForCoffee(myScan);
            double sugarAmount = generateSugarNumber();
            //if (sugar < sugarAmount){
            //System.out.println("Please repeat and choose amount less than 200g");
            //}else
            if (cycleToExitEarly(coffee, water, sugar, milk, beans) == false) {
                break;
            }



//            switch (coffee) {
//                case 1:
//                    System.out.println(chooseMessage + espresso);
//                    water -= 20;
//                    beans -= 4;
//                    sugar -= sugarAmount;
//                    break;
//                case 2:
//                    System.out.println(chooseMessage + americano);
//                    water -= 50;
//                    beans -= 4;
//                    sugar -= sugarAmount;
//                    break;
//                case 3:
//                    System.out.println(chooseMessage + cappuccino);
//                    water -= 90;
//                    beans -= 4;
//                    milk -= 40;
//                    sugar -= sugarAmount;
//                    break;
//                case 4:
//                    System.out.println(chooseMessage + latte);
//                    water -= 100;
//                    beans -= 5;
//                    milk -= 50;
//                    sugar -= sugarAmount;
//                    break;
//                default:
//                    System.out.println("Error !");
//
//            }


        }
        System.out.println(waterRemainderMessage + water + ml + "\n" + beansRemainderMessage + beans + gram +
                "\n" + milkRemainderMessage + milk + ml + "\n" + sugarRemainderMessage + sugar + gram);

        System.out.println("Have a nice day\nBye)");


    }

    static void giveAChoice(String helloMessage) {
        System.out.println(helloMessage);
    }

    static int askForCoffee(Scanner myScan) {
        int coffee = myScan.nextInt();
        return coffee;
    }

    static double generateSugarNumber() {
        double sugarAmount = 1 + (int) (Math.random() * 19);
        return sugarAmount;
    }

    static boolean cycleToExitEarly(int coffee, double water, double sugar, double milk, double beans) {
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
                System.out.println(chooseMessage + americano);
                water -= 50;
                beans -= 4;
                sugar -= sugarAmount;
                break;
            case 3:
                System.out.println(chooseMessage + cappuccino);
                water -= 90;
                beans -= 4;
                milk -= 40;
                sugar -= sugarAmount;
                break;
            case 4:
                System.out.println(chooseMessage + latte);
                water -= 100;
                beans -= 5;
                milk -= 50;
                sugar -= sugarAmount;
                break;
            default:
                System.out.println("Error !");

        }
    }
    static void makeEspresso(String espresso, double sugar, double water, double beans, double sugarAmount,
                             String chooseMessage){
        System.out.println(chooseMessage + espresso);
        water -= 20;
        beans -= 4;
        sugar -= sugarAmount;
    }
    static void makeAmericano(String americano, double sugar, double water, double beans, double sugarAmount,
                              String chooseMessage){
        System.out.println(chooseMessage + americano);
        water -= 50;
        beans -= 4;
        sugar -= sugarAmount;
    }
    static void makeCappuccino(String cappuccino, double sugar, double water, double beans, double sugarAmount,
                               String chooseMessage, double milk){
        System.out.println(chooseMessage + cappuccino);
        water -= 90;
        beans -= 4;
        milk -= 40;
        sugar -= sugarAmount;
    }
    static void makeLatte(String latte, double sugar, double water, double beans, double sugarAmount,
                          String chooseMessage, double milk){
        System.out.println(chooseMessage + latte);
        water -= 100;
        beans -= 5;
        milk -= 50;
        sugar -= sugarAmount;
    }
}
