package zad;

import zad.Context;
import zad.State;

public class IdleState implements State {
    private String stateName = "IDLE_STATE";

    @Override
    public void applyState(Context context) {
        context.setState(this);
    }

    @Override
    public String getStateName() {
        return this.stateName;
    }
}
