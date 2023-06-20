class Account
{
    int acc_no;
    int balance;
    void disp(){
        System.out.println("Balance for ACC NO.: "+acc_no);
        System.out.println("is "+balance);
    }
}
class Person extends Account{
    int aadhar_no;
    void add(int acc,int bal,int ano){
        acc_no=acc;
        balance=bal;
        aadhar_no=ano;
    }
    void onlyAcc(){
        super.disp();
    }
    void display(){
        System.out.println("Aadhar No.: "+aadhar_no);
        System.out.println("Balance for ACC NO.: "+acc_no);
        System.out.println("is "+balance);
    }
}
class Main
{
        public static void main(String[] args) {
        Person ob1 = new Person();
        ob1.add(1,4000,10005);
        Person ob2 = new Person();
        ob2.add(2,6000,1111);
        Person ob3 = new Person();
        ob3.add(3,8000,20034);
        ob1.display();
        ob2.display();
        ob3.display();
    }
}

