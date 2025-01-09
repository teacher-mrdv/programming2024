public class StringDemo
{
    public static void main(String[] args)
    {
        String n = "Super";
        String p = "man";
        String q = "Super";
        String s = new String("Super");
        System.out.println(n == q);
        System.out.println(n == s);
        String nn = "hello";
        String qq = nn;
        String f = nn+qq;
        System.out.println( f );
        System.out.println(nn==qq);
        System.out.println(n==s);
        System.out.println(n.equals(s));
        System.out.println(n.substring(2,5));
        String last3 = n.substring(2, n.length());
        System.out.println(last3.toUpperCase());
        String name = "Sakura";
        System.out.println(name.substring(0, 4));
        System.out.println(name.substring(name.length()-2));

    }
}
