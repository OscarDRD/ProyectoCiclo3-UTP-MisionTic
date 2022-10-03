import React from 'react';
import { Link } from 'react-router-dom';


const Sidebar = () => {
  return (
        <div className="wrapper d-flex">
            <div className="sidebar">
                <small className="text-muted pl-5">Mi Red de Salud</small>
                <ul>
                    <li>
                        <Link to="/perfil">
                            <i className="fa-solid fas fa-user"></i>Mi perfíl
                        </Link>
                    </li>

                    <li>
                        <button className="btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed" data-bs-toggle="collapse" data-bs-target="#enfermedades" aria-expanded="false">
                            <i className="fa-solid fas fa-virus"></i>Enfermedades
                        </button>
                        
                        <div className="collapse" id="enfermedades">
                            <ul className="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                                <li>
                                    <Link to="/nueva-enfermedad" className="d-inline-flex text-decoration-none rounded">
                                        Asociar nueva enfermedad
                                    </Link>
                                </li>

                                <li>
                                    <Link to="/consultar-enfermedades" className="d-inline-flex text-decoration-none rounded">
                                        Consultar mis enfermedades
                                    </Link>
                                </li>
                            </ul>
                        </div>
                    </li>    
                    
                    <li>
                        <button className="btn btn-toggle d-inline-flex align-items-center rounded border-0 collapsed" data-bs-toggle="collapse" data-bs-target="#familiares" aria-expanded="false">
                            <i className="fa-solid fas fa-people-roof "></i>Familiares
                        </button>
                        
                        <div className="collapse" id="familiares">
                            <ul className="btn-toggle-nav list-unstyled fw-normal pb-1 small">
                                <li>
                                    <Link to="/nuevo-familiar" className="d-inline-flex text-decoration-none rounded">
                                    Asociar nuevo familiar
                                    </Link>
                                </li>
                                <li>
                                    <Link to="/consultar-familiares" className="d-inline-flex text-decoration-none rounded">
                                        Consultar familiares
                                    </Link>
                                </li>
                            </ul>
                        </div>
                    </li>

                </ul>
            </div>
        </div>        
  )
}

export default Sidebar
