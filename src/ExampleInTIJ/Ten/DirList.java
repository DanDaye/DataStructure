package ExampleInTIJ.Ten;


import java.io.File;
import java.io.FilenameFilter;

public class DirList {

    public static void main(String[] args){
        try {
            File path = new File(".");
            String[] list;
            if (args.length==0)
                list = path.list();
            else
                list = path.list(new DirFilter(args[0]));
            for (int i =0;i<list.length;i++){
                System.out.println(list[i]);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class DirFilter implements FilenameFilter{
    String afn;
    DirFilter(String afn){ this.afn = afn;}
    public boolean accept(File dir,String name){
        String f = new File(name).getName();//为确定我们操作的只是文件名，其中没有包含路径信息，去除所有路径信息
        return f.indexOf(afn)!=-1;
    }
}
