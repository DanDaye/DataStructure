package DATA_STRUCTURE.HightDataStructure;

public class BFSshort {
}
class Point{
    private  int x;
    private int y;
    public int getX(){
        return this.x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    Point(int x,int y){
        this.x = x;
        this.y =y;
    }
}

class MyMap{
    private int preX;
    private int preY;
    private int price;
    MyMap(){
        this.preX=0;
        this.preY =0;
        this.price=0;
    }

    public int getPreX() {
        return preX;
    }

    public int getPreY() {
        return preY;
    }

    public int getPrice() {
        return price;
    }

    public void setPreX(int preX) {
        this.preX = preX;
    }

    public void setPreY(int preY) {
        this.preY = preY;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}