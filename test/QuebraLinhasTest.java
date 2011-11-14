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
	Object[] linhas = QuebraLinha.quebrar("Um gato comeu o rato atrás do armário.", 12);
	assertArrayEquals(new Object[] {"Um gato", "comeu o rato", "atrás do", "armário."}, linhas);
	}
	
	@Test
	public void deveQuebrarLinhaTalher() {
	Object[] linhas = QuebraLinha.quebrar("O melhor talher para comer sopa é a colher.", 25);
	assertArrayEquals(new Object[] {"O melhor talher para", "comer sopa é a colher."}, linhas);
	}
	
	@Test
	public void deveQuebrarLinhaBarata() {
	Object[] linhas = QuebraLinha.quebrar("A barata vestiu vestido roxo", 8);
	assertArrayEquals(new Object[] {"A barata", "vestiu", "vestido", "roxo"}, linhas);
	}
	
	@Test
	public void deveQuebrarLinhaOla() {
	Object[] linhas = QuebraLinha.quebrar("Olá alô", 4);
	assertArrayEquals(new Object[] {"Olá", "alô"}, linhas);
	}
	
	@Test
	public void deveQuebrarLinhaOlaMundo() {
	Object[] linhas = QuebraLinha.quebrar("Olá mundo", 6);
	assertArrayEquals(new Object[] {"Olá", "mundo"}, linhas);
	}
}
