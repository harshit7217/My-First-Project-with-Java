public class Main {
    public static void main(String[] args) {
//        Print the prices and list of all products
        int bubbleGumPrice = 2;
        float toffeePrice = 0.2f;
        int iceCreamPrice = 5;
        int chocolatePrice = 4;
        float doughNutPrice = 2.5f;
        float panCakePrice = 3.2f;

        System.out.println("Prices:");
        System.out.println("Bubblegum: $"+ bubbleGumPrice);
        System.out.println("Toffee: $"+ toffeePrice);
        System.out.println("Ice cream: $"+ iceCreamPrice);
        System.out.println("Milk chocolate: $"+ chocolatePrice);
        System.out.println("Doughnut: $"+ doughNutPrice);
        System.out.println("Pancake: $"+ panCakePrice);

//        Print the earned the total amount of this period
        int bubbleGumEarned = 202;
        int toffeeEarned = 118;
        int iceCreamEarned = 2250;
        int milkChocolateEarned = 1680;
        int doughNutEarned = 1075;
        int panCakeEarned = 80;
        float income = bubbleGumEarned + toffeeEarned + iceCreamEarned + milkChocolateEarned + doughNutEarned + panCakeEarned;
        System.out.println();
        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $"+ bubbleGumEarned);
        System.out.println("Toffee: $"+ toffeeEarned);
        System.out.println("Ice cream: $"+ iceCreamEarned);
        System.out.println("Milk chocolate: $"+ milkChocolateEarned);
        System.out.println("Doughnut: $"+ doughNutEarned);
        System.out.println("Pancake: $"+ panCakeEarned);
        System.out.println();
        System.out.println("Income: $"+ income);

    }
}
