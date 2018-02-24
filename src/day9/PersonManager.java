package day9;

public class PersonManager {

    Person [] persons;
    int index;

    // 멤버 변수를 초기화 시켜주는 메소드
    public void initialize(){
        persons = new Person[99];
        index = 0;
    }

    // Person 객체를 추가해주는 메소드
    public void addPerson(Person person){
        persons[index++] = person;
        System.out.println(index + "번째 person이 등록되었습니다.");
    }

    // 추가된 Person 객체들의 정보를 출력하는 메소드
    public void printPersons(){
        for(int i=0; i<index; ++i){
            persons[i].printInfo();
        }
    }

}
