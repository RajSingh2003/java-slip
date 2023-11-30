import java.io.*;

class ss13 
{
    public static void main(String args[]) throws Exception 
	{
        String fname = args[0];
        File f = new File(fname);

        if (f.isFile()) {
            FileInputStream fis = new FileInputStream(fname);
            int ch, cnt = 0;

            while ((ch = fis.read()) != -1) {
                if (ch == '\n') {
                    cnt++;
                }
            }

            System.out.println("Number of lines in the given file is " + cnt);
        } else {
            System.out.println("File does not exist");
        }
    }
}
//outupt
//javac ss13.java
//java ss13 sample.txt