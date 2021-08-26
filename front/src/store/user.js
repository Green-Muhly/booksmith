import { makeAutoObservable } from "mobx";

class User {
  user = {};

  constructor() {
    makeAutoObservable(this);
  }
}

const userStore = new User();
export default userStore;
