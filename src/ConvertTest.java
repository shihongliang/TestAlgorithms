import java.util.Stack;

/**
 * @author hongliang
 *
 */
public class ConvertTest {

	   public TreeNode Convert(TreeNode root) {
	       if(root==null)
	    	   return null;
	       Stack<TreeNode> stack=new Stack<TreeNode>();
	       TreeNode p=root;
	       TreeNode pre=null;
	     boolean isFirst=true;
	     while(p!=null&&!stack.isEmpty())
	     {
	    	 if(p!=null)
	    	 {
	    		 stack.push(p);
	    		 p=p.left;
	    	 }
	    	 p=stack.pop();
	    	 if(isFirst)
	    	 {
	    		 root=p;
	    		 pre=root;
	    		 isFirst=false;
	    	 }else{
	    		 
	    		 pre.right=p;
	    		 p.left=pre;
	    		 pre=p;
	    		 
	    	 }
	    	 p=p.right;
	     }
	       
		  return root; 
		   
	   }
	   
	   public static void main(String[]args)
	   {
		   
	   }
	   
	
}
