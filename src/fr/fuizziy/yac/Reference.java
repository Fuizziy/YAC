package fr.fuizziy.yac;

public class Reference {

	public static boolean workInProgress = true;
	
	public static enum Utils {
		PREFIX("�c[�aNawel�c]"),
		NO_PERMISSION("�cTu n'as pas la permission d'executer cette commande"),
		ALREADY_OPENED("�cTu as d�j� ouvert la case du jour !"),
		NOT_PLAYER("Mode console d�tect�. �eWARNING: Comportement ind�fini."),
		WORK_IN_PROGRESS("�6Attention: �7Le plugin est en phase de "
				+ "d�veloppement ou en train d'�tre r�ecrit, des comportements"
				+ "ind�finis sont donc � pr�voir.");
		
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
