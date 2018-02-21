import sun.security.krb5.internal.crypto.HmacMd5ArcFourCksumType;

public class Main {

    public static void main(String[] args) {

        /*
         * 匿名内部类的生命方法
         *
         *
         * new 父类（参数列表）|实现接口（）{
         *   //匿名内部类的内部定义
         * }
         *
         * */
        Human human = new Human() {
            @Override
            public void walk() {
                System.out.println("AnonymousHuman can walk.");

            }
        };


        human.walk();

        Thread t = new Thread() {

            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {

                    try {
                        sleep(100);

                    } catch (InterruptedException e) {
                        e.printStackTrace();

                    }

                    System.out.println(i);
                }
            }
        };

        t.start();

        new Thread() {
            @Override
            public void run() {

                for (int i = 0; i < 10; i++) {
                    try {
                        sleep(100);

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("i = " + i);
                }

            }

        }.start();


        Human man = new Man();

        man.walk();

        Man man1 = new Man();
        man1.dance();

        Human human1 = new Main().getHumanInstance("fucker");
        human1.walk();

    }


    public Human getHumanInstance(final String name) {

        return new Human() {

            private String nameA;

            {
                nameA = name;
            }


            @Override
            public void walk() {
                System.out.println(nameA + " walk.");
            }


        };


    }
}


