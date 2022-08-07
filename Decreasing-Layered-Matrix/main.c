#include <stdio.h>
void print(int);
int main()
{
    int n;
    printf("please enter an integer :\n");
    scanf("%d",&n);
    int k=2*n-1,j,q;
    int repeat=k;
    int halfRow=(k/2)+1;
    printf("\n");
    for(int i=1;i<=(k/2)+1;i++){
        q=n;
        j=1;
       while(j<=(k-repeat)/2){
           print(q);
           q--;
           j++;
       }
       for(j=1;j<=repeat;j++){
           print(q);
       }
       q=q+1;
       j=1;
       while(j<=(k-repeat)/2){
           print(q);
           q++;
           j++;
       }
       repeat-=2;
        printf("\n");
    }
    repeat+=4;
    for(int i=halfRow+1;i<=k;i++){
        j=1;
        q=n;
        while(j<=(k-repeat)/2){
            print(q);
            q--;
            j++;
        }
        for(j=1;j<=repeat;j++){
            print(q);
        }
        q=q+1;
        j=1;
        while(j<=(k-repeat)/2){
            print(q);
            q++;
            j++;
        }
        printf("\n");
        repeat+=2;
    }
    printf("\n");
    printf("\t Developed By JR.Y ------  De.coder();\n\n\n");
    return 0;
}
void print(int number){
    if(number/10==0)
        printf("%d  ",number);
    else
        printf("%d ",number);
}
