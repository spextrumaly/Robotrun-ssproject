package state;
import java.awt.Image;

import entity.Player;
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
		player.setHeadlessTime(100);
		player.setState(new StateHeadless(player));
	}
	@Override
	public Image getHeadImg() {
		return player.headImg;
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
