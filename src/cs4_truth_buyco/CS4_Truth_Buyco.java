/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4_truth_buyco;

 /**
 *
 * @author TRUTH
 */
public class CS4_Truth_Buyco {
    public static void main(String[] args) {

        String mov1 = "Mean Girls";
        String mov2 = "Legally Blonde";
        String mov3 = "Devil Wears Prada";
    
        int date1 = 2004;
        int date2 = 2001;
        int date3 = 2006;
    
        int rate1 = 84;
        int rate2 = 71;
        int rate3 = 75;
    
        System.out.println("Movie 1 ");
        System.out.println(" ");
        System.out.println("Title: " + mov1);
        System.out.println("Date released: " + date1);
        System.out.println("Rating on Rotten Tomatoes: " + rate1);
        System.out.println(" ");
    
        System.out.println("Movie 2 ");
        System.out.println(" ");
        System.out.println("Title: " + mov2);
        System.out.println("Date released: " + date2);
        System.out.println("Rating on Rotten Tomatoes: " + rate2);
        System.out.println(" ");

        System.out.println("Movie 3 ");
        System.out.println(" ");
        System.out.println("Title: " + mov3);
        System.out.println("Date released: " + date3);
        System.out.println("Rating on Rotten Tomatoes: " + rate3);
        System.out.println(" ");
    
        System.out.println(" ");
        System.out.print("Mean Girls released earlier than Legally Blonde (t/f): ");
    
        if(date1 < date2) {
          	System.out.print("True");	
       	}
        else {
          	System.out.print("False");
        }
    
        System.out.println(" ");
        System.out.print("Devil Wears Prada was rated higher than Legally Blonde (t/f): ");
    
        if(rate1 > rate2) {
           	System.out.print("True");	
       	}
        else {
           	System.out.print("False");
        }
    
        System.out.println(" ");
        System.out.print("Average rating of the movies: ");
        System.out.print((rate1 + rate2 + rate3)/3);
        
    }
    
}
