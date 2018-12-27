package sandbox.web;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sandbox.domain.model.Todo;
import sandbox.domain.model.TodoList;
import sandbox.domain.service.ITodoService;

/**
 * クライアントからのリクエストを受け付ける非同期コントローラです。
 *
 * @author t.nemoto.x
 */
@RestController
@RequestMapping(value = "/api")
@RequiredArgsConstructor
public class TodoRestController {

    /**
     * Todoサービス
     */
    @Autowired
    private final ITodoService todoService;

    /**
     *  Todoを全件取得するAPIです。
     *
     * @return
     */
    @GetMapping(value = "/todo")
    @ResponseBody
    public ResponseEntity<TodoList> fetch() {
        return ResponseEntity.ok().body(todoService.findAll());
    }

    /**
     *  Todoを登録するAPIです。
     *
     * @param todo Todoモデル
     * @return なし
     */
    @PostMapping(value = "/todo")
    @ResponseBody
    public ResponseEntity<Integer> create(@RequestBody Todo todo) {
        return ResponseEntity.ok().body(todoService.create(todo));
    }

    /**
     *  Todoを更新するAPIです。
     *
     * @param id ID
     * @param todo Todoモデル
     * @return なし
     */
    @PutMapping(value = "/todo/{id}")
    @ResponseBody
    public ResponseEntity<Integer> update(@PathVariable int id, @RequestBody Todo todo) {
        return ResponseEntity.ok().body(todoService.update(id, todo));
    }

    /**
     *  Todoを削除するAPIです。
     *
     * @param id ID
     * @return なし
     */
    @DeleteMapping(value = "/todo/{id}")
    @ResponseBody
    public ResponseEntity<Integer> delete(@PathVariable int id) {
        return ResponseEntity.ok().body(todoService.delete(id));
    }
}
