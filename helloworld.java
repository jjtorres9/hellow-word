public class helloworld{
	public static void main(String[] args){
		System.out.println("Hello JHON TORRES");
	
	chicken chicken1;
	chicken1=new chicken();
	chicken chickenone;
	chickenone= new chicken ();
	chicken chickentwo;
	chickentwo= new chicken ();
	chicken chickentree;
	chickentree= new chicken ();
	chicken1.initializeData("Lucy","Brown",2);
	chickentree.initializeData("rosa","black and white",1);
	chickentwo.initializeData("florencia"," white",1);
	chickenone.initializeData("martina","black",3);
	chicken1.print();
	chickenone.print ();
	chickentwo.print ();
	chickentree.print();
	chicken1.drink ();
	chicken1.poop ();
	chicken1.layAnEgg();
	chickenone.drink ();
	chickentwo.poop ();
	chickentree.layAnEgg ();
	}
	
}