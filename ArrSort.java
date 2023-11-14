import java.util.Arrays;
public class ArrSort {


        public static void main(String args[])
        {

            String[] Name = {"Golu", "Nitesh", "Dipak", "Himanshu", "dipesh"};
            int size = Name.length;

            for(int i = 0; i<size-1; i++)
            {
                for (int j = i+1; j<Name.length; j++)
                {

                    if(Name[i].compareTo(Name[j])>0)
                    {

                        String temp = Name[i];
                        Name[i] = Name[j];
                        Name[j] = temp;
                    }
                }
            }

            System.out.println(Arrays.toString(Name));
        }
    }

