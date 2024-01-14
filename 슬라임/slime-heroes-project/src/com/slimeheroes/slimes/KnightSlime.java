package com.slimeheroes.slimes;

import com.slimeheroes.hero.Hero;

public class KnightSlime extends Slimes {
    int slimeHp;
    int slimeDamage;

    public KnightSlime(int slimeDamage, int slimeHp) {
        this.slimeDamage = slimeDamage;
        this.slimeHp = slimeHp;
    }

    @Override
    public void attack(Hero hero) {
        if (getSlimeHp() >= 1) {
            System.out.println("몬스터가 공격을 했다!\n");
            hero.setHeroHp(hero.getHeroHp() - slimeDamage);
        } else {
            System.out.println("몬스터가 처치되었습니다.\n");
        }

    }

    @Override
    public void finalattack(Hero hero) {
        if (getSlimeHp() <= 5 && getSlimeHp() >= 0) {
            System.out.println("몬스터가 자폭을 합니다!");
            hero.setHeroHp(hero.getHeroHp()-(slimeDamage*15));
        }

    }

    @Override
        public void halfDamageAttack (Hero hero){
            System.out.println("몬스터가 공격을 했다!\n방어에 성공했다.\n");
            hero.setHeroHp(hero.getHeroHp() - (slimeDamage / 2));
        if (getSlimeHp() <= 5){setSlimeHp(getSlimeHp()-100);}
        }

        @Override
        public int getSlimeHp () {
            return slimeHp;
        }

        public void setSlimeHp ( int slimeHp){
            this.slimeHp = slimeHp;
        }




}
