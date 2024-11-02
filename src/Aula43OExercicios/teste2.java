package Aula43OExercicios;
import javax.swing.*;

public class teste2 {

        public static void main(String[] args) {
            // Cria uma nova janela (JFrame)
            JFrame frame = new JFrame("Minha Primeira Interface Gráfica");
            frame.setSize(400, 300);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            // Cria um botão e o adiciona à janela
            JButton button = new JButton("Clique Aqui!");
            frame.add(button);

            // Torna a janela visível
            frame.setVisible(true);
        }
    }

