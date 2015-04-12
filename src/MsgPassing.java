
public class MsgPassing {
	public static void main(String args[]){
		CQueue cq = new CQueue();
		
		new Producer(cq).start();
		
		new Consumer(cq,0).start();
		new Consumer(cq,1).start();
		new Consumer(cq,2).start();
		new Consumer(cq,3).start();
		new Consumer(cq,4).start();
	}
}
