package com.example.demo.repository;

//사용자 등급 테이블 
public class UserLevel {

 // 사용자 등급 번호 
 private Long userlevel;

 // 사용자 등급 이름 
 private String userlevelname;

 public Long getUserlevel() {
     return userlevel;
 }

 public void setUserlevel(Long userlevel) {
     this.userlevel = userlevel;
 }

 public String getUserlevelname() {
     return userlevelname;
 }

 public void setUserlevelname(String userlevelname) {
     this.userlevelname = userlevelname;
 }

}