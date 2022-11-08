import java.awt.*;

public class Cell
{
    private boolean Alive = false;

    public void die()
    {
        Alive = false;
    }

    public void reborn()
    {
        Alive = true;
    }

    public boolean isAlive()
    {
        return Alive;
    }

    public void draw(Graphics g, int x, int y, int size)
    {
        g.drawRect(x,y,size,size);
        if(Alive)
        {
            g.fillRect(x,y,size,size);
        }
    }
}
