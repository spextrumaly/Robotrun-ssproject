package abstractFactory;

import bodyPart.Body;
import headPart.Head;
import legPart.Leg;

public abstract class PartFactory {
	
	public abstract Head getHead(int i);
	public abstract Body getBody(int i);
	public abstract Leg getLeg(int i);
	
}
