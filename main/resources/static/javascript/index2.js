//Sidebar
const menuItems = document.querySelectorAll('.menu-item');

//remove active class from all menu items 
const changeActiveItem = () => {
    menuItems.forEach(item => {
        item.classList.remove('active');
    })
}

menuItems.forEach(item => {
    item.addEventListener('click', () => {
        changeActiveItem();
        item.classList.add('active');
    })
})

// for like and dislike
// Get all the like icons and add click event listeners
const likeIcons = document.querySelectorAll('.like-icon');

likeIcons.forEach((likeIcon) => {
    likeIcon.addEventListener('click', function() {
        // Toggle the 'liked' class to change the color
        this.classList.toggle('liked');
    });
});

// JavaScript

// Get all the comment icons and add click event listeners
const commentIcons = document.querySelectorAll('.comment-icon');

commentIcons.forEach((commentIcon) => {
    commentIcon.addEventListener('click', function() {
        // Find the closest feed element
        const feed = this.closest('.feed');

        // Find the associated comment box within this feed
        const commentBox = feed.querySelector('.comment-box');

        // Toggle the comment box visibility
        commentBox.classList.toggle('show-comment-box');
    });
});




// Explore 
// Get the explore link element
const exploreLink = document.getElementById('explore-link');

// Add a click event listener to the explore link
exploreLink.addEventListener('click', () => {
    // Get the search bar element
    const searchBar = document.getElementById('search-bar');

    // Check if the search bar exists and is visible
    if (searchBar && !searchBar.classList.contains('active')) {
        // If not visible, toggle the 'active' class to display the search bar
        searchBar.classList.toggle('active');

        // Optionally, focus on the search input when it becomes visible
        const searchInput = searchBar.querySelector('input[type="search"]');
        if (searchInput) {
            searchInput.focus();
        }
    }
});


// create button of navbar
// Get the create post button element
const createPostBtn = document.getElementById('create-post-btn');

// Get the post caption textarea element
const postCaptionTextarea = document.getElementById('post-caption');

// Add a click event listener to the create post button
createPostBtn.addEventListener('click', () => {
    // Check if the post caption textarea exists
    if (postCaptionTextarea) {
        // Scroll to the post caption textarea with a smooth behavior
        postCaptionTextarea.scrollIntoView({ behavior: 'smooth' });
        
        // Optionally, you can focus on the textarea after scrolling to it
        postCaptionTextarea.focus();
    }
});



