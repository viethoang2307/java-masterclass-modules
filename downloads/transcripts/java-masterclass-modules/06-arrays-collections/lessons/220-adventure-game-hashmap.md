# 220. Adventure game với HashMap

## Graph model

Location là node, exits là directed edge command → destination ID. World là Map<Integer, Location> để lookup nhanh.

~~~java
record Location(int id, String description, Map<String, Integer> exits) {
    Location { exits = Map.copyOf(exits); }
}
~~~

Map.copyOf bảo vệ exits khỏi mutation caller. Validator phải phát hiện dangling destination ID.

## Navigation

Normalize command, resolve alias, lookup exit, xác minh destination, rồi mới cập nhật current location. Parse không nên nằm trong domain transition.

## Bài tập

Implement validator world graph, command N/S/E/W/Q và shortest path bằng Queue + Set visited. Test unknown location, missing exit và dangling edge.

## Pitfalls

Mutable exits, update current trước khi validate destination và trộn Scanner với game model.
