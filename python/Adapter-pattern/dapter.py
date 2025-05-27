from abc import ABC, abstractmethod

class  StudentInterface(ABC):
    """Interface for Student"""
    @abstractmethod
    def get_name():
        """Returns the name of the student"""
        pass
    @abstractmethod
    def get_email():
        """Returns the email of the student"""
        ...

class CollegeStudent(StudentInterface):
    def __init__(self, name, email):
        self.name = name
        self.age = email

    def get_name(self):
        return self.name

    def get_email(self):
        return self.age
    


# This is the new class that we want to adapt 
class HighSchoolStudent:
    def __init__(self, name, email):
        self.name = name
        self.age = email

    def get_FistName(self):
        return self.name

    def get_EmailAdress(self):
        return self.age
    
# Adapter class to adapt HighSchoolStudent to StudentInterface
class HighSchoolStudentAdapter(StudentInterface):
    def __init__(self, high_school_student: HighSchoolStudent):
        self.high_school_student = high_school_student

    def get_name(self):
        return self.high_school_student.get_FistName()

    def get_email(self):
        return self.high_school_student.get_EmailAdress()
    


    

# Example usage
if __name__ == "__main__":
    
    students:StudentInterface = []

    college_student = CollegeStudent("Alice", "Alice@gmail.com")
   

    high_school_student = HighSchoolStudent("Bob", "bob@gmail.com")
    high_school_student_adapter = HighSchoolStudentAdapter(high_school_student)

    students.append(college_student)
    students.append(high_school_student_adapter)

    for student in students:
        print(f"Name: {student.get_name()}, Email: {student.get_email()}")

