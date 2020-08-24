import java.util.Iterator;

public class CircleList implements ListInterface, Iterable<ListNode> {
	
	
	public ListNode head;
	public ListNode last;
	
	private int size;
	private ListNode inode;
	
	
	public CircleList() {
		this.head = null;
		this.last = null;
		size = 0;
		
	}
	
    public CircleList(Object object) {
		this.head = new ListNode();
		this.last = head;
	}
    
    public void recorrer() {
    	try {
    		ListNode pointer=head;
    		int i=0;
    		do {
    			System.out.println(i + " .[" + pointer.getObject() + "] " + " -> ");
    			pointer=pointer.next;
    			i++;
    		}while(pointer!=head);
    		 
    	}catch(Exception e){
    		
    	}
    	 
    	
    }
    
    public ListNode searchNode(Object object) {
		ListNode pointer=head;
		do {
			if(pointer.getObject().toString().equals(object.toString())) {
    			return pointer;
    		}
			pointer=pointer.next;
		}while(pointer!=head);
    	
		return null;
	}	

	@Override
	public boolean isEmpty() {
		return head==null;
	}

	@Override
	public int getSize() {
		return size;
	}

	@Override
	public void clear() {
		head=null;
		last=null;
		size=0;
		
	}

	@Override
	public Object getHead() {
		return head.getObject();
	}

	@Override
	public Object getTail() {
		return last.getObject();
	}

	@Override
	public Object search(Object object) {
		if(isEmpty()) {
			return null;
		}else {
			ListNode pointer=head;
			do {
				if(pointer.getObject().toString().equals(object.toString())) {
	    			return pointer;
	    		}
				pointer=pointer.next;
			}while(pointer!=head);
		}
		return null;
	}

	@Override
	public boolean add(Object object) {
		ListNode node= new ListNode(object);
		if(isEmpty()) {
    		head=last=node;
    		size++;
    	}else {
    		node.next=last.next;
    		last.next=node;
    		last=node;
    		size++;
    	}
		return false;
	}

