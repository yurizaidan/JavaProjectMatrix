package JavaProjectMatrix;
import java.util.Scanner;

public class matrixSum {

	public static void main(String[] args) {
		int matrix [][] = new int [5][5];
		readElements(matrix,5,5);
		printElements(matrix,5,5);
		sumElements(matrix,5,5);	

	}
	
	public static void readElements (int matrix [][], int i, int j) {
		int matrixLenght = matrix.length;
		Scanner in = new Scanner(System.in);
		System.out.println("Fill in the matrix with integers: ");
        
		for (i = 0; i<matrixLenght; i++)
        {
            for (j = 0; j<matrixLenght; j++)
            {
            	System.out.println("Enter value for current row/colum position "+"("+i+","+j+")"+" :");
            	matrix[i][j] = in.nextInt();
            }
        }
	}
	
	public static void sumElements (int matrix [][], int i, int j) {
        int sum=0;
        int matrixLenght = matrix.length;
		for (i = 0; i<matrixLenght; i++)
        {
            for (j = 0; j<matrixLenght; j++)
            {
            	sum=sum+matrix[i][j];
            }
        }
		System.out.println("Sum of elements is: "+sum);
	}
		
	public static void printElements (int matrix [][], int i, int j) {
		int matrixLenght = matrix.length;
		System.out.println("Your matrix is : ");
        
        for (i = 0; i <matrixLenght; i++)
        {
            for (j = 0; j<matrixLenght; j++)
            {
                System.out.print(matrix[i][j]+"\t");
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