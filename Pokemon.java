package test;
import java.lang.Math;
import java.util.Random;

import javax.swing.JOptionPane;

import java.util.*;
public class Pokemon {
	static String ability;
	public static int ehealth;
	public static int estrength;
	public static int espeed;
	public static int estun;
	public static String eability;
	public static int special;
	public static int level = 1;
Pokemon(int ehealth, int estrength, int espeed, int estun, String eability, int special){
	this.ehealth = ehealth;
	this.estrength = estrength;
	this.espeed = espeed;
	this.estun = estun;
	this.eability = eability;
	this.special = special;
}
    public static boolean stun() {
    	Random random = new Random();
    	int rand = 0;
    	while (true){
    	    rand = random.nextInt(4);
    	    if(rand !=0) break;
    	}
    	if(rand == 1) {

    return true;
    	} else {
    		return false;
    	}
    }
    public static boolean specialworks() {
    	Random random = new Random();
    	int rand = 0;
    	while (true){
    	    rand = random.nextInt(5);
    	    if(rand !=0) break;
    	}
    	if(rand >= 3) {

    return true;
    	} else {
    		return false;
    	}
    }
    public static int attackorstun() {
    	Random random = new Random();
    	int rand = 0;
    	while (true){
    	    rand = random.nextInt(3);
    	    if(rand !=0) break;
    	}
    	if(rand == 1) {
    	
    return 1;
    	} else {
    		return 2;
    	}
    }
    public static int attack(int strength, int ehealth) {
    	return ehealth-strength;
    }

    public static void main(String[] args){
 try {
        System.out.println("Welcome to Daniel's Game");
        System.out.println("\nFire. Water. Earth. Air. The four nations lived in harmony until the Avatar attacked. \nFueled by anger, this avatar, whose name remains unknown, has sought to take over the world.\nLegends say that he lives deep in the Himalayas and wields the power of all four elements, but nobody can say for sure");
        System.out.println("It is your job to save the world from catastrophe");
        String y = (JOptionPane.showInputDialog("Are you up for the Challenge?"));
        if(y.toLowerCase().equals("yes")) {
            System.out.println("You better be");
        } else {
            System.out.println("The world ends cuz you suck");
            System.exit(0);
        }
             name();

    }
 catch(java.lang.NumberFormatException e) {
	 System.out.println("You did not type anything, therefore all progress will be lost");
	 main(null);
 }
 }
    public static void name() {
String type;
String name  = (JOptionPane.showInputDialog("What is Your Name?"));


        int x = Integer.parseInt(JOptionPane.showInputDialog("\nChoose a Pokemon: \n1. Fire \n2. Water\n 3. Earth \n4. Air"));
if(x==1||x==2||x==3||x==4) {
	
}else {
	System.out.println("Yuo scuk at tyopging nbumdsers");
	name();
}
switch(x) {
case 1:
	ability = "hot as";
	type = "Fire";
break;
case 2:
	ability = "white water";
	type = "Water";
	break;
case 3:
	ability = "shit";
	type = "Earth";
	break;
default:
	ability = "blow";
	type = "Air";
break;
}

System.out.println("You are an "+type+"bender born from a small vilage called Ronit's Ass.");
BS(name,"Grant", type );        
}
   
