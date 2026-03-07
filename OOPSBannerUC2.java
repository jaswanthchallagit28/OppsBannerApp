public class OOPSBannerUC2 {

    public static void main(String[] args) {

        // STEP 1 — Create String Array for 7 lines
        String[] banner = new String[7];

        // STEP 2 — Build each line using String.join()

        banner[0] = String.join("",
                " ******** ", " ******** ", " ******** ", " ******** ");

        banner[1] = String.join("",
                " *      * ", " *      * ", " *      * ", " *        ");

        banner[2] = String.join("",
                " *      * ", " *      * ", " *      * ", " *        ");

        banner[3] = String.join("",
                " *      * ", " ******** ", " ******** ", " ******** ");

        banner[4] = String.join("",
                " *      * ", " *        ", " *        ", "        * ");

        banner[5] = String.join("",
                " *      * ", " *        ", " *        ", "        * ");

        banner[6] = String.join("",
                " ******** ", " ******** ", " *        ", " ******** ");

        // STEP 3 — Enhanced for loop to print
        for (String line : banner) {
            System.out.println(line);
        }
    }
}
