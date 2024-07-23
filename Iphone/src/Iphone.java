public class Iphone extends Celular {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        iphone.ligar("98238713");
        iphone.exibirPagina("www.google.com");
        iphone.iniciarCorreioVoz();
        iphone.desligar();
    }
}
