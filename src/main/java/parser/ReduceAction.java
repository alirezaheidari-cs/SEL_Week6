package parser;

public class ReduceAction implements ActionBehavior {
    private int ruleNumber;

    public ReduceAction(int ruleNumber) {
        this.ruleNumber = ruleNumber;
    }

    @Override
    public String performAction() {
        return "r" + ruleNumber;
    }
}
