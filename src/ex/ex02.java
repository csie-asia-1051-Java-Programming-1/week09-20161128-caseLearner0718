package ex;
/*
 * Topic: 設計一 class 包含下列資訊:學號、姓名、國文成績、英文成績、數學成績，
 並於主程式讓使用者輸入位學生的資料並根據平均成績由高至低輸出如下:
 ID    NAME     Chinese     English       Math        Avg
 * Date: 2016/11/28
 * Author: 1050210XX 周永振老師
 */

import java.util.ArrayList;
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studList = new ArrayList<Student>();
		Student tmpStudent;
		Scanner scn = new Scanner(System.in);
		String name="",id,cont="y";
		int count=1,eval,mval;
//		System.out.println("if you don't want to input more");
//		System.out.println("please input null in name");
		while(true){
			System.out.println("input " + count +" id:");
			id = scn.next();
			System.out.println("input " + count +" name:");
			name = scn.next();
			System.out.println("input " + count +" english score:");
			eval = scn.nextInt();
			System.out.println("input " + count +" math score:");
			mval = scn.nextInt();
			studList.add(new Student(id,name,eval,mval));
			count++;
			System.out.println("countinue:Y out:N");
			cont = scn.next();
			if(cont.equals("N")){
				break;
			}
		}
		for(int i = 0;i < studList.size();i++){
			for(int j = 1; j<i;j++){
				if(studList.get(j).count()>studList.get(i).count()){
					tmpStudent = studList.get(i);
					studList.set(i, studList.get(j));
					studList.set(j, tmpStudent);
				}
			}
		}
//		studList.add(new Student("David","1899"));
//		studList.add(new Student("Tavid","2000"));
		studList.get(0).showInfo();
		System.out.println(studList.get(0).count());
	}

}
