import React from "react";

const SignUp = () => {
  return (
    <section className="text-gray-600 body-font">
      <div className="flex flex-wrap items-center justify-center h-screen">
        <div className="lg:w-1/4 md:w-1/2 bg-gray-100 rounded-lg p-8 flex flex-col w-full ">
          <h2 className="text-gray-900 text-xl font-bold title-font mb-5">
            회원가입
          </h2>
          <div className="flex flex-row mb-4 justify-between">
            <input
              type="text"
              placeholder="아이디"
              id="full-name"
              name="full-name"
              className=" w-3/4 bg-white rounded border border-gray-300 focus:border-green-500 focus:ring-2 focus:ring-green-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out"
            />
            <button className="w-1/5 bg-blue-500 text-white py-1 px-3 leading-8 rounded text-sm font-semibold hover:bg-blue-700">
              중복확인
            </button>
          </div>
          <input
            placeholder="패스워드"
            type="email"
            id="email"
            name="email"
            className="mb-4 w-full bg-white rounded border border-gray-300 focus:border-green-500 focus:ring-2 focus:ring-green-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out"
          />
          <input
            placeholder="패스워드 확인"
            type="email"
            id="email"
            name="email"
            className="mb-4 w-full bg-white rounded border border-gray-300 focus:border-green-500 focus:ring-2 focus:ring-green-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out"
          />
          <input
            placeholder="이름"
            type="email"
            id="email"
            name="email"
            className="mb-4 w-full bg-white rounded border border-gray-300 focus:border-green-500 focus:ring-2 focus:ring-green-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out"
          />
          <input
            placeholder="휴대폰 번호"
            type="email"
            id="email"
            name="email"
            className="mb-4 w-full bg-white rounded border border-gray-300 focus:border-green-500 focus:ring-2 focus:ring-green-200 text-base outline-none text-gray-700 py-1 px-3 leading-8 transition-colors duration-200 ease-in-out"
          />
          <button className="text-white bg-green-500 border-0 mt-5 py-2 px-8 focus:outline-none hover:bg-green-600 rounded text-xl font-semibold">
            가입 완료
          </button>
        </div>
      </div>
    </section>
  );
};

export default SignUp;
