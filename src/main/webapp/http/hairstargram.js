class HttpClient {
    host = 'http://localhost/';
    constructor() {
        
    }

    get(url) {
       var data = '';
       fetch(this.host + url)
       .then(response => data = response)
       .catch(err => data = err);

       return data;
    }

    send(sender) {

    }

    async sendAsync(sender) {

    }
}