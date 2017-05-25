package state;

import java.awt.image.BufferedImage;

import entity.Player;


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
