package State;
import java.awt.Image;

import Entity.Player;
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
		
	}
	@Override
	public Image getImg() {
		return this.player.img;
	}
}
