
public class PRIMO_CHECK {

	//static boolean isprimo (int p) {
	
	static void isprimo(long MAX) {	
		long i,p;
		//boolean is = true;
		
		
		System.out.println("PRIMOS: 1, ");
		
		for (p=2; p<=MAX; p++) {
			
			for (i=1; i<=p; i++) {
				
				if ((p%i==0)&&(p/i==1)) {
					//is = true;
					System.out.println("," + p);
				}
				
				else if ((p%i==0) && (i!=1)) {
					//is = false;
					break;
				}
			}
		}
		//return is;		
	}
					
	public static void main (String[] args) {
		long MAX = 999999;
		//PRIMO_CHECK is_p = new PRIMO_CHECK();	 
		//System.out.println(is_p.isprimo(p) ? "ES PRIMO." : "NO ES PRIMO.");	
		PRIMO_CHECK.isprimo(MAX);	
	}		
}
