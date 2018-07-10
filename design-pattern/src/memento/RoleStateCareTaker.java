package memento;

/**
 * @Author: wujiapeng
 * @Description: 角色状态管理员
 * @Date: created in 15:42 2018/7/10
 */
public class RoleStateCareTaker {

    private GameRoleMemento gameRoleMemento;

    public GameRoleMemento getGameRoleMemento() {
        return gameRoleMemento;
    }

    public void setGameRoleMemento(GameRoleMemento gameRoleMemento) {
        this.gameRoleMemento = gameRoleMemento;
    }
}
