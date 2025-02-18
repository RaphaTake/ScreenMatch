import br.com.java.screenMatch.calculos.CalculadoraDeTempo;
import br.com.java.screenMatch.calculos.FiltroRecomendacao;
import br.com.java.screenMatch.modelos.Episodio;
import br.com.java.screenMatch.modelos.Filme;
import br.com.java.screenMatch.modelos.Serie;

public class Main {

	public static void main(String[] args) {
		Filme meuFilme = new Filme();
		meuFilme.setNome("Toy Story");
		meuFilme.setAnoDeLancamento(2007);
		meuFilme.setDuracaoEmMinutos(130);
		
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(5);
		meuFilme.avalia(8);
		meuFilme.avalia(9);

		System.out.println("Duração em minutos: " + meuFilme.getDuracaoEmMinutos());
		System.out.println(meuFilme.pegaMedia());
		System.out.println(meuFilme.getTotalDeAvaliacao());
		
		Serie lost = new Serie();
		lost.setNome("Lost");
		lost.setAnoDeLancamento(2000);
		lost.exibeFichaTecnica();
		lost.setTemporadas(10);
		lost.setEpisodiosPorTemporada(10);
		lost.setMinutosPorEpisodio(50);
		System.out.println("Duração em minutos: " + lost.getDuracaoEmMinutos());
		
		
		Filme outroFilme = new Filme();
		outroFilme.setNome("Carros");
		outroFilme.setAnoDeLancamento(2000);
		outroFilme.setDuracaoEmMinutos(120);
		
		CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
		calculadora.inclui(meuFilme);
		calculadora.inclui(outroFilme);
		calculadora.inclui(lost);
		System.out.println(calculadora.getTempoTotal()); 	
		
		FiltroRecomendacao filtro = new FiltroRecomendacao();
		filtro.filtra(meuFilme);
		
		Episodio episodio = new Episodio();
		episodio.setNumero(1);
		episodio.setSerie(lost);
		episodio.setTotalVisualizacoes(300);
		filtro.filtra(episodio);
		
		
		
	}

}
