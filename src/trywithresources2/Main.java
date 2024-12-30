package trywithresources2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
	 String[] lines = new String[] {"Primeira Linha","Segunda Linha","Terceira Linha"};
	 
	 String path = "out.txt";
	 
	 try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){ // cria ou recria o arquivo, na forma new FileWriter(path, true) ele só adiciona ao arquivo
		 for (String line: lines) {
			 bw.write(line); // escreve os itens do array de strings no arquivo
			 bw.newLine(); // cria a próxima linha
		 }
	 }
	 catch (IOException e) {
		 System.out.println("Error: " + e.getMessage());
	 }
	 
	 
	}

}
