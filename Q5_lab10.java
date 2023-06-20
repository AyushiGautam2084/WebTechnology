class HrsException extends Exception {
    public HrsException(String message) {
        super(message);
    }
}

class MinException extends Exception {
    public MinException(String message) {
        super(message);
    }
}

class SecException extends Exception {
    public SecException(String message) {
        super(message);
    }
}

class Time {
    private int hours;
    private int minutes;
    private int seconds;
    
    public Time(int hours, int minutes, int seconds) throws HrsException, MinException, SecException {
        if (hours < 0 || hours > 24) {
            throw new HrsException("Invalid hours value: " + hours);
        }
        if (minutes < 0 || minutes > 60) {
            throw new MinException("Invalid minutes value: " + minutes);
        }
        if (seconds < 0 || seconds > 60) {
            throw new SecException("Invalid seconds value: " + seconds);
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    // getters and setters for hours, minutes, seconds
    public int getHours() {
        return hours;
    }
    
    public void setHours(int hours) throws HrsException {
        if (hours < 0 || hours > 24) {
            throw new HrsException("Invalid hours value: " + hours);
        }
        this.hours = hours;
    }
    
    public int getMinutes() {
        return minutes;
    }
    
    public void setMinutes(int minutes) throws MinException {
        if (minutes < 0 || minutes > 60) {
            throw new MinException("Invalid minutes value: " + minutes);
        }
        this.minutes = minutes;
    }
    
    public int getSeconds() {
        return seconds;
    }
    
    public void setSeconds(int seconds) throws SecException {
        if (seconds < 0 || seconds > 60) {
            throw new SecException("Invalid seconds value: " + seconds);
        }
        this.seconds = seconds;
    }
}

class Main {
    public static void main(String[] args) {
        try {
            Time time = new Time(25, 70, 70);
        } catch (HrsException | MinException | SecException e) {
            System.out.println(e.getMessage());
        }
    }
}
