package LinkedList;

class LL
{
    StudentNode head;
    class StudentNode
    {
        int rollNumber;
        String name;
        int age;
        char grade;
        StudentNode next;

        StudentNode(int rollNumber,String name,int age,char grade)
        {
            this.rollNumber = rollNumber;
            this.name = name;
            this.age =age;
            this.grade = grade;
            this.next = null;
        }
    }

    public void addBegin(int rollNumber,String name,int age,char grade)
    {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        if(head == null)
        {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void addEnd(int rollNumber,String name,int age,char grade)
    {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
        if(head == null)
        {
            head = newNode;
            return;
        }

        StudentNode curr = head;

        while(curr.next!=null)
        {
            curr = curr.next;
        }

        curr.next = newNode;
        
    }


    public void addAtPosition(int rollNumber,String name,int age,char grade,int position) {
        StudentNode newNode = new StudentNode(rollNumber, name, age, grade);
   
        if (position <= 1 || head == null) 
        {
            newNode.next = head;
            head = newNode;
            return;
        }
    
        StudentNode temp = head;
        int count = 1;
    
        while (temp.next != null && count < position - 1) 
        {
            temp = temp.next;
            count++;
        }
    
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void deleteByRoll(int rollNumber) 
    {
        if (head == null) return;

        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.rollNumber != rollNumber)
        {
            temp = temp.next;
        }

        if (temp.next != null)
        {
            temp.next = temp.next.next;
        }
    }


    public StudentNode search(int rollNumber) 
    {
        StudentNode temp = head;
        while (temp != null) 
        {
            if (temp.rollNumber == rollNumber) 
            {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }


    public void updateGrade(int rollNumber, char newGrade) 
    {
        StudentNode student = search(rollNumber);
        if (student != null) 
        {
            student.grade = newGrade;
        }
    }

    public void display() 
    {
        StudentNode temp = head;
        if (temp == null) 
        {
            System.out.println("List is empty");
            return;
        }

        while (temp != null) 
        {
            System.out.println(temp.rollNumber + " " + temp.name + " " + temp.age + " " + temp.grade);
            temp = temp.next;
        }
    }




}
public class Program1 {
    public static void main(String[] args) {
        LL list = new LL();

        list.addBegin(1, "Ram", 20, 'A');
        list.addEnd(2, "Shyam", 21, 'B');
        list.addAtPosition(3, "Aku", 22, 'A', 2);

        list.display();

        list.updateGrade(2, 'A');
        list.deleteByRoll(1);

        System.out.println("After update and delete:");
        list.display();
    }
}

