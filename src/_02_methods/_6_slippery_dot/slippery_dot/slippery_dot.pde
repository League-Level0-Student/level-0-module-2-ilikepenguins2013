/*** When you are done, this program will draw an ellipse 
     that jumps to new location each time you click on it.
***/
 
 // 1. Create three integer variables to represent the x, y, and the size of the ellipse
    int dotX=150;
    int dotY=150;
    int dotSize=25;
    int time=2;
    int score=0;
    void setup() {
      textSize(40);
      // 2. Set the size of your sketch
      size(1920,900);
      frameRate(60);
    
    }
    
    void draw() {
      // 3. Set the background color of your sketch
      background(#F7FFFD);
      
      // 4. Draw an ellipse using the variables created at the top of the sketch for the location and size of your ellipse. 
      //    Make sure it fits in the window. Change the variables if it does not.
      fill(#197EE0);
      ellipse(dotX,dotY,dotSize,dotSize);
    
     //System.out.println(frameCount);
      if(frameCount%60==0) {
        time--;
      }
      fill(#FF0000);
      text("time left: " + time, 1700,40);
      text("score: " + score, 30,40);
      if(time<=0) {
        background(#FFFFFF);
        textSize(70);
       
        text("you lose l bozo u stink", 700,450);
        text("ur score was "+score, 800,100);
        dotX = -100;
      }
      
      
    }
    
    /******** This method gets called automatically when you press the mouse ************/
    void mousePressed() {
      //5. Create an integer variable called distance
      int distance;
      //6. The getDistanceFromMouse() method below returns a number.
      //   Set the value of your distance variable to the value returned by the getDistance method
      //   You will need to pass the x and y location of your ellipse to this method.
        distance=getDistanceFromMouse(dotX,dotY);
          
      //7.  Use an if statement to check if your distance variable is < the radius of the ellipse
      //    If it is, make a new x AND y for the ellipse, for a new random location on the window
      //    Hint: Use code like this      x = (int) random(width);
      if(distance<dotSize/2) {
        dotX=(int) random(width);
        dotY=(int) random(height);
        time = 2;
        score++;
      }
       
      
    }
    
    /********  This method gives you the number of pixels between the mouse and the x,y point ***********/
    int getDistanceFromMouse(int x, int y) {
      return (int)Math.sqrt(Math.pow((mouseX-x),2) + Math.pow((mouseY-y),2));
    }
