package com.example.todosample;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
public class TodoRestControllerTest {
    private TodoRepository todoRepository;
    private TodoRestController todoRestController;

    @BeforeEach
    void setUp() {
        todoRepository = mock(TodoRepository.class);
        todoRestController = new TodoRestController(todoRepository);
    }

    @Test
    void getTodos_getter_setter() {
        TodoEntity entity = new TodoEntity();
        entity.setId(1);
        entity.setTitle("title");
        entity.setCompleted(true);

        assertNotNull(entity);

        assertEquals(1,entity.getId());
        assertEquals("title", entity.getTitle());
        assertEquals(true, entity.getCompleted());

        List<TodoEntity> mockEntity = Arrays.asList(entity);
        when(todoRepository.findAll()).thenReturn(mockEntity);

    }
}
