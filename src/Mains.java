
public class Mains {

	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
 
        student1.setName("Paul");
        student1.setGpa(3.5);
        student2.setName("Peter");
        student2.setGpa(3.5);
        
        System.out.println("Name: " + student1.getName());
        System.out.println("GPA: " + student1.getGpa());
        System.out.println("Name: " + student2.getName());
        System.out.println("GPA: " + student2.getGpa());

        Person pam = new Person();
        Person paul = new Person();

        pam.setName("Pam");
        pam.setGpa(3.8);
        pam.setTall(170.5);

        paul.setName("Paul");
        paul.setGpa(3.5);
        paul.setTall(175.2);

        System.out.println(" ");
        System.out.println("Pam's Information:");
        System.out.println("Name: " + pam.getName());
        System.out.println("GPA: " + pam.getGpa());
        System.out.println("Height: " + pam.getTall());

        System.out.println("\nPaul's Information:");
        System.out.println("Name: " + paul.getName());
        System.out.println("GPA: " + paul.getGpa());
        System.out.println("Height: " + paul.getTall());
        
        Book book1 = new Book();
        Book book2 = new Book();

        book1.setBookID("0345");
        book1.setBookName("AI for ALL");
        book1.setBookColor("blue");
        book1.setBookPrice(250.30);

        book2.setBookID("0111");
        book2.setBookName("The funny math");
        book2.setBookColor("green");
        book2.setBookPrice(110.55);

        System.out.println(" ");
        System.out.println("Book 1:");
        System.out.println("Book ID: " + book1.getBookID());
        System.out.println("Book Name: " + book1.getBookName());
        System.out.println("Book Color: " + book1.getBookColor());
        System.out.println("Book Price: $" + book1.getBookPrice());

        System.out.println("Book 2:");
        System.out.println("Book ID: " + book2.getBookID());
        System.out.println("Book Name: " + book2.getBookName());
        System.out.println("Book Color: " + book2.getBookColor());
        System.out.println("Book Price: " + book2.getBookPrice());
        
        Television myTelevision = new Television("Sony", "Black");
        myTelevision.turnOn();
        myTelevision.changeChannel(5);
        myTelevision.turnUpVolume();
        myTelevision.turnUpVolume();
        myTelevision.turnDownVolume();
        myTelevision.turnOff();
        
	}

}
