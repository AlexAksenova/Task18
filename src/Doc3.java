import java.io.*;
public class Doc3
{
    public static void main(String[] args)

    {
        String file;
        int num=0;
        try (BufferedReader br= new BufferedReader(new FileReader("docnum.txt")))
        {
            while ( (file=br.readLine()) !=null)
            {
                System.out.println(file);
                num++;
            }
        }
        catch (IOException exc)
        {
            System.out.println("Ошибка - отсутствует файл " + exc);
        }
        String file1;
        int j=0;
        BufferedReader f = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Вам нужно ввести " + num + " строк");
           try (FileWriter w= new FileWriter("docnum.txt"))
        {
            do {
                System.out.println("Вводите текст, который нужно записать: ");
                file1=f.readLine();
                j++;
                //if (j>num) break;
                file1=file1+"\r\n";
                w.write(file1);
            } while (j<num);

        } catch (IOException exc ){
            System.out.println("Ошибка ввода-вывода данных " + exc);
        }

    }
}
