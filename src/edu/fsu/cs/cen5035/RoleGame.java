/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fsu.cs.cen5035;

/**
 *
 * @author Javier
 */
public class RoleGame {

    public static void main(String[] args) {
        Weapon sword = WeaponFactory.getWeapon("sword");
        System.out.println("Sword has " + sword.hit() + " of damage.");
        int armor = 20;
        System.out.println("Swords was able to do " + sword.hit(armor) + " of damage due to an armor with "+armor+ " points.");
        
        //TODO: Add the remainig weapons here
        Weapon arrow = WeaponFactory.getWeapon("arrow");
        System.out.println("Arrow has " + arrow.hit() + " of damage.");
        System.out.println("Arrows are able to do " + arrow.hit(0) + " of damage due to an armor with " +0+ " points.");
        System.out.println("Arrows are able to do " + arrow.hit(armor) + " of damage due to an armor with " +armor+ " points.");

        Weapon axe = WeaponFactory.getWeapon("axe");
        System.out.println("Axe has " + axe.hit() + " of damage.");
        System.out.println("Axes are able to do " + axe.hit(0) + " of damage due to an armor with " +0+ " points.");
        System.out.println("Axes are able to do " + axe.hit(armor) + " of damage due to an armor with " +armor+ " points.");

        Weapon magicstaff = WeaponFactory.getWeapon("magicstaff");
        System.out.println("Magic Staff has " + magicstaff.hit() + " of damage.");
        System.out.println("Staffs are able to do " + magicstaff.hit(0) + " of damage due to an armor with " +0+ " points.");
        System.out.println("Staffs are able to do " + magicstaff.hit(armor) + " of damage due to an armor with " +armor+ " points.");

    }
}
