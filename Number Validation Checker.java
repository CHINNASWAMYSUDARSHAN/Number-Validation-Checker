import java.util.Scanner;
class MiniProject{
public static void main(String args[]){
Scanner sp=new Scanner(System.in);
int x=1;
do{
System.out.println("<---- Main  Menu ---->");
System.out.println("1.TO Check Even Number Or Not ");
System.out.println("2.Perform Sum And Count Operations on Number");
System.out.println("3.To Check Prime Number Or Not");
System.out.println("4.To Find The Factorial of a Number");
System.out.println("5.TO Find Reverse of The Number");
System.out.println("6.TO Check Armstrong Number Or Not");
System.out.println("7.To Check Palindrome Number or Not");
System.out.println("8.To Check Neon Number or Not");
System.out.println("9.To Check Happy Number or Not");
System.out.println("10.To Check Harshad Number or Not");
System.out.println("11.Exit \n");
System.out.println("Enter Your Choice:");
int choice=sp.nextInt();
if (choice==1){
System.out.println("TO Check Even Number or Not");
System.out.println("Enter The Number:");
int num=sp.nextInt();
System.out.println("The Number is:"+num);
if(num%2==0){
System.out.println("The Given Number "+num+" is Even Number \n");
}
else{
System.out.println("The Given Number "+num+" is Odd Number \n");
}
}
else if(choice==2){
System.out.println("\n Finding The Sum of the Digits,Count of the Digits,Count the Even Digits,Count the Odd Digits,Sum of the Odd Digits ,Sum of the Even Digits");
System.out.println("Enter The Number:");
int num=sp.nextInt();
int num1=num;
int count=0,evencount=0,oddcount=0,sum=0;
int evensum=0,oddsum=0;
while(num>0){
int rem=num%10;
count+=1;
sum+=rem;
if(rem%2==0){
evencount+=1;
evensum+=rem;
}
else{
oddcount+=1;
oddsum+=rem;
}
num=num/10;
}
System.out.println("Sum Of The "+num1+" Number:"+sum);
System.out.println("Count Of Digits in "+num1+" Number:"+count);
System.out.println("Sum Of The Even Digits in "+num1+" Number:"+evensum);
System.out.println("Count Of Even Digits In The "+num1+" Number:"+evencount);
System.out.println("Sum Of The Odd Digits in "+num1+" Number:"+oddsum);
System.out.println("Count Of Odd Digits In The "+num1+" Number:"+oddcount+"\n");
}
else if(choice==3){
System.out.println("Finding a Number is Prime or Not ");
System.out.println("Enter the Number:");
int num=sp.nextInt();
int count=0;
if(num==0||num==1){
System.out.println(num+" is not prime number");
}
else{
for(int i=2;i<=num/2;i++){
if(num%i==0){
System.out.println(num+" is not prime number");
count+=1;
break;
}
}
if(count==0){
System.out.println(num+" is prime number \n");
}
}
}
else if(choice==4){
System.out.println("To Find The Factorial of a Number");
System.out.println("Enter The Number:");
int num=sp.nextInt();
int fact=1;
for(int i=1;i<=num;i++){
fact=fact*i;
}
System.out.println("Factorial of Given Number is :"+fact);
}
else if(choice==5){
System.out.println("Finding Reverse of a number");
System.out.println("Enter The Number");
int num=sp.nextInt();
int rev=0;
while(num!=0){
int rem=num%10;
rev = rev * 10 + rem;
num = num/10;
}
System.out.println("The Reverse of The Given Number is: "+rev+"\n");
}
else if(choice==6){
System.out.println("To Check Whether Number is Armstrong Or not");
int sum=0;
System.out.println("Enter The Number");
int num=sp.nextInt();
int arm=num;
while(num!=0){
int rem= num % 10;
sum= sum + (rem*rem*rem);
num = num/10;
}
if(sum==arm){
System.out.println(arm+" is ArmStrong Number \n");
}
else{
System.out.println(arm+" is not ArmStrong Number \n");
}
}
else if(choice==7){
System.out.println("To Check Whether a Number is Palindrome or not");
System.out.println("Enter The Number");
int num=sp.nextInt();
int palin=num;
int rev=0;
while(num!=0){
int rem=num%10;
rev = rev * 10 + rem;
num = num/10;
}
if(rev==palin){
System.out.println(palin+" is a Palindrome \n");
}
else{
System.out.println(palin+" is not a Palindrome \n");
}
}
else if(choice==8){
System.out.println("TO Check whether number is Neon Or Not");
System.out.println("Enter The Number:");
int num=sp.nextInt();
int s=num;
int sum=0;
int sq = num * num;
while(sq!=0){
int rem= sq % 10;
sum = sum +rem;
sq=sq/10;
}
if(s== sum){
System.out.println(s+ " is a Neon Number \n");
}
else{
System.out.println(s+ " is not a Neon Number \n");
}
}
else if(choice==9){
System.out.println("To check Whether Number is Happy Number or Not");
System.out.println("Enter the Number:\n");
int num=sp.nextInt();
int temp=num;
int sum=0;
while (num!= 1 && num!= 4) {
sum = 0;
while (num!=0){
int remainder=num % 10;
sum =sum+(remainder * remainder);
num=num/10;
}
num=sum;
}
if(sum==1 || num==1){
System.out.println(temp+" is a Happy Number \n");
}
else{
System.out.println(temp+" is not a Happy number \n");
}
}
else if(choice==10){
System.out.println("To Check Harshad Number or Not");
System.out.println("Enter The Number:");
int num=sp.nextInt();
int rem,sum =0;
int temp= num;
while(num > 0){
rem = num%10;
sum = sum + rem;
num= num/10;
}
if(temp%sum == 0){
System.out.println(temp + " is a Harshad number \n");
}
else{
System.out.println(temp+ " is Not a Harshad number \n");
}
}
else if(choice==11){
break;
}
else{
System.out.println("Invalid Choice \n");
}
}while(x==1);
}
}
