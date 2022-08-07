#include <iostream>
using namespace std;
int main()
{
    int n;
    cout<<"please enter number :\n";
    cin>>n;
    while(!(n>=1 && n<=100)){
        cout<<"you entered wrong number, 1<=number<=100 ,enter again :\n";
        cin>>n;
    }
    int side=4*n+1,triangleBase=2*side-1;
    int r1=1,r2=-1,c1=triangleBase/2+1,c2=-1;
    int saveColumn1=c1;
    int levelCurrent=1;
    int number1=0;
    int number2=0;
    for(int i=1;i<=side;i++){
        for(int j=1;j<=triangleBase;j++){
            if(i==r1 && j==c1){
                cout<<"*";
                if(r2==-1 && c2==-1){
                    r2=r1+1;
                    c2=c1+1;
                    r1++;
                    c1--;
                    saveColumn1=c1;
                }
                else if(number1<levelCurrent-1 && i!=levelCurrent*4+1){
                    c1+=8;
                    number1++;
                }
                else{
                    r1++;
                    c1=saveColumn1-1;
                    saveColumn1=c1;
                }

            }
            else if(i==r2 && j==c2){
                cout<<"*";
                if(number2<levelCurrent-1 && i!=levelCurrent*4+1){
                    c2+=8;
                    number2++;
                }
                else{
                    if(i==levelCurrent*4+1){
                        r2++;
                        c2=c1+2;
                        levelCurrent++;
                    }
                    else{
                        r2++;
                        if(i+1==levelCurrent*4+1){
                            c2++;
                        }
                        else{
                            c2=(levelCurrent>1)?(c2-(7+(levelCurrent-2)*8)):(c2+1);
                        }
                    }
                }
            }
            else if(i==levelCurrent*4+1 && (j>c1 && j<c2)){
                cout<<"*";
            }
            else
                cout<<" ";
        }
        cout<<"\n";
        number1=0;
        number2=0;
    }
    cout<<"Develped By:JR.Y\n";
    cout<<"--->> Decoder();\n ";
    return 0;
}

