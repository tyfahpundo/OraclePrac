public class Chick{
    private String name = "Fluffy";
    {System.out.println("Setting Field");}

    public Chick(){
        name = "Tiny";
        System.out.println("Setting Constructor");
    }
    public static void main(String [] args){
        Chick chick = new Chick();
        System.out.println(chick.name);
    }
}
