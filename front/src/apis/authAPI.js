import SERVER_IP from "./config";
import axios from "axios";

const loginAPI = async (body) => {
  try {
    const { data } = await axios.post(`${SERVER_IP}/login`, body);
    return data;
  } catch (e) {
    console.error(e);
  }
};

const signUpAPI = async (body) => {
  try {
    const { data } = await axios.post(`${SERVER_IP}/members/add`, body);
    return data;
  } catch (e) {
    console.error(e);
  }
};

const duplicateAPI = async (id) => {
  try {
    const { data } = await axios.post(`${SERVER_IP}/members/duplicate`, id);
    return data;
  } catch (e) {
    console.error(e);
  }
};

export { loginAPI, signUpAPI, duplicateAPI };
