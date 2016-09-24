package ca.uqac.IA.Devoir1.robot.actions;

import ca.uqac.IA.Devoir1.environment.Environment;
import ca.uqac.IA.Devoir1.environment.Tile;
import ca.uqac.IA.Devoir1.robot.Robot;
import ca.uqac.IA.Devoir1.robot.State;
import ca.uqac.IA.Devoir1.util.Position;

/**
 * Created by dhawo on 23/09/2016.
 */
public class MoveRightAction extends Action{
    public MoveRightAction(State state) {
        int destX = state.getCurrentTile().getX()+1;
        int y = state.getCurrentTile().getY();
        try{
            this.afterState = state;
            this.afterState.moveRobot(new Position(destX,y));
        }catch(IndexOutOfBoundsException ex){
            this.setLegal(false);
        }
    }

    @Override
    public void doAction(Environment env, Robot robot) {
        Tile currentTile = robot.getState().getCurrentTile();
        robot.move(new Position(currentTile.getX() + 1, currentTile.getY()));
        System.out.println(String.format("Aspirobot has moved to tile ({1},{2])", robot.getState().getCurrentTile().getX(), robot.getState().getCurrentTile().getY()));
    }
}