package excecoesverificadas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex2SolucaoV1 {
	
	public static void main(String[] args) {
		File arquivo = new File("c:\\temp\\arquivo.txt");
		
		Scanner sc = null;
		try {
			sc = new Scanner(arquivo);
			
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			if (sc != null) {
				sc.close();				
			}
		}
	}
	
}
