-- Last updated: 05/09/2026, 20:07:41
SELECT product_id, product_name, description
FROM products
WHERE description REGEXP '\\bSN[0-9]{4}-[0-9]{4}\\b'
      COLLATE utf8mb4_bin
ORDER BY product_id;