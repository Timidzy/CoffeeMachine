import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        final String espresso = "Espresso";
        final String americano = "Americano";
        final String cappuccino = "Cappuccino";
        final String latte = "Latte";
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
                System.out.println(watterRemainderMessage + (water - 20) + "ml");
                System.out.println(beansRemainderMessage + (beans - 4) + "g");
                System.out.println(sugarRemainderMessage + (sugar - sugarAmount) + "g");
                break;
            case 2:
                System.out.println(chooseMessage + americano);
                System.out.println(watterRemainderMessage + (water - 50) + "ml");
                System.out.println(beansRemainderMessage + (beans - 4) + "g");
                System.out.println(sugarRemainderMessage + (sugar - sugarAmount) + "g");
                break;
            case 3:
                System.out.println(chooseMessage + cappuccino);
                System.out.println(watterRemainderMessage + (water - 90) + "ml");
                System.out.println(beansRemainderMessage + (beans - 4) + "g");
                System.out.println(milkRemainderMessage + (milk - 40) + "ml");
                System.out.println(sugarRemainderMessage + (sugar - sugarAmount) + "g");
                break;
            case 4:
                System.out.println(chooseMessage + latte);
                System.out.println(watterRemainderMessage + (water - 100) + "ml");
                System.out.println(beansRemainderMessage + (beans - 5) + "g");
                System.out.println(milkRemainderMessage + (milk - 50) + "ml");
                System.out.println(sugarRemainderMessage + (sugar - sugarAmount) + "g");
                break;
            default:
                System.out.println("Error !");
        }
        System.out.println("Have a nice day\nBye)");



    }
}
