
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
	}
	boolean pertenece(int elem) {
		return pertenece(raiz,elem);
	}
	void quitar(int elem) {
		// DESAFIO
		throw new RuntimeException("Method Not Implemented yet");
	}
	int cantNodos() {

		return cantNodos(raiz);
		// throw new RuntimeException("Method Not Implemented yet");
	}
	int altura() {
		return altura(raiz);
	//	throw new RuntimeException("Method Not Implemented yet");
	}
	boolean estaBalanceado() {
		throw new RuntimeException("Method Not Implemented yet");
	}
	int minimo() {
		return minimo(raiz);
		//		throw new RuntimeException("Method Not Implemented yet");
	}
	int maximo() {
		return maximo(raiz);
		//throw new RuntimeException("Method Not Implemented yet");
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
		if(nodo==null)
			{
				return 0;
			}
		return 1 + cantNodos(nodo.der) + cantNodos(nodo.izq);
	}
	private boolean pertenece(ABInt.NodoInt nodo, int elem) {
		if(nodo==null){
			return false;
		}
		if(nodo.elem == elem)
			{
				return true;
			}
		return pertenece(nodo.izq, elem) || pertenece(nodo.der, elem);
	}
	private int altura(ABInt.NodoInt nodo) {
		if(nodo==null){
			return 0;
		}
		return 1 + Math.max(altura(nodo.der),altura(nodo.izq));
	}
	private int minimo(ABInt.NodoInt nodo) {
		if(nodo==null)
			throw new RuntimeException("Esto no puede pasar");

		if(esHoja(nodo))
			return nodo.elem;

		if(nodo.der == null)
			return Math.min(nodo.elem,minimo(nodo.izq));
		else
			if(nodo.izq ==null)
			return Math.min(nodo.elem,(minimo(nodo.der)));

		return Math.min(nodo.elem,Math.min(minimo(nodo.der),minimo(nodo.izq)));
	}	
	private boolean esHoja(ABInt.NodoInt nodo) {

		return nodo.der == null && nodo.izq == null;
	}
	private int maximo(ABInt.NodoInt nodo) {
		if(nodo==null)
			throw new RuntimeException("Esto no puede pasar");

		if(esHoja(nodo))
			return nodo.elem;

		if(nodo.der == null)
			return Math.max(nodo.elem,maximo(nodo.izq));
		else
			if(nodo.izq ==null)
			return Math.max(nodo.elem,(maximo(nodo.der)));

		return Math.max(nodo.elem,Math.min(maximo(nodo.der),maximo(nodo.izq)));
	}
	
	@Override
	public String toString() {
		return "Method Not Implemented yet";
	}
}