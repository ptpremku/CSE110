package com.tymon;

class Monster {
// complete this class
private String name;
private int health;
private Weapon weapon;

public Monster(String name, int health, Weapon weapon){
        this.name = name;
        this.health = health;
        this.weapon = weapon;

        }

public String getName(){
        return name;
        }


public int getHealth(){
        return health;
        }


public String getWeaponName(){
        return weapon.getName();
        }

public int attack(Monster toAttack){
        int damage = (int)(Math.random() * weapon.getMaxDamage());

        toAttack.health -= damage;

        return damage;
        }
        }
