package Java0426_class_part03;
/*
 * 김병조/외과/39
 * 이상민/내과/50
 * 박상기/피부과/20
 * 오상수/내과/25
 * 윤달수/피부과/30
 * 
 * 
 * 
 * 
 * [출력결과]
 * 박상기 피부과 20
 * 윤달수 피부과 30
 */
public class Doctor {
	String name;
	String medical;
	int patient;
	
	public Doctor() {
		
	}
	public Doctor(String name,String medical,int patient) {
		this.name = name;
		this.medical = medical;
		this.patient = patient;
		
	}
	
	public void prn() {
		System.out.printf("%s %s %d \n" ,name ,medical,patient);
	}
}
