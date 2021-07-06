package javaExp;

public class EvenNumber {
    public static void main(String[] args) {
        int number=4;
        int finishNumber=20;
        int counter=0;
        while((number<=finishNumber)&&(counter<=5)){
            number++;
            if(!isEvenNumber(number)){
                counter++;
                continue;
            }
            System.out.println("Even number "+number);
        }
        System.out.println("A total of "+counter+" even numbers have been found");
    }
    public static boolean isEvenNumber(int num1){
        if (num1%2!=0){
            return false;
        }else{
            return true;
        }
    }
}
