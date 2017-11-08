package za.ac.cput.ExtremeCoders.Senzo;

public class Laptop
{
    private int imei;
    private String type;
    private String model;

    public Laptop(int imei, String type, String model)
    {
        this.imei = imei;
        this.type = type;
        this.model = model;
    }

    public int getImei()
    {
        return imei;
    }

    public void setImei(int imei)
    {
        this.imei = imei;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getModel()
    {
        return model;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }

        Laptop that = (Laptop) o;

        return imei == that.imei;
    }

    @Override
    public int hashCode()
    {
        return imei;
    }

    @Override
    public String toString()
    {
        return "imei: " + imei + " type: " + type + " model: " + model;
    }
}

