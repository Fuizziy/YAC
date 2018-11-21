package fr.fuizziy.yac;

public class Reference {
	public static String prefix = "§c[§aNawel§c] ";
	public static enum Utils {
		PREFIX("§c[§aNawel§c]"),
		NO_PERMISSION("§cTu n'as pas la permission d'executer cette commande"),
		ALREADY_OPENED("§cTu as déjà ouvert la case du jour !"),
		NOT_PLAYER("Mode console détecté. §eWARNING: Comportement indéfini.");
		
		String msg;
		
		Utils(String msg)
		{
			this.msg = msg;
		}
		
		public String getMessage()
		{
			return this.msg;
		}
	}
}
