#include<iostream>
#include<conio.h>
using namespace std;
int main()
{
int u,k,s,i,j,p,x,c,z,d;
z=-17;
u=20;
s=10;
for(i=1;i<=19;i++)
{
	k=0;
for(j=1;j<=19;j++)
{
	p=0;
	if(i<=10)
	{
	if(j<i)
	{
		while(j<i)
		{
		cout<<s-p<<" ";
		if((s-p!=10))
		cout<<" ";
		j++;
		k++;
		p++;	
		}
	}
	if((j>=i)&&(j!=u))
	{
		cout<<s-k<<" ";
		if((s-k)!=10)
		cout<<" ";
	}
	else
	{
	c=i-1;	
	x=i-2;
	while(c>0)
	{
		cout<<s-x<<" ";
		if((s-x)!=10)
		cout<<" ";
		c--;
		j++;
		x--;
	}
}
	}
	if(i>10)
	{
			if(j<=(i-z))
	{
		while(j<=(i-z))
		{
		cout<<s-p<<" ";
		if((s-p!=10))
		cout<<" ";
		j++;
		k++;
		p++;	
		}
	}
	if((j>(i-z))&&(j<=i))
	{
		cout<<s-k<<" ";
		if((s-k)!=10)
		cout<<" ";
	}
	else
	{
	c=i-1;	
	d=d-2;
	x=i+d-2;
	while((c>0)&&(j<=19))
	{
		cout<<s-x<<" ";
		if((s-x)!=10)
		cout<<" ";
		c--;
		j++;
		x--;
	}
}
	}
	
}
cout<<"\n";
k=0;
u--;
z=z+2;
}
cout<<"\n"<<"         Developed By M. H. Khoshechin -----";
getch();
return 0;
}
