import java.util.*;
class TwoStacks{
int[] array;
int size;
int top1, top2;

TwoStacks(int j){
size = j;
array = new int [j];
top1 = j/2+1;
top2 = j/2;
}
void push1 (int k){

if(top1>0){
top1--;
array[top1] = k;
}
else{
System.out.println("Stack overflow"+"By element:"+ k + "\n");
return;

}
}

void push2(int k){
if(top2<size-1){
top2++;
array[top2] = k;
}else{
System.out.println("Stack overflow"+"by element:"+ k + "\n");
return;
}
}
 int pop1(){
 if(top1<=size/2){
 int k = array[top1];
 top1++;
 return k ;
 }
 else{
 System.out.println("Stack underflow");
 System.exit(1);
 }
 return 0;
 }
 
 int pop2(){
if (top2>=size/2+1){
int k = array[top2];
top2--;
return k ;
}
else{
System.out.println("Stack underflow");

System.exit(1);
 }
 return 1;
 }
}
class MainTwoStacks{
public static void main(String[] args){
TwoStacks t1 =  new TwoStacks(5);
t1.push1(5);
t1.push2(10);
t1.push2(15);
t1.push1(11);
t1.push2(7);
System.out.println("Popped element from the stack1 is"+":"+t1.pop1()+"\n");
t1.push2(40);
System.out.println("Popped element from the stack2 is"+":"+t1.pop2()+"\n");

}

}