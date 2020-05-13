package test;

import java.util.*;
import javax.swing.JOptionPane;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Hashtable;
public class science1 {
	static double x;
    public static void main(String[] args) {
    	int e = Integer.parseInt(JOptionPane.showInputDialog("1. Mass to weight\n2.Weight to mass"));
    	if(e==1) {
    		masstoweight();
    		
    	}else if(e==2) {
    		weighttomass();
    		
    	}else {
    		System.out.println("Please type either 1 or two");
    		main(null);
    		
    	}
    }
    public static void masstoweight() {
      	int e = Integer.parseInt(JOptionPane.showInputDialog("Choose a planet:\n1:Earth\n2:Mars\n3:Jupiter\n4:Neptune\n5:Uranus\n6:Saturn\n7:Venus\n8:Mercury"));
      	switch(e) {
      	case 1:
      		 x = 9.807;
      	break;
      	case 2:
      		 x = 3.711;
      		break;
      	case 3:
      		 x = 24.79;
      		break;
      	case 4:
      		 x = 11.15;
      	break;
      	case 5:
      	 x = 8.87;
      			break;
      	case 6:
      		 x = 10.44;
      		break;
      	case 7:
      		 x = 8.87;
      		break;
      	case 8:
      		 x = 3.7;
      		break;
      		default:
      			System.out.println("Please type a number between 1 and 8");
      	masstoweight();
      	break;}
      	double w = Double.parseDouble(JOptionPane.showInputDialog("What is your mass"));
    double answer = x*w;

	double er = Double.parseDouble(JOptionPane.showInputDialog("Your weight is: "+answer+"N"));
    	System.exit(0);
    }
  public static void weighttomass() {
  	int e = Integer.parseInt(JOptionPane.showInputDialog("Choose a planet:\n1:Earth\n2:Mars\n3:Jupiter\n4:Neptune\n5:Uranus\n6:Saturn\n7:Venus\n8:Mercury"));
  	switch(e) {
  	case 1:
  		 x = 9.807;
  	break;
  	case 2:
  		 x = 3.711;
  		break;
  	case 3:
  		 x = 24.79;
  		break;
  	case 4:
  		 x = 11.15;
  	break;
  	case 5:
  	 x = 8.87;
  			break;
  	case 6:
  		 x = 10.44;
  		break;
  	case 7:
  		 x = 8.87;
  		break;
  	case 8:
  		 x = 3.7;
  		break;
  		default:
  			System.out.println("Please type a number between 1 and 8");
  	weighttomass();
  	break;}
  	double w = Double.parseDouble(JOptionPane.showInputDialog("What is your weight"));
double answer = w/x;

	double er = Double.parseDouble(JOptionPane.showInputDialog("Your mass is: "+answer+"kg"));
	System.exit(0);
	}
}