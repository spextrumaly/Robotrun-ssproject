package abstractFactory;

import bodyPart.Body;
import headPart.Head;
import headPart.Head1;
import headPart.Head2;
import legPart.Leg;

public class HeadFactory extends PartFactory {

	@Override
	public
	Head getHead(int i) {
		// TODO Auto-generated method stub
		if ( i == 0 ) return null;
		else if ( i == 1 ) return new Head1();
		else if ( i == 2 ) return new Head2();
		return null;
	}

	@Override
	public
	Body getBody(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public
	Leg getLeg(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
