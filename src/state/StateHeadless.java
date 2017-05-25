package state;
import java.awt.Image;

import entity.Player;
import game.*;

public class StateHeadless implements State{
	private Player player;
	public StateHeadless(Player player) {
		this.player = player;
	}
	@Override
	public void jump() {
		player.setvY(20);
		player.setState(new StateHeadlessJump(player));
	}
	@Override
	public void launchHead() {
		
	}
	@Override
	public Image getHeadImg() {
		return null;
	}
	@Override
	public Image getBodyImg() {
		return player.bodyImg;
	}
	@Override
	public Image getWheelImg() {
		return player.wheelImg;
	}
}
