package state;
import java.awt.image.BufferedImage;

import entity.Player;

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
	public BufferedImage getHeadImg() {
		return player.headImg;
	}
	@Override
	public BufferedImage getBodyImg() {
		return player.bodyImg;
	}
	@Override
	public BufferedImage getWheelImg() {
		return player.wheelImg;
	}

}
