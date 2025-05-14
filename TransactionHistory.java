public class TransactionHistory {
    int t_id;
    String sender;
    String reciver;
    String status;
    String date;
    TransactionHistory(int t_id,String sender, String reciver,String status,String date){
        this.t_id=t_id;
        this.sender=sender;
        this.reciver=reciver;
        this.status=status;
        this.date=date;
    }
    void DisplayTransaction(){
        System.out.println("Transaction ID: "+t_id);
        System.out.println("Sender Name: "+sender);
        System.out.println("Reciver Name: "+reciver);
        System.out.println("Transaction status: "+status);
        System.out.println("Date: "+date);
    }
    public static void main(String[] args) {
        TransactionHistory t=new TransactionHistory(1,"Ariha","Shreya","Success","22-04-2025");
        t.DisplayTransaction();
    }
}
