package State;
import java.awt.Image;

import Entity.Player;
import game.*;

public class StateRun implements State {
	private Player player;
	public StateRun(Player player) {
		this.player = player;
	}
	@Override
	public void jump() {
		player.setvY(20);
		player.setState(new StateJump(player));
	}
	@Override
	public void launchHead() {
		
	}
	@Override
	public Image getImg() {
		return this.player.img;
	}

}
