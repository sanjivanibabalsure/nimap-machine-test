
@GetMapping("/api/categories")
public Page<Category> getAllCategories(@RequestParam(defaultValue = "0") int page,
                                       @RequestParam(defaultValue = "5") int size) {
    Pageable pageable = PageRequest.of(page, size);
    return categoryRepository.findAll(pageable);
}
