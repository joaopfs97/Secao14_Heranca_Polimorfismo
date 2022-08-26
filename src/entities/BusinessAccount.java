package entities;

public class BusinessAccount extends Account{
    private Double loanLimit;
    
    public BusinessAccount(){
        super();
    }

    public BusinessAccount(Double loanLimit, Integer number, String holder, Double balance) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }
    
    public void loan(Double amount){
        if(amount <= loanLimit){
            balance += balance * amount;    
        }
    }
    
    @Override
    public void withdraw(Double amount){
        super.withdraw(amount);
        balance -= 2;
    }
}
