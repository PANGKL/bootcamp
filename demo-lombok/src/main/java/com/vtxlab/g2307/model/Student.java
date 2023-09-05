package com.vtxlab.g2307.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

// @NoArgsConstructor  // 同RequiredArgsConstructor撞
@RequiredArgsConstructor // The minimal args to create Student Obj
@AllArgsConstructor
public class Student {
  // No final and no @Nonnull attrubute in this class
  private int age;

  public static void main(String[] args) {
    Student student = new Student(); // come from RequiredArgsConstructor
    Student s2 = new Student(10);



  }
}
