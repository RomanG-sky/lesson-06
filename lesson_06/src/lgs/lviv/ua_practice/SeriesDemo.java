package lgs.lviv.ua_practice;

public class SeriesDemo {

	public static void main(String[] args) {
		ByTwos ob = new ByTwos();
		
		for(int i=0; i<5; i++)
			System.out.println("Наступне значення : " + ob.getNext());
			System.out.println("\nПеревантаження");
			ob.reset();
		
		for(int i=0; i<5; i++)
			System.out.println("Наступне значення : " + ob.getNext());
			System.out.println("\nПочаткове значення: 100");
			ob.setStart(100);;
		
			for(int i=0; i<5; i++)
				System.out.println("Наступне значення : " + ob.getNext());
		
	
	}

}
