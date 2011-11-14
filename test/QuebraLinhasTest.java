import static org.junit.Assert.*;

import org.junit.Test;

public class QuebraLinhasTest {
	
	@Test
	public void deveQuebrarLinhaJabutiPequeno(){
	Object[] linhas = QuebraLinha.quebrar("Um pequeno jabuti.", 20);
	assertArrayEquals(new Object[] {"Um pequeno jabuti."}, linhas);
	}
	
	@Test
	public void deveQuebrarLinhaJabuti(){
	Object[] linhas = QuebraLinha.quebrar("Um pequeno jabuti xereta viu dez cegonhas felizes.", 20);
	assertArrayEquals(new Object[] {"Um pequeno jabuti", "xereta viu dez", "cegonhas felizes."}, linhas);
	}
	
	@Test
	public void deveQuebrarLinhaRato() {
	Object[] linhas = QuebraLinha.quebrar("O rato roeu a roupa do rei de roma.", 11);
	assertArrayEquals(new Object[] {"O rato roeu", "a roupa do", "rei de", "roma."}, linhas);
	}
	
	@Test
	public void deveQuebrarLinhaGato() {
	Object[] linhas = QuebraLinha.quebrar("Um gato comeu o rato atr�s do arm�rio.", 12);
	assertArrayEquals(new Object[] {"Um gato", "comeu o rato", "atr�s do", "arm�rio."}, linhas);
	}
	
	@Test
	public void deveQuebrarLinhaTalher() {
	Object[] linhas = QuebraLinha.quebrar("O melhor talher para comer sopa � a colher.", 25);
	assertArrayEquals(new Object[] {"O melhor talher para", "comer sopa � a colher."}, linhas);
	}
	
	@Test
	public void deveQuebrarLinhaBarata() {
	Object[] linhas = QuebraLinha.quebrar("A barata vestiu vestido roxo", 8);
	assertArrayEquals(new Object[] {"A barata", "vestiu", "vestido", "roxo"}, linhas);
	}
	
	@Test
	public void deveQuebrarLinhaOla() {
	Object[] linhas = QuebraLinha.quebrar("Ol� al�", 4);
	assertArrayEquals(new Object[] {"Ol�", "al�"}, linhas);
	}
	
	@Test
	public void deveQuebrarLinhaOlaMundo() {
	Object[] linhas = QuebraLinha.quebrar("Ol� mundo", 6);
	assertArrayEquals(new Object[] {"Ol�", "mundo"}, linhas);
	}
}
