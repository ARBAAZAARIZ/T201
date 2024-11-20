package StringsPrograms;

public class program2 {
    public static void main(String[] args) {
        String data="himachal";
        char c[]={'a','e','i','o','u'};
        int count=0;

        for (int i = 0; i <data.length() ; i++) {
            for (int j = 0; j <c.length ; j++) {
                if(c[j]==data.charAt(i)){
                    count++;
                }
            }
        }

        System.out.println(count);
        String sb="arb";
        System.out.println(sb);
        sb="aaz";
        System.out.println(sb);

    }
}
