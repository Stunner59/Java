class Static {

    static int a;
    static double b;
    static String s;
    

    public static void main(String[] args) {
        
                System.out.println(a);
                System.out.println(b);
                System.out.println(s);
               
                
    }
    static {
        System.out.println(a);
        a = 20;
    }

    

}