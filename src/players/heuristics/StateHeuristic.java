package players.heuristics;

import core.GameState;
import players.assign.SingleTreeNode;

public abstract class StateHeuristic {
    public abstract double evaluateState(GameState gs);
}
