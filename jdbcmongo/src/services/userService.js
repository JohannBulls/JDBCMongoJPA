const BASE_URL = 'http://localhost:8080/api/users';

/**
 * Service object for interacting with the user API.
 */
const userService = {
    /**
     * Fetches all users from the backend API.
     * @returns {Promise<Array>} A promise that resolves to an array of user objects.
     * @throws {Error} If the network response is not ok.
     */
    getUsers: async () => {
        const response = await fetch(BASE_URL);
        if (!response.ok) {
            throw new Error('Network response was not ok');
        }
        return await response.json();
    },

    /**
     * Adds a new user to the backend API.
     * @param {Object} userData The user data to be added.
     * @returns {Promise<void>} A promise that resolves when the user is added.
     * @throws {Error} If the user could not be added.
     */
    addUser: async (userData) => {
        const response = await fetch(BASE_URL, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(userData),
        });

        if (!response.ok) {
            throw new Error('Failed to add user');
        }
    }
};

export default userService;
