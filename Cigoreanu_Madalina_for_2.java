import java.util.Scanner;

public class Cigoreanu_Madalina_for_2 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in); 
		int n = read.nextInt(); 
		read.close();
		
		draw_1(n);
		draw_2(n);
		draw_3(n);
	}
	
	public static void draw_1(int n) {
		for (int i = 1; i < n + 1; ++i) {
			for (int j = 1; j< n+1; ++j) {
				System.out.printf("%3d ", Math.min(i, j));
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void draw_2(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n + 1; j++) {
				System.out.printf("%3d ", n*i + j);
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void draw_3(int n) {
		int[][] square = new int[n][n];
		
		int r = 0, c = 0, start = 1, length = n;
		while (length > 0) {
			for (int i = c; i < (c + length); i++) 	
				square[r][i] = start++;
			
			for (int i = r + 1; i < (r + length); i++)		
				square[i][c + length - 1] = start++;
			
			for (int i = c + length - 2; i > c-1 ; i--)	
				square[r+length-1][i] = start++;
			
			for (int i = r + length -2; i > r; i--)		
				square[i][c] = start++;

			r++; c++;
			length -= 2;
		}

		for (int i = 0; i < square.length; ++i) {
		    for (int j = 0; j < square[i].length; ++j) {
		        System.out.printf("%3d ", square[i][j]);
		    }
		    System.out.println();
		}
	}
}