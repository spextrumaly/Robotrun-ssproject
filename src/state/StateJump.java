package state;
import java.awt.Image;

import entity.Player;
import game.*;

public class StateJump implements State{
	Player player;
	
	public StateJump(Player player) {
		this.player = player;
	}
	@Override
	public void jump(){
		
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
