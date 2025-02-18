package br.com.java.screenMatch.calculos;


import br.com.java.screenMatch.modelos.Titulo;


public class CalculadoraDeTempo {

		private int tempoTotal = 0;

		
		public int getTempoTotal() {
			return this.tempoTotal;
		}
		
//		public void inclui(Filme f){
//			this.tempoTotal += f.getDuracaoEmMinutos();
//		}
//		
//		public void inclui(Serie f){
//			this.tempoTotal += f.getDuracaoEmMinutos();
//		}

		public void inclui(Titulo titulo) {
			System.out.println("Adicionando");
			this.tempoTotal += titulo.getDuracaoEmMinutos();
		}
		
}
