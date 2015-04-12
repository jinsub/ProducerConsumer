
public class CQueue {
	private Item[] cq;
	private int rear,front;
	private int turn;
	private int numOfC;
	public CQueue(){
		cq = new Item[10];
		rear=front=0;
		numOfC = turn = 0;
		
	}
	public void produce(Item p){
		cq[front] = p;
		System.out.println(p.getNUm()+" item produced !!");
		front=(front+1)%10;
	}
	public void consume(int cn){
		if(turn==cn){
			System.out.println(cq[rear].getNUm()+"'th item consumed by "+cn+"'th consumer !!");
			rear = (rear+1)%10;
			turn = (turn+1)%numOfC;
		}
	}
	public boolean producable(){
		if((front+1)%10==rear) 	return false;
		else						return true;
	}
	public boolean consumable(){
		if(front==rear) 		return false;
		else 					return true;
	}
	public void addC(){
		numOfC++;
	}
	public int getNumOfC(){
		return numOfC;
	}
}
