package ExampleInTIJ.Seven;

interface Monster{
    void meance();
}

interface DangerousMonster extends Monster{
    void destory();
}

interface Lethal{
    void kill();
}
class DragonZilla implements  DangerousMonster{
    public void meance(){}
    public void destory(){}
}

interface Vampire extends DangerousMonster,Lethal{
    void drinkBlood();
}


public class HorrorShow {
    static void u(Monster b){ b.meance();}
    static void v(DangerousMonster d){
        d.meance();
        d.destory();
    }

    public static void main(String[] args){
        DragonZilla if2 = new DragonZilla();
        u(if2);
        v(if2);
    }
}
