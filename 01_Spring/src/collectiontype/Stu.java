package collectiontype;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Stu {
    
    // 数组类型
    private String[] courses;

    
    // List集合类型
    private List<String> bookList;
    
    // Map集合类型
    private Map<String, String> look;
    
    
    // Set集合类型
    private Set<String> bodys;
    
    
    
    
    
    public void setBodys(Set<String> bodys) {
        this.bodys = bodys;
    }
    
    public void setBookList(List<String> bookList) {
        this.bookList = bookList;
    }

    public void setLook(Map<String, String> look) {
        this.look = look;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }


    public String[] getCourses() {
        return courses;
    }

    public List<String> getBookList() {
        return bookList;
    }

    public Map<String, String> getLook() {
        return look;
    }

    public Set<String> getBodys() {
        return bodys;
    }
}
