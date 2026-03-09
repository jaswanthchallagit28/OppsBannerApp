public class OOPSPatternArray{
	public static void main(String[] args) {
		String[] lines = new String[9];
		lines[0] = "   *   " + "   *    " + "***	 " + "   **";
		lines[1] = " *   * " + " *   *  " + "*     *   " + " **      ";
		lines[2] = "*     *" + "*     * " + "*      *  " + "**       ";
		lines[3] = "*     *" + "*     * " + "*     *   " + " **      ";
		lines[4] = "*	   *" + "*     * " + "***     " + "     * ";
		lines[5] = "*     *" + "*     * " + "*          " + "      * ";
		lines[6] = "*     *" + "*     * " + "*          " + "       *";
		lines[7] = " *   * " + " *   *  " + "*          " + "      * ";
		lines[8] = "   *   " + "   *    " + "*          " + " **   ";
		for (String line : lines) {
			System.out.println(line);
		}
	}
		}
