package state;
import java.awt.Image;

import entity.Player;
import game.*;

public class StateHeadlessJump implements State{
	private Player player;
	public StateHeadlessJump(Player player) {
		this.player = player;
	}
	@Override
	public void jump() {
		
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
