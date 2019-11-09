class HttpClient {
    host = 'http://localhost/';
    constructor() {

    }

    get(url) {
        ()
        var data = this.sendAsync(this.host + url);
    }

    send(sender) {

    }

    async sendAsync(sender) {
        var data = await fetch(sender)
            .then(function (response) {
                console.log(response);
                data = response;
                return response;
            })
            .catch(function (err) {
                data = err;
                console.log(err);
                return err;
            });

        return await data.json();
    }
}