package ExampleInTIJ.Ten;
import java.io.File;
import java.io.FilenameFilter;

public class DirList3 {
    public static void main(final String[] args){
        try {
            File path = new File(".");
            String[] list;
            if (args.length ==0)
                list=path.list();
            else
                list = path.list(
                        new FilenameFilter() {
                            @Override
                            public boolean accept(File dir, String name) {
                                String f = new File(name).getName();
                                return f.indexOf(name) !=-1;
                            }
                        }
                );
            for (int i=0;i<list.length;i++){
                System.out.println(list[i]);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
