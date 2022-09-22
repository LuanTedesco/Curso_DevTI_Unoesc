import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class exercicio2 {

  public static void main(String[] args) {
    File arquivo = new File("c:\\temp\\arquivo.txt");

    Scanner scan = null;

    try {
      scan = new Scanner(arquivo);

      while (scan.hasNextLine()) {
        System.out.println(scan.nextLine());
      }
    } catch (FileNotFoundException e) {
      System.out.println("Arquivo não existe");
    } finally {
      if (scan != null) {
        scan.close();
      }
    }
  }
}
