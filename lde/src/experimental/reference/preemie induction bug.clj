{

  :{
    :(∀ x₁ , (= (+ m x₁) (+ x₁ m)))
    (= (+ m (𝜎 k)) (+ (𝜎 k) m))}

  :{
    :{
      :[k#(= (+ m k) (+ k m))']
      (= (+ m k#(= (+ m k) (+ k m))') (+ k#(= (+ m k) (+ k m))' m))}
    (∀ x₁ , (= (+ m x₁) (+ x₁ m)))}

  :{
    :(= (+ m k) (+ k m))
    :{
      :[k#(= (+ m k) (+ k m))']
      :(= (+ m k#(= (+ m k) (+ k m))') (+ k#(= (+ m k) (+ k m))' m))
      (= (+ m (𝜎 k#(= (+ m k) (+ k m))')) (+ (𝜎 k#(= (+ m k) (+ k m))') m))}
    (∀ x₁ , (= (+ m x₁) (+ x₁ m)))}

  {
    :(= (+ m 0) (+ 0 m))
    {
      :(= (+ m k) (+ k m))
      (= (+ m (𝜎 k)) (+ (𝜎 k) m))}}}

;--------------------------------------------------------------------
{
  :{
    :A
    B}

  :{
    :{
      :C
      D}
    A}

  :{
    :E
    :{
      :C
      :D
      G}
    A}

  {
    :H
    {
      :E
      B}}}      

;--------------------------------------------

{
  :{ :A B }

  :{ :{ :C D } A}

  :{ :E :{:C :D G } A }

  { :H :E B }

}

;=============================

{ :{ :A B }  :{ :{ :C D } A}  :{ :E :{:C :D G } A }  { :H :E B } }


