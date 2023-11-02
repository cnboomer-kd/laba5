public enum Seasons
{
    winter(-10),
    spring(10),
    summer(25)
    {
        @Override
        public String getDescription()
        {
            return "Теплое время года";
        }
    },
    autumn(15);

    private int averageTemperature;

    Seasons(int averageTemperature)
    {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageTemperature()
    {
        return averageTemperature;
    }

    public void setAverageTemperature(int averageTemperature)
    {
        this.averageTemperature = averageTemperature;
    }

    public String getDescription()
    {
        return "Холодное время года";
    }
}
