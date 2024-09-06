import java.util.LinkedList;


public class App {
    public static void main(String[] args) throws Exception {
        LinkedList<String> pro = new LinkedList<>();

        pro.add("a");
        pro.add("b");
        pro.add("c");
        pro.add("d");
        pro.add("e");
        pro.add("f");
        pro.add("g");
        pro.add("h");

        
           //
            System.out.println(pro.get(4));

            pro.remove(3);

            System.out.println(pro);
        

    }
}
