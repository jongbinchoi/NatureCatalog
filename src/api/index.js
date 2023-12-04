import axios from 'axios';

const baseUrl = 'http://localhost:8081/';

export default {
    getNatureList() {
        console.log('getNatureList');
        return axios.get(baseUrl + 'natureCatalog/guestbook');
    },
    getNature(id) {
        console.log(id);
        return axios.get(baseUrl + 'natureCatalog/guestbook/' + id);
    },
    postNature() {
        console.log('postNature');
        return axios.post(baseUrl + 'natureCatalog/guestbook');
    },
    patchNature(id) {
        console.log('patchNature');
        return axios.patch(baseUrl + 'natureCatalog/guestbook/' + id);
    },
    deleteNature(id) {
        console.log('deleteNature');
        return axios.delete(baseUrl + 'natureCatalog/guestbook/' + id);
    },
    getNatureCommets(natureId) {
        console.log('getNatureCommets');
        return axios.get(baseUrl + 'natureCatalog/guestbook/' + natureId + '/comments');
    },
    postNatureComment(natureId) {
        console.log('postNatureComment');
        return axios.post(baseUrl + 'natureCatalog/guestbook/' + natureId + '/comments');
    },
    patchNatureComment(id) {
        console.log('patchNatureComment');
        return axios.patch(baseUrl + 'guestbook/comments/' + id);
    },
    deleteNatureComment(id) {
        console.log('deleteNatureComment');
        return axios.delete(baseUrl + 'guestbook/comments/' + id);
    }
};
