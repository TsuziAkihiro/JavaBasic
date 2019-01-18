package practice13.common;

public class SuperHero extends Hero{

//	コンストラクタ
	public SuperHero(){
		super();
	}

	private Item equipment;

	public Item getEquipment() {
		return this.equipment;
	}

	public void setEquipment(Item equipment) {
		this.equipment = equipment;
	}


	public int attack() {
		return super.attack()+ this.equipment.getAdditionalDamage();
	}
}
