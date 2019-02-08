package ExampleInTIJ.nineteen;

public enum  SpaceShip {
    SCOT,GARGO,TRANSPORT,CRUISER,BATTLESHIP,MOTHERSHIP;
    public String toString(){
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }

    public static void main(String[] args){
        for (SpaceShip s:values()){
            System.out.println(s);
        }
    }
}
