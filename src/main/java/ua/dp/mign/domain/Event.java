package ua.dp.mign.domain;

import java.util.Date;

public class Event {
   public Long getId() {
      return id;
   }

   private void setId(Long id) {
      this.id = id;
   }

   public Date getDate() {
      return date;
   }

   public void setDate(Date date) {
      this.date = date;
   }

   public String getTitle() {
      return title;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   private Long id;
   private String title;
   private Date date;
}
