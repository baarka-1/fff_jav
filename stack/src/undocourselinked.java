

class Registration2 {

    private linkedstack<String> courses = new linkedstack<>();

    public void addCourse(String code) {
        courses.push(code);

        System.out.println("Added " + code +
                " | top: " + courses.peek()
                + " | size: " + courses.size());
    }

    public void undocourselinked() {
        if (courses.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        String removed = courses.pop();

        System.out.println("Removed " + removed +
                " | size: " + courses.size());
    }
}

public class undocourselinked {
    public static void main(String[] args) {

        Registration2 reg = new Registration2();

        reg.addCourse("CA314");
        reg.addCourse("CA301");
        reg.addCourse("MA210");

        reg.undocourselinked();
        reg.undocourselinked();
    }
}