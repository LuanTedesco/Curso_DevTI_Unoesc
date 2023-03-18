import { http } from './ss-axios'

export default {
  listar() {
    return http.get('funcionarios')
  },

  salvar(funcionario) {
    return http.post('funcionarios', funcionario)
  },

  alterar(funcionario) {
    return http.put('funcionarios' + funcionario.id, funcionario)
  },

  excluir(funcionario) {
    return http.delete('funcionarios' + funcionario.id)
  }
}
