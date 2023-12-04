function changeProfilePic() {
    const fileInput = document.getElementById('fileInput');
    const profilePic = document.getElementById('profilePic');
  
    fileInput.addEventListener('change', function () {
      const file = this.files[0];
      const reader = new FileReader();
  
      reader.onload = function (e) {
        profilePic.src = e.target.result;
      };
  
      reader.readAsDataURL(file);
    });
  
    fileInput.click();
  }
  
  function changeUsername() {
    const usernameInput = document.getElementById('username');
    const newUsername = prompt('Enter new username:');
    
    if (newUsername && newUsername.trim() !== '') {
      usernameInput.value = newUsername;
    }
  }
  
  function changeBio() {
    const bioInput = document.getElementById('bio');
    const newBio = prompt('Enter new bio:');
    
    if (newBio !== null) {
      bioInput.value = newBio;
    }
  }
  