import java.util.ArrayList;
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

    public static void Ex04() {

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

        Float total = (nota1 + nota2 + (nota3 * 2) + notaExercicio);
        if (total > 100) {
            total = Float.valueOf(100);
        }
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

    public static void Ex05() {

        Integer repAlunos = 1;

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("\nInforme nome:");
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

            Float total = (nota1 + nota2 + (nota3 * 2) + notaExercicio);
            if (total > 100) {
                total = Float.valueOf(100);
            }
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

            System.out.print("\nDeseja adicional mais um aluno? \n(digite 1) para Sim e (digite 0) para Não\n");
            repAlunos = scanner.nextInt();

            switch (repAlunos) {
                case 1:
                    repAlunos = 1;
                    break;
                case 0:
                    repAlunos = 0;
                    break;
                default:
                    System.out.println("\nValor nao valido!");
                    break;
            }

        } while (repAlunos == 1);
    }

    public static void Ex06() {

        Integer repAlunos = 1;
        Integer QuantApr = 0, QuantRec = 0, QuantRep = 0;

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("\nInforme nome:");
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

            Float total = (nota1 + nota2 + (nota3 * 2) + notaExercicio);
            if (total > 100) {
                total = Float.valueOf(100);
            }
            System.out.println("\nNome: " + nome + "\nTurma: " + turma + "\nTotal das notas: " + total);

            System.out.println("\nResultado final: ");
            if (total < 40){
                System.out.print("Reprovado");
                QuantRep += 1;

            }
            else if (total >= 40 && total <= 49){
                System.out.print("Recuperação - Prova II");
                QuantRec += 1;
            }
            else if (total >= 50 && total <= 59){
                System.out.print("Recuperação - Prova I");
                QuantRec += 1;
            }
            else if (total >= 60){
                System.out.print("Aprovado");
                QuantApr += 1;
            }
            else
                System.out.print("Dados inseridos incorretamente!");

            System.out.print("\nDeseja adicional mais um aluno? \n(digite 1) para Sim e (digite 0) para Não\n");
            repAlunos = scanner.nextInt();

            switch (repAlunos) {
                case 1:
                    repAlunos = 1;
                    break;
                case 0:
                    repAlunos = 0;
                    break;
                default:
                    System.out.println("\nValor nao valido!");
            }

        } while (repAlunos == 1);

        System.out.println("\nQuantidade de alunos 'Aprovados': " + QuantApr);
        System.out.println("\nQuantidade de alunos 'Em Recuperação': " + QuantRec);
        System.out.println("\nQuantidade de alunos 'Reprovados': " + QuantRep);
    }

    public static void Ex07() {

        Integer repAlunos = 1;
        Integer quantApr = 0, quantRec = 0, quantRep = 0;
        ArrayList<String> alunos = new ArrayList();
        Float melhorAlunoTurma = 0;
        Integer notaMelhorAlunoTurma = 0;
        Float melhorAlunoSala = 0;
        Integer notaMelhorAlunoSala = 0;
        Integer posicaoAluno = 0;

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("\nInforme nome:");
            String nome = scanner.nextLine();
            alunos.add(nome);
            posicaoAluno += 1;

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
            if (notaExercicio > melhorAlunoSala)
                melhorAlunoSala = notaExercicio;
                notaMelhorAlunoSala = posicaoAluno;

            Float total = (nota1 + nota2 + (nota3 * 2) + notaExercicio);
            if (total > 100) {
                total = Float.valueOf(100);
            }
            System.out.println("\nNome: " + nome + "\nTurma: " + turma + "\nTotal das notas: " + total);

            System.out.println("\nResultado final: ");
            if (total < 40){
                System.out.print("Reprovado");
                quantRep += 1;
            }
            else if (total >= 40 && total <= 49){
                System.out.print("Recuperação - Prova II");
                quantRec += 1;
            }
            else if (total >= 50 && total <= 59){
                System.out.print("Recuperação - Prova I");
                quantRec += 1;
            }
            else if (total >= 60){
                System.out.print("Aprovado");
                quantApr += 1;
            }
            else
                System.out.print("Dados inseridos incorretamente!");

            System.out.print("\nDeseja adicional mais um aluno? \n(digite 1) para Sim e (digite 0) para Não\n");
            repAlunos = scanner.nextInt();

            switch (repAlunos) {
                case 1:
                    repAlunos = 1;
                    break;
                case 0:
                    repAlunos = 0;
                    break;
                default:
                    System.out.println("\nValor nao valido!");
            }

        } while (repAlunos == 1);

        System.out.println("\nQuantidade de alunos 'Aprovados': " + quantApr);
        System.out.println("\nQuantidade de alunos 'Em Recuperação': " + quantRec);
        System.out.println("\nQuantidade de alunos 'Reprovados': " + quantRep);
    }

    //endregion
}
