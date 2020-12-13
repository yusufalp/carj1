public class Calculator {
  public static void main(String[] args) {

    int numberOfPersons = 4;

    double taxPercent = 8;
    double tipPercent = 15;

    double personOneAppetizerCost = 9.99;
    double personOneMainCost = 23.99;
    double personOneDessertCost = 10.29;
    double personOneDrinkCost = 8.50;

    double personTwoAppetizerCost = 12.99;
    double personTwoMainCost = 18.99;
    double personTwoDessertCost = 9.99;
    double personTwoDrinkCost = 4.25;

    double personThreeAppetizerCost = 10.49;
    double personThreeMainCost = 26.79;
    double personThreeDessertCost = 10.29;
    double personThreeDrinkCost = 3.75;

    double personFourAppetizerCost = 13.79;
    double personFourMainCost = 25.99;
    double personFourDessertCost = 4.49;
    double personFourDrinkCost = 7.50;

    String personOneName = "Adeline";
    String personOneAppetizer = "Stuffed Ziti Fritta";
    String personOneMain = "Shrimp Scampi";
    String personOneDessert = "Sicilian Cheesecake";
    String personOneDrink = "Raspberry Lemonade x 2";

    String personTwoName = "Brixton";
    String personTwoAppetizer = "Lasagna Fritta";
    String personTwoMain = "Fettuccine Alfredo";
    String personTwoDessert = "Lemon Cream cake";
    String personTwoDrink = "Mango-Strawberry Iced Tea";

    String personThreeName = "Cora";
    String personThreeAppetizer = "Fried Mozzarella";
    String personThreeMain = "Tour of Italy";
    String personThreeDessert = "Zeppoli";
    String personThreeDrink = "Fresh Brewed Iced Tea";

    String personFourName = "Dean";
    String personFourAppetizer = "Classic Shrimp Scampi Fritta";
    String personFourMain = "Seafood Alfredo";
    String personFourDessert = "Dolcini";
    String personFourDrink = "Coke x 2";

    boolean payTip = true;
    boolean splitBillEvenly = true;

    double personOneSubTotal = personOneAppetizerCost + personOneMainCost + personOneDessertCost + personOneDrinkCost;
    double personTwoSubTotal = personTwoAppetizerCost + personTwoMainCost + personTwoDessertCost + personTwoDrinkCost;
    double personThreeSubTotal = personThreeAppetizerCost + personThreeMainCost + personThreeDessertCost
        + personThreeDrinkCost;
    double personFourSubTotal = personFourAppetizerCost + personFourMainCost + personFourDessertCost
        + personFourDrinkCost;

    double taxAmount = taxPercent / 100;
    double personOneTax = taxAmount * personOneSubTotal;
    double personTwoTax = taxAmount * personTwoSubTotal;
    double personThreeTax = taxAmount * personThreeSubTotal;
    double personFourTax = taxAmount * personFourSubTotal;

    double mealSubTotal = personOneSubTotal + personTwoSubTotal + personThreeSubTotal + personFourSubTotal;
    double mealTax = mealSubTotal * taxAmount;
    double mealTip = (tipPercent / 100) * mealSubTotal;
    double mealTotal = mealSubTotal + mealTax + mealTip;

    double evenCostPerPerson = mealTotal / numberOfPersons;

    double personOneTip = (tipPercent / 100) * personOneSubTotal;
    double personTwoTip = (tipPercent / 100) * personTwoSubTotal;
    double personThreeTip = (tipPercent / 100) * personThreeSubTotal;
    double personFourTip = (tipPercent / 100) * personFourSubTotal;

    double personOneTotal = personOneSubTotal + personOneTip + personOneTax;
    double personTwoTotal = personTwoSubTotal + personTwoTip + personTwoTax;
    double personThreeTotal = personThreeSubTotal + personThreeTip + personThreeTax;
    double personFourTotal = personFourSubTotal + personFourTip + personFourTax;

    System.out.println("Total cost of meal");
    System.out.println(mealTotal);
    System.out.println("Amount each person pays if split evenly");
    System.out.println(evenCostPerPerson);
    System.out.println("If not split evenly:");
    System.out.println(personOneName);
    System.out.println(personOneTotal);
    System.out.println(personTwoName);
    System.out.println(personTwoTotal);
    System.out.println(personThreeName);
    System.out.println(personThreeTotal);
    System.out.println(personFourName);
    System.out.println(personFourTotal);
  }
}
