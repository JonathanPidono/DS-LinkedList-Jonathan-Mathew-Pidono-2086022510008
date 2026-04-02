Part A — Concept Check

1. Why does a linked list need a head variable?

2. Why does each node store a next reference?

3. Why is insertion at the beginning easier in linked list than in array?

Part B — Code Reading

4. In insertAtBeginning(), why do we write:
  newNode.next = head;
  head = newNode;
  in that order?

5. In display(), what would happen if we accidentally wrote:
  while (current.next != null)
  instead of:
  while (current != null)

Part C — Comparison with Array

6. Which structure is better for fast random access?

7. Which structure is better for frequent insertion at the beginning?
  
8. Why does linked list use more memory than array?

Jawaban:
1. Head sebagai penanda node pertama dalam struktur data tersebut. Tanpa head, alamat memori node pertama akan hilang, menyebabkan seluruh linked list tidak dapat diakses.
2. Untuk membentuk struktur seperti kererta api di mana node dapat tersebar di seluruh memori, bukan disimpan secara berurutan seperti pada array. Tanpa next, kita tidak bisa menentukan urutannya.
3. Di array, menyisipkan di posisi 0 berarti menggeser semua elemen ke kanan terlebih dahulu operasi O(n). Di linked list, kita tinggal perlu membuat node baru, mengarahkan newNode.next = head, lalu memperbarui head = newNode hanya 2 langkah, O(1), tanpa pergeseran apapun.
4. Baris 1 harus lebih dulu agar referensi ke list lama tersimpan dulu sebelum head diperbarui. Jika head diperbarui lebih dulu, kita hilangkan referensi ke list lalu.
5. Loop berhenti ketika current adalah node terakhir (karena current.next == null). Masalahnya, node terakhir tidak pernah dicetak. Misalnya list 10 → 20 → 30, output hanya akan jadi 10 -> 20 -> dan node 30 terlewat.
6. Array karena di array kalau kita mau akses elemen di posisi manapun adalah O(1) karena kita tinggal perlu menggunakan index langsung (arr[i]). Linked list harus melakukan traversal dari head satu per satu.
7. Linked list karena di linked list nsertion di awal linked list adalah O(1) karena hanya memperbarui head dan satu pointer. Array membutuhkan O(n) karena semua elemen harus digeser ke kanan.
8. Setiap node di linked list menyimpan dua hal yaitu nilai data dan referensi next (pointer ke node berikutnya). Array hanya menyimpan nilai data saja tidak ada overhead pointer. Semakin banyak node, semakin besar total memori yang dipakai linked list.
