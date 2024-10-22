import java.util.Arrays;
import java.util.List;

    public class TrabalhandoLamb{
        public static void main(String [] args){
             List<String> aprovados = Arrays.asList("Ana", "joão", "david", "alguém");
        for (String nome : aprovados) {
            System.out.println("Aprovado: " + nome);
        }
        //É a mesma coisa do acima, porém a variáve 'nome' vai receber o indice do for, mesma coisa de cima...
        aprovados.forEach(nome -> System.out.println("Aprovado(a): " + nome));
        //É a forma de chama um método com um modelo já definido de string
        aprovados.forEach(nome->nomealunos(nome));
    }
    static void nomealunos(String nome){
        System.out.println("O nome do aluno aprovado é: "+nome);

    }
        }
    }
    a
    
   