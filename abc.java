class Abc
{
public static void main(String args[])
{
String s=new String("aaaabbbbcccc");
int x,y,count=0,value=0;
for(x=0;x<s.length();x++)
{
count=0;
for(int y=x;y<s.length();y++)
{
  if(s.charAt(x)==s.charAt(y))
      count++;
  else if(
    {
      x=y;
      x--;
       break;
    }
  }
System.out.println(s.charAt(x-1)+" "+count+" ");
}
}
}
  
   
  