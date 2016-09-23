package ca.uqac.IA.Devoir1.robot.actions;

import ca.uqac.IA.Devoir1.environment.Environment;
import ca.uqac.IA.Devoir1.robot.Robot;
import ca.uqac.IA.Devoir1.robot.State;

/**
 * Created by dhawo on 23/09/2016.
 */
public abstract class Action {
    private State afterState;
    private boolean legal;
    public abstract void doAction(Environment env, Robot robot);

    public State getAfterState() {
        return afterState;
    }

    public boolean isLegal() {
        return legal;
    }

    public void setLegal(boolean legal){
        this.legal = false;
    }
}

