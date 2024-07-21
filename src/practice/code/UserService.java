package practice.code;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> users = new ArrayList<>();

    public UserService() {
        // テストデータの追加
        users.add(new User(1L, "John Doe", "john@example.com"));
        users.add(new User(2L, "Jane Doe", "jane@example.com"));
    }

    // 全ユーザーを取得
    public List<User> getAllUsers() {
        return users;
    }

    // ユーザーをIDで検索
    public User getUserById(Long id) {
        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    // ユーザーを追加
    public void addUser(User user) {
        users.add(user);
    }

    // ユーザー情報を更新
    public void updateUser(Long id, User user) {
        for (int i = 0; i < users.size(); i++) {
            User u = users.get(i);
            if (u.getId().equals(id)) {
                users.set(i, user);
                return;
            }
        }
    }

    // ユーザーを削除
    public void deleteUser(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }
}
