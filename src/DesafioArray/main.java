package DesafioArray;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Quantas notas o Aluno terá?");
        int qntNotas=sc.nextInt();
        double[]notasAluno=new double[qntNotas];
        double totalnotas=0;
        for (int i=0;i<notasAluno.length;i++){
            System.out.println("Digite o valor da nota "+(i+1));
            notasAluno[i]=sc.nextDouble();
            totalnotas=totalnotas+notasAluno[i];
        }
        System.out.println("A média das notas dos Aluno é "+totalnotas/notasAluno.length);

    }
}
