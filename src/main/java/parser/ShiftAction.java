package parser;

public class ShiftAction implements ActionBehavior {
    private int stateNumber;

    public ShiftAction(int stateNumber) {
        this.stateNumber = stateNumber;
    }

    @Override
    public String performAction() {
        return "s" + stateNumber;
    }
}