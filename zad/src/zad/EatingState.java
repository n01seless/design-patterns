package zad;

import zad.Context;
import zad.State;

public class EatingState implements State {
    private String stateName = "EATING_STATE";

    @Override
    public void applyState(Context context) {
        context.setState(this);
    }

    @Override
    public String getStateName() {
        return this.stateName;
    }
}
