import React, { useState } from 'react';
import userService from '../services/userService';

function UserModal({ fetchUsers, closeModal }) {
    const [formData, setFormData] = useState({
        firstName: '',
        lastName: '',
        birthdate: '',
        email: '',
        program: ''
    });

    const handleInputChange = (e) => {
        setFormData({
            ...formData,
            [e.target.id]: e.target.value
        });
    };

    const handleSubmit = async () => {
        if (!formData.firstName || !formData.lastName || !formData.birthdate || !formData.email || !formData.program) {
            alert('Please fill out all fields');
            return;
        }
        try {
            await userService.addUser(formData);
            fetchUsers(); // Actualiza la lista de usuarios después de agregar uno nuevo
            closeModal(); // Cierra el modal después de agregar el usuario
            setFormData({ // Reinicia el estado del formulario después de enviar
                firstName: '',
                lastName: '',
                birthdate: '',
                email: '',
                program: ''
            });
        } catch (error) {
            console.error('Error adding user:', error);
        }
    };

    return (
        <>
            <div className="modal show" tabIndex="-1" role="dialog" style={{ display: 'block' }}>
                <div className="modal-dialog" role="document">
                    <div className="modal-content">
                        <div className="modal-header">
                            <h5 className="modal-title" id="userModalLabel">Add User</h5>
                            <button type="button" className="btn-close" aria-label="Close" onClick={closeModal}></button>
                        </div>
                        <div className="modal-body">
                            {/* Contenido del modal */}
                            <form>
                                <div className="mb-3">
                                    <label htmlFor="firstName" className="form-label">First Name</label>
                                    <input type="text" className="form-control" id="firstName" onChange={handleInputChange} value={formData.firstName} />
                                </div>
                                <div className="mb-3">
                                    <label htmlFor="lastName" className="form-label">Last Name</label>
                                    <input type="text" className="form-control" id="lastName" onChange={handleInputChange} value={formData.lastName} />
                                </div>
                                <div className="mb-3">
                                    <label htmlFor="birthdate" className="form-label">Birthdate</label>
                                    <input type="date" className="form-control" id="birthdate" onChange={handleInputChange} value={formData.birthdate} />
                                </div>
                                <div className="mb-3">
                                    <label htmlFor="email" className="form-label">Email</label>
                                    <input type="email" className="form-control" id="email" onChange={handleInputChange} value={formData.email} />
                                </div>
                                <div className="mb-3">
                                    <label htmlFor="program" className="form-label">Program</label>
                                    <input type="text" className="form-control" id="program" onChange={handleInputChange} value={formData.program} />
                                </div>
                            </form>
                        </div>
                        <div className="modal-footer">
                            <button type="button" className="btn btn-secondary" onClick={closeModal}>Close</button>
                            <button type="button" className="btn btn-primary" onClick={handleSubmit}>Save changes</button>
                        </div>
                    </div>
                </div>
            </div>
        </>
    );
}

export default UserModal;
