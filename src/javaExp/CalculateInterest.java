package javaExp;

public class CalculateInterest {
    public static void main(String[] args) {
        double amount=10000;
        for (int i=2;i<=8;i++){
            System.out.println(String.format("%.2f",calculateInterest(amount, i))+" € of interest at "+i+"% interest");
        }
        for (int j=8;j>=10;j++){
            System.out.println(String.format("%.2f",calculateInterest(amount, j))+" € of interest at "+j+"% interest");
        }
    }
    public static double calculateInterest(double amount,double interestRate){
        return (amount *(interestRate/100));
    }
}