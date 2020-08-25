
public class Student {
 private String name, Standard;
 private int age, id,sub1,sub2,sub3;
 
 public Student(String name,String standard,int age,int id,int sub1,int sub2,int sub3) {
		this.name=name;
		this.Standard=standard;
		this.age=age;
		this.id=id;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
 
 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getStandard() {
	return Standard;
}
public void setStandard(String standard) {
	Standard = standard;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getSub1() {
	return sub1;
}
public void setSub1(int sub1) {
	this.sub1 = sub1;
}
public int getSub2() {
	return sub2;
}
public void setSub2(int sub2) {
	this.sub2 = sub2;
}
public int getSub3() {
	return sub3;
}
public void setSub3(int sub3) {
	this.sub3 = sub3;
}
 
public void display() {
	System.out.println("Name"+getName());
	System.out.println("standard"+getStandard());
	System.out.println("Subject 1 Marks"+getSub1());
	System.out.println("Subject 2 Marks"+getSub2());
	System.out.println("Subject 3 Marks"+getSub3());
	
}


	
}
