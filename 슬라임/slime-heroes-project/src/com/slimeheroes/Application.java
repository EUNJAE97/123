package com.slimeheroes;

import com.slimeheroes.game.PlayGame;
import com.slimeheroes.game.StartGame;
import com.slimeheroes.hero.Class1Hero;
import com.slimeheroes.hero.Class2Hero;
import com.slimeheroes.hero.Class3Hero;
import com.slimeheroes.hero.Hero;
import com.slimeheroes.slimes.EmperorSlime;
import com.slimeheroes.slimes.KnightSlime;
import com.slimeheroes.slimes.Slime;
import com.slimeheroes.slimes.Slimes;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        PlayGame playGame = new PlayGame();
        Slimes slimes;
        Hero hero;

        /* 게임 스타트 */
        System.out.println("게임이 시작됩니다.");


        StartGame startGame = new StartGame();

        /* 게임 플레이 */
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                slimes = new Slime(2, 10);
                hero = new Class1Hero(3, 100);
            } else if (i == 1) {
                slimes = new KnightSlime(5, 20);
                hero = new Class2Hero(6, 100);
            } else {
                slimes = new EmperorSlime(10, 50);
                hero = new Class3Hero(9, 100);
            }
            startGame.startGame();
            playGame.playGame(hero, slimes);
        }
    }
}
