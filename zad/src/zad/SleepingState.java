package zad;

import zad.Context;
import zad.State;

public class SleepingState implements State {
    private String stateName = "SLEEPING_STATE";

    @Override
    public void applyState(Context context) {
        context.setState(this);
    }

    @Override
    public String getStateName() {
        return this.stateName;
    }
}
