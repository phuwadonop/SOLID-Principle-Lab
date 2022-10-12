public class Square implements Geometric {
    private int side;
    Square(int side) {
        this.setSide(side);
    }
    public void setSide(int side) {
        this.side = side;
    }
    @Override
    public int getHeight() {
        return  this.side;
    }

    @Override
    public int getWidth() {
        return this.side;
    }

    @Override
    public int getArea() {
        return side*side;
    }

}
