import java.util.ArrayList;

/**
   This program computes permutations of a string.
*/
public class Permutations
{
   public static void main(String[] args)
   {
      for (String s : substr("Ragula"))
      {         
         System.out.println(s);
      }
   }

   /**
      Gets all permutations of a given word.
      @param word the string to permute
      @return a list of all permutations
   */
   public static ArrayList<String> permutations(String word)
   {
      ArrayList<String> result = new ArrayList<String>();

      // The empty string has a single permutation: itself
      if (word.length() == 0) 
      { 
         result.add(word); 
         return result; 
      }
      else
      {
         // Loop through all character positions
         for (int i = 0; i < word.length(); i++)
         {
            // Form a shorter word by removing the ith character
            String shorter = word.substring(0, i) + word.substring(i + 1);

            // Generate all permutations of the simpler word
            ArrayList<String> shorterPermutations = permutations(shorter);

            // Add the removed character to the front of
            // each permutation of the simpler word, 
            for (String s : shorterPermutations)
            {
               result.add(word.charAt(i) + s);
            }
         }
         // Return all permutations
         return result;
      }
   }
   
   public static ArrayList<String> substr (String word){
	   ArrayList<String> result = new ArrayList<String>();
	   if(word.length() == 0){
		   result.add(" ");
		   return result;
	   } else {
		   for(int i=0; i<word.length()-1; i++){
			   for(int j=word.length(); j>i; j--){
				   String shorter = word.substring(i, j);
				   result.add(shorter);
			   }
		   }
		   result.add(String.valueOf(word.charAt(word.length()-1)));
	   return result;
	   }
   }
}

