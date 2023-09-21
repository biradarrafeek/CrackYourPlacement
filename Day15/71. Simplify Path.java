
class Solution {
  public String simplifyPath(String path) {
      Stack<String> st = new Stack<>();
      String[] pathList = path.split("\\/");

      for(String p : pathList){
          if(p.length()==0 || p.equals(".")){
              continue;
          }
          else if(p.equals("..")){
              if(!st.empty()){
                  st.pop();
              }
          }
          else{
              st.push(p);
          }
      }
      String ans = "";
      while(!st.empty()){
          ans = st.pop() + "/" + ans;
      }
      if(ans.length()==0){
          return "/";
      }
      else {
          return "/" + ans.substring(0,ans.length()-1);
      }

    // final String[] dirs = path.split("/");
    // Stack<String> stack = new Stack<>();

    // for (final String dir : dirs) {
    //   if (dir.isEmpty() || dir.equals("."))
    //     continue;
    //   if (dir.equals("..")) {
    //     if (!stack.isEmpty())
    //       stack.pop();
    //   } else {
    //     stack.push(dir);
    //   }
    // }

    // return "/" + String.join("/", stack);
  }
}
