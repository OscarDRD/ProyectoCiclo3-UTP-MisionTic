import React from 'react'

const AsociarFamiliares = () => {
  return (
    <div>
        <form class="row g-3 needs-validation" novalidate>
            
            <div class="col-md-4">
                <label for="validationCustom01" class="form-label">Nombre</label>
                <input type="text" class="form-control" id="validationCustom01" value="" required />
            </div>

            <div class="col-md-4">
                <label for="validationCustom02" class="form-label">Apellidos</label>
                <input type="text" class="form-control" id="validationCustom02" value="" required />
            </div>
                       
            <div class="col-md-4">
                <label for="validationCustom03" class="form-label">No. Identificación</label>
                <input type="text" class="form-control" id="validationCustom03" required />
            </div>

            <div class="col-md-4">
                <label for="validationCustom04" class="form-label">Fecha de nacimiento</label>
                <input type="date" class="form-control" id="validationCustom04" required />
            </div>

            <div class="col-md-4">
              <span>Tipo de parentesco</span>
              <select class="form-select " aria-label="Default select example">
                <option value="4" >Papá</option>
                <option value="1">Mamá</option>
                <option value="2">Abuelo</option>
                <option value="3">Tío</option>
                <option value="3">Hermano</option>
                <option value="3">Primo</option>
              </select>
            </div>

            <div class="col-12">
                <button class="btn btn-primary" type="submit">Enviar</button>
            </div>

        </form>
    </div>
  )
}

export default AsociarFamiliares