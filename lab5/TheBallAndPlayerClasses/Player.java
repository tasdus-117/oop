package hus.oop.lab5.TheBallAndPlayerClasses;
public class Player {
    private int number;
    private float x;
    private float y;
    private float z = 0.0f;

    public Player(int number, float x, float y) {
        this.number = number;
        this.x = x;
        this.y = y;
    }
    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void move(float xDisp, float yDisp) {
        x += xDisp;
        y += yDisp;
    }
    public void jump(float zDisp) {
        z += zDisp;
    }
    public boolean near(Ball ball) {
        float distance = (float) Math.sqrt(Math.pow(this.x - ball.getX(), 2) + Math.pow(this.y - ball.getY(), 2) +
                Math.pow(this.z - ball.getZ(), 2));
        return distance < 8;
    }
    public void kick(Ball ball) {
        if (near(ball)) {
            float newX = ball.getX()+10;
            float newY = ball.getY()+10;
            float newZ = ball.getZ()+2;
            ball.setXYZ(newX, newY, newZ);
        } else {
            System.out.println("Too far away");
        }
    }
}
