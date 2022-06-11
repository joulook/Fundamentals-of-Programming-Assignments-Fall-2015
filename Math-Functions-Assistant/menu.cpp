#include<iostream>
#include<conio.h>
#include<stdlib.h>
#include<math.h>
using namespace std;
void part1();
void part2();
void part3();
void part4();
int main()
{
	int a,c;
	part1();
	cin>>a;
	system("cls");
	while(a<5)
	{
		if(a==1)
		part2();
		if(a==2)
		part3();
		if(a==3)
		part4();
		if(a==4)
		return 0;
		cout<<"Enter 0 to return to main menu :\n";
		cin>>c;
		system("cls");
		part1();
		cin>>a;
	system("cls");	
	}
}
void part1()
{
	cout<<"\n\n        Developed by : M. H. khoshechin \n\n" ;
	cout<<"Select an item from the list :\n\n";
	cout<<"1.Checking a number is prime or not.\n\n";
	cout<<"2.Power Function .\n\n";
	cout<<"3.Factorial Function .\n\n";
	cout<<"4.Exit.\n\n";


}
void part3()
{
unsigned long int x,y,c;
	cout<<"For Calculating x^y, Enter 2 numbers for x and y :\n";
	cin>>x>>y;
	c=pow(x,y);
	cout<<"The Answer is : "<<c<<"\n";
}
void part4()
{
	int n,s=1,i;
	cout<<"For Calculating x!, Enter a number for x :\n";
	cin>>n;
	for(i=1;i<=n;i++)
	s=s*i;
	cout<<"The Answer is :"<<s<<"\n";
}
void part2()
{
	int i,n,r,c;
	cout<<"to finding x is prime or not, Enter a number for x :\n";
	cin>>n;
	for(i=1;i<=n;i++)
	{
		r=n%i;
		if(r==0)
		c++;
	}
	if(c==2)
	cout<<"x is prime.\n";
	else
	cout<<"x is not prime.\n";
}
