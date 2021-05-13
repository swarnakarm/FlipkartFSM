public class Automata {

	private String workflowId;
	private State workflowState;

	public String getWorkflowId() {
		return workflowId;
	}

	public void setWorkflowId(String workflowId) {
		this.workflowId = workflowId;
	}

	public State getWorkflowState() {
		return workflowState;
	}

	public void setWorkflowState(State workflowState) {
		this.workflowState = workflowState;
	}

	State nextTransition(String eventName, State currentState) {
		State tmp = workflowState;
		while (tmp != null) {
			if (tmp.getStateName().equals(currentState.getStateName()) 
					&& tmp.getEvent().equals(eventName)) {
				return tmp;
			}
			tmp = tmp.getNextState();
		}
		return null;
	}

}
