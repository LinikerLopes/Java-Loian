package ExerciciosAvulsos;

public class TesteData {
    public int calculaFatorial(int num){
        if(num == 0)
        {
            return 1;
        }
        return num * calculaFatorial(num-1);
    }

    public static int fibonacci(int num2){
        if (num2 < 2){
            return 1;
        }
        return fibonacci(num2-1) + fibonacci(num2-2);
    }
}
