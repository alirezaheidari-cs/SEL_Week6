package parser;

public class Action {
    private ActionBehavior actionBehavior;

    public Action(ActionBehavior actionBehavior) {
        this.actionBehavior = actionBehavior;
    }

    public String toString() {
        return actionBehavior.performAction();
    }
}