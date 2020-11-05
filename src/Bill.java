public class Bill {

    private int amount;
    private String billId;


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }


    public String printInfo(){

        return "billID = " + billId + "\namount = " + amount;

    }

}
