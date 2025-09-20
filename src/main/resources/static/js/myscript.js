function showCourses(){
    fetch("/courses")      //API ENDPOINT
    .then((response) => response.json())
    .then((courses) => {
        const dataTable = document.getElementById("tableCourse")

        courses.forEach(course => {
            var row = `<tr>
                <td>${course.courseId}</td>
                <td>${course.courseName}</td>
                <td>${course.trainer}</td>
                <td>${course.durationInWeeks}</td>
            </tr>`

            dataTable.innerHTML += row;
        });
    });
}

function showenrolled(){
    fetch("/courses/enrolled")      //API ENDPOINT
    .then((response) => response.json())
    .then((students) => {
        const dataTable = document.getElementById("tableEnrolled")

        students.forEach(student => {
            var row = `<tr>
                <td>${student.name}</td>
                <td>${student.emailId}</td>
                <td>${student.courseName}</td>
            </tr>`

            dataTable.innerHTML += row;
        });
    });
}