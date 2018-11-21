package fr.fuizziy.yac;

public class Reference {

	public static boolean workInProgress = true;
	
	public static enum Utils {
		PREFIX("§c[§aNawel§c]"),
		NO_PERMISSION("§cTu n'as pas la permission d'executer cette commande"),
		ALREADY_OPENED("§cTu as déjà ouvert la case du jour !"),
		NOT_PLAYER("Mode console détecté. §eWARNING: Comportement indéfini."),
		WORK_IN_PROGRESS("§6Attention: §7Le plugin est en phase de "
				+ "développement ou en train d'être réecrit, des comportements"
				+ "indéfinis sont donc à prévoir.");
		
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
