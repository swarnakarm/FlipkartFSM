import java.util.List;

public class Machine {

	private String machineId;
	private String workflowId;
	private WorkflowStore worflowStore;
	private boolean terminated = false;
	private State currState;

	public String getMachineId() {
		return machineId;
	}

	public Machine(WorkflowStore worflowStore, String machineId, String workflowId) {
		this.worflowStore = worflowStore;
		this.workflowId = workflowId;
		this.machineId = machineId;
		Automata automata = worflowStore.getAutomata(workflowId);
		currState = automata.getWorkflowState();
	}

	public List<Task> transition(String event){
		if(terminated){
			throw new RuntimeException("Machine Already Terminated");
		}
		Automata automata = worflowStore.getAutomata(workflowId);
		State nextState = automata.nextTransition(event, currState);
		if(nextState.isEndState()){
			terminated = true;
		}
		return nextState.getTasks();
	}

}
