

        public class Account{
            private double balance;
            public Account(double balance){
                if(balance>0){
                    this.balance=balance;}
                else{
                    balance=0;
                }

            }
            public void credict(double ammount){
                balance=balance+ammount;
            }
            public double getbalance(){
                return balance;
            }
    }

