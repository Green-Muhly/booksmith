import SERVER_IP from "./config";
import axios from "axios";

const signUpAPI = async (body) => {
    try {
        const res = await axios.post(`${SERVER_IP}/members/add`, body);
        return res;
    } catch (e) {
        console.log(e);
    }
};

export { signUpAPI };
