import React from 'react'

const AsociarEnfermedades = () => {
  return (
    <div>
        <form class="row g-3 needs-validation" novalidate>
            
            <div class="col-md-6">
                <label for="validationCustom01" class="form-label">Nombre</label>
                <input type="text" class="form-control" id="validationCustom01" value="" required />
            </div>
                       
            <div class="col-md-6">
                <label for="validationCustom03" class="form-label">No. Identificación</label>
                <input type="text" class="form-control" id="validationCustom03" required />
            </div>

            <div class="col-md-12">
              <label for="exampleFormControlTextarea1" class="form-label">Síntomas</label>
              <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
            </div>

            <div class="col-md-12">
              <label for="exampleFormControlTextarea1" class="form-label">Tratamiento</label>
              <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
            </div>

            <div class="col-12">
                <button class="btn btn-primary" type="submit">Enviar</button>
            </div>

        </form>
    </div>
  )
}

export default AsociarEnfermedades