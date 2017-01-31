package javaapplication4.Objects;

/**
 * Created by stiv on 31.01.17.
 */
public class MyVector {
    private float x;
    private float y;
    private float z;
    private float startX;
    private float startY;
    private float startZ;

    public MyVector(float x, float y, float z, float startX, float startY, float startZ) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.startX = startX;
        this.startY = startY;
        this.startZ = startZ;
        normolize();
    }

    public float length() {
        return (float)Math.sqrt(x * x + y * y + z * z);
    }

    public void normolize() {
        float length = this.length();
        this.x = x / length;
        this.y = y / length;
        this.z = z / length;
    }

    public float getX() {
        return this.x;
    }

    public float getY() {
        return this.y;
    }

    public float getZ() {
        return this.z;
    }

    public float getStartX() {
        return this.startX;
    }

    public float getStartY() {
        return this.startY;
    }

    public float getStartZ() {
        return this.startZ;
    }

    public void setX(float newx) {
        this.x = newx;
    }

    public void setY(float newy) {
        this.y = newy;
    }

    public void setZ(float newz) {
        this.z = newz;
    }

    public void setStartX(float newx) {
        this.startX = newx;
    }

    public void setStartY(float newy) {
        this.startY = newy;
    }

    public void setStartZ(float newz) {
        this.startZ = newz;
    }
}
