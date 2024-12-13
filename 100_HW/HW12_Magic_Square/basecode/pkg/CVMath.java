package pkg;

public class CVMath {		
	public static int findMid(int a, int b, int c){
		return (a + b + c - Math.min(a,Math.min(b,c)) - Math.max(a,Math.max(b,c)));
	}
	public static int MagicSquare(int e){
		boolean tof = true;
		int f = 1;
		int g = 1;

		for(int i = 2; e > 0; i++ ){
			if(f == g * g){
				if(e == 1){
					return f;
				}
			System.out.println(f);
			e--;
			}
			if(f > g * g){
				g++;
			}
			f = f + i;
		}
		return f;
	}

}
