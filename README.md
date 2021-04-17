# Gradle Simple Sample

- Fooがアプリ、Barを参照
- FooとBarがcommons-langを参照
  - `api 'org.apache.commons:commons-lang3:3.7'`

## 始め方

gradleコマンド(or `gradlew(.bat)`)は、project直下で実行。

### タスク確認

```bash
gradle-simple> gradle tasks
gradle-simple> gradle tasks --all #全部出す
```

### ビルド

```bash
gradle-simple> gradle build
```

### Unit Test

```bash
gradle-simple> gradle test
gradle-simple> gradle :bar:test # 個別指定
gradle-simple> gradle test --rerun-tasks # 強制再実行
gradle-simple> gradle test --info # 詳細ログ
gradle-simple> gradle :bar:test --tests bar.BarTest # 部分実行 (:bar指定必須)
```

### 実行

```bash
gradle-simple> gradle :foo:run
gradle-simple> gradle run # 割と適当でも見つけてくれる
```

## 参考

- [Gradle入門 - Qiita](https://qiita.com/vvakame/items/83366fbfa47562fafbf4)
- [Gradle使い方メモ - Qiita](https://qiita.com/opengl-8080/items/4c1aa85b4737bd362d9e)
- [初めてのgradle build(Java) - Qiita](https://qiita.com/tatesuke/items/6e30dc8891d0857f240e)
  - 最小構成が理解できるが記載ちょっと古い
- [Gradle の compile, api, implementation とかについて - Qiita](https://qiita.com/opengl-8080/items/6ad642e0b016465891de)
  - compile*は廃止 → implementation*/apiを使う
- [JUnit 5 + Gradle による Java の自動テスト導入 - Qiita](https://qiita.com/niwasawa/items/cfcd37a3c2a795c336ba)
  - JUnit5をGradleで動かす場合の設定方法
