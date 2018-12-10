package ExampleInTIJ.four;
public class Garbage {
    public static void main(String[] args) {

        while (!Chair.f) {
            new Chair();
            new String("To take up space");
        }

        System.out.println("After all Chairs have been created:\n" + "total created = " + Chair.created + ", total finalized = " + Chair.finalized);

        System.out.println("gc():");
        System.gc();
        System.out.println("runFinalization():");
        System.runFinalization();

        System.out.println("bye!");
    }
}

class Chair {
    static boolean gcrun = false;
    static boolean f = false;
    static int created = 0;
    static int finalized = 0;
    int i;

    public Chair() {
        i = ++created;
        if (created == 47){
            System.out.println("Created 47");
        }
    }

    protected void finalize(){
        if (!gcrun){
            gcrun = true;
            System.out.println("Beginning to finalize after chairs been created.");
            System.out.println("i=" + i);
            System.out.println("created=" + created);
        }
        if (i == 47){
            System.out.println("Finalize chair #47,setting flag to stop chair creation.");
            f = true;
        }
        finalized++;
        if (finalized >= created){
            System.out.println("All finalized.");
        }
    }
}