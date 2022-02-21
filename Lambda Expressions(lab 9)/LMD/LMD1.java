package LMD;

interface Num {
	int a(int x, int y);
}

public class LMD1 {

	Num a = (x, y) -> {
		return (int) (Math.pow(x,y));
	};
	
	public static void main(String[] args) {
		Num i = (x, y) -> {
			return (int) (Math.pow(x,y));
		};
		System.out.println(i.a(2, 3));
	}
}