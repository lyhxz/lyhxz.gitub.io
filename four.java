public class four {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 2; i < 201; i++) {
            int j = 2;
            while(i % j != 0) {
                j++;
            } if(i == j) {
                count++;
                System.out.println(i);

            }
        }
        System.out.println("共有素数" + count + "个");
    }
}
