package data.assaignment.pkg03;
import java.io.FileReader;
public class DataAssaignment03 {
 public static void main(String[] args) throws Exception{
 FileReader file=new FileReader 
("C:\\Users\\Omar\\Desktop\\assaignment\\data
Assaignment\\brackets.txt");
 Stack stc=new Stack();
 int x;
 boolean flag=true;
 int i=0;
 while( (x=file.read()) != -1 && flag){
 switch((char)x){
 case '(': case '[': case '{':
 stc.push(x); break;
 case ')':
 if(stc.top()=='(') stc.pop();
 else flag=false;
 break;
 case ']':
 if(stc.top()=='[') stc.pop();
 else flag=false;
 break;
 case '}':
 if(stc.top()=='{') stc.pop();
 else flag=false;
 break;
 }
 }
 System.out.println((flag && stc.isEmpty())? "Balanced" : "Not 
Balanced");
 
 }
}