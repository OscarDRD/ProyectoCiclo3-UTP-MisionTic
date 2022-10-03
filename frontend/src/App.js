import './App.css';
import Sidebar from './components/Sidebar';
import { Route, Routes } from "react-router-dom";
import Perfil from './pages/Perfil';
import AsociarEnfermedades from './pages/AsociarEnfermedades';
import ConsultarEnfermedades from './pages/ConsultarEnfermedades';
import AsociarFamiliares from './pages/AsociarFamiliares';
import ConsultarFamiliares from './pages/ConsultarFamiliares';

function App() {
  return (
    <div className="App">
      <Sidebar />
      <div className="wrapper">
        <div className='content'>
          <Routes>
            <Route path="/perfil" element={<Perfil />} />
            <Route path="/nueva-enfermedad" element={<AsociarEnfermedades />} />
            <Route path="/consultar-enfermedades" element={<ConsultarEnfermedades />} />
            <Route path="/nuevo-familiar" element={<AsociarFamiliares />} />
            <Route path="/consultar-familiares" element={<ConsultarFamiliares />} /> 
          </Routes>
        </div>
      </div>
    </div>
  );
}

export default App;
