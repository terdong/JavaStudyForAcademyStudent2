package day13.books;

public class Magazine extends Book {
    private int day;

    public Magazine(String title, String genre, int day) {
        super(title, genre);
        this.day = day;
    }

/*    public void printMagazine(){
        printBook();
        System.out.println("발매일: " + day);
    }*/

    // setter
    public void setDay(int day){
        if(day < 1 || day > 31 ){
            System.out.println("day 값을 1일 에서 31일 사이로 넣어주세요.");
        }else {
            this.day = day;
        }
    }

    // getter
    public int getDay(){
        return day;
    }

    public void printDay(){
        System.out.println("발매일: "+ day);
    }
}
