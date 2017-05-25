package state;
import java.awt.Image;

public interface State {
	public void jump();
	public void launchHead();
	public Image getHeadImg();
	public Image getBodyImg();
	public Image getWheelImg();
}
