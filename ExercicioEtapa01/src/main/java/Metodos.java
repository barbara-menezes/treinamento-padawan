import java.util.Scanner;

public class Metodos {

    //region Atividades

    public static void Ex01() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a nota da prova 1:");
        Float nota1 = scanner.nextFloat();

        System.out.println("Informe a nota da prova 2");
        Float nota2 = scanner.nextFloat();

        System.out.println("Informe a nota da prova 3:");
        Float nota3 = scanner.nextFloat();

        Float total = (nota1 + nota2 + nota3);
        System.out.println("Total das notas: " + total);
    }

    public static void Ex02() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe turma");
        String turma = scanner.nextLine();

        System.out.println("Informe a nota da prova 1:");
        Float nota1 = scanner.nextFloat();

        System.out.println("Informe a nota da prova 2");
        Float nota2 = scanner.nextFloat();

        System.out.println("Informe a nota da prova 3:");
        Float nota3 = scanner.nextFloat();

        Float total = (nota1 + nota2 + nota3);
        System.out.println("\nNome: " + nome + "\nTurma: " + turma + "\nTotal das notas: " + total);
    }

    public static void Ex03() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe nome:");
        String nome = scanner.nextLine();

        System.out.println("Informe turma");
        String turma = scanner.nextLine();

        System.out.println("Informe a nota da prova 1:");
        Float nota1 = scanner.nextFloat();

        System.out.println("Informe a nota da prova 2");
        Float nota2 = scanner.nextFloat();

        System.out.println("Informe a nota da prova 3:");
        Float nota3 = scanner.nextFloat();

        System.out.println("Informe a nota de exercício:");
        Float notaExercicio = scanner.nextFloat();

        Float total = (nota1 + nota2 + nota3 + notaExercicio);
        System.out.println("\nNome: " + nome + "\nTurma: " + turma + "\nTotal das notas: " + total);

        System.out.println("\nResultado final: ");
        if (total < 40)
            System.out.print("Reprovado");
        else if (total >= 40 && total <= 49)
            System.out.print("Recuperação - Prova II");
        else if (total >= 50 && total <= 59)
            System.out.print("Recuperação - Prova I");
        else if (total >= 60)
            System.out.print("Aprovado");
        else
            System.out.print("Dados inseridos incorretamente!");
    }

    //endregion
}
