package java0430.ingeritance.part06;

/*
 * PerOver을 상속받는 DogOver,BirdOver클래스를
 * main() 메소드를 참조하여 아래와 같이 출력이 되도록 구현하시오.
 * 
 * [출력결과]
 *슈퍼클래스 move() : 애완동물이 움직입니다.
 *서브클래스 move() : 새가 날아갑니다.
 */
public class PetOver {
	int age;

	public void move() {
		System.out.println("슈퍼클래스 move() : 애완동물이 움직입니다. ");

	}
}

class DogOver extends PetOver {

	public void move() {
		super.move();
	}
}

class BirdOver extends PetOver {

	public void move() {
		System.out.println("서브클래스 move() : 새가 날아갑니다.");
	}
}

// end PetOver
