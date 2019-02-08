package ExampleInTIJ.nineteen;

import static TIJ_examples.net.mindview.util.Print.print;

public enum  OzWitch {
    WEST("Miss Gulch,..."),
    NORTH("Glinda,..."),
    EAST("Wicked Witch of the East,..."),
    SOUTH("Good by inference,but missing");

    private String description;//私有成员变量

    OzWitch(String description) {//构造函数
        this.description = description;
    }
    public String getDescription(){//方法
        return description;
    }
    public static void main(String[] args){//main函数
        for (OzWitch witch:OzWitch.values()){
            print(witch +" : " +witch.getDescription() );
        }
    }
}
