package Model;

public class damager implements player{
	protected int hp = 3;
	protected int ap = 2;
	private String name = "Damager"; 
	
	public int getHp() {
		return hp;
	}
	
	
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	
	public int getAp() {
		return ap;
	}
	
	
	public void setAp(int ap) {
		this.ap = ap;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
