import java.util.Iterator;

public interface ListInterface {
	
	public boolean isEmpty(); //LISTO

    public int getSize();//LISTO

    public void clear();//LISTO

    public Object getHead(); //LISTO
    
    public Object getTail(); //LISTO
    
    public Object search(Object object); //LISTO

    public boolean add(Object object); //LISTO

    public boolean insert(Object ob, Object object);//LISTO

    public boolean insertHead(Object object); //LISTO
    
    public boolean insertTail(Object object);  //LISTO

    
    
    
    /*
    expansion operations
     */
    
    public boolean contains(Object object);//LISTO

    public boolean isEquals(Object object);//LISTO

    public Iterator<ListNode> iterator();//LISTO

    public Object[] toArray();//LISTO

    public Object[] toArray(Object[] object);//LISTO

    public Object getBeforeTo();//LISTO

    public Object getNextTo();//LISTO

    public CircleList sortList(); //LISTO
    
    
    
    //NODOS
     
    public Object get(ListNode node);//LISTO
    
    public boolean set(ListNode node, Object object); 

    public boolean remove(ListNode node); 
    
    public boolean insert(ListNode node, Object object); //LISTO
    
    public Object getBeforeTo(ListNode node); 
    
    public Object getNextTo(ListNode node); //LISTO

    public CircleList subList(ListNode from, ListNode to); 


}
