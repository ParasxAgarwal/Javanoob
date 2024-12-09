class switch{
    public static void main(String args[]){
        int a = 7;
        int b = 3;
        int c = a + b;
        switch(c){
            case 10 -> result = "high";
            case 4 -> result = "low";
            default -> result = "Random";
        }

        System.out.println(result);

    }
}