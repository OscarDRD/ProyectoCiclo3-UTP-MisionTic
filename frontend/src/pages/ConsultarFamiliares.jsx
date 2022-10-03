import React from 'react'

const ConsultarFamiliares = () => {
  return (
    <div>
      <table class="table table-hover table-bordered">
        
        <thead>
          <tr>
            <th scope="col">#</th>
            <th scope="col">Nombre</th>
            <th scope="col">Identificacio</th>
            <th scope="col">Edad</th>
            <th scope="col">Parentesco</th>
            <th scope="col">Enfermedades</th>
          </tr>
        </thead>

        <tbody>
          <tr>
            <th scope="row">1</th>
            <td>Mark</td>
            <td>Otto</td>
            <td>34</td>
            <td>Papá</td>
            <td>
              <span class="badge text-bg-danger m-1">Enfermedad 1</span>
              <span class="badge text-bg-primary m-1">Enfermedad 2</span>
              <span class="badge text-bg-primary m-1">Enfermedad 3</span>
              <span class="badge text-bg-primary m-1">Enfermedad 4</span>
              <span class="badge text-bg-danger m-1">Enfermedad 5</span>             
            </td>
          </tr>
          <tr>
            <th scope="row">2</th>
            <td>Jacob</td>
            <td>Thornton</td>
            <td>56</td>
            <td>Tío</td>
            <td>
              <span class="badge text-bg-warning m-1">Enfermedad 1</span>
              <span class="badge text-bg-danger m-1">Enfermedad 2</span>
              <span class="badge text-bg-primary m-1">Enfermedad 3</span>
            </td>
          </tr>
          <tr>
            <th scope="row">3</th>
            <td>Larry</td>
            <td></td>
            <td>80</td>            
            <td>Abuelo</td>
            <td>
              <span class="badge text-bg-primary m-1">Enfermedad 1</span>
              <span class="badge text-bg-primary m-1">Enfermedad 2</span>
              <span class="badge text-bg-warning m-1">Enfermedad 3</span>
              <span class="badge text-bg-primary m-1">Enfermedad 4</span>
              <span class="badge text-bg-danger m-1">Enfermedad 5</span>
              <span class="badge text-bg-primary m-1">Enfermedad 6</span>
              <span class="badge text-bg-primary m-1">Enfermedad 7</span>
              <span class="badge text-bg-primary m-1">Enfermedad 8</span>
              <span class="badge text-bg-primary m-1">Enfermedad 9</span>
              <span class="badge text-bg-primary m-1">Enfermedad 10</span>
              <span class="badge text-bg-danger m-1">Enfermedad 11</span>
              <span class="badge text-bg-primary m-1">Enfermedad 12</span>
              <span class="badge text-bg-primary m-1">Enfermedad 13</span>
              <span class="badge text-bg-warning m-1">Enfermedad 14</span>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  )
}

export default ConsultarFamiliares
