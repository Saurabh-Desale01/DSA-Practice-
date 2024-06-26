package map;

public class MyMain {

	public static void main(String[] args) {
		
		MyHashMap hash = new MyHashMap();
		
		hash.put(1, "Java");
		hash.put(2, "Python");
		hash.put(6, "JavaScript");
		hash.put(5, "Html");
		
		//hash.put(5, "css");
		
		System.out.println(hash.remove(5));
		System.out.println(hash);

	}

}
