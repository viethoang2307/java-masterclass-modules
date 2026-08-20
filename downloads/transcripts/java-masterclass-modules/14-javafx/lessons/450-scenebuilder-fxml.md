# 450 — Scene Builder và FXML

FXML tách layout khỏi Java code; `fx:id`/controller injection là runtime contract. Controller initialize sau injection, không truy cập field trước.

Validate FXML version/module access và giữ controller mỏng.
