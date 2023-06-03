package JavaProjectMatrix;
import java.util.Scanner;

public class matrix5x5 {

	public static void main(String[] args) {
		int myFirstMatrix [][] = new int [3][3];
		int matrixLenght = myFirstMatrix.length;
		Scanner in = new Scanner(System.in);
		System.out.println("Fill in the matrix with integers: ");
        
		for (int i = 0; i <matrixLenght; i++)
        {
            for (int j = 0; j <matrixLenght; j++)
            {
            	System.out.println("Enter value for current row/colum position "+"("+i+","+j+")"+" :");
            	myFirstMatrix[i][j] = in.nextInt();
            }
        }
		
		System.out.println("Your matrix is : ");
        
        for (int i = 0; i <matrixLenght; i++)
        {
            for (int j = 0; j <matrixLenght; j++)
            {
                System.out.print(myFirstMatrix[i][j]+"\t");
            }
             
            System.out.println();
        }
  }
	
	

}



/*
 Faça um programa que leia um matriz A(5,5) e escreve a mesma na tela. Não é
necessário u@lizar métodos.
2. Faça um programa que leia um matriz A(5,5) e escreve a soma dos seus
elementos. A leitura e a soma dos elementos de A, u@lize métodos.
3. Faça um programa que leia um matriz A(6,6) e escreve a soma dos elementos da
sua diagonal principal e da sua diagonal secundária. A leitura e as somas devem
ser feitas por métodos.
4. Faça um programa que leia um matriz A(7,6) e escreve a soma dos elementos da
linha 5 e da coluna 3. A leitura e as somas devem ser feitas por métodos.
5. Faça um programa que leia um matriz A(6,6) e escreve o menor elemento da sua
diagonal secundária. A leitura e a soma devem ser feitas em métodos.
6. Crie uma matriz para armazenar as médias de G1 de 20 alunos de 5 turmas de
Fundamentos de programação. Todos os valores lidos devem pertencer ao
intervalo [0;10]. A seguir,
(a) crie e escreva um vetor contendo a média de cada turma.
(b) crie e escreva um vetor com as posições dos melhores alunos de cada
turma.
 A leitura e a escrita da matriz e o preenchimento e escrita dos vetores devem ser
feitos por métodos.
*/