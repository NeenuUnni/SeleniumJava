package basics;

public class AddNum {
    
    public int add(int num1, int num2) {
        return num1 + num2;
    }

	public static void main(String[] args) {
		AddNum cal=new AddNum();
		int res=cal.add(20,30);
		System.out.println("The result of the given numbers is:" +res);

	}

}
