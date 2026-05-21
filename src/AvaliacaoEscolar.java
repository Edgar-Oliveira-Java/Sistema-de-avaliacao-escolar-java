public class AvaliacaoEscolar {
    public static void main(String[] args) {
        String [] alunos = {"Robert", "Bruce", "Peter"};
        double [][] notas = new double[3][3];

        notas[0][0] = 5.6;//Matematica.
        notas[0][1] = 7;//Portugues.
        notas[0][2] = 4;//Historia.

        notas[1][0] = 7;
        notas[1][1] = 9;
        notas[1][2] = 7;

        notas[2][0] =  0;
        notas[2][1] = 1;
        notas[2][2] = 5;

        for(int i = 0;i<alunos.length;i++){
            System.out.println(alunos[i]);
            double sum = 0;//Essa variavel, vai resetar após o fim do loop abaixo, resetando pra o proximo aluno
            for(int j = 0;j<notas[i].length;j++){
                sum += notas[i][j];
            }
            int media = (int) Math.round(sum/notas[i].length);//Garanto que o numero que vai sair, seja "int".

            switch(media){
                case 9, 10:
                    System.out.println("Sua Nota é: A");
                    System.out.println("Passou de Ano!");
                    System.out.println();
                    break;
                case 7, 8:
                    System.out.println("Sua Nota é: B");
                    System.out.println("Passou de Ano!");
                    System.out.println();
                    break;
                case 5, 6:
                    System.out.println("Sua Nota é: C");
                    System.out.println("Passou de Ano!");
                    System.out.println();
                    break;
                case 3, 4:
                    System.out.println("Sua Nota é: D");
                    System.out.println("Recuperação!");
                    System.out.println();
                    break;
                case 0, 1, 2:
                    System.out.println("Repetiu!");
                    System.out.println();
            }
        }
    }
}