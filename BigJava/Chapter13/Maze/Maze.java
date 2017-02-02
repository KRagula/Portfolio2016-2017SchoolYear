import java.util.ArrayList;

/**
   Attempts to find a path through a maze.
*/
public class Maze
{
   private char[][] maze;
   private int width;
   private int height;
   private ArrayList<Coordinate> path;

   /**
      Create a maze searcher.
      @param aMaze character array representation of maze
   */
   public Maze(char[][] aMaze)
   {
      maze = aMaze;
      width = maze[0].length;
      height = maze.length;
      path = new ArrayList<Coordinate>();
   }

   /**
      Find an escape path.
      @param i row position
      @param j column position
      @return if escape is possible
   */
   public boolean escape(int i, int j)
   {
	  boolean keepGoing = true;
      char right = this.maze[i][j+1];
      char left = this.maze[i][j-1];
      char up = this.maze[i-1][j];
      char down = this.maze[i+1][j];
      if(this.isExit(i,j) || this.isExit(i-1,j) || this.isExit(i+1,j) || this.isExit(i,j-1) ||
    		  this.isExit(i,j+1)){
    	  return true;
      }
      System.out.println("position = "+"("+j + ":" + i+")");
      this.maze[i][j] = 'd';
      if(right == ' ' && keepGoing){
    	  if(! this.escape(i, j+1)){
    		  keepGoing = true;
    	  } else {
    		  keepGoing = false;
    		  return true;
    	  }
      }
      if(left == ' ' && keepGoing){
    	  if(! this.escape(i, j-1)){
    		  keepGoing = true;
    	  } else {
    		  keepGoing = false;
    		  return true;
    	  }      }
      if(up == ' ' && keepGoing){
    	  if(! this.escape(i-1, j)){
    		  keepGoing = true;
    	  } else {
    		  keepGoing = false;
    		  return true;
    	  }
      }
      if(down == ' ' && keepGoing){
    	  if(! this.escape(i+1, j)){
    		  keepGoing = true;
    	  } else {
    		  keepGoing = false;
    		  return true;
    	  }
      }
      return false;
   }

   /**
      Get the path through the maze.
      @return list of coordinates along path
   */
   public ArrayList<Coordinate> getPath()
   {
      return path;
   }

   /**
      Determine if the row, column location is an exit.
      @return if location is an exit
   */
   private boolean isExit(int i, int j)
   {
      return maze[i][j] == ' '
            && (i == 0 || j == 0 || i == height - 1 || j == width - 1);
   }
}
