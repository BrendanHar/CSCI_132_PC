public class Test_file_one {


    public static void ifstatement(){
        double a = 6;
        if (a < 8) {
            System.out.println("yep");
        }
        else {
            System.out.println("NOPEDED");
        }

    }

    public static void whileStatement(int a){

        while (a < 15){
            System.out.println(a);
            a= a + 1;
        }
        System.out.println("a "+ a);
    }

    public static void forstatement(int a){

        int i = 33;
        for (i = 0; i< a; i++){
            System.out.println("i "+ i);
        }

    }


    public static void main(String[] args) {

        ifstatement();
        whileStatement(3);
        forstatement(22);

        String a = "Hello World";

        System.out.println(a);

    }

}
