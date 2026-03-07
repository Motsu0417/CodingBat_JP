# CodingBat_JP

CodingBat風の基礎問題を、日本語で学習しやすく整理したJava学習リポジトリです。
問題クラスを実装し、`Wormup-1/Test.java`でCSVテストケースを実行できます。
できる限り問題は増やす（予定）です。

## はじめに

- 利用方法（実装・テスト手順）はこのファイルを参照
- 非公式プロジェクトとしての注意事項は[README_CodingBat_JP.md](README_CodingBat_JP.md)を参照

## クイックスタート

```bash
cd Wormup-1
javac Test.java
java Test SumDouble
```

別の問題を実行する場合:

```bash
java Test StartHi
java Test BackAround
```

## 使い方

1. `Wormup-1`配下の問題ファイル（例: `SumDouble.java`）を開く
2. `// ここに回答`の箇所を実装する
3. `Wormup-1`で`java Test <問題クラス名>`を実行する

例:

```bash
cd Wormup-1
java Test SumDouble
```

## ディレクトリ構成

```text
CodingBat_JP/
├─ README.md
├─ README_CodingBat_JP.md
├─ Wormup-1/
│  ├─ Test.java
│  ├─ SumDouble.java などの問題ファイル
│  └─ cases/
│     └─ 各問題のCSVテストケース
└─ Solution/
   └─ Wormup-1/
      └─ 解答例の問題ファイル
```

## テスト仕様（`Wormup-1/Test.java`）

- 実行時に対象クラス（例: `SumDouble.java`）をコンパイル
- クラス名をlower camel case化した`public static`メソッドを呼び出し
  - 例: `SumDouble` -> `sumDouble`
- テストケースは`cases/<ClassName>.csv`を読み込み
- CSVは「1列目: 期待値 / 2列目以降: 引数」
- 対応型: `int`, `boolean`, `long`, `double`, `String`

## 問題を追加する方法

1. `Wormup-1/NewProblem.java`を作成
2. `public static`メソッド`newProblem(...)`を実装
3. `Wormup-1/cases/NewProblem.csv`を作成
4. `java Test NewProblem`を実行

## 注意事項（要点）

- 本リポジトリはCodingBatの**非公式**プロジェクトです
- 問題内容・構成の著作権はCodingBatおよび作者に帰属します
- 翻訳・説明の一部にAIを利用しているため、不正確な表現が含まれる可能性があります
- コード実行は自己責任です（詳細は[README_CodingBat_JP.md](README_CodingBat_JP.md)）

## 参考リンク

- CodingBat公式サイト: https://codingbat.com/
- 注意事項・背景・貢献案内: [README_CodingBat_JP.md](README_CodingBat_JP.md)
