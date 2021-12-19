public class Main {
    public static void main(String[] args){
        boolean teste = TeenNumberChecker.hasTeen(22, 23, 34);
        System.out.println("The first method retuns " + teste);

        boolean teste2 = TeenNumberChecker.isTeen(13);
        System.out.println("The second method returns " + teste2);
    }
}
