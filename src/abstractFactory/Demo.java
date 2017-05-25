package abstractFactory;

import bodyPart.Body;
import headPart.Head;
import legPart.Leg;

public class Demo {
	
	public static void main( String[] args ){
		
		PartFactory legFactory = FactoryProducer.getFactory( "LEG" );
		PartFactory headFactory = FactoryProducer.getFactory( "HEAD" );
		PartFactory bodyFactory = FactoryProducer.getFactory( "BODY" );
		
		Head h = headFactory.getHead(1);
		Body b = bodyFactory.getBody(1);
		Leg l = legFactory.getLeg(1);
		
		h.draw();
		b.draw();
		l.draw();
		
		System.out.println("print robot r information");
		Robot r = new Robot (h,b,l);
		r.print();
	}
}
