import processing.core.PApplet;

public class FourBallsProcessing extends PApplet
{
    public static final int HEIGHT = 480;
    public static final int WIDTH = 640;
    public static final int DIAMETER = 10;
    public static int position = 0;
    int ballOne=0,ballTwo=0,ballThree=0,ballFour=0;
    int height=HEIGHT/5;

    public static void main(String[] args) {
        PApplet.main("FourBallsProcessing",args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH,HEIGHT);
    }

    @Override
    public void setup() {
        super.setup();
        background(255);

    }

    @Override
    public void draw()
    {
        ellipse(ballOne,height, DIAMETER, DIAMETER);
        ellipse(ballTwo,height*2, DIAMETER, DIAMETER);
        ellipse(ballThree,height*3, DIAMETER, DIAMETER);
        ellipse(ballFour,height*4, DIAMETER, DIAMETER);
        updatePositions();


    }
    public void updatePositions()
    {
        ballOne+=2;
        ballTwo+=4;
        ballThree+=6;
        ballFour+=8;

    }

}