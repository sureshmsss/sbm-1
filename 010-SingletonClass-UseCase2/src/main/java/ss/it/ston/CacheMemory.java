package ss.it.ston;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CacheMemory {
	private Map<String, Object> map;

	public CacheMemory() {
		map = new HashMap<String, Object>();
	}

	public List<String> getConutries(String key) {
		return (List<String>) map.get(key);
	}
}