	@Override
	public boolean insert(Object ob, Object object) {
		try {
			if(ob != null) {
				ListNode pointer = (ListNode) this.search(object);
				if(pointer.next==head) {
					add(object);
					size++;
				}else {
					ListNode node = new ListNode(object);
					node.next=pointer.next;
					pointer.next=node;
					size++;
				}
				return true;
			}else {
				return false;
			}
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean insertHead(Object object) {
		ListNode node = new ListNode(object);
    	if(isEmpty()) {
    		head=node;
    		last=node;
    		last.next=head;
        	size++;
        	return true;
    		
    	}else {
        	node.next=head;
        	head=node; 
        	last.next=head;
        	size++;
        	return true;
    	}
    	
	}

	@Override
	public boolean insertTail(Object object) {
		ListNode node = new ListNode(object);
    	if(isEmpty()) {
    		head=node;
        	last=node; 
        	last.next=head;
        	size++;
        	return true;
    		
    	}else {
        	last.next=node;
        	node.next=head;
        	last=node;
        	size++;
        	return true;
    	}
	}

	@Override
	public boolean contains(Object object) {
		ListNode pointer=head;
		do {
			if(pointer.getObject().toString().equals(object.toString())) {
    			return true;
    		}
			pointer=pointer.next;
		}while(pointer!=head);
		return false;
	}

	@Override
	public boolean isEquals(Object object) {
		ListNode pointer=head;
		do {
			if(pointer.getObject().toString().equals(object.toString())) {
    			return true;
    		}
			pointer=pointer.next;
		}while(pointer!=head);
		return false;
	}

	@Override
	public Iterator<ListNode> iterator() {
		inode = head;
        Iterator<ListNode> i = new Iterator<ListNode>() {
            @Override
            public boolean hasNext() {
                return inode.next != head ? true : false;
            }

            @Override
            public ListNode next() {
                if (hasNext()) {
                    ListNode tmp = inode;
                    inode = inode.next;
                    return tmp;
                } else {
                    return null;
                }
            }
        };
        return i;
	}

	@Override
	public Object[] toArray() {
		Object[] array = new Object[getSize()];
    	ListNode pointer=head;
    	try {
    		int cont=0;
    		do {
    			Object valor=getTo(pointer);
    			array[cont]= valor;
    			pointer=pointer.next;
    			cont++;
    		}while(pointer!=head && cont<= getSize());
    		
    	}catch(Exception e) {
    		
    	}
        return array;
	}

	@Override
	public Object[] toArray(Object[] object) {
		Object[] array = new Object[getSize()];
    	ListNode pointer=head;
    	try {
    		int cont=0;
    		do {
    			Object valor=getTo(pointer);
    			array[cont]= valor;
    			pointer=pointer.next;
    			cont++;
    		}while(pointer!=head && cont<= getSize());
    		
    	}catch(Exception e) {
    		
    	}
        return array;
	}

	@Override
	public Object getBeforeTo() {
		return last.getObject();
	}

	@Override
	public Object getNextTo() {
		return head.next.getObject();
	}

	@Override
	public CircleList sortList() {
		CircleList ob=new CircleList();
		Object[] array = new Object[size];
    	ListNode pointer=head;
    	try {
    		int cont=0;
    		do {
    			Object valor=this.getTo(pointer);
    			array[cont]= valor;
    			pointer=pointer.next;
    			cont++;
    		}while(pointer!=head && cont<= size);
    		
    	}catch(Exception e) {
    		
    	}
    
       //METODO DE BURBUJA
       int tmp=0;
       for(int i = 0; i < size; i++){
    	  for (int k = 1; k < (array.length-i); k++) {
			if((int) array[k-1] > (int) array[k]) {
				tmp=(int)array[k-1];
				array[k-1]=array[k];
				array[k]=tmp;
			}
		}
       } 
    	  
    	for (int m = 0; m < array.length; m++) {
			ob.add(array[m]);
		}
    	
        return ob;
	}

	
	//METODOS DE NODOS
	
	@Override
	public Object get(ListNode node) {
		ListNode pointer=head;
		do {
			if(pointer.toString().equals(node.toString())) {
    			return pointer;
    		}
			pointer=pointer.next;
		}while(pointer!=head);
		
		return null;
	}

	@Override
	public boolean set(ListNode node, Object object) {
		ListNode node1 = new ListNode(object);
		ListNode pointer=head;
		ListNode pointer1=last;
		do {
			if(pointer.toString().equals(node.toString())) {
				pointer1.next=node1;
				node1.next=pointer.next;
				pointer=node1;
				
				return true;
    		}
			pointer1=pointer;
			pointer=pointer.next;
		}while(pointer!=head);
	 
		
		
		this.insert(pointer1, object);
		return false;
	}

	@Override
	public boolean remove(ListNode node) {
		ListNode pointer=head;
		ListNode pointer1=last;
		do {
			if(pointer.toString().equals(node.toString())) {
				pointer1.next=pointer.next;
				size--;
				return true;
    		}
			pointer1=pointer;
			pointer=pointer.next;
		}while(pointer!=head);
		return false;
	}

	@Override
	public boolean insert(ListNode node, Object object) {
		ListNode node1 = new ListNode(object);
		ListNode pointer =head;
		do {
			if(pointer.toString().equals(node.toString())) {
    			ListNode temp =pointer.next;
    			pointer.next=node1;
    			node1.next=temp;
    			return true;
    		}
			pointer=pointer.next;
		}while(pointer!=head);
		
		return false;
	}

	@Override
	public Object getBeforeTo(ListNode node) {
		ListNode pointer=head;
		ListNode pointer1=last;
		do {		
			pointer1=pointer;
			pointer=pointer.next;
		}while(pointer!=node);
		
		return pointer1.getObject();	
	}

	@Override
	public Object getNextTo(ListNode node) {
		ListNode pointer=head;
		do {
			if(pointer.toString().equals(node.toString())) {
    			return pointer.next.getObject();
    		}
			pointer=pointer.next;
		}while(pointer!=head);
		
		return null;
	}

	@Override
	public CircleList subList(ListNode from, ListNode to) {
		CircleList list = new CircleList();
    	ListNode pointer =head;
    	do {
			if(pointer.toString().equals(from.toString())) {
    			pointer=from;
    			break;
    		}
			pointer=pointer.next;
		}while(pointer!=head);
    	
    	do {
    		
    		list.add(pointer.getObject());
    		pointer=pointer.next;
    		
    	}while(pointer!=to);
    	
    	list.add(to.getObject());
        return list;
	}
    
    
    
	
	public Object getTo(ListNode node) {
		if(node.next==null) {
			return node.getObject();
		}else {
			//getTo(node.next);
			return node.getObject();
		}	
		 
	}
	
	
	

	
	

}
