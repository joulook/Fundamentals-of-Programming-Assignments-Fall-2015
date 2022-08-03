#include<iostream>
 float fact(float x){
	float m =1;
	for(float i = 1; i<=x ; i++)
	m*=i;
	return m ;
}
float pow(float a,float b){
	float m =1;
	for(float i = 0; i<b ; i++)
	m*=a;
	return m;
}
double sin(float t){
	double sum;
	float k=1;
	for(float i=1 ; i<=11 ; i+=2){
		sum=(k*(pow(t,i)/fact(i)))+sum;
		k=-k;
	}
	return sum ;
}
double cos(float t){
	double sum=1;
	float k=-1;
	for(float i=2 ; i<=12 ; i+=2){
		sum=(k*(pow(t,i)/fact(i)))+sum;
		k=-k;
	}
	return sum;
}
double tan(float t ){
	return sin(t)/cos(t);
}
void whoBuildThis(){
	printf("Developed by : JR.Y\nDe.coder();\n");
}
int main()
{
	float k=1,x,p=3.14159;
	double sum=0;
	printf("Enter your Degree : ");
	scanf("%f",&x);
	float t;
	t=(x*p)/180;
	printf("\n");
	printf("sin : ");
	printf("%f" , sin(t));
	printf("\n\n");
	printf("cos : ");
	printf("%f" , cos(t));
	printf("\n\n");
    printf("tan : ");
    if(x==90)
    printf("Infinity");
    else
	printf("%f" , tan(t));
	printf("\n\n");
	whoBuildThis();
	return 0;
}
