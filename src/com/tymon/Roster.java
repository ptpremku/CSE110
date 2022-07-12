package com.tymon;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileInputStream;

public class Roster {
    private ArrayList<Player> playerList;

    public Roster() {
        this.playerList = new ArrayList<>();
    }

    public Roster(String rosterFileName) throws IOException {
        this.playerList = new ArrayList<>();
        String first_name;
        String last_name;
        double attack;
        double block;

        FileInputStream x = new FileInputStream(rosterFileName);
        Scanner scnr = new Scanner(x);


        while (scnr.hasNext()) {
            first_name = scnr.next();
            last_name = scnr.next();
            attack = scnr.nextDouble();
            block = scnr.nextDouble();
            this.playerList.add(new Player(first_name + " " + last_name, attack, block));
        }

        x.close();
    }

    public void addPlayer(String name, double attack, double block) {
        this.playerList.add(new Player(name, attack, block));
    }

    public int getPlayerCount() {
        System.out.println(playerList.size());
        return this.playerList.size();
    }

    public void printAllPlayers() {
        for (int i = 0; i < playerList.size(); i++) {
            Player playerFromArray = playerList.get(i);
            playerFromArray.printInfo();
        }
    }

    public void printTopAttackers() {
        double y = 0.0;
        double a1 = 0.0;
        int x = 0;
        int a;
        int c = 0;


        for (int i = 0; i < playerList.size(); i++) {
            Player playerFromArray = playerList.get(i);
            if (playerFromArray.getAttackScore() > y) {
                y = playerFromArray.getAttackScore();
                x = i;
            }
        }

        for (a = 0; a < playerList.size(); a++) {
            Player playerFromArray = playerList.get(a);
            if (playerFromArray.getAttackScore() < y && playerFromArray.getAttackScore() > a1) {
                a1 = playerFromArray.getAttackScore();
                c = a;
            }
        }

        Player playerFromArray = playerList.get(x);
        playerFromArray.printInfo();

        Player second = playerList.get(c);
        second.printInfo();

    }

    public void printTopBlockers() {
        double y = 0.0;
        double a1 = 0.0;
        int x = 0;
        int a;
        int c = 0;


        for (int i = 0; i < playerList.size(); i++) {
            Player playerFromArray = playerList.get(i);
            if (playerFromArray.getBlockScore() > y) {
                y = playerFromArray.getBlockScore();
                x = i;
            }
        }

        for (a = 0; a < playerList.size(); a++) {
            Player playerFromArray = playerList.get(a);
            if (playerFromArray.getBlockScore() < y && playerFromArray.getBlockScore() > a1) {
                a1 = playerFromArray.getBlockScore();
                c = a;
            }
        }

        Player playerFromArray = playerList.get(x);
        playerFromArray.printInfo();

        Player second = playerList.get(c);
        second.printInfo();

    }

    public Player getPlayerByName(String name) {
        for (int i = 0; i < playerList.size(); i++) {
            Player playerFromArray = playerList.get(i);
            if (playerFromArray.getName().equals(name)){
                return playerFromArray;
            }
        }
        return null;
    }
}

