package statements;
	import java.io.*;

	public class Buffer
	{
	public static void main(String args[]) throws IOException    {
	BufferedReader sy = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("please enter name ");
	String b = sy.readLine();


	System.out.println("please enter salary ");
	String c =sy.readLine();

	System.out.println("please enter PF ");
	String d=sy.readLine();


	System.out.println("please enter HRA ");
	String e =sy.readLine();


	System.out.println("please enter DA ");
	String f =sy.readLine();
        sy.close();
	int n = Integer.parseInt(c);
	int o = Integer.parseInt(d);
	int p = Integer.parseInt(e);
	int s = Integer.parseInt(f);

	int pf =(o*n)/100;
	int hra = (p*n)/100;
	int da =(s*n)/100;
	int w =n+hra+da-pf;

	System.out.println( b+" "+w);

	if(w>=50000){
	System.out.println("eligable to marriage");
	}else{
	System.out.println("not eligable to marriage");

	}

	}
	}




