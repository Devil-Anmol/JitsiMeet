# Jitsi Meet

Jitsi Meet is a Kotlin Jetpack Compose application designed to facilitate online video conferencing. The app allows users to log in or register using Firebase authentication. Once authenticated, users can join a conference room by entering the room name. Additionally, users can manage their favorite conference room users by adding new users or deleting existing ones.

## Key Features

1. **Welcome/Login/Register Page:**
   - Upon opening the app, users are greeted with a welcome page that serves as both the login and register page.
   - Firebase authentication is integrated to handle user login and registration securely.
   - Users can enter their email and password to log in or register for a new account.

2. **Conference Room Joining:**
   - After successful authentication, users are directed to the conference room joining page.
   - Here, users can enter the conference room name they wish to join.
   - The app seamlessly integrates with Jitsi Meet to provide a smooth video conferencing experience.

3. **Favorites Management:**
   - The app provides a "Favorites" button that allows users to manage their favorite conference room users.
   - Users can view a list of saved users' room names in a `LazyColumn`.
   - The swipe-to-dismiss feature enables users to delete saved users by sliding their names in the `LazyColumn`.
   - Additionally, users can add new favorite users by entering their names.

4. **Database Integration:**
   - Room database is used to store and manage favorite users' room names locally on the device.
   - This ensures that users' favorite users' room names are persistently stored and accessible across app sessions.

## Activities

1. **WelcomeActivity/LoginActivity/RegisterActivity:**
   - WelcomeActivity serves as the entry point of the app, providing options for users to log in or register.
   - LoginActivity handles user authentication, allowing existing users to log in.
   - RegisterActivity facilitates user registration for new users.

2. **ConferenceRoomJoinActivity:**
   - ConferenceRoomJoinActivity allows authenticated users to join a conference room by entering the room name.

3. **FavoritesActivity:**
   - FavoritesActivity displays a list of favorite conference room users and provides functionality to add new users or delete existing ones.
   - Swipe-to-delete functionality is implemented to allow users to delete saved users by sliding their names in the list.

## Additional Features

1. **Intents:**
   - The app utilizes intents to navigate between different screens and activities, providing a seamless user experience.

2. **Hardware Sensors:**
   - The app may access hardware sensors such as the camera and microphone to enable video conferencing functionality.
   - Camera access is required for capturing video during video calls, while microphone access is necessary for capturing audio.

3. **Internet Connectivity:**
   - The app relies on internet connectivity to authenticate users, join conference rooms, and communicate with the Jitsi Meet servers.
   - It utilizes network connectivity checks to ensure a stable connection throughout the user's session.

4. **Swipe-to-Delete Functionality:**
   - Users can swipe left on a favorite user's name in the `LazyColumn` to delete the user from their favorites list.
   - The swipe-to-delete functionality provides a convenient way for users to manage their favorite conference room users.

## Issues

1. **Jitsi Sign-In Requirement:**
   - Jitsi Meet requires sign-in for the first user to join the meeting, which is browser-based. Therefore, signing in within the app is not possible.
   - One possible workaround is to use JSON Web Tokens (JWT) via cloud functions on Firebase. However, this service is paid.
   - Alternatively, users can sign in with Google credentials in their browser to be the first to join the meeting, after which the app will work fine.

## Future Enhancements

1. **Enhanced UI/UX:**
   - Implement more polished UI designs and animations to enhance user engagement and experience.

2. **User Profiles:**
   - Introduce user profiles to allow users to personalize their experience and manage settings.

3. **Notifications:**
   - Implement push notifications to alert users about upcoming meetings or new messages.

4. **Security Enhancements:**
   - Enhance security measures to protect user data and privacy, including end-to-end encryption for video conferences.

## Working App Pics and Video

### Screenshots

| Welcome/Login Screen | Register Screen |
| :---: | :---: |
| ![Screenshot_20240513_044350](https://github.com/Devil-Anmol/JitsiMeet/assets/108612802/ec01f8f0-f35c-4d07-b425-5f19c4e8cc5d) | ![Screenshot_20240513_044432](https://github.com/Devil-Anmol/JitsiMeet/assets/108612802/1f88c5b4-d08a-4b04-8287-927a6b74a17f) |

| Join Conference Screen | Favourites Screen |
| :---: | :---: |
| ![Screenshot_20240513_045210](https://github.com/Devil-Anmol/JitsiMeet/assets/108612802/8dd99f6c-2f5b-4fc0-a6eb-24a9aa5d53cb) |  ![Screenshot_20240513_045528](https://github.com/Devil-Anmol/JitsiMeet/assets/108612802/40f0d824-32a2-4490-8068-a8a19bf3251e) |

| Get Favourite Screen | Add New Favourites Screen |
| :---: | :---: |
| ![Screenshot_20240513_045600](https://github.com/Devil-Anmol/JitsiMeet/assets/108612802/b736a0ab-728e-4251-9b99-6d60aeb559ac) | ![Screenshot_20240513_045616](https://github.com/Devil-Anmol/JitsiMeet/assets/108612802/95b78e2d-3b13-47be-ba8d-8e0fc60c8e3e) |



### Video
[Watch Video](https://drive.google.com/file/d/19b-AF9XMCfX_Izm2AbpO-gyWG61JsiA-/view?usp=sharing)

## Links

- [Jitsi Meet](https://jitsi.org/jitsi-meet/)
- [Jitsi Documentation](https://jitsi.github.io/handbook/docs/dev-guide/dev-guide-android-sdk)
- [Firebase](https://firebase.google.com/)
- [Jetpack Compose](https://developer.android.com/jetpack/compose)
- [JWT](https://jwt.io/)
