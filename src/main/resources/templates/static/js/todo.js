
document.getElementById('todoForm').addEventListener('submit', function(e) {
    e.preventDefault();
    var todoText = document.getElementById('todoInput').value;
    addTodo(todoText);
});

function todo() {
    fetch('api/todos', {
        method: 'POST',
        header: {
            'Content-Type': 'application/json',
        },
        body:JSON.stringify({text:todoText})
    })
    .then(response => response.json())
    .then(data => {
        console.log('data')
    })
}