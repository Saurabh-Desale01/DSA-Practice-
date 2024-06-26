package map;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashMap {

	LinkedList<Entry>[] list;
	
	public MyHashMap() {
		this.list = new LinkedList[5];
	}
	
	public boolean put(int key, String val) {
		int index = hashKey(key);
		
		if(list[index] == null) {
			list[index] = new LinkedList<>();
		}
		var bucket = list[index];
		
		for(var entry: bucket) {
			if(entry.key == key) {
				entry.val=val;
				return true;
			}
		}
		bucket.addLast(new Entry(key, val));
		return true;
	}
	
	public String get(int key) {
		int index = hashKey(key);
		if(list[index] == null) throw new IllegalArgumentException();
		
		var bucket = list[index];
		for(var entry: bucket) {
			if(entry.key == key) return entry.val;
		}
		
		throw new IllegalArgumentException();
	}
	
	public String remove(int key) {
		int index = hashKey(key);
		if(list[index]==null) throw new IllegalArgumentException();
		
		var bucket = list[index];
		
		for(var entry: bucket) {
			if(entry.key==key) {
				bucket.remove(entry);
				return entry.val;
			}
		}
		throw new IllegalArgumentException();
	}
	
	private int hashKey(int key) {
		return key % list.length;
	}
	
	public String toString() {
		return Arrays.toString(list);
	}
}

class Entry{
	
	public int key;
	public String val;
	
	public Entry(int key, String val) {
		this.key=key;
		this.val=val;
	}
	
	public String toString() {
		return key + " " + val;
	}
}
