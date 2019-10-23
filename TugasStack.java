package strukturdata;

public class TugasStack {

	
		
		// TODO Auto-generated method stub
		public int top;
	    public String [] data;
	   
	    public TugasStack (int x) {
	        data = new String [x];  
	    }
	   
	    public void push (String nilai){
	        if(top<data.length){
	            data[top]= nilai;
	            top++;
	        }
	        else{
	            System.out.println("Data Penuh");
	        }
	       
	    }
	    public String pop(){
	        if(top>0){
	            top--;
	            String tmp= data[top];
	            data[top]=null;
	            return tmp;
	           
	        }
	        else{
	            System.out.println("Data Kosong");
	            return null;
	        }
	       
	    }
	    public void printdata(){
	        for(int x=0; x<data.length; x++){
	            System.out.println(data[x]+",");
	        }
	    }

	   




	



public static void main(String[] args) {
	System.out.println("jumlah barang yang masuk(push)");
    TugasStack a = new TugasStack(5);
    a.push("kardus Aqua");
    a.push("kardus indomie");
    a.push("kardus kecap");
    a.push("kardus rinso");
    a.push("kardus soklin");
    a.printdata();
    
    System.out.println("barang yang akan berkurang(pop)");
    System.out.println("");
    System.out.println("");
    System.out.println("kardus soklin akan di keluarkan");  
    System.out.println("");
    System.out.println(a.pop()+"telah keluar");
    
    a.printdata();
    
}
}

