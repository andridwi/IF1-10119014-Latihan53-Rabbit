/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119014.latihan53.rabbit;

/**
 *
 * @author Andri
 * Nama : Andri Dwi P
 * Kelas: IF-1
 * NIM  : 10119014
 */
class Rabbit extends Animal{
    private String color, name;
    
    public Rabbit(String name, boolean vegetarian, String food, int legs, String color) {
        super(vegetarian, food, legs);
        this.name = name;
        this.color = color;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public String getName(){
        return this.name;
    }  
}
