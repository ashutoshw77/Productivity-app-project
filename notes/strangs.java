class stra
{
 public static void main(String args[])
 {

  int mul=1,asc=0,sum=0;
char ch;
int i;
  String num="",str="";
  String str1="",stro="",stroo="",str3="",str4="";
  int count=0;
for(i=0;i<args.length;i++)
 str+=args[i];
  for( i=0;i<str.length();i++)
  {
ch=str.charAt(i);
if(ch=='-')
{
i++;
do
{
str1+=str.charAt(i);
i++;
if(i>=str.length())
{
break;
}
}
while(Character.isDigit(str.charAt(i)));
mul*=Integer.parseInt(str1)*-1;
str1="";
i--;
}
else if(Character.isDigit(str.charAt(i)))
{
do
{
str1+=str.charAt(i);
i++;
if(i>=str.length())
break;
}
while(Character.isDigit(str.charAt(i)));
sum+=Integer.parseInt(str1);
str1="";
i--;
}
else if((int)ch>=65 && (int)ch<=90)
{
stro+=ch;
if(ch=='Z')
{
asc=(int)ch+7;
str3+=(char)(asc);
}
else
{
asc=(int)ch+32;
str3+=(char)(asc+1);
}
}
else
{
 if((int)ch>=97 && (int)ch<=122)
{
stroo+=ch;
if(ch=='a')
{
asc=(int)ch-7;
str4+=(char)(asc);
}
else
{
asc=(int)ch-32;
str4+=(char)(asc-1);
}
}
}
}
System.out.println("The sum of positive numbers"+sum);
System.out.println("The product of negative numbers"+mul);
System.out.println("The  small characters "+stroo+" converted  previous letter in Capital  "+str4);
System.out.println("The  capital characters "+stro+" converted  after letter into small "+str3);
}
}