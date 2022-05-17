
public class ABInt{ // Arbol binario de enteros
	private NodoInt raiz;
	
	private class NodoInt{ // Clase interna
		int elem;
		NodoInt izq,der;
		NodoInt(int valor) {
			elem=valor;
		}
		@Override
		public String toString() {
			return " "+elem+" ";
		}
	
		
	}
	
	// AQUI VAN LOS METODOS...
	void agregar(int elem) {
		raiz = agregar(raiz,elem);
			
		if(!pertenece(elem));

		throw new RuntimeException("Method Not Implemented yet");


	}
	
	boolean pertenece(int elem) {
		if(raiz==null){
			return false;
		}
		return pertenece(raiz,elem);
	}


	void quitar(int elem) {
		// DESAFIO
		throw new RuntimeException("Method Not Implemented yet");
	}
	int cantNodos() {
		if(raiz==null)
			return 1;
		else 
			return cantNodos(raiz);
		// throw new RuntimeException("Method Not Implemented yet");
	}
	

	int altura() {
		throw new RuntimeException("Method Not Implemented yet");
	}
	boolean estaBalanceado() {
		throw new RuntimeException("Method Not Implemented yet");
	}
	int minimo() {
		throw new RuntimeException("Method Not Implemented yet");
	}
	int maximo() {
		throw new RuntimeException("Method Not Implemented yet");
	}
	


	private ABInt.NodoInt agregar(ABInt.NodoInt nodo, int elem) {
		if(nodo==null)
			return new NodoInt(elem); //Lo creo y lo utilizo en otro lado
		
		if (nodo.izq != null)
			nodo.der = agregar(nodo.der, elem);
		else
			nodo.izq = agregar(nodo.izq, elem);

		return nodo;
	}
	private int cantNodos(ABInt.NodoInt nodo) {
	
		if(nodo.der!=null)
			cantNodos(nodo.der);

		if(nodo.izq!=null)
			cantNodos(nodo.izq);


		return 1;
	}

	private boolean pertenece(ABInt.NodoInt nodo, int elem) {

		return false;
	}

	@Override
	public String toString() {
		return "Method Not Implemented yet";
	}
}