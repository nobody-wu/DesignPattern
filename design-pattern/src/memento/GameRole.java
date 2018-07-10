package memento;

import decorator.Decorator;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 15:27 2018/7/10
 */
public class GameRole {

    private int Vitality;

    private int Attack;

    private int Defense;

    public int getVitality() {
        return Vitality;
    }

    public void setVitality(int vitality) {
        Vitality = vitality;
    }

    public int getAttack() {
        return Attack;
    }

    public void setAttack(int attack) {
        Attack = attack;
    }

    public int getDefense() {
        return Defense;
    }

    public void setDefense(int defense) {
        Defense = defense;
    }

    public void getInitState() {
        Vitality = 100;
        Attack = 100;
        Defense = 100;
    }

    public GameRoleMemento saveMemento() {
        return new GameRoleMemento(Vitality, Attack, Defense);
    }

    public void RecoveryState(GameRoleMemento gameRoleMemento) {
        Vitality = gameRoleMemento.getVitality();
        Attack = gameRoleMemento.getAttack();
        Defense = gameRoleMemento.getDefense();
    }

    public void fight() {
        Vitality = 0;
        Attack = 0;
        Defense = 0;
    }

    public void stateDisplay() {
        System.out.println("Vitality:" + Vitality + ",Attack:" + Attack + ",Defense:" + Defense);
    }
}
