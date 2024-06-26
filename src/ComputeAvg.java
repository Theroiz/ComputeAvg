import java.util.Scanner;
public class ComputeAvg {
    public static void main(String args[]) {
        double[] pontuacoes = new double[5];
        Scanner entrada = new Scanner(System.in);
        double total = 0;
        for(int i = 0; i<pontuacoes.length;i++)
        {
            System.out.println("Insira a pontuacao do aluno "+(i+1)+":");
            pontuacoes[i] = entrada.nextInt();
            total += pontuacoes[i];
        }
        entrada.close();
        System.out.println("A media dos alunos e "+Math.round(total/pontuacoes.length));
    }
}