public class Movie{
    private String movieName, movieCategory;
    private int ticketCost;
    
    public void setMovieName(String movieName){
        this.movieName = movieName;
    }
    public void setMovieCategory(String movieCategory){
        this.movieCategory = movieCategory;
    }
    public void setTicketCost(int ticketCost){
        this.ticketCost = ticketCost;
    }
    public String getMovieName(){
        return movieName;
    }
    public String getMovieCategory(){
        return movieCategory;
    }
    public int getTicketCost(){
        return ticketCost;
    }
    public int calculateTicketCost(String circle){
        circle = circle.toLowerCase();
        movieCategory = movieCategory.toUpperCase();
        if(circle.equals("gold") || circle.equals("silver")) {
            if(movieCategory.equals("2D") || movieCategory.equals("3D")) {
                if(circle.equals("gold") && movieCategory.equals("2D"))
                    ticketCost=300;
                else if(circle.equals("gold") && movieCategory.equals("3D"))
                    ticketCost=500;
                else if(circle.equals("silver") && movieCategory.equals("2D"))
                    ticketCost = 250;
                else
                    ticketCost = 450;
                return 0;
            }
            else
                return -1;
        }
        else {
            if(movieCategory.equals("2D") || movieCategory.equals("3D"))
                return -2;
            return -3;
        }
    }           
}