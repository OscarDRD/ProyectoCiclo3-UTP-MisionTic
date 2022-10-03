import React from 'react'

const Perfil = () => {
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
                <span>Seleccione sus Enfermedades</span>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault" />
                    <label class="form-check-label" for="flexCheckDefault">
                        Enfermedad 1
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked" />
                    <label class="form-check-label" for="flexCheckChecked">
                        Enfermedad 2
                    </label>
                </div>

                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="" id="flexCheckChecked" />
                    <label class="form-check-label" for="flexCheckChecked">
                        Enfermedad 3
                    </label>
                </div>
            </div>

            <div class="col-12">
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="" id="invalidCheck" required />
                    <label class="form-check-label" for="invalidCheck">
                        Acepto los terminos y condiciones.
                    </label>
                    <div class="invalid-feedback">
                        Debes aceptarlos para continuar.
                    </div>
                </div>
            </div>

            <div class="col-12">
                <button class="btn btn-primary" type="submit">Enviar</button>
            </div>

        </form>
    </div>
  )
}

export default Perfil
