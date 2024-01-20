package Dec23;
public class switch3 {
    public static void main(String[] args) {
        String ch="Addition";
        int a=10,b=20,c;
        switch(ch)
        {
            case "Addition":
            c=a+b;
            System.out.println(c);
            break;
            case "Subraction":
            c=a-b;
            System.out.println(c);
            break;
            default:
            System.out.println("Invalid");
        }
    }
    
}
