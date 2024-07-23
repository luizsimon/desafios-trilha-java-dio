public class Celular implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }

    public void pausar() {
        System.out.println("PAUSANDO MUSICA");    
    }

    public void selecionarMusica() {
        System.out.println("SELECIONANDO MUSICA"); 
    }

    public void ligar() {
        System.out.println("LIGANDO IPHONE"); 
    }

    public void desligar() {
        System.out.println("DESLIGANDO IPHONE"); 
    }

    public void atender() {
        System.out.println("ATENDENDO A LIGAÇÃO"); 
    }

    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ"); 
    }

    public void exibirPagina() {
        System.out.println("EXIBINDO PAGINA"); 
    }

    public void atualizarPagina() {
        System.out.println("ATUALIZANDO A PAGINA"); 
    }

    public void adicionarNovaAba() {
        System.out.println("ADICIONANDO NOVA ABA"); 
    }

    public void removerUltimaAba() {
        System.out.println("REMOVENDO A ULTIMA ABA"); 
    }
}