# 205. Card game challenge: chia bài an toàn

## Mục tiêu

- Kết hợp list, shuffle và domain invariant.
- Thiết kế API chia bài có validation.

```java
static List<List<Card>> deal(List<Card> deck, int players, int cardsEach) {
    if (players <= 0 || cardsEach <= 0 || players * cardsEach > deck.size()) {
        throw new IllegalArgumentException("Invalid deal");
    }
    List<List<Card>> hands = new ArrayList<>();
    for (int p = 0; p < players; p++) hands.add(new ArrayList<>());
    for (int i = 0; i < players * cardsEach; i++) {
        hands.get(i % players).add(deck.get(i));
    }
    return hands;
}
```

Chia vòng tròn giúp mỗi player nhận xen kẽ. Có thể dùng cursor thay vì xóa đầu `ArrayList`, tránh dịch chuyển toàn bộ phần tử.

## Checklist

- Validate overflow khi tính tổng card nếu dữ liệu có thể lớn.
- Không một card xuất hiện ở hai hand.
- Số card còn lại chính xác.
- Xác định rõ method có mutate deck hay không.

## Bài tập ngắn

Viết self-check đối chiếu hợp của mọi hand và remainder với deck ban đầu.

## Interview prompt

Vì sao liên tục gọi `remove(0)` trên `ArrayList` là lựa chọn kém?

## Nguồn

- Transcript bài 205.
- Java 17 API: `List`, `Collections.shuffle`.
