package syning.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import syning.service.BookService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestBook {


    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("druidconfig.xml");
        
        BookService bs = context.getBean("bookService", BookService.class);
        
//        Book b = new Book();
//        b.setName("人类简史");
//        b.setPrice(199D);
//        b.setId(0);
//        Integer update = bs.add(b);
//        System.out.println("update = " + update);
        
        // 获取单行单列
//        { 
//            int count = bs.findCount();
//            System.out.println("count = " + count);
//        }

        
        // 获取单行多列
//        {
//            Book book = bs.getBookById(4);
//            System.out.println("book = " + book.getId() + "  " + book.getName() + "  " + book.getPrice());
//        }


        // 获取列表
//        { 
//           List<Book> list = bs.getBookList();
//           System.out.println(list);
//        }

        
        
        // 批量添加
//        {
//            List<Object[]> lst = new ArrayList<>();
//            lst.add(new Object[]{"西西弗里", 19});
//            lst.add(new Object[]{"尤利西斯", 18});
//            lst.add(new Object[]{"查拉图斯特拉如是说", 1});
//            int[] ins = bs.addList(lst);
//            System.out.println(Arrays.toString(ins));
//        }

        
        
        // 批量修改
//        {
//            List<Object[]> lst = new ArrayList<>();
//            lst.add(new Object[]{2000, 1});
//            lst.add(new Object[]{2000, 2});
//            lst.add(new Object[]{2000, 3});
//            int[] ins = bs.updateList(lst);
//            System.out.println(Arrays.toString(ins));
//        }
        
        
        
        // 批量删除
        {
            List<Object[]> lst = new ArrayList<>();
            lst.add(new Object[]{3});
            lst.add(new Object[]{9});
            lst.add(new Object[]{10});
            int[] ins = bs.deleteList(lst);
            System.out.println(Arrays.toString(ins));
        }
        
        
        
    }
}
