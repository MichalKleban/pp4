import java.util.ArrayList;
public class kolejkaFifo {
    ArrayList<String> kolejka = new ArrayList<>();
    int maxLength = 5;

    public void add(String name){
        if(kolejka.size() < 5) kolejka.add(name);
        else{
            System.out.println("Kolejka jest pelna");
        }}
    public void remove(){
        kolejka.remove(kolejka.size()-1);
    }
    public int len(){
        return kolejka.size();
    }
    public void printInfo(){
        for(int i = 0; i<kolejka.size(); i++){
            System.out.println(kolejka.get(i));
        }
    }
    public static void main(String[] args) {
        kolejkaFifo p1 = new kolejkaFifo();
        p1.add("michal");
        p1.add("maciek");
        p1.add("piotr");
        System.out.println(p1.len());
        p1.printInfo();
        p1.remove();
        p1.printInfo();
        p1.add("piotr");
        p1.add("piotr");
        p1.add("piotr");
        p1.add("piotr");
        p1.printInfo();
    }
}
