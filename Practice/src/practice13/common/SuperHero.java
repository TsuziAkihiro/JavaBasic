package practice13.common;

public class SuperHero extends Hero{

	practice13.common.Item equipment;

	public SuperHero(){
		super(25,10,7);
	}

	public int attack() {
		return super.power + getAdditionalDamage;
	}
}
