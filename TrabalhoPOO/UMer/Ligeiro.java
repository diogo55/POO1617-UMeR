
public class Ligeiro extends Veiculo{

   
   public Ligeiro(){
       super();
   }
   
   public Ligeiro(int vMed, int preco, int factorF, String matricula,Localizacao loc){
       super(vMed,preco,factorF,matricula,loc);
       
   }
   
   public Ligeiro(Ligeiro l){
       super(l);
   }
   
   public Ligeiro clone(){
       return new Ligeiro();
   }
   
   public boolean equals(Object o){
       if(o==this){
           return true;
       }
       if((o==null) || o.getClass() != this.getClass()){
           return false;
       }
       Ligeiro l = (Ligeiro) o;
       return super.equals(o);
   }
    
   public String toString(){
       StringBuilder sb = new StringBuilder();
       sb.append(super.toString());
     
       return sb.toString();
   }
}
