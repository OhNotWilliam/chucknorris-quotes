<template>
  <div class="quote-wrapper">
    <img alt="chuck-norris" src="../assets/chuck-norris.png" class="img" />
    <h1 class="quote">"{{ randomQuote.quote }}"</h1>
  </div>
</template>

<script>
export default {
  name: "ChuckNorrisQuote",
  data() {
    return {
      randomQuote:
        "Wenn alles funktioniert, steht hier ein Chuck Norris Spruch.",
    };
  },
  methods: {
    loadRandomQuote() {
      var requestOptions = {
        method: 'GET',
        redirect: 'follow'
      };
      fetch("http://localhost:8080/api/v1/quotes", requestOptions)
          .then(response => response.json())
          .then(result => console.log(this.randomQuote=result))
          .catch(error => console.log('error', error));
    },
    getRandomInt(maxExclusive) {
      return Math.floor(Math.random() * maxExclusive);
    },
  },
beforeMount(){
  this.loadRandomQuote()
},
};
</script>

<style>
.quote-wrapper {
  display: flex;
  justify-content: space-evenly;
  align-items: center;
  height: 100%;
  width: 95%;
  margin: auto;
}
h1 {
  font-size: 4vw;
  text-align: center;
  font-style: italic;
}
.img {
  width: 50%;
}
.quote {
  width: 50%;
}

@media screen and (max-width: 780px) {
  .quote-wrapper {
    display: flex;
    flex-direction: column;
  }
  .img {
    width: 100%;
  }
  .quote {
    width: 100%;
  }
}
</style>
