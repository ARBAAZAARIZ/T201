public class PrintNumbers {
    void printn(int s,int e){
        if(s<=e){
            System.out.println(s);
            s+=1;
            printn(s,e);
        }
    }

    public static void main(String[] args) {
        PrintNumbers pn=new PrintNumbers();
        pn.printn(1, 10);
    }
}
