package day15.diablo.items;

public abstract class Item extends Object{
    protected String name;

    protected Item(String name){
        this.name = name;
    }

    public void use(){
        System.out.println("이 아이템(" + name + ")은 사용할 수 없는 아이템입니다.");
    }

    @Override
    public String toString(){
        return name;
    }
}
