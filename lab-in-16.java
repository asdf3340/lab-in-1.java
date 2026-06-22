import java.io.*;
import java.util.regex.*;

public class Main {
  public static void main(String[] args)
  {
    StringBuilder sb = new StringBuilder();
    try (BufferedReader br = new BufferedReader(new FileReader("input.txt")))
    {
      String s;
      while ((s = br.readLine()) != null)
      {
        sb.append(s).append("\n");
      }
    }
    catch (IOException ex)
    {
      System.out.println(ex.getMessage());
    }

    String text = sb.toString();
    Pattern pattern = Pattern.compile("(//.*)|(/\\*(.|\\n)*\\*/)");
    Matcher matcher = pattern.matcher(text);
    String w = matcher.replaceAll("");

    try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt")))
    {
      bw.write(w);
    }
    catch (IOException ex)
    {
      System.out.println("Ошибка " + ex.getMessage());
    }
  }
}
