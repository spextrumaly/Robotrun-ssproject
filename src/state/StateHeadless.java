package state;
import java.awt.image.BufferedImage;

import entity.Player;

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
	public BufferedImage getHeadImg() {
		return null;
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
