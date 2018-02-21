public class Man extends Human {
    @Override
    public void walk() {
        System.out.println("Man can walk.");

    }

    public  void  dance(){
        new Woman() {


            public void manDance() {
                super.dance();
                System.out.println("Man dance.");
            }
        }.manDance();

    }
}
