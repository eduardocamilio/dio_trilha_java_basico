public class ComputadorUsuario {
	public static void main(String[] args) {
		//abrindo MSN Messenger
		MSN msn = new MSN();
        System.out.println("Usando o MSN: ");
		msn.enviarMensagem();		
		msn.receberMensagem();


        Facebook fbm = new Facebook();
        System.out.println("Usando o Facebook: "); 
		fbm.enviarMensagem();
		fbm.receberMensagem();
      
		
		Telegram tlg = new Telegram();
        System.out.println("Usando o Telegram: ");
		tlg.enviarMensagem();
		tlg.receberMensagem();

	}
}