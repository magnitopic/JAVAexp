package javaExp;

public class primeNumbers {
    public static void main(String[] args) {
        int counter=0;
        for(int i=2;i<1000;i++){
            if (counter==10){
                break;
            }else if(isPrime(i)){
                counter++;
                System.out.println(i+" is a prime number. A total of "+counter+" prime numbers have been saved");
            }
        }
    }
    public static boolean isPrime(int n){
       if (n<=1){
           return false;
       }
       for (int i=2;i<=(long) Math.sqrt(n);i++){
        if(n%i==0){
            return false;
        }
       }
       return true;
    }
}
