package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Usuario;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Usuario usuario = new Usuario(null, null, null);
		usuario.name = "Gillian";
		usuario.setId(2023);
		

		System.out.println(usuario);

		sc.close();
	}
}
