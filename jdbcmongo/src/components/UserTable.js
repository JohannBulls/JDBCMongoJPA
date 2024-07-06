import React, { useState, useEffect } from 'react';
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.bundle.min.js';
import UserModal from './UserModal';
import userService from '../services/userService';

/**
 * UserTable component that displays a list of registered users and provides
 * functionality to add new users via a modal.
 */
function UserTable() {
    const [users, setUsers] = useState([]);
    const [modalOpen, setModalOpen] = useState(false);

    // Fetch users when the component mounts
    useEffect(() => {
        fetchUsers();
    }, []);

    /**
     * Fetches the list of users from the backend and sets the users state.
     */
    const fetchUsers = async () => {
        try {
            const data = await userService.getUsers();
            setUsers(data);
        } catch (error) {
            console.error('Error fetching users:', error);
        }
    };

    /**
     * Opens the user modal.
     */
    const openModal = () => setModalOpen(true);

    /**
     * Closes the user modal.
     */
    const closeModal = () => setModalOpen(false);

    return (
        <div className="container mt-5">
            <button type="button" className="btn btn-success" onClick={openModal}>
                Add user
            </button>
            <h2 className="mt-3">Registered Users</h2>
            <table className="table table-striped table-hover ">
                <thead>
                    <tr>
                        <th>First Name</th>
                        <th>Last Name</th>
                        <th>Birthdate</th>
                        <th>Email</th>
                        <th>Program</th>
                    </tr>
                </thead>
                <tbody>
                    {users.map(user => (
                        <tr key={user.id}>
                            <td>{user.firstName}</td>
                            <td>{user.lastName}</td>
                            <td>{new Date(user.birthdate).toLocaleDateString()}</td>
                            <td>{user.email}</td>
                            <td>{user.program}</td>
                        </tr>
                    ))}
                </tbody>
            </table>

            {modalOpen && <UserModal fetchUsers={fetchUsers} closeModal={closeModal} />}
        </div>
    );
}

export default UserTable;
