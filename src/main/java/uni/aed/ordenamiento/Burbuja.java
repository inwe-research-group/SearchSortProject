package uni.aed.ordenamiento;
/**
 * Esta clase implementa el método de la burbuja.
 * La clase se implementa con Xs.
 * @author 
 *
 */
public class Burbuja {
	
    /**
     * Método para ordenar mediante "la burbuja"
     * @param X El X a ordenar.
     * @return El mismo X ya ordenado.
     */
    int nIntercambios=0;
    int nComparaciones=0;

    public void setnIntercambios(int nIntercambios) {
        this.nIntercambios = nIntercambios;
    }

    public void setnComparaciones(int nComparaciones) {
        this.nComparaciones = nComparaciones;
    }

    public int getnIntercambios() {
        return nIntercambios;
    }

    public int getnComparaciones() {
        return nComparaciones;
    }    
	
    public Integer[] burbuja(Integer[] X){
        int intercambios = 0,tintercambios = 0, tcomparaciones = 0,comparaciones = 0;

        int aux = 0;
        int N=X.length - 1;
        for(int i = 0; i<N; i++){
            comparaciones = 0;
            intercambios = 0;
            for(int j= 0; j<N; j++ ){
                comparaciones++;
                tcomparaciones++;
                if (X[j]>X[j+1]){
                        tintercambios++;
                        intercambios++;
                        aux = X[j];
                        X[j] = X[j+1];
                        X[j+1] = aux;			
                }
            }
            System.out.println("#comparaciones i="+i+" es: "+comparaciones);
            System.out.println("#intercambios i="+i+" es: "+intercambios);
        }	        
        this.setnIntercambios(tintercambios);
        this.setnComparaciones(tcomparaciones);
        System.out.println("#intercambios es max(n-1)^2:"+getnIntercambios());
        System.out.println("#comparaciones es (n-1)^2:"+getnComparaciones());
        return X;
    }

         public static Integer[] burbuja2(Integer[] X){
		int intercambios = 0, comparaciones = 0;
		
		int aux = 0;
		for(int i = 0; i<X.length - 1; i++){
                    for(int j=0; j<(X.length - 1)-i;j++){                    
                        comparaciones++;
                        if (X[j]>X[j+1]){
                                intercambios++;
                                aux = X[j];
                                X[j] = X[j+1];
                                X[j+1] = aux;			
                        }
                    }
		}	
		System.out.println("Numero de intercambios:"+intercambios);
		System.out.println("Numero de comparaciones:"+comparaciones);
		return X;
	}
	
	

}
