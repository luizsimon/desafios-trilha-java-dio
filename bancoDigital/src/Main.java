public class Main {

	public static void main(String[] args) {
		Cliente luiz = new Cliente("Luiz", "030.402.130-21");
        Cliente joao = new Cliente("Joao", "392.123.492-62");
		
		Conta ccLuiz = new ContaCorrente(luiz);
		Conta poupancaJoao = new ContaPoupanca(joao);

		ccLuiz.depositar(100);
		poupancaJoao.depositar(200);
		
        ccLuiz.transferir(150, poupancaJoao);
        
        ccLuiz.imprimirExtrato();
		poupancaJoao.imprimirExtrato();
	}

}
