package Aula17Exec;

public class Exec17 {
    public static void main(String[] args) {
        int num = 5;
        for (int i = num; i > 0; i--){
            num *= i;
            System.out.println(num + " x " + (i-1));

        }

    }
}
