public class Census {

    private String[] questions;

    private int[] answers;


    Census(){
        this.questions = new String[3];
        this.questions[0]="1. Have u tried IE 10 ? a. Yes b.No c. Maybe : ?";
        this.questions[1]="2. Which browser do you use? a. Firefox b. Chrome c. IE : ?";
        this.questions[2]="3. Will you switch your current browser? a. Yes b. No c. Maybe :  ?";
        this.answers = new int[3];
    }
    public void setAnswer (int serial , int answer)
    {
        this.answers[serial] = answer;
    }
    public void printAnswer (int serial)
    {
        System.out.println(this.answers[serial]);
    }
    public void printQuestion (int i)
    {
        System.out.println(this.questions[i]);
    }
    public void printHistory (int i)
    {
        System.out.println("Your number "+(i+1)+" question answer was : "+this.answers[i]);
    }
    public int setResult ()
    {
        int result =0;
        for (int i=0;i<3;i++)
        {
            switch (this.answers[i])
            {
                case 1:
                    result=result+5;
                    break;
                case 2:
                    result=result+0;
                    break;
                case 3:
                    result=result+2;
                    break;
            }
        }
        return result;
    }
    public String[] getQuestions() {
        return questions;
    }

    public void setQuestions(String[] questions) {
        this.questions = questions;
    }

    public int[] getAnswers() {
        return answers;
    }


    /*public void setAnswers(String[] answers) {
        this.answers = answers;
    }*/
}
