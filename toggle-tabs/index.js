const items = document.querySelectorAll(".accordion button");

function toggleAccordion() {
  const itemToggle = this.getAttribute("aria-expanded");

  //   for (i = 0; i < items.length; i++) {
  //     items[i].setAttribute("aria-expanded", "false");
  //   }

  if (itemToggle == "false") {
    this.setAttribute("aria-expanded", "true");
  }
  if (itemToggle == "true") {
    this.setAttribute("aria-expanded", "false");
  }
}

items.forEach((item) => item.addEventListener("click", toggleAccordion));
