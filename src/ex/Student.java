package ex;

public class Student {
	private String id,name;
	private int eval,mval;
//	private ArrayList<Course>couList = new ArrayList<Course>();
	public Student(String id1,String name1,int eval1,int mval1){
		name = name1;
		id = id1;
		eval = eval1;
		mval = mval1;
	}
	public void showInfo(){
		System.out.println("name:" + name);
		System.out.println("id:" + id);
		System.out.println("english:" + eval);
		System.out.println("math:" + mval);
//		System.out.println("#of course:" + couList.size());
	}
	public float count(){
		return (eval+mval)/2;
	}
}
