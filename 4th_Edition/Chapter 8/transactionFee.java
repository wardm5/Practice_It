//  https://practiceit.cs.washington.edu/problem/view/bjp4/chapter8/e11-transactionFeeBankAccount

public boolean transactionFee(double fee){
    int trans = transactions;
    double totalFee = 0.0;
    double bal = balance;
    if (trans == 0) 
        return false;
    for(int i = 1; i <= trans; i++){
        totalFee += fee*i;
        if (totalFee >= bal) {
            balance = 0.0;
            return false;
        }   
    }
    balance = bal - totalFee;
    return true;  
}
