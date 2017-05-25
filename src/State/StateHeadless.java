package State;
import java.awt.Image;

import Entity.Player;
import game.*;

public class StateHeadless implements State{
	private Player player;
	public StateHeadless(Player player) {
		this.player = player;
	}
	@Override
	public void jump() {
		
	}
	@Override
	public void launchHead() {
		
	}
	@Override
	public Image getImg() {
		return this.player.headlessImg;
	}
}
