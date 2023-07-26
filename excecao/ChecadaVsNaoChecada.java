package excecao;

public class ChecadaVsNaoChecada {
    public static void main(String[] args) {
        try{
            geraErro1();
        }catch (RuntimeException e ){
            System.out.println(e.getMessage());
        }
        try{
            geraErro2();
        }  catch (Throwable e){
            System.out.println(e.getMessage());
        }

        System.out.println("FIM :)");

    }
    //Não chegada ou não verificada
    static void geraErro1(){
        throw  new RuntimeException("Ocorreu um erro bem legal #01!!");
    }
    //Exceção chegada ou verificada
    static void geraErro2() throws Exception{
        throw  new Exception("Ocorreu um erro bem legal #02!!");
    }
}