    public static void BS(String me, String enemy, String type) {
    	System.out.println("As a child were trained by the great "+ type +"bender Daniel, in an abandoned mineshaft, but one day he left to pursue a journey and never came back...");
    	System.out.println("You realize that he was taken by the Avatar and killed");
    	System.out.println("You decide to avenge him, and save the world from the Avatar.");
    	switch(type) {
    	case "Fire":
    		breake(1200, 300, 40, 1);
    	break;
    	case "Water":
    		breake(1200, 100, 60, 2);
    		break;
    	case "Earth":
    		breake(1200, 200, 20, 3);
    		break;
    	default:
    		breake(1200, 100, 40, 3);
    	break;
    	}
    }
    public static void breake(int health, int strength, int speed, int stun) {
    	   Pokemon ass;
    	ass = new Airbender(health, strength, speed, stun);
    	    }
    public static void battle(int health, int strength, int speed, int stun,int ehealth, int estrength, int espeed, int estun, String eability, int special) {
    	System.out.println("A heavy attack does a fixed amount of damage and a stun has a 33% chance to skip a given number of your opponent's moves. Whoever has a greater speed goes first.");
        if (level == 2) {
        	String ab = (JOptionPane.showInputDialog("Type stats to get your new stats"));
        	if(ab.equalsIgnoreCase("stats")) {
                System.out.println("health:"+health+"\nheavy attack damage:"+strength+"\nYour speed:"+speed+"\nno. of moves that your opponent loses if you manage to stun your opponent: "+stun+"\nYour special damage:" +special);
                System.out.println("You meet a wild ass and it attacks you! What do you want 2 do");
                battle1(health, strength, speed, stun, ehealth, estrength, espeed, estun, eability, special);
                } else {
                 	battle(health, strength, speed, stun, ehealth, estrength, espeed, estun, eability, special);
          
                	}
        }else {
    	String ab = (JOptionPane.showInputDialog("Type stats to get your stats"));
        if(ab.equalsIgnoreCase("stats")) {
        System.out.println("health:"+health+"\nheavy attack damage:"+strength+"\nYour speed:"+speed+"\nno. of moves that your opponent loses if you manage to stun your opponent: "+stun);
        System.out.println("You meet a wild ass and it attacks you! What do you want 2 do");
        battle1(health, strength, speed, stun, ehealth, estrength, espeed, estun, eability, special);
        } else {
         	battle(health, strength, speed, stun, ehealth, estrength, espeed, estun, eability, special);
  
        	}

    }
        }
    public static void stuned(int health, int strength, int speed, int stun,int ehealth, int estrength, int espeed, int estun, String eability, int special) {

    	for (int i = 0; i<stun+1; i++) {
            int jk = Integer.parseInt(JOptionPane.showInputDialog("press 1 for heavy attack, and 2 for stun"));
            if(jk == 1) {
            	System.out.println("You use "+ability);
        		System.out.println(ability+" is very effective");
   ehealth = attack(strength, ehealth);
   System.out.println("Your opponent has "+ ehealth+" health");
    }else if(jk==2) {
    	System.out.println("You use stun while your opponent is stunned");
            	if(stun()==true) {
                	System.out.println("Stun is very effective");
            		stun  = 2*stun;
            		stuned(health, strength, speed, stun, ehealth, estrength, espeed, estun, eability, special);
            		
            	}else {
            		System.out.println("Stun is not very effective");

            	}
            	
            }
            }
    	enemygoesfirst(health, strength, speed, stun, ehealth, estrength, espeed, estun, eability, special);
    }
    public static void stuned1(int health, int strength, int speed, int stun,int ehealth, int estrength, int espeed, int estun, String eability, int special) {

    	for (int ewe= 0;ewe<estun+1; ewe++) {
            if(attackorstun() == 1) {
      		  System.out.println("Your opponent uses "+ eability+ " while you are stunned");
    		  System.out.println("It is very effective");
   health = attack(estrength, health);
	System.out.println("You have "+ health+" health");
    }else if(attackorstun()==2) {
    	System.out.println("Your opponent uses stun while you are stunned");
            	if(stun()==true) {
          		  System.out.println("It is very effective");
          		  stun = 2*stun;
            		stuned1(health, strength, speed, stun, ehealth, estrength, espeed, estun, eability, special);
            	}else {
            		System.out.println("It is not very effective");
            	}
            }
           }
    	yougofirst(health, strength, speed, stun, ehealth, estrength, espeed, estun, eability, special);
    }
  public static void enemygoesfirst(int health, int strength, int speed, int stun,int ehealth, int estrength, int espeed, int estun, String eability, int special) {
	  if (ehealth>=1&&health>=1) {
		  System.out.println("\nYour opponent attacks");
		  attackorstun();
	  if(attackorstun() == 1) {
		  System.out.println("Your opponent uses "+ eability);
		  System.out.println("It is very effective");
    	health = attack(estrength, health);
    	System.out.println("You have "+ health+" health");
    	}else {
  		  System.out.println("Your opponent uses stun");
    	        	if(stun()==true) {
    	          		System.out.println("Stun is very effective");
    	        		stuned1(health, strength, speed, stun, ehealth, estrength, espeed, estun, eability, special);
    	        	}
    	        	else {
    	          		System.out.println("Stun is not very effective");
    	        		yougofirst(health, strength, speed, stun, ehealth, estrength, espeed, estun, eability, special);

    	        	}
    	        }
    yougofirst(health, strength, speed, stun, ehealth, estrength, espeed, estun, eability, special);
  }
  else if(health < -100) {
	  System.out.println("OVERKILL!!!!!!!!!!!");
	  System.out.println("you died");
	  main(null);
  }else if(ehealth < -100) {
	  System.out.println("OVERKILL!!!!!!!!!!!");
	  System.out.println("Your opponent died");
	  callupon(health, strength, speed, stun);
	  }
  else if(health<1) {
	  System.out.println("you died");
	  main(null);
  }else if(ehealth < 1) {
	  System.out.println("Your opponent died");
	  callupon(health, strength, speed, stun);
	  }
  
	  }

