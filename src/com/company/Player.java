package com.company;
public class Player
{
    private int maxHealth;
    private int health;
    private int armor;
    private int money;
    private int x;
    private int y;
    private int attack;
    private String name;

    public Player(String name){
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        maxHealth = 100;
        health = maxHealth;
        armor = 0;
        money = 0;
        x = 0;
        y = 0;
        attack = 0;
    }

    public void setMaxHealth(int amount){
        maxHealth = amount;
        if(maxHealth <= 0){
            maxHealth = 1;
        }
    }
    public void setHealth(int amount){
        health = amount;
        if(health > maxHealth){
            health = maxHealth;
        }
        else if(health <= 0){
            health = 0;
        }
    }
    public void setMoney(int amount){
        money = amount;
        if(money < 0){
            money = 0;
        }
    }
    public void setX(int amount){
        x = amount;
        if(x < 0){
            x = 0;
        }
    }
    public void setY(int amount){
        y = amount;
        if(y < 0){
            y = 0;
        }
    }
    public void setAttack(int amount){
        attack = amount;
        if(attack < 0){
            attack = 0;
        }
    }

    public void printStats(){
        System.out.println(name + "'s stats");
        System.out.println("Health: " + health + "/" + maxHealth);
        System.out.println("Armor: " + armor + " points");
        System.out.println("Attack: " + attack + " points");
        System.out.println("Money: " + money + " bucks");
        System.out.println("Position: (" + x + "," + y + ")");
        System.out.println("");
    }

    public int getName(){
        return name;
    }
    public int getMaxHealth(){
        return maxHealth;
    }
    public int getHealth(){
        return health;
    }
    public int getArmor(){
        return armor;
    }
    public int getMoney(){
        return money;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getAttack(){
        return attack;
    }
}
