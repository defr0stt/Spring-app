package ua.lpnu.spring.bean;

public class TestBean
{
    private String name;

    private TestBean(String name) {
        this.name = name;
    }

    // method to create objects because of
    // constructor is private
    public static TestBean creatableMethod(String name){
        System.out.println("creatableMethod is called");
        return new TestBean(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void initialization(){
        System.out.print("Initializing process");
        for(int i=0; i<3;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
    }

    public void destroying(){
        System.out.print("Destroying process");
        for(int i=0; i<3;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println();
    }
}