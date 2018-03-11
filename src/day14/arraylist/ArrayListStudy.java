package day14.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStudy {
    public static void main(String[] args) {

        String [] strings = new String[3];
        int index = 0 ;

        ArrayList arrayList = new ArrayList();

        Scanner scanner = new Scanner(System.in);

        for(;;){
            System.out.print("입력: ");
            String str = scanner.nextLine();
            if(str.equals("exit")){
                break;
            }else if(str.contains("/remove")){
                str = str.substring("/remove ".length());
                int idx = Integer.valueOf(str);
                // ArrayList의 특정 번째 값을 삭제시키는 코드
                arrayList.remove(idx);
            }else{
                arrayList.add(str);
            }

           /* strings[index++] = str;
            for (int i = 0; i< index; ++i){
                System.out.println(strings[i]);
            }*/

            for(int i=0; i<arrayList.size(); ++i){
                System.out.println(i + ": " + arrayList.get(i));
            }
        }

    }
}
