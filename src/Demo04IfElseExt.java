public class Demo04IfElseExt {
 public static void main(String[]args) {
	//x��y�Ĺ�ϵ�������£�
	 //���x>3,��ôy=2x+1��
	 //���-1<x<3,��ôy=2x��
	 //���x<=-1,��ôy=2x-1��
	 
	 //�����ȸ�x��һ��ֵ
	 int x=19;
	 int y;
	 if (x>3){
		 //����ֱ��д��2x
		 y=2*x+1;
	 }
	 //�˴���������д��һ��Ҫ�ֿ�д���á�&&������
	 else if(-1<x && x<3) {
		 y=2*x; 
	 }
	 else{
		 y=2*x-1; 
	 }
	 System.out.println("����ǣ�"+y);
 }
 
}