  public static void yougofirst(int health, int strength, int speed, int stun,int ehealth, int estrength, int espeed, int estun, String eability, int special) {
	  if (ehealth>=1&&health>=1) {
		  System.out.println("\nYou attack");
	    	
  	int jk = Integer.parseInt(JOptionPane.showInputDialog("press 1 for heavy attack, 2 for stun, and 3 for special"));
  	if (jk==3 && level == 2) {
  	System.out.println("You use special attack");
  	if(specialworks() == true) {
  	System.out.println("It is very effective");
  	ehealth = attack(strength, ehealth);
  	health = health-100;
  	System.out.println("You lost 100 health. Your health now is"+health);
  	System.out.println("Your opponent has "+ ehealth+" health");
  	stuned1(health, strength, speed,stun, ehealth,estrength,espeed,estun,eability, special);
  	}
  	else {
  		System.out.println("Special is not very effective");
  	}
  	}
  	else if(jk==3 && level == 1) {
  		System.out.println("You have not unlocked this ability yet");
  		yougofirst(health, strength, speed, stun, ehealth, estrength, espeed, estun, eability, special);
  	}
  	else if(jk == 1) {
	  System.out.println("You use "+ ability);
	  System.out.println("It is very effective");
ehealth = attack(strength, ehealth);
System.out.println("Your opponent has "+ ehealth+" health");
}else if(jk==2) {
	System.out.println("You use stun");
  	if(stun()==true) {
  		System.out.println("Stun is very effective");
  		stuned(health, strength, speed, stun, ehealth, estrength, espeed, estun, eability, special);
  	}
  	else {
  		System.out.println("Stun is not very effective");
	  enemygoesfirst(health, strength, speed, stun, ehealth, estrength, espeed, estun, eability, special);
  }
  }
  
  enemygoesfirst(health, strength, speed, stun, ehealth, estrength, espeed, estun, eability, special);
  }else if(health < -100) {
	  System.out.println("OVERKILL!!!!!!!!!!!");
	  System.out.println("you died");
main(null);
  }else if(ehealth < -100) {
	  System.out.println("OVERKILL!!!!!!!!!!!");
	  System.out.println("Your opponent died");
	  callupon(health, strength, speed, stun);

  }
  else if(health<1) {
	  System.out.println("you died");
	  main(null);
  }else if(ehealth < 1) {
	  System.out.println("Your opponent died");
	callupon(health, strength, speed, stun);  	  
  }
	  }
  public static void callupon(int health, int strength, int speed, int stun) {
	  level=level+1;
	  Pokemon paladin;
	  paladin = new Earthbender(health, strength, speed, stun);
  }
  
    public static void battle1(int health, int strength, int speed, int stun,int ehealth, int estrength, int espeed, int estun, String eability, int special) {
        
       
        if(espeed>speed) {
          	System.out.println("Your opponent is faster and attacks first");
        	enemygoesfirst(health, strength, speed, stun, ehealth, estrength, espeed, estun, eability, special);
        }else {
          	System.out.println("You are fast and attack first");
        	yougofirst(health, strength, speed, stun, ehealth, estrength, espeed, estun, eability, special);
    }

}
}



