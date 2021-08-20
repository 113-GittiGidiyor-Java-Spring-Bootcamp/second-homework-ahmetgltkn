# İkinci ödev teslim tarihi : 22 Ağustos - 23:00
### Not : ARAŞTIRMA KONUSU kısmı tamamıyla sizleri geliştirmek amaçlı , eklenmiştir , o madde için herhangi bir kod vs örneğine ihtiyaç yoktur.


### ! dikkat port numarası 3400'tır. 

## Student HTTP Methods

### GET Students localhost:3400/api/students

### GET findStudentById localhost:3400/api/students/1

### Post Student Data localhost:3400/api/students
    
     Ad new Student
       {
        "name": "Ahmet GÜLTEKİN",
        "address": "İSTANBUL",
        "birthDate": "2020-01-06",
        "gender": "Male"      
    }

### Delete Data localhost:3400/api/students/1

### Put Data localhost:3400/api/students/1

      Updates Students
 
            {
                "name": "Yeni ögrenci adı",
                "address": "İSTANBUL",
                "birthDate": "2020-01-06",
                "gender": "Male"       
            }

## Course HTTP Methods

### GET Courses localhost:3400/api/courses

### GET findCourseById localhost:3400/api/courses/1

### Post Courses Data localhost:3400/api/courses
    
     Ad new Courses
      {
          
          "courseName": "Java",
          "courseCode": "1001",
          "courseCredit": 0.0,        
      }

### Delete Data localhost:3400/api/courses/1

### Put Data localhost:3400/api/permaments/1

      Update Courses
            {
               
                "courseName": "YeniJava",
                "courseCode": "1001",
                "courseCredit": 10.0,        
            }

## Permament Instructor Methods

### GET Permaments localhost:3400/api/permaments

### GET findPermamentById localhost:3400/api/permaments/1

### Post Permaments Data localhost:3400/api/permaments
    
     Ad new Permaments
            {
              "name": "Koray Hoca",
              "address": "İstanbul",
              "fixedSalary": 500,
              "phoneNumber": "123",
              "courses": []
            }

### Delete Data localhost:3400/api/permaments/1

### Put Data localhost:3400/api/permaments/1
     Update  Permaments
       
            {
              "name": "Patika.Dev Eğitmeni",
              "address": "İstanbul",
              "fixedSalary": 500,
              "phoneNumber": "123",
              "courses": []
            }

## VisitinResearcher HTTP Methods

### GET VisitinResearcher localhost:3400/api/visitings

### GET findVisitingById localhost:3400/api/visitings/1

### Post Visiting Data localhost:3400/api/visitings
    
     Ad new VisitinResearcher
            {
              "name": "ZAfer Hoca",
              "address": "İstanbul",
              "hourlySalary": 500,
              "phoneNumber": "123",
              "courses": []
            }

### Delete Data localhost:3400/api/visitings/1

### Put Data localhost:3400/api/visitings/1

      Update VisitinResearcher 
            {
              "name": "Patika.Dev Asistan",
              "address": "İstanbul",
              "hourlySalary": 500,
              "phoneNumber": "123",
              "courses": []
            }






![homework](https://user-images.githubusercontent.com/45206582/129493929-01f3b3a7-793f-4057-959a-ac5fb05ad8a8.png)


