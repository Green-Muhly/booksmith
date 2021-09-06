import React, { useState } from "react";

const SignUp = () => {
    const [inputs, setInputs] = useState({
        id: "",
        password: "",
        passwordConfirm: "",
        name: "",
        tel: "",
    });

    const { id, password, passwordConfirm, name, tel } = inputs;
    const onChange = ({ target }) => {
        const { name, value } = target;
        setInputs({
            ...inputs,
            [name]: value,
        });
    };
    const validContent = (type, message) => {
        if (type === "") {
            alert(`${message}을/를 입력하세요.`);
            return true;
        }
        return false;
    };
    const signUp = () => {
        if (password !== passwordConfirm) {
            alert("패스워드가 일치하지 않습니다.");
            return;
        }
        if (validContent(id, "ID")) return;
        if (validContent(password, "패스워드")) return;
        if (validContent(name, "이름")) return;
        if (validContent(tel, "휴대폰 번호")) return;

        console.log(id, password, name, tel);
    };

    return (
        <section className="text-gray-600 body-font">
            <div className="flex flex-wrap items-center justify-center h-screen">
                <div className="lg:w-2/5 md:w-2/3 bg-gray-100 rounded-lg p-8 flex flex-col w-full ">
                    <h2 className="text-gray-900 text-xl font-bold title-font mb-5">회원가입</h2>
                    <div className="flex flex-row mb-4 justify-between">
                        <input
                            type="text"
                            placeholder="아이디"
                            name="id"
                            onChange={onChange}
                            className=" w-3/4 bg-white rounded border border-gray-300 focus:border-green-500 focus:ring-2 focus:ring-green-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out"
                        />
                        <button className="w-1/5 bg-blue-500 text-white py-1 px-3 leading-8 rounded text-sm font-semibold hover:bg-blue-700">
                            중복확인
                        </button>
                    </div>
                    <input
                        placeholder="패스워드"
                        type="password"
                        name="password"
                        onChange={onChange}
                        className="mb-4 w-full bg-white rounded border border-gray-300 focus:border-green-500 focus:ring-2 focus:ring-green-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out"
                    />
                    <input
                        placeholder="패스워드 확인"
                        type="password"
                        name="passwordConfirm"
                        onChange={onChange}
                        className="mb-4 w-full bg-white rounded border border-gray-300 focus:border-green-500 focus:ring-2 focus:ring-green-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out"
                    />
                    <input
                        placeholder="이름"
                        type="text"
                        name="name"
                        onChange={onChange}
                        className="mb-4 w-full bg-white rounded border border-gray-300 focus:border-green-500 focus:ring-2 focus:ring-green-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out"
                    />
                    <input
                        placeholder="휴대폰 번호"
                        type="number"
                        name="tel"
                        onChange={onChange}
                        className="mb-4 w-full bg-white rounded border border-gray-300 focus:border-green-500 focus:ring-2 focus:ring-green-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out"
                    />
                    <button
                        onClick={signUp}
                        className="text-white bg-green-500 border-0 mt-5 py-2 px-8 focus:outline-none hover:bg-green-600 rounded text-xl font-semibold"
                    >
                        가입 완료
                    </button>
                </div>
            </div>
        </section>
    );
};

export default SignUp;
