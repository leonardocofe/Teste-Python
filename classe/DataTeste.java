package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data();


        var d2 = new Data(10, 4, 1996);

        System.out.println(d1.obterDataFormatada());
        System.out.println(d2.obterDataFormatada());
    }
}
