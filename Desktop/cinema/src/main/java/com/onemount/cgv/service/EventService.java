package com.onemount.cgv.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onemount.cgv.model.Cinema;
import com.onemount.cgv.model.Event;
import com.onemount.cgv.model.Film;
import com.onemount.cgv.model.Room;
import com.onemount.cgv.repository.EventRepository;

@Service
public class EventService {
  @PersistenceContext
  private EntityManager em;

  @Autowired private EventRepository eventRepository;

  @Transactional
  public void generateEvents(){

    List<Room> rooms1 = new ArrayList<Room>();
    List<Room> rooms2 = new ArrayList<Room>();
    Room room1 = new Room("T1","10","P1","S1","50m2","Available");
    Room room2 = new Room("T2","20","P2","S1","70m2","Available");
    Room room3 = new Room("T3","50","P4","S1","100m2","Using");
    Room room4 = new Room("D1","40","P4","S3","90m2","Using");
    Room room5 = new Room("D2","50","P5","S1","110m2","Available");


    rooms1.add(room1);
    rooms1.add(room2);
    rooms1.add(room3);
    rooms2.add(room4);
    rooms2.add(room5);

    
    Cinema cgvtimecity = new Cinema("CGV Time City","Ha Noi",rooms1, "active");
    Cinema cgvtruongdinh = new Cinema("CGV Truong Dinh","Ha Noi",rooms2, "active");
    Cinema cgvquan10 = new Cinema("CGV Quan 10","Ho Chi Minh",rooms2, "active");

    List<Cinema> cinemas1 = new ArrayList<Cinema>();
    List<Cinema> cinemas2 = new ArrayList<Cinema>();

    cinemas1.add(cgvtimecity);
    cinemas1.add(cgvtruongdinh);
    cinemas2.add(cgvquan10);

    Film film1 = new Film("BÀN TAY DIỆT QUỶ", "09-04-2021", "128", "Kim Joo Hwan","Park Seo Joon, Ahn Sung Ki, Woo Do Hwan, Choi Woo Sik",
    "Korea", "Hành Động, Kinh Dị", "Sau khi bản thân bỗng nhiên sở hữu “Bàn tay diệt quỷ”, võ sĩ MMA Yong Hoo (Park Seo Joon thủ vai) đã dấn thân vào hành trình trừ tà, trục quỷ đối đầu với Giám Mục Bóng Tối (Woo Do Hwan) – tên quỷ Satan đột lốt người. Từ đó sự thật về cái chết của cha Yong Hoo cũng dần được hé lộ cũng như nguyên nhân anh trở thành “người được chọn”.",
    "https://www.cgv.vn/media/catalog/product/cache/1/image/c5f0a1eff4c394a251036189ccddaacd/b/t/btdq_main_poster.jpg",
    "showing");
    Film film2 = new Film("THÁM TỬ LỪNG DANH CONAN: VIÊN ĐẠN ĐỎ", "23/04/2021", "111", "Tomoka Nagaoka","Minami Hamabe, Megumi Hayashibara, Ogata Kenichi, Rikiya Koyama, Minami Takayama",
    "Japan", "Hành Động, Hoạt Hình, Hồi hộp, Tình cảm, Tội phạm", "Thế vận hội thể thao lớn nhất thế giới được tổ chức tại Tokyo, Nhật Bản thu hút rất nhiều sự chú ý. Khi sự kiện ra mắt con tàu siêu tốc với tốc độ 1000km/h diễn ra cũng là lúc hàng loạt các vụ bắt cóc xảy ra! Gia tộc hiểm ác tụ tập tại đây sẽ gây ra một loạt sự kiện chấn động thế giới!",
    "https://www.cgv.vn/media/catalog/product/cache/1/image/c5f0a1eff4c394a251036189ccddaacd/c/o/conan_24_-_main_poster_1_.jpg",
    "showing");
    Film film3 = new Film("ĐỨA BÉ", "14/05/2021", "150", "Kim Hyun Tak","Kim Hyang Gi, Ryoo Hyoun Kyoung",
    "Korea", "Tâm Lý","Do miếng cơm manh áo, cô sinh viên A Young đành chấp nhận công việc trông trẻ cho bà mẹ đơn thân Young Chae. Tuy nhiên khi phát hiện chị ta vì quá khó khăn mà định đưa đứa bé vào trại mồ côi, nàng ta đã quyết tâm ngăn cản vì A Young cũng là một đứa trẻ lớn lên trong cô nhi viện với nhiều đau thương và đơn độc.",
    "https://www.cgv.vn/media/catalog/product/cache/1/image/c5f0a1eff4c394a251036189ccddaacd/i/_/i_-_main_poster_1_.jpg",
    "Comming soon");

    List<Film> films1 = new ArrayList<Film>();
    List<Film> films2 = new ArrayList<Film>();

    films1.add(film1);
    films1.add(film2);
    films2.add(film1);
    films2.add(film3);

    Event event1 = new Event(cinemas1, rooms1, films1, "10/05/2021", "01/06/2021", 1); // status =1 đang diễn ra, = 2 kết thúc
    Event event2 = new Event(cinemas2, rooms1, films1, "25/05/2021", "20/06/2021", 2); // status =1 đang diễn ra, = 2 kết thúc


    em.persist(room1);
    em.persist(room2);
    em.persist(room3);
    em.persist(room4);
    em.persist(room5);

    em.persist(cgvtimecity); 
    em.persist(cgvtruongdinh); 
    em.persist(cgvquan10); 

    em.persist(film1);
    em.persist(film2);
    em.persist(film3);

    em.persist(event1);
    em.persist(event2);

  }

  public List<Event> getAllEvents() {
    return eventRepository.findAll();
  }
  
    
}

