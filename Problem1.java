
public class Problem1 {
	public static void main(String[] args) {
		int ml = 250;
		if(ml==250) {
			System.out.println("The glass is full");
		}
		else if(ml<250) {
			System.out.println("The glass is not full anymore");
		}
		else if(ml<20 || ml==0) {
			System.out.println("Waiter new beer*");
			System.out.println("*Spatter can be ordered instead of beer");
		}
		int numOfGlasses = 3;
		if(numOfGlasses<4) {
			int pinsHit = 8;
			if(pinsHit==10) { 
				System.out.println("X - Strike!!!");
			}
			else if(pinsHit>=7 && pinsHit<=9) { 
				System.out.println("Good Hit");
			}
			else if(pinsHit>=4 && pinsHit<=6) { 
				System.out.println("Normal Hit");
			}
			else if(pinsHit>=1 && pinsHit<=3) { 
				System.out.println("Weak Hit");
			}
			else if(pinsHit==0) { 
				System.out.println("Miss");
			}
		}
		for(int i = 1;i<=20;i++) {
			if(i==10) {
				System.out.println("Phu, I hope this is over soon.");
			}
			if(i==15) {
				System.out.println("I don't think I can do this.");
			}
			if(i==19) {
				System.out.println("YES, I CAN DO IT!!!!");
			}
			if(i==20) {
				System.out.println("OLEOLEOLEEE");
			}
		}
		int i = 1;
		while(i<=20) {
			if(i==10) {
				System.out.println("Phu, I hope this is over soon.");
			}
			if(i==15) {
				System.out.println("I don't think I can do this.");
			}
			if(i==19) {
				System.out.println("YES, I CAN DO IT!!!!");
			}
			if(i==20) {
				System.out.println("OLEOLEOLEEE");
			}
			i++;
		}
		i = 1;
		do {
			if(i==10) {
				System.out.println("Phu, I hope this is over soon.");
			}
			if(i==15) {
				System.out.println("I don't think I can do this.");
			}
			if(i==19) {
				System.out.println("YES, I CAN DO IT!!!!");
			}
			if(i==20) {
				System.out.println("OLEOLEOLEEE");
			}
			i++;
		}while(i<=20);
		switch(numOfGlasses) {
			case 1:
			case 0:
				System.out.println("Go for showers, brush your teeth, and put on your sleeping clothes.");
				break;
			case 2:
				System.out.println("Go for showers, brush your teeth, and put on your sleeping clothes.");
				for(i = 1; i<=3;i++) {
					System.out.println("Cookie No. "+i+" eaten");
				}
				break;
			default:
				for(i = 1; i<=numOfGlasses;i++) {
					System.out.println("Step "+i+" taken");
				}
				System.out.println("Now I have to sleep");
				break;
		}

		
	}
}
