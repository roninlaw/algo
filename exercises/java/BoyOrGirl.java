import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.OutputStreamWriter; 
import java.io.PrintWriter; 
import java.io.IOException;
import java.io.FileReader; 
import java.io.FileWriter;
import java.util.StringTokenizer; 
import java.util.Arrays; 

public class BoyOrGirl { 
  
  public void solve() throws IOException {
    String S = nextLine();
    int nd = 0; 
    int len = S.length(); 
    char[] ca = S.toCharArray(); 
    Arrays.sort(ca); 
    int b = 0; 
    int i = 0; 
    while (i < len) { 
      while (i < len && ca[b] == ca[i])
        i++; 
      nd++; 
      if (i == len)
        break; 
      b = i; 
    }
    if (nd % 2 == 1)
      System.out.println("IGNORE HIM!");
    else 
      System.out.println("CHAT WITH HER!");
  }
  
  public BufferedReader br; 
  public StringTokenizer st; 
  public PrintWriter out; 
  
  public String nextToken() throws IOException {
    while(st == null || !st.hasMoreTokens()) 
      st = new StringTokenizer(br.readLine());
    return st.nextToken(); 
  }

  public String nextLine() throws IOException {
    return br.readLine();
  }
  
  public int ni() throws IOException {
    return Integer.parseInt(nextToken());
  }
  
  public long nl() throws IOException {
    return Long.parseLong(nextToken());
  }
  
  public double nd() throws IOException {
    return Double.parseDouble(nextToken());
  }

  public void run() throws IOException { 
    br = new BufferedReader(new InputStreamReader(System.in));
    out = new PrintWriter(new OutputStreamWriter(System.out));
    solve(); 
  }

  public static void main(String args[]) throws IOException { 
    new BoyOrGirl().run(); 
  }
}

