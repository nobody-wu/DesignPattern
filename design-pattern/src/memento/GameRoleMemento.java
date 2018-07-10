package memento;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 15:28 2018/7/10
 */
public class GameRoleMemento {
    private int Vitality;

    private int Attack;

    private int Defense;

    public GameRoleMemento(int vitality, int attack, int defense) {
        Vitality = vitality;
        Attack = attack;
        Defense = defense;
    }

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
}
