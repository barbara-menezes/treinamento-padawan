import java.util.ArrayList;
import java.util.Scanner;

public class Metodos {

    //region Atividades
    public static void Ex01() {

        Scanner scanner = new Scanner(System.in);
        float notaProva = 0.0f;

        System.out.println("Informe a nota da prova 1:");
        notaProva += scanner.nextFloat();

        System.out.println("Informe a nota da prova 2");
        notaProva += scanner.nextFloat();

        System.out.println("Informe a nota da prova 3:");
        notaProva += scanner.nextFloat();

        System.out.println("Total das notas: " + notaProva);
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
        else if (total >= 40 && total < 50)
            System.out.print("Recuperação - Prova II");
        else if (total >= 50 && total < 60)
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
        Float melhorNotaAula = 0f, melhorNotaTurma = 0f;
        String melhorAlunoAula="", melhorAlunoTurma="";

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
            if (notaExercicio > melhorNotaAula) {
                melhorNotaAula = notaExercicio;
                melhorAlunoAula = nome;
            }

            Float total = (nota1 + nota2 + (nota3 * 2) + notaExercicio);
            if (total > 100) {
                total = Float.valueOf(100);
            }
            if (total > melhorNotaTurma) {
                melhorNotaTurma = total;
                melhorAlunoTurma = nome;
            }
            System.out.println("\nNome: " + nome + "\nTurma: " + turma + "\nTotal das notas: " + total);

            if (total < 40){
                System.out.print("Resultado final: Reprovado");
                quantRep += 1;
            }
            else if (total >= 40 && total <= 49){
                System.out.print("Resultado final: Recuperação - Prova II");
                quantRec += 1;
            }
            else if (total >= 50 && total <= 59){
                System.out.print("Resultado final: Recuperação - Prova I");
                quantRec += 1;
            }
            else if (total >= 60){
                System.out.print("Resultado final: Aprovado");
                quantApr += 1;
            }
            else
                System.out.print("Dados inseridos incorretamente!");

            System.out.print("\n\nDeseja adicional mais um aluno? \n(digite 1) para Sim e (digite 0) para Não\n");
            repAlunos = scanner.nextInt();

            switch (repAlunos) {
                case 1:
                    repAlunos = 1;
                    break;
                case 0:
                    repAlunos = 0;
                    break;
                default:
                    System.out.println("\nValor nao válido!");
            }

        } while (repAlunos == 1);

        System.out.println("\nQuantidade de alunos 'Aprovados': " + quantApr);
        System.out.println("Quantidade de alunos 'Em Recuperação': " + quantRec);
        System.out.println("Quantidade de alunos 'Reprovados': " + quantRep);
        System.out.println("Aluno destaque da turma: " + melhorAlunoTurma + " - nota: " + melhorNotaTurma);
        System.out.println("Aluno destaque da sala: " + melhorAlunoAula + " - nota: " + melhorNotaAula);
    }

    public static void Ex08() {

        int repAlunos = 0, quantVend = 0;
        String maiorComissaoVendedor = "", menorComissaoVendedor = "";
        Float maiorcomissao = 0.0f, menorcomissao = 99999999999999.0f, comissaoTotal = 0.0f;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nInforme o nome do vendedor:");
            String nome = scanner.nextLine();

            System.out.println("Informe o valor total de comissão: ");
            Float comissao = scanner.nextFloat();
            comissaoTotal += comissao;

            if (comissao > maiorcomissao) {
                maiorcomissao = comissao;
                maiorComissaoVendedor = nome;
            }
            if (comissao < menorcomissao) {
                menorcomissao = comissao;
                menorComissaoVendedor = nome;
            }
            quantVend++;

            System.out.print("\n\nDeseja adicional mais um aluno? \n(digite 1) para Sim e (digite 0) para Não\n");
            repAlunos = scanner.nextInt();

        } while (repAlunos == 1);

        System.out.println("\nVendedor com maior comissão: " + maiorComissaoVendedor + " - valor comissao: " + maiorcomissao);
        System.out.println("\nVendedor com menor comissão: " + menorComissaoVendedor + " - valor comissao: " + menorcomissao);
        System.out.println("\nValor médio das comissões " + (comissaoTotal/quantVend));
    }

    public static void Ex09() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nInforme seu login:");
        String usuario = scanner.nextLine();

        System.out.println("\nInforme sua senha: ");
        String senha = scanner.nextLine();

        switch (usuario){
            case "admin":
                if (senha.equals("admin"))
                    System.out.println("\nBem vindo Administrador!");
                else
                    System.out.println("\nUsuário não encontrado!");
                break;
            case "user":
                if (senha.equals("user"))
                    System.out.println("\nBem Vindo Usuário!");
                else
                    System.out.println("\nUsuário não encontrado!");
                break;
            case "inactive":
                if (senha.equals("pass"))
                    System.out.println("\nSeu usuario está Inativo!");
                else
                    System.out.println("\nUsuário não encontrado!");
                break;
            default:
                System.out.println("‘Usuário não encontrado!’");
        }

        /*string opcoes = scanner.nextLine();
        desejaContinuar = opcao.esquals('S');*/
    }
    //endregion
}
