public class Celular implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    
    public void tocar() {
        System.out.println("TOCANDO MUSICA");
    }

    public void pausar() {
        System.out.println("PAUSANDO MUSICA");    
    }

    public void selecionarMusica(String musica) {
        System.out.println("SELECIONANDO MUSICA: " + musica); 
    }

    public void ligar(String numero) {
        System.out.println("LIGANDO PARA NUMERO: " + numero); 
    }

    public void desligar() {
        System.out.println("DESLIGANDO A LIGAÇÃO"); 
    }

    public void atender() {
        System.out.println("ATENDENDO A LIGAÇÃO"); 
    }

    public void iniciarCorreioVoz() {
        System.out.println("INICIANDO CORREIO DE VOZ"); 
    }

    public void exibirPagina(String url) {
        System.out.println("EXIBINDO PAGINA: " + url); 
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
