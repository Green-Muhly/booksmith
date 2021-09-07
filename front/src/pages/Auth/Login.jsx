import React, { useState } from "react";
import { Link } from "react-router-dom";

const Login = () => {
    const [inputs, setInputs] = useState({
        id: "",
        password: "",
    });
    const { id, password } = inputs;

    const onChange = ({ target }) => {
        const { name, value } = target;
        setInputs({
            ...inputs,
            [name]: value,
        });
    };
    const login = () => {
        if (id === "") return;
        if (password === "") return;
        console.log(id, password);
    };

    return (
        <section className="text-gray-600 body-font">
            <div className="flex flex-wrap items-center justify-center h-screen">
                <div className="lg:w-1/4 md:w-1/2 bg-gray-100 rounded-lg p-8 flex flex-col w-full ">
                    <h2 className="text-gray-900 text-xl font-bold title-font mb-5">Login</h2>
                    <div className="relative mb-4">
                        <input
                            type="text"
                            placeholder="ID"
                            id="full-name"
                            name="id"
                            onChange={onChange}
                            className="w-full bg-white rounded border border-gray-300 focus:border-green-500 focus:ring-2 focus:ring-green-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out"
                        />
                    </div>
                    <div className="relative mb-4">
                        <input
                            placeholder="Password"
                            type="password"
                            id="password"
                            name="password"
                            onChange={onChange}
                            className="w-full bg-white rounded border border-gray-300 focus:border-green-500 focus:ring-2 focus:ring-green-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out"
                        />
                    </div>
                    <button
                        onClick={login}
                        className="text-white bg-green-500 border-0 py-2 px-8 focus:outline-none hover:bg-green-600 rounded text-xl font-semibold"
                    >
                        로그인
                    </button>
                    <div className="flex justify-around mt-5">
                        <button className="text-white bg-blue-500 py-2 w-32 rounded hover:bg-blue-700 font-bold">
                            <Link to="/signup">회원가입</Link>
                        </button>
                        <button className="text-white bg-blue-500 py-2 w-32 rounded hover:bg-blue-700 font-bold">아이디 찾기</button>
                        <button className="text-white bg-blue-500 py-2 w-32 rounded hover:bg-blue-700 font-bold">비밀번호 찾기</button>
                    </div>
                </div>
            </div>
        </section>
    );
};

export default Login;
