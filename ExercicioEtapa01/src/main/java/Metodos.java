import java.util.Scanner;

public class Metodos {

    public static void SolicitarGrade() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe a nome:");
        String nome1 = leitor.next();
        System.out.println("Informe turma");
        String turma1 = leitor.next();
        System.out.println("Informe a nota da prova 1:");
        double nota1 = leitor.nextDouble();

        System.out.println("Informe a nome:");
        String nome2 = leitor.next();
        System.out.println("Informe turma");
        String turma2 = leitor.next();
        System.out.println("Informe a nota da prova 2");
        double nota2 = leitor.nextDouble();

        System.out.println("Informe a nome:");
        String nome3 = leitor.next();
        System.out.println("Informe turma");
        String turma3 = leitor.next();
        System.out.println("Informe a nota da prova 3:");
        double nota3 = leitor.nextDouble();

        System.out.println("O total das notas e: " + (nota1+nota2+nota3));
    }
}
