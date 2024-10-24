package Aula17Exec;

public class Exec6 {

    public static void main(String[] args) {
        int num = 0;
        int num1 = 20;
        while(num < num1){
            num++;
            System.out.print( " " + num);

        }
        System.out.println();
        while(num <= num1){
            num--;
            if(num == 0){
                break;
            }
            System.out.println( " " + num);
        }
    }

}

