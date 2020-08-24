
public class Main {

	public static void main(String[] args) {
		
		
		CircleList lista = new CircleList();
		
		for (int i = 0; i < 10; i++) {
			lista.add(i);
		}
		
		//lista.recorrer();
		
		//System.out.println(lista.isEmpty());	
		//System.out.println(lista.getSize());	
				
		//lista.clear();
		//System.out.println(lista.isEmpty());
				
		//System.out.println(lista.getHead());
		//System.out.println(lista.getTail());
		
		//System.out.println(lista.search(3));
	
		//lista.insertHead(40);
		//lista.insertTail(50);
		
		//ListNode pointer=lista.searchNode(3);
		//System.out.println(lista.insert(pointer, 20));
		

	   //System.out.println(lista.contains(4));
	   //System.out.println(lista.isEquals(4));
		
		//lista.recorrer();
		
		/*
	    Object arrays[]=lista.toArray();
	    for (int i = 0; i < arrays.length; i++) {
			System.out.println(arrays[i]);
		}
	  */
		
	   //System.out.println(lista.getBeforeTo());
	   //System.out.println(lista.getNextTo());
		
		
		/*
		lista.add(30);
		lista.add(21);
		lista.add(12);
		lista.recorrer();
		
		CircleList or=lista.sortList();
		or.recorrer();
		
		*/
		
		/*
		ListNode pointer=lista.searchNode(6);
		System.out.println(pointer);
		System.out.println(lista.remove(pointer));
		lista.recorrer();
		*/
		
		//ListNode pointer=lista.searchNode(6);
		//System.out.println(lista.get(pointer));
		//System.out.println(lista.set(pointer, 20));
		//lista.recorrer();
		
		
		//System.out.println(lista.getNextTo(pointer));
		//System.out.println(lista.getBeforeTo(pointer));
		
		
		/*
		System.out.println("Sublista");
		ListNode pointer1=lista.searchNode(2);
		ListNode pointer=lista.searchNode(8);
		
		CircleList sublista=lista.subList(pointer1, pointer);
		
		sublista.recorrer();
		
		*/
		
	}

}
