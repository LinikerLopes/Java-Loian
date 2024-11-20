package ExerciciosAvulsos;

public class TesteData {
    public int calculaFatorial(int num){
        if(num == 0)
        {
            return 1;
        }
        return num * calculaFatorial(num-1);
    }
}
