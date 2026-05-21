<script setup>

import { ref } from "vue"

const texto = ref("")


</script>
<template>
  <h1>Lista de Tarefas</h1>
  <input class="texto" v-model="texto">

  <button @click="adicionarTarefa">
   Adicionar
  </button>
<div class="caixas">
      <div class="pendente">
        
      </div>
      
      <div class="andamento">
        
      </div>

      <div class="concluido">
    
  </div>


</div>

</template>
<style>
h1{
  color: black;
  margin-top: 65px;
  
}
body{
  background-color: rgb(189, 197, 197);
}

button{
  width: 5cm;
  margin-left: 60%;
 margin-top: -21px;
}

.caixas{
  display:flex;
  gap:20px;
  border-radius:10px;
 
}

.pendentes{
  width: 7cm;
  height: 9cm;
  background-color:rgb(123, 124, 126);
  margin-left:70px;
  margin-top: 150px;
  border-radius:10px;
}
.andamento{
  width: 7cm;
  height: 9cm;
  background-color:rgb(123, 124, 126);
  border-radius:10px;
  margin-left: 50px;
  margin-top: 90px;
}
.concluido{
  width: 7cm;
  height: 9cm;
  background-color:rgb(123, 124, 126);
  margin-left: 70px;
  margin-top: 90px;
  border-radius:10px;
}

</style>

<style scoped>
 .texto{
  width: 10cm;
  margin-left: 25%;
  margin-top: 80px;
 }
</style>


















