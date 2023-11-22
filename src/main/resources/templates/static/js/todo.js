
document.getElementById('todoForm').addEventListener('submit', function(e) {
    e.preventDefault();
    var todoText = document.getElementById('title').value;
    fetch('http://localhost:8080/api/todos', {
        method: 'POST',
        header: {
            'Content-Type': 'application/json',
        },
        body:JSON.stringify({title: title, completed: false})
    })
    .then(response => response.json())
    .then(data => {
        console.log(todoText)
    })
}