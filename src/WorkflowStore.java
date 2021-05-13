import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WorkflowStore {

	private Map<String,Automata> automataMetaStore;

	public Map<String,Automata> getAutomataMetaStore() {
		return automataMetaStore;
	}

	public void setAutomataMetaStore(List<Automata> automatas) {
		if(automatas != null){
			this.automataMetaStore = automatas.stream()
					.collect(
						Collectors.toMap(automata-> automata.getWorkflowId(), 
								automata -> automata));
		}
	}
	
	public void addAutomata(Automata automata){
		automataMetaStore.put(automata.getWorkflowId(), automata);
	}
	
	public void updateAutomata(Automata automata){
		automataMetaStore.put(automata.getWorkflowId(), automata);
	}
	
	public Automata getAutomata(String workflowId){
		return automataMetaStore.get(workflowId);
	}
	
	
}