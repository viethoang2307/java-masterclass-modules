# 143. Ordered itinerary phần 1

## Ordering invariant

Một itinerary ordered cần quy tắc comparator rõ: destination alphabetic, stop number hoặc time. Nếu comparator trả 0 cho hai item khác nhau, TreeSet có thể loại mất item; với List, comparator chỉ quyết định vị trí.

~~~java
List<String> route = new LinkedList<>();
ListIterator<String> cursor = route.listIterator();
while (cursor.hasNext()) {
    if (cursor.next().compareToIgnoreCase(destination) > 0) {
        cursor.previous();
        cursor.add(destination);
        return;
    }
}
cursor.add(destination);
~~~

## Duplicate

Check duplicate theo cùng normalization với ordering. Nếu sort case-insensitive nhưng duplicate check case-sensitive, route có thể chứa hai representation của cùng điểm.

## Bài tập

Implement insertOrdered, removeByNormalizedName và snapshot. Test insert đầu/giữa/cuối, duplicate và input null.

## Pitfalls

Dùng index loop trên LinkedList, quên previous trước add, và comparator/order không nhất quán.
