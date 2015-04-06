
package maincadena;


public class MainCadena {

 public static void main(String[] args) 
	{
		// Setup Chain of Responsibility
		Handler h1 = new ConcreteHandlerOne();
		Handler h2 = new ConcreteHandlerTwo();
		Handler h3 = new ConcreteHandlerThree();
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);

		// Send requests to the chain
		h1.handleRequest(new Request("Valor Negativo ", -1));
		h1.handleRequest(new Request("Valor Negativo ",  0));
		h1.handleRequest(new Request("Valor Negativo ",  1));
		h1.handleRequest(new Request("Valor Negativo ",  2));
		h1.handleRequest(new Request("Valor Negativo ", -5));	    
	}
    
}
