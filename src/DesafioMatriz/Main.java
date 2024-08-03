package DesafioMatriz;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a quantidade de Alunos");
        int alunos=sc.nextInt();
        System.out.println("Qual a quantidade de notas de cada Aluno");
        int notas=sc.nextInt();
        double [][]NotasAlunos=new double[alunos][notas];
        double totalNotas=0;
        for (int i = 0; i <alunos ; i++) {
            for (int j = 0; j < notas; j++) {
                System.out.println("Digite a nota "+(j+1)+" do Aluno "+(i+1));
                NotasAlunos[i][j]=sc.nextDouble();
                totalNotas+=NotasAlunos[i][j];
            }
        }
        System.out.println("A média das notas da Turma é:"+totalNotas/(alunos*notas));
        for (double[]NotasTurma:NotasAlunos){
            System.out.println(Arrays.toString(NotasTurma));
        }
    }
}
