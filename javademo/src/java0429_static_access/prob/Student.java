package java0429_static_access.prob;

/*
-name:String
-kor:int
-mat:int
-eng:int
+Student()
+Student(name:String,kor:int,mat:int,eng:int)
+setter&getter
+toString():String
+getTotal():int                 <---- kor+eng+mat 를 리턴
+getAvg():double             <---- getTotal()를 3으로 나누어서 평균을 구한후 리턴
+getGrade():char              <---- getAvg()를 이용해서 A,B,C,D,F학점을 구해서 리턴
*/

public class Student {
	private String name;
	private int kor;
	private int mat;
	private int eng;

	public Student() {

	}

	public int getTotal() {
		return kor + mat + eng;
	}

	public double getAvg() {
		return (double) getTotal()/2;
	}

	public char getGrade() {
		if (getAvg() >= 90) {
			return 'A';
		} else if (getAvg() <= 89 && getAvg() >= 80) {
			return 'B';
		} else if (getAvg() <= 79 && getAvg() >= 70) {
			return 'C';
		} else if (getAvg() <= 69 && getAvg() >= 60) {
			return 'D';
		}else if(getAvg() <= 59 && getAvg() >= 50) {
			return 'F';
		}
		
		return 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public String toSting() {
		return name + "의 점수는" + kor + "이며, 평균은" + mat + "이고 학점은" + eng + "입니다.";
	}

	public Student(String name, int kor, int mat, int eng) {
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
	}
}