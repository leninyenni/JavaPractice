package anveshPrograms.SF;

public class ValidIPOrNot {
    public static void main(String[] args) {
        System.out.println(isValid("10.123.255.255"));

    }

    public static boolean isValid(String str) {
        boolean isValid = false;
        //"10.151.22.66"
        int count = 0;
        String[] strA = new String[str.length()];

        if (str.contains(".")) {
            strA = str.split("\\.");
            if (strA.length == 4) {
                for (int i = 0; i < strA.length; i++) {

                    if (isNumeric(strA[i])&& Integer.parseInt(strA[i]) >= 0 && Integer.parseInt(strA[i]) <= 255)
                        count++;

                }
            }
        }
        if (count == strA.length) {
            isValid = true;
        }

        return isValid;
    }


    public static boolean isNumeric(String strNum) {
        //Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
        if (strNum == null) {
            return false;
        }
        //return pattern.matcher(strNum).matches();
        return strNum.matches("-?\\d+(\\.\\d+)?");
    }
}