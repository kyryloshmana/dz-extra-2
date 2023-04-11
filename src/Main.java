import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        fact(5);






    }

    public static void task1() {
        for (int i = 5; i >= 1; i--) {
            System.out.print(i);
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void task2() {
        int enteredValue = 5;
        int x=5;
        while (x <= enteredValue && x>0) {//5<=5
            int y = 0;
            System.out.print(x);
            while (y < x) { //0<5

                System.out.print("*");
                y++;//1
            }
            System.out.println("");
            x--;//3
        }
    }

    public static void fact(int value){
        int resolt = 1;
        for (int i = 1; i<=value; i++){
            resolt = resolt*i;
        }
        System.out.println(value + " factorial is " + resolt);
    }


}
