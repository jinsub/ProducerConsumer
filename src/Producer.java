
public class Producer extends Thread{
	private CQueue cq;
	private int productNum;
	public Producer(CQueue cq){
		this.cq = cq;
		productNum=0;
	}
	public void run(){
		try{
			while(true){
				Thread.sleep(1000);
				if(cq.producable()){
					cq.produce(new Item(productNum));;
					productNum++;
				}
			}
		} catch(InterruptedException e){			
		}
	}
}
