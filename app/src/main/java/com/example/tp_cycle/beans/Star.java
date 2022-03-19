package com.example.tp_cycle.beans;

public class Star {
    private int ids;
        private String name;
        private String image;
        private float star;
        private static int comp;

        public Star(String name,String image, float star)
        { this.ids = ++comp;
            this.name = name;
            this.image = image;
            this.star = star; }

        public int getId() {
            return ids;
        }

    public void
    setId(int id)
    {
        this.ids = id;
    }
    public String getName()
        {
    return name;
        }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getImg()
    {
    return image; }
    public void setImg(String img)
    {
        this.image = img;
    }
    public float getStar()
    {
        return star;
    }
    public void setStar(float star)
    {
        this.star = star;
    }
}
