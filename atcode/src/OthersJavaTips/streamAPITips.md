# Java Stream APIの基本概念

## 基本的なStream操作
### map と mapToObj
```java
// mapの例（int型のまま2倍）
IntStream.of(1, 2, 3)
    .map(x -> x * 2)         // [1,2,3] → [2,4,6]
    .forEach(System.out::println);

// mapToObjの例（int型からString型へ変換）
IntStream.of(1, 2, 3)
    .mapToObj(x -> "数字" + x) // [1,2,3] → ["数字1","数字2","数字3"]
    .forEach(System.out::println);
```

### flatMap（平坦化）
```java
List<List<Integer>> nestedList = Arrays.asList(
    Arrays.asList(1, 2),
    Arrays.asList(3, 4)
);

// flatMapで平坦化
nestedList.stream()
    .flatMap(List::stream)  // [[1,2],[3,4]] → [1,2,3,4]
    .forEach(System.out::println);
```

### reduce（畳み込み）
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
int sum = numbers.stream()
    .reduce(0, (subtotal, element) -> subtotal + element);
// 実行過程: 0→1→3→6→10
```

## よく使う処理パターン
### 累積和の計算
```java
// 従来のfor文
List<Integer> cumSum = new ArrayList<>();
int sum = 0;
for (int num : numbers) {
    sum += num;
    cumSum.add(sum);
}

// Stream APIを使用
List<Integer> cumSum = IntStream.range(0, numbers.size())
    .mapToObj(i -> numbers.subList(0, i + 1)
    .stream()
    .reduce(0, Integer::sum))
    .collect(Collectors.toList());
```

## 注意点
- Stream APIは可読性と引き換えに簡潔な記述が可能
- 競技プログラミングでは従来のfor文の方が:
  - デバッグしやすい
  - コードの意図が明確
  - 実行時間が予測しやすい