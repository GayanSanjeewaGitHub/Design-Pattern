package pkg12_composite_structural.pattern;

import java.util.ArrayList;

/**
 *
 * @author GAYAN SANJEEWA
 */
abstract class AbstractSuperPosition {

    String name;
    String title;
    double salary;

    String getName() {
        return name;
    }

    String getTitile() {
        return title;
    }

    abstract double getValue();

}

class JobLeaf extends AbstractSuperPosition {

    public JobLeaf(String title, String name, double salary) {
        this.title = title;
        this.name = name;
        this.salary = salary;
    }

    @Override
    double getValue() {
        return this.salary;
    }

}

class JobLead extends AbstractSuperPosition {

    public JobLead(String title, String name, double salary) {
        this.title = title;
        this.name = name;
        this.salary = salary;
    }
    ArrayList<AbstractSuperPosition> jobleafs = new ArrayList();

    void addChild(AbstractSuperPosition e) {
        jobleafs.add(e);

    }

    @Override
    double getValue() {
        double value = this.salary;
        for (AbstractSuperPosition jobleaf : jobleafs) {
            value += jobleaf.getValue();
        }
        return value;
    }

}

public class Exam {

    public static void main(String[] args) {

        JobLead kevin = new JobLead("Manager", "kevin", 180000);
        JobLead henry = new JobLead("Project Lead", "Henry", 100000);
        JobLead mathew = new JobLead("Project Lead", "Mathew", 90000);
        JobLead levi = new JobLead("Project Lead", "Levi", 100000);

        JobLeaf ryn = new JobLeaf("Developer", "Ryn", 80000);
        JobLeaf json = new JobLeaf("Developer", "Jsonn", 60000);
        JobLeaf kevinD = new JobLeaf("Developer", "Kevin_D", 60000);
        JobLeaf alex = new JobLeaf("Developer", "Alex", 70000);

        kevin.addChild(henry);
        kevin.addChild(mathew);
        kevin.addChild(levi);

        henry.addChild(ryn);
        mathew.addChild(json);
        
        levi.addChild(kevinD);
        levi.addChild(alex);
        
        System.out.println(" Requestig Managers Salary Under :"+kevin.getName()+" ::"+kevin.getValue()+" /=Rs");
        System.out.println("Total  Salary  Project Lead Under :"+levi.getName()+"::"+levi.getValue()+" /=Rs");
        
        
        

    }
}
