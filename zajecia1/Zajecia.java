import java.util.ArrayList;
public class Zajecia {
    ArrayList<String> listaStudentow = new ArrayList<>();

    public void zapiszStudenta(String imie, String nazwisko){
        String fullName = imie +" "+nazwisko; 
        if(listaStudentow.size() <= 10 ){    
            listaStudentow.add(fullName);
        }
        else System.out.println("Zajecia maja pelna liste studentow");   
    }
    public static void main(String[] args) {
        Zajecia zajecia = new Zajecia();
        zajecia.zapiszStudenta("michal", "kleban");

    }
}