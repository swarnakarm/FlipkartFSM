import java.util.List;

public class State {

	private String stateName;
	private String event;
	private State nextState;
	private boolean isEndState;
	private List<Task> tasks;
	
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public State getNextState() {
		return nextState;
	}
	public void setNextState(State nextState) {
		this.nextState = nextState;
	}
	public boolean isEndState() {
		return isEndState;
	}
	public void setEndState(boolean isEndState) {
		this.isEndState = isEndState;
	}
	public List<Task> getTasks() {
		return tasks;
	}
	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
}