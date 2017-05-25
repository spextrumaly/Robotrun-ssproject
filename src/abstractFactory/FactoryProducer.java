package abstractFactory;

public class FactoryProducer {
	
	public static PartFactory getFactory(String choice){
		if ( choice.equalsIgnoreCase("BODY") ) return new BodyFactory();
		else if ( choice.equalsIgnoreCase("LEG") ) return new LegFactory();
		else if ( choice.equalsIgnoreCase("HEAD") ) return new HeadFactory();
		return null;
	}
}
