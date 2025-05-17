class LiveClass extends Course{
    public LiveClass(String title, int total_modules) {
        super(title, total_modules);
    }

    @Override
    public int calculateDuration() {
        int classesPerWeek = 2;
        int weeks = (int) Math.ceil((double) total_modules / classesPerWeek);
        return weeks;
    }
}
