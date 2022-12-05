/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UTS;

/**
 *
 * @author Dimas Adi Pratama
 */
public class Penyanyi extends Pop{
    public static void main(String[] args) {
      Pop pop = new Pop("Blackpink", "How You Like That");
      Dangdut dangdut = new Dangdut();
      
      pop.singer("Ecylat Story");
      pop.song("Bentuk Cinta");
      pop.cetakLabel();
      
      dangdut.singer("Ayu tingting");
      dangdut.song("Kopi Dandgut");
      dangdut.cetakLabel();
        
        
    }

}
