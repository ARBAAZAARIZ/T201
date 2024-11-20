package Employee;

public class Emp {

    private String name;
    private int empId;
    private double bPay; // Basic Pay
    private double hra;  // House Rent Allowance
    private double da;   // Dearness Allowance
    private double nPay; // Net Pay
    private double pf;   // Provident Fund
    private double grossPay;
    private double incomeTax;
    private double allowance;

   public Emp(String name, int empId , double bPay){
        this.name=name;
        this.empId=empId;
        this.bPay=bPay;
        calculateSalary();
        displayEmpDetails();

    }
    private void calculateSalary(){
        this.hra=0.30 * bPay;
        this.da=0.40 * bPay;
        this.grossPay=bPay+hra+da;
        this.pf=0.12*bPay;
        this.incomeTax=0.10*grossPay;
        this.allowance=0.05*grossPay;
        this.nPay=grossPay-(pf+incomeTax+allowance);

    }
    public void displayEmpDetails(){

        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Basic Pay: " + bPay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Gross Pay: " + grossPay);
        System.out.println("Provident Fund: " + pf);
        System.out.println("Income Tax: " + incomeTax);
        System.out.println("Allowance: " + allowance);
        System.out.println("Net Pay: " + nPay);

    }



}
