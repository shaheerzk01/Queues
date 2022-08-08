package PROGRAMS;

import java.util.Comparator;

public class PROGRAM4_3 implements Comparator<PROGRAM4>{

    public int compare(PROGRAM4 s1, PROGRAM4 s2) {
          if (s1.rank > s2.rank)
              return 1;
          else if (s1.rank < s2.rank)
               return -1;
         return 0;
}   

}
