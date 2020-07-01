package zad;

import zad.State;

public class Main {

	public static void main(String[] args) {
		
		
		EatingState eatingState = new EatingState();
		SleepingState sleepingState = new SleepingState();
		IdleState idleState = new IdleState();
		
		Context horse = new Context("horse1");
		idleState.applyState(horse);
        State state = horse.getState();
        String currentState = state.getStateName();
        System.out.println("currentState: " + currentState);
       sleepingState.applyState(horse);
        state = horse.getState();
        currentState = state.getStateName();
        System.out.println("currentState: " + currentState);
		
		
		
		Context cow = new Context("cow1");
		eatingState.applyState(cow);
        State state2 = cow.getState();
        String currentState2 = state.getStateName();
        System.out.println("currentState: " + currentState2);
       sleepingState.applyState(cow);
        state = cow.getState();
        currentState2 = state.getStateName();
        System.out.println("currentState: " + currentState2);


		

	}

}
