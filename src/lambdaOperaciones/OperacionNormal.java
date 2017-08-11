package lambdaOperaciones;

public class OperacionNormal {
    
   
	
    public static void main(String[] args) {
		
		OperacionNormal test = new OperacionNormal();
		      System.out.println(test.calcular());
	}
	
	public double  calcular(){
             double valor = 6;
            
            Operacion operacion = (double x, double y) -> ((x + y) / valor);
            
            return operacion.calcularPromedio(2, 7);
	}
    
}
