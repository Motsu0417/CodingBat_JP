# CodingBat_JP

JavaでCodingBat風の基礎問題を解くための学習リポジトリです。  
各問題クラスを実装し、`Test.java`でCSVテストケースを実行できます。

## 前提環境

- Java（`javac` / `java` が使えること）

## ディレクトリ構成

```text
CodingBat_JP/
├─ README.md
├─ Wormup-1/
│  ├─ Test.java
│  ├─ SumDouble.java などの問題ファイル
│  └─ cases/
│     └─ 各問題のCSVテストケース
└─ Solution/
   └─ Wormup-1/
      └─ 解答例の問題ファイル
```

## 使い方

1. 問題ファイルの`// ここに回答`部分を実装する  
2. `Wormup-1`に移動してテストランナーをコンパイルする  
3. 問題名を指定してテストを実行する

```bash
cd Wormup-1
javac Test.java
java Test SumDouble
```

他の問題を試す場合:

```bash
java Test StartHi
java Test BackAround
```

## テスト仕様（Test.java）

- 実行時に対象クラス（例: `SumDouble.java`）をコンパイル
- クラス名をlower camel case化した`public static`メソッドを呼び出し
  - 例: `SumDouble` -> `sumDouble`
- テストケースは`cases/<ClassName>.csv`から読み込み
- 1列目が期待値、2列目以降が引数
- 対応型: `int`, `boolean`, `long`, `double`, `String`

## 問題を追加する方法

1. `Wormup-1/NewProblem.java`を作成
2. `public static`メソッド`newProblem(...)`を実装
3. `Wormup-1/cases/NewProblem.csv`を作成
4. 以下で実行

```bash
cd Wormup-1
java Test NewProblem
```

## 学習の進め方

- まず`Wormup-1`の問題を自力で実装
- `Solution/Wormup-1`の解答例と比較
- 失敗したケースをCSVから確認して再実装
