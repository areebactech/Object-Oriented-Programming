public class developer extends Employee{
    private String pro_language;

    developer(){
    }
    developer(String na, String id, String de, String la){
        super(na, id, de);
        pro_language = la;
    }

    void display(){
        super.display();
        System.out.println("Programming Language: " + pro_language);
    }
}