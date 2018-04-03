public class StringBalanceChecker {
    public static boolean stringBalanceCheck(String string){
        int count = 0;
        char sim;

        for(int i = 0; i < string.length(); i++){
            sim = string.charAt(i);
            if (sim == ')'){
                count--;
                if (count < 0){
                    return false;
                }
            }
            else if(sim == '('){
                count++;
            }
        }
        return count == 0;
    }
}
