package Inheritence;
import java.util.Random;

public class SuperHero extends FictionalChar{
	private boolean heroPower;
	private static int numOfChar = 0;
	
	
	public static int getNumOfChar() {
		return numOfChar;
	}
	
	public SuperHero(String name, int age, double speed, int healthBar, int intelligence, int range, String weapon) {
		super(name, age, speed, healthBar, intelligence, range, weapon);
		numOfChar++;
	}
	public void calcPower() {
		double pow;
		
		pow = this.getAge()*0.1 + this.getSpeed() * 0.5 + this.getHealthBar()*0.5 + this.getIntelligence()*0.5 + this.getRange()*0.2;
		
		int num = (int) Math.random()*100;
		if(num >= 50)
			this.heroPower = true;
		else
			this.heroPower = false;
		
		
		switch(this.getWeapon()) {
		case "Portal Gun" : pow += 4.9; break;
		case "Blue Flame" : pow += 5; break;
		case "Spatula" : pow += 0.5; break;
		case "Revolver" : pow += 3; break; 
		case "Hypnotization" : pow += 3.5; break;
		case "Pistol" : pow += 3.1; break;
		case "LightSaber" : pow += 4; break;
		case "Web" : pow += 3.8; break;
		case "BatMobile" : pow += 3.9; break; 
		case "Katana" : pow += 2.9; break;
		case "Stick" : pow += 2.5; break;
		case "Wand" : pow += 3.7; break;
		case "Magical Cape" : pow += 3.6; break;
		case "Mjolnir" : pow += 4.8; break;
		case "Spear And Shield" : pow += 3.2; break;
		case "Baton" : pow += 3.8; break;
		case "The Trident" : pow += 4.7; break;
		}
		
		if(heroPower)
			pow *= 1.20;
		
		pow = Math.round(pow);
		
		this.setPower(pow);
	}
	
	
	@Override
	public String toString() {
		return super.toString() + "Hero Power= " + heroPower;
	}
	
}