import java.util.HashMap;
import java.util.Map;

public class MachineStore {

	
	private Map<String, Machine> machineStoreMap;
	
	public MachineStore(){
		machineStoreMap = new HashMap<>();
	}
	
	public void addMachine(Machine machine){
		machineStoreMap.put(machine.getMachineId(), machine);
	}
	

	public Machine machine(String machineId){
		return machineStoreMap.get(machineId);
	}
	
}
