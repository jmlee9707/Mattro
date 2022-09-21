import type { NextPage } from "next";
import { useRouter } from "next/router";
import Image from "next/image";
import logo from "../public/images/logo/logo.png";

import styles from "./index.module.scss";

const Home: NextPage = () => {
  const router = useRouter();
  // const startClick = () => {
  //   router.push("/theme/main"); // 페이지 이동
  // };
  return (
    <div className={`${styles.home}`}>
      <div className={`${styles.contents} flex column align-center`}>
        <div className={`${styles.subtitle} fs-50 coreExtra`}>
          지하철 노선별 맛집 추천
          <div />
        </div>
        <div
          className={`${styles.title} fs-100 coreHeavy flex align-center justify-center`}
        >
          <Image src={logo} alt="logo" className={styles.logo} />
        </div>
        <button
          type="button"
          onClick={() => {
            router.push("/theme/main");
          }}
          className={`${styles.btn} fs-40 coreExtra`}
        >
          START
        </button>
      </div>
    </div>
  );
};

export default Home;