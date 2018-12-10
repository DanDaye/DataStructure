package TIJ.Three;

public class three {
    public static void main(String[] args){
        for (int i=0;i<5;i++){
            switch (i){
                case 0:
                    System.out.println("It's 0 case");
                    break;
                case 1:
                    System.out.println("It's 1 case");
                    for (int j=0;j<i;j++){
                        System.out.println(j);
                    }
                    break;
                case 2:
                    System.out.println("It's 2 case");
                    for (int j=0;j<i;j++){
                        System.out.println(j);
                    }
                    break;
                case 3:
                    System.out.println("It's 3 case");
                    for (int j=0;j<i;j++){
                        System.out.println(j);
                    }
                    break;
                case 4:
                    System.out.println("It's 4 case");
                    for (int j=0;j<i;j++){
                        System.out.println(j);
                    }
                    break;
                default:
                        break;

            }
        }
    }
}
