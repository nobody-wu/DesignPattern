package memento;

/**
 * @Author: wujiapeng
 * @Description:
 * @Date: created in 15:38 2018/7/10
 */
public class Main {

    public static void main(String[] args) {
        GameRole role = new GameRole();
        role.getInitState();
        role.stateDisplay();


        RoleStateCareTaker taker = new RoleStateCareTaker();
        GameRoleMemento gameRoleMemento = role.saveMemento();
        taker.setGameRoleMemento(gameRoleMemento);

        role.fight();
        role.stateDisplay();

        role.RecoveryState(taker.getGameRoleMemento());
        role.stateDisplay();
    }

}
