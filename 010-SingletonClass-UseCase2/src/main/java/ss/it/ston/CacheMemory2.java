package ss.it.ston;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CacheMemory2 {
	private static CacheMemory2 cm;
	private Map<String, Object> map;

	public CacheMemory2() {
		map = new HashMap<String, Object>();
	}

	public static CacheMemory2 getInstance() {
		if (cm == null)
			cm = new CacheMemory2();
		return cm;
	}

	public List<String> getConutries(String key) {
		return (List<String>) map.get(key);
	}
}
