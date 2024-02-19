public class Teacher extends User{
    String nickName;
    String status;
    String subjects[] = new String[10];
    int sizeOfSubjects = 0;


    public Teacher(int id, String login, String password, String nickName, String status) {
        super(id, login, password);
        this.nickName = nickName;
        this.status = status;
    }

    public Teacher() {
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public int getSizeOfSubjects() {
        return sizeOfSubjects;
    }

    public void setSizeOfSubjects(int sizeOfSubjects) {
        this.sizeOfSubjects = sizeOfSubjects;
    }

    public void addSubject(String subject){
        subjects[sizeOfSubjects] = subject;
        sizeOfSubjects++;
    }

    @Override
    String getUserData() {
        return "ID: "+id+" LOGIN: "+login+" PASSWORD: "+password+" NICKNAME: "+nickName+" STATUS: "+ status;
    }
}
