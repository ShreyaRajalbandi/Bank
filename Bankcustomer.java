public class Bankcustomer {
    String c_name;
    String acc_num;
    int age;
    Bankcustomer(String c_name,String acc_num,int age){
        this.c_name=c_name;
        this.acc_num=acc_num;
        this.age=age;
    }
    void DisplayCustomer(){
        System.out.println("CUSTOMER NAME: "+c_name);
        System.out.println("ACCOUNT NUMBER: "+acc_num);
        System.out.println("CUSTOMER AGE: "+age);
    }
    public static void main(String[]args){
        Bankcustomer bc= new Bankcustomer("Ariha","SBI500",20);
        bc.DisplayCustomer();
}
