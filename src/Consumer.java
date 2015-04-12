
public class Consumer extends Thread {
	private CQueue cq;
	private int cn;
	public Consumer(CQueue cq,int cn){
		this.cq = cq;
		cq.addC();
		this.cn = cq.getNumOfC()-1;
	}
	public void run(){
		try{
			while(true){
				Thread.sleep(1000);
				if(cq.consumable()){
					cq.consume(cn);
				}
			}
		} catch(InterruptedException e){			
		}
	}
}
