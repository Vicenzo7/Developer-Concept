package system_design.LLD.ATM.ATMStates;

import system_design.LLD.ATM.ATM;
import system_design.LLD.ATM.Card;

public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());
    }
}
