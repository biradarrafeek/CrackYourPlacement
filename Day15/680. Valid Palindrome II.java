class Solution {
  public boolean validPalindrome(String s) {
    for (int l = 0, r = s.length() - 1; l < r; ++l, --r)
      if (s.charAt(l) != s.charAt(r))
        return validPalindrome(s, l + 1, r) || validPalindrome(s, l, r - 1);
    return true;
  }

  private boolean validPalindrome(final String s, int l, int r) {
    while (l < r)
      if (s.charAt(l++) != s.charAt(r--))
        return false;
    return true;
  }
}


// class Solution {
//     public boolean validPalindrome(String s) {
//         int start=0,end = s.length()-1;
//         int count1 = 0, count2 = 0;

//         while(start<end){
//             if(s.charAt(start)==s.charAt(end)){
//                 start++;
//                 end--;
//             }
//             else{
//                 start++;
//                 count1++;
//             }
//         }
//         start=0;
//         end = s.length()-1;
//          while(start<end){
//             if(s.charAt(start)==s.charAt(end)){
//                 start++;
//                 end--;
//             }
//             else{
//                 end--;
//                 count2++;
//             }
//         }
//         if(count1 == 1 || count2 == 1) return true;
//         if(count1 == 0 || count2 == 0) return true;

//         return false;
//     }
// }
