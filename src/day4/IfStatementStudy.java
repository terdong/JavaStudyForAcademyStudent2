package day4;

public class IfStatementStudy {
    public static void main(String [] args){

        //if( /*조건식*/ ){
        if( 3 < 2 ){
            //조건식이 참인 경우 실행 될 구문
            System.out.println("3이 2보다 작습니다.");
        }else{
            //* else 문은 항상 if 문이 나온 다음에만 사용 할 수 있다. 단독 사용 불가
            //조건식이 참이 아닌 경우 실행 될 구문
            System.out.println("3이 2보다 큽니다.");
        }
    }
}
