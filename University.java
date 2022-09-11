
    public class University {
        String uniName = "MUET";

        static class Student {
            static void display() {

                University u1 = new University();
                String temp = u1.uniName;
                System.out.println("displaying from inner class Display:");
                System.out.println("Uni-name: " + temp);
            }
        }

        public void outerDisplay() {
            System.out.println("displaying from outerDisplay method:");
            Student.display();
        }

        class Demo {
            public static void main(String[] args) {
                University myUni=new University();
                myUni.outerDisplay();
            }
        }
    }

