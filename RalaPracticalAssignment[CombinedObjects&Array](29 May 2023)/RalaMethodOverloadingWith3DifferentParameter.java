public class RalaMethodOverloadingWith3DifferentParameter {
		public static void main(String args[]) {
		
		Method method = new Method();
		method.parentMethod("Sonu", 4, 'b');
			
		//After overloading
		System.out.println();
			
		AfterOverloading afterOverloading = new AfterOverloading(); 
		afterOverloading.afterOverloadingParentMethod("Rohit", 3, 'a');
				
	}

	
}

class Method {
	
	public void parentMethod(String name, int rollNo, char grade) {
		System.out.println("Name : " + name);
		System.out.println("Roll No : " + rollNo);
		System.out.println("Grade : " + grade);
	}

}

class AfterOverloading extends Method {
	
	//Method Overloading
	public void afterOverloadingParentMethod(String cName, int cRollNo, char cGrade) {
		System.out.println("cName : " + cName);
		System.out.println("cRoll No : " + cRollNo);
		System.out.println("cGrade : " + cGrade);
	}
}