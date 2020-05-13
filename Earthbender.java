package test;

import javax.swing.JOptionPane;

public class Earthbender extends Pokemon{
Earthbender(int health, int strength, int speed, int stun){
	super(1600, 400, 20, 1, "thicc ass", strength);
  	int jk = Integer.parseInt(JOptionPane.showInputDialog("Choose what you want to improve: \n1. Health(+150) \n2. Damage(+100) \n3. Speed(+75)\n4.stun(+1)"));
  	if (jk == 1) {
  		health = health +150;
  	}else if(jk == 2) {
  		strength = strength +100;
  		
  	}else if(jk == 3) {
  		speed = speed+75;
  		
  	}else if(jk == 4) {
  		stun = stun+1;
  		
  	}else {
  		callupon(health, strength, speed, stun);
  		}
  	System.out.println("You unlocked a new power called the special!\n This power does twice the amount of damage as a normal attack, but it should only be used in dire circumstances because you loose 100 health, and this only works 75 percent of the time\n You will also become very tired afterwards, so you will be stunned");
  	special =  2*strength;
	battle(health, strength, speed, stun, ehealth, estrength, espeed, estun, eability, special);
}

}



