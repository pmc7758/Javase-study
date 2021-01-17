public class TestLambda {

/*    static class Teacher implements RoleName{
        @Override
        public void outPutName() {
            System.out.println("我是小红老师");
        }
    }*/


    public static void main(String[] args) {

        //RoleName teacher = new Teacher();
        //teacher.outPutName();


/*        RoleName teacher = new Teacher();
        teacher.outPutName();*/
/*        class Teacher implements RoleName {
            @Override
            public void outPutName() {
                System.out.println("我是小红老师");
            }

        }

        RoleName teacher = new Teacher();
        teacher.outPutName();*/



/*        RoleName teacher = new RoleName() {
            @Override
            public void outPutName() {
                System.out.println("我是小亮老师");
            }
        };
        teacher.outPutName();*/

        RoleName teacher;
        //String name = "小白";
        teacher = (name)->{
            System.out.println("我是"+name+"老师");
        };
        teacher.outPutName("小白");

    }
}


interface RoleName{
    void outPutName(String name);
}


/*
class Teacher implements RoleName{
    @Override
    public void outPutName() {
        System.out.println("我是小红老师");
    }
}*/
