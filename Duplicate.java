class Duplicate
{
public static void main(String [] args)
{
   int a[]=new int[]{10,15,30,15,10,1,2,3,10,30,1,2,6,7};
  
   int x,y,count;
  for(x=0;x<a.length;x++)
    {
        count=0;
      for(y=x+1;y<a.length;y++)
      {  
       if(a[y]==a[x])
        {
          count++;
         }
       }
     
         if(count==0)
  System.out.println(a[x]+" "+   count);
}
}
}      