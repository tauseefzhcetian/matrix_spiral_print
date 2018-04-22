package com.iplusplus.tauseef.dsalgo;

import java.util.Arrays;

/**
 * @author Ahmed
 * Prints given matrix in spiral form using recursion
 *
 */
public class MatrixSpiral {

	public static void main(String[] args) {
		int rows = 3;
        int cols = 6;
        int matrix[][] = { 	{1,  2,  3,  4,  5,  6},
                      		{7,  8,  9,  10, 11, 12},
                      		{13, 14, 15, 16, 17, 18}
                    	};
        spiralPrint(rows,cols,matrix);
        System.out.println();
        
        int rows1 = 4;
        int cols1 = 6;
        int matrix1[][] = { 	{1,  2,  3,  4,  5,  6},
          						{7,  8,  9,  10, 11, 12},
          						{13, 14, 15, 16, 17, 18},
          						{22, 23, 24, 25, 26, 27}
        				};
        spiralPrint(rows1,cols1,matrix1);
        System.out.println();
        
        int rows2 = 2;
        int cols2 = 4;
        int matrix2[][] = { 	{1,  2,  3,  4},
        						{7,  8,  9,  10}
        				};
        spiralPrint(rows2,cols2,matrix2);
        System.out.println();

	}
	
	private static void spiralPrint(int rows, int cols, int[][]matrix) {
	
		int[][] traversed = new int[rows][cols];
		for(int i=0;i<traversed.length;i++) {
			Arrays.fill(traversed[i], 0);	
		}
		spiral(matrix,0,rows-1,0,cols-1,traversed);
	}

	private static void spiral(int[][] matrix, int rowstart,int rowend, int colstart,int colsend, int[][] traversed) {
		
			// print left to right
			for (int i = colstart; i <= colsend; i++) {
				if(traversed[rowstart][i]==0) {
					System.out.print(matrix[rowstart][i]+" ");
					traversed[rowstart][i] = 1;
				}
			}
		
			//print top to bottom
			for (int i = rowstart+1; i <= rowend; i++) {
				if(traversed[i][colsend]==0) {
					System.out.print(matrix[i][colsend]+" ");
					traversed[i][colsend] = 1;
				}
			}
			
			//print right to left
			for (int i = colsend-1; i >= colstart; i--) {
				if(traversed[rowend][i]==0) {
					System.out.print(matrix[rowend][i]+" ");
					traversed[rowend][i] = 1;
				}
				
			}
			
			//print right to left
			for (int i = rowend-1; i > rowstart; i--) {
				if(traversed[i][colstart]==0) {
					System.out.print(matrix[i][colstart]+" ");
					traversed[i][colstart] = 1;
				}
			}
			
			if(rowstart>=rowend||colstart>=colsend) {
				return;
			}
			spiral(matrix,rowstart+1,rowend-1,colstart+1,colsend-1,traversed);
			
	}
	
	
	

}
