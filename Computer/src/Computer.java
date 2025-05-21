    class Computer {
        protected int wordSize;   // in bits
        protected int memorySize; // in MB
        protected int storageSize; // in MB
        protected int speed;      // in MHz

        // Default Constructor
        public Computer() {
            this.wordSize = 32;
            this.memorySize = 4096;
            this.storageSize = 500000;
            this.speed = 2500;
        }

        // Parameterized Constructor
        public Computer(int wordSize, int memorySize, int storageSize, int speed) {
            this.wordSize = wordSize;
            this.memorySize = memorySize;
            this.storageSize = storageSize;
            this.speed = speed;
        }

        // Display function
        public void display() {
            System.out.println("Computer Specifications:");
            System.out.println("Word Size: " + wordSize + " bits");
            System.out.println("Memory Size: " + memorySize + " MB");
            System.out.println("Storage Size: " + storageSize + " MB");
            System.out.println("Speed: " + speed + " MHz");
        }
    }

