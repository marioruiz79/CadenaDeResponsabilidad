
package maincadena;

public class ConcreteHandlerOne extends Handler
{
	public void handleRequest(Request request)
	{
		if (request.getValue() < 0)
		{           //if request is eligible handle it
			System.out.println("Valores Negativos son manejados por ConcreteHandlerOne:");
			System.out.println("\tConcreteHandlerOne.HandleRequest : " + request.getDescription()
						 + request.getValue());
		}
		else
		{
			/*super.handleRequest(request);*/
		}
	}
 }