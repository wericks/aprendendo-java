
public class TesteCollections {

	public static void main( String[] args ) {
		/* //Teste de performance
		final int MAX = 20000;
		long tempoInicio = System.currentTimeMillis ();
		List<Integer> lista = new ArrayList<Integer> ();
		for (int i = 0; i < MAX; i++) {
			lista.add(i);
		}
		for (int i = 0; i < MAX; i++) {
			lista.contains ( i );
		}
		long tempoFim = System.currentTimeMillis ();
		System.out.println ("Tempo total: " + (tempoFim - tempoInicio));
		*/

		/* // Implementando interface List
		java.util.List<String> lista = new java.util.ArrayList<> ();
		lista.add("Antonho");
		lista.add("Justefatzo");
		lista.add("Marquim");
		System.out.println ("\nLista de nomes :" + lista);
		*/

		/* ||||||||||||||||||||||||||||||||||||

		//usando o sort() da classe Collections
		// ctrl + D -> duplicar linha
		java.util.List<String> listaNomeAlunos = new java.util.ArrayList<> ();
		listaNomeAlunos.add("Georgie Leistan");
		listaNomeAlunos.add("Carspian Hystoik");
		listaNomeAlunos.add("Harnold Sokteriun");
		listaNomeAlunos.add("Carliunum");

		System.out.println (listaNomeAlunos);
		//nesse caso o sort
		//organiza com base na quantidade de caracteres
		java.util.Collections.sort ( listaNomeAlunos );
		System.out.println (listaNomeAlunos);

		||||||||||||||||||||||||||||||||||||||| */






	}
}
