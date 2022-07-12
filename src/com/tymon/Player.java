package com.tymon;

public class Player {
    private String name;
    private double attackScore;
    private double blockScore;

    public Player(String name, double attackScore, double blockScore){
        this.name = name;
        this.attackScore = attackScore;
        this.blockScore = blockScore;
    }

    public String getName(){
        return this.name;
    }

    public double getAttackScore() {
        return this.attackScore;
    }

    public void setAttackScore(double attackScore) {
        this.attackScore = attackScore;
    }

    public double getBlockScore() {
        return this.blockScore;
    }

    public void setBlockScore(double blockScore) {
        this.blockScore = blockScore;
    }

    public void printInfo(){
        System.out.printf("%s (attack = %.2f, block = %.2f)%n", this.name, this.attackScore, this.blockScore);
    }
}
