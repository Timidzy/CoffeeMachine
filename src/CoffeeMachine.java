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
        String watterRemainderMessage = "Remainder of water is ";
        String beansRemainderMessage = "Remainder of beans is ";
        String milkRemainderMessage = "Remainder of milk is ";
        String sugarRemainderMessage = "Remainder of sugar is ";
        String helloChooseMessage = "Hello!\nChoose coffee u would like to drink\n1 - espresso\n2 - americano\n3 - cappuccino\n4 - latte";
        double milk = 1000;
        double beans = 400;
        double water = 3000;
        double sugar = 200;

        //espresso - water 20, beans 4
        //americano - water 50, beans 4
        //cappuccino - water 90, beans 4, milk 40
        //latte - water 100, beans 5, milk 50

        System.out.println(helloChooseMessage);
        int coffee = myScan.nextInt();
        double sugarAmount = 1 + (Math.random() * 19);
        //if (sugar < sugarAmount){
            //System.out.println("Please repeat and choose amount less than 200g");
        //}else

        switch (coffee){
            case 1:
                System.out.println(chooseMessage + espresso);
                double waterRemainder = water - 20;
                double beansRemainder = beans - 4;
                double sugarRemainder = sugar - sugarAmount;
                System.out.println(watterRemainderMessage + waterRemainder + ml + "\n" + beansRemainderMessage + beansRemainder + gram + "\n" + sugarRemainderMessage + sugarRemainder + gram);
                break;
            case 2:
                System.out.println(chooseMessage + americano);
                waterRemainder = water - 50;
                beansRemainder = beans - 4;
                sugarRemainder = sugar - sugarAmount;
                System.out.println(watterRemainderMessage + waterRemainder + ml + "\n" + beansRemainderMessage + beansRemainder + gram + "\n" + sugarRemainderMessage + sugarRemainder + gram);
                break;
            case 3:
                System.out.println(chooseMessage + cappuccino);
                waterRemainder = water - 90;
                beansRemainder = beans - 4;
                double milkRemainder = milk - 40;
                sugarRemainder = sugar - sugarAmount;
                System.out.println(watterRemainderMessage + waterRemainder + ml + "\n" + beansRemainderMessage + beansRemainder + gram + "\n" + milkRemainderMessage + milkRemainder + ml + "\n" + sugarRemainderMessage + sugarRemainder + gram);
                break;
            case 4:
                System.out.println(chooseMessage + latte);
                waterRemainder = water - 100;
                beansRemainder = beans - 5;
                milkRemainder = milk - 50;
                sugarRemainder = sugar - sugarAmount;
                System.out.println(watterRemainderMessage + waterRemainder + ml + "\n" + beansRemainderMessage + beansRemainder + gram + "\n" + milkRemainderMessage + milkRemainder + ml + "\n" + sugarRemainderMessage + sugarRemainder + gram);
                break;
            default:
                System.out.println("Error !");
        }
        System.out.println("Have a nice day\nBye)");



    }
}
