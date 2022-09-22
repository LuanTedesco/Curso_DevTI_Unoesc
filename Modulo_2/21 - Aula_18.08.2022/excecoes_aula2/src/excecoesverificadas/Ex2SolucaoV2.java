package excecoesverificadas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ex2SolucaoV2 {

	public static void mostraArquivo() {
		File arquivo = new File("c:\\temp\\arquivo.txt");

		try (Scanner sc = new Scanner(arquivo)) {
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		} catch (FileNotFoundException e) {
			System.out.println("Erro abrindo arquivo: " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		mostraArquivo();
	}

}
