package br.com.servidor;

import java.io.PrintStream;

public class ComandoC1 implements Runnable {
	
	private PrintStream saida;

	public ComandoC1(PrintStream saida) {
		this.saida = saida;
	}

	public void run() {
		System.out.println("Executando comando c1"); 

		try {
			Thread.sleep(20000);//simulando algo demorado
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		} 

	    this.saida.println("Comando c1 executado com sucesso!");
	}
}
