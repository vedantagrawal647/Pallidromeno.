public class Pallindrome {
        public static void main(String[] args) {
            int d = 123, n, k,q, r;
            d=121;
            k=d;
            n = 0;
            while(d!=0){
                q=d/10;
                r=d%10;
                n=(n*10)+r;
                d=q;
            }
            if(k==n){
                System.out.println("given no. is pallindrome");
            }
            else{
                System.out.println("given no. is not a pallindrome");
            }



    }
}

