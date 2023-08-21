class Vowel
{
public static void main(String args[])
{
 String s=new String("HAPPY NEW YEAR");
 String a[]=s.split(" ");
String temp="";
 int x,count=0;
for(x=0;x<a.length;x++)
{
    count=0;
    temp="";
   temp=a[x];
for(int y=temp.length()-1;y>=0;y--)
{
      if(a[x].charAt(y)=='A'||a[x].charAt(y)=='E'||a[x].charAt(y)=='I'||a[x].charAt(y)=='O'||a[x].charAt(y)=='U')
   count++;
}
if(count==2)
System.out.println(a[x]);
}
}
}