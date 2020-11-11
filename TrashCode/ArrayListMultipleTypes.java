package test;
// comments are gay
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMultipleTypes<E> {
	
	private ArrayList list;
	private int size;
	
	public ArrayListMultipleTypes() {
		list = new ArrayList();
		size = 0;
	}
	
	
	public void add(E e) {
		list.add(e);
		size++;
	}
	
	public void remove(int index) {
		list.remove(index);
		size--;
	}
	
	
	public <E> E checkAndGet(int index) {
		if (list.get(index) instanceof String) {
			String str = (String) list.get(index);
			return (E) str;
			
		} else if (list.get(index) instanceof Integer) {
			Integer num = (Integer) list.get(index);
			return (E) num;
			
		} else if (list.get(index) instanceof Character) {
			Character charThing = (Character) list.get(index);
			return (E) charThing;
			
		} else if (list.get(index) instanceof Double || list.get(index) instanceof Float) {
			Double num = (Double) list.get(index);
			return (E) num;
			
		} else if (list.get(index) instanceof Book) {
			Book num = (Book) list.get(index);
			return (E) num;
			
		} else if (list.get(index) instanceof String[]) {
			String[] array = (String[]) list.get(index);
			return (E) array;
			
		} else if (list.get(index) instanceof int[]) {
			int[] array = (int[]) list.get(index);
			return (E) array;
			
		} else if (list.get(index) instanceof Character[] || list.get(index) instanceof char[]) {
			Character[] array = (Character[]) list.get(index);
			return (E) array;
			
		} else if (list.get(index) instanceof Double[]) {
			Double[] array = (Double[]) list.get(index);
			return (E) array;
			
		} else if (list.get(index) instanceof ArrayListMultipleTypes) {
			ArrayListMultipleTypes array = (ArrayListMultipleTypes) list.get(index);
			return (E) array;
		}
		return null;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		if (size==0) {
			return true;
		}
		return false;
	}
	
	public void clear() {
		list.clear();
		size = 0;
	}
	
	@Override
	public String toString() {
		String str = "[";
		for (int i = 0; i < size; i++) {
			Object element = checkAndGet(i);
			if (element instanceof String[]) {
				String arrStr = Arrays.toString((String[]) element);
				str += arrStr + ", ";
				
			} else if(element instanceof int[] ) {
				String arrStr = Arrays.toString((int[]) element);
				str += arrStr + ", ";
				
			} else if(element instanceof Character[] ) {
				String arrStr = Arrays.toString((Character[]) element);
				str += arrStr + ", ";
				
			} else if(element instanceof Double[] ) {
				String arrStr = Arrays.toString((Double[]) element);
				str += arrStr + ", ";
				
			} else {
				str += element.toString() + ", ";
			}
			
		}
		if (str.equals("[")) {
			str += "]";
		} else {
			str = str.substring(0, str.length()-2) + "]";
		}		
		return str;
	}
	
	
}
