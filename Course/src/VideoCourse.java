class VideoCourse extends Course{

    public VideoCourse(String title,int total_modules){
        super(title,total_modules);
    }

    public int calculateDuration(){
        int hours = (int)Math.ceil(total_modules * 1.5);
        return hours;
    }
}
