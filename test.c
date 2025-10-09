#include <stdio.h>
int main()
{
int x = 10, y = 4, z=2;
int P,Q,R,S;
if (x > y) {
P=x*y-z;
}
else {
P = x+y+z;
}
printf("Value of P is : %d\n", P);
while(y >0) {
y--; z+=2;
}
Q=z;
printf("Value of Q after the loop is : %d\n", Q);
R=x&y|z;
printf("Value of R (bit is : %d\n", R);
for(int i = 0; i < 3; i++){
x+=i;
}
printf("Value of S after the for loop is : %d\n", S);
return 0;
}
