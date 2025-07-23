 class q43 {
    public static void main(String[] args) {
    
    int height=4;
    int slantheight=5;
    int polishingrate = 10;

    double raduis;
    raduis=Math.sqrt(slantheight*slantheight-height*height);

    double  area;
    area = (22*raduis*raduis)/7;

    System.out.println("area of base of cone :"+area +"  cm");
    double cost =area *polishingrate;
    
    System.out.println("cost of polishing :"+cost + " cm");
    
    
    
    }

}

